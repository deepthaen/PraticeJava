package javaConcept;

import java.util.Stack;

public class SpecialStackImplementaionPartice extends Stack<Integer>{
	Stack<Integer> min = new Stack<Integer>();
	
	
	void push(int x) {
		if(isEmpty() == true) {
			super.push(x);
			min.push(x);
		}else {
			super.push(x);
			int y = min.pop();
			min.push(x);
			
			if(x <= y ) 
				min.push(x);
			}
			
		}
		
		public Integer pop() 
	    { 
	        int x = super.pop(); 
	        int y = min.pop();
	        
	        if(y != x)
	        	min.push(y);
	           return x;        
	        
	        
	    } 
		
		public int getMin() {
			int x = min.pop();
			min.push(x);
			return x;
	  
		}
		
		
			public static void main(String[] args) {

				SpecialStackImplementaion s = new SpecialStackImplementaion();
				s.push(10);
				s.push(20);
				s.push(5);
				s.push(30); 
				System.out.println(s.getMin()); 
				s.push(1); 
				System.out.println(s.pop()); 
				System.out.println(s.getMin());
				s.push(5);
				System.out.println(s.getMin());

			}
		

	}
	
	
	
	

