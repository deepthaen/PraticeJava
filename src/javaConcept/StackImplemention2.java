package javaConcept;

import java.util.Stack;

public class StackImplemention2 extends Stack<Integer>{
	Stack<Integer> min = new Stack<Integer>();
		
	void push(int x) {
		if(isEmpty() == true) {
			super.push(x);
			min.push(x);
		}else {
			super.push(x);
			int y = min.pop();
			min.push(y);
			
			if(x <= y)
				min.push(x);
			
		}
	}
	
	public Integer pop() {
		int x= super.pop();
		int y = min.pop();
		
		if(y != x)
			min.push(y);
		return x;
	}
	
	
	
	
	
	int getMin() {
		int x = min.pop();
		min.push(x);
		return x;
	}
	
	public static void main(String[] args) {
		StackImplemention2 s = new StackImplemention2();
		s.push(10);
		s.push(20);
		s.push(5);
		s.push(30);
		System.out.println("Min element in stack ::" + s.getMin());
	}

}
