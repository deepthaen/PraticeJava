package javaConcept;

public class MissInteg {
	public static void main(String[] args) {
		int[] n = {1,2,3,5};
		missInte(n);
	}

	public static void missInte(int[] n) {
		int len = n.length;
		
		int sumOfAll = ((len*(len+1))/2);
		

		int sumOfArr = 0;
		
		for (int i = 0; i < len-1; i++) {
			sumOfArr = sumOfArr+n[i];
			
			
		}
		int missNum = sumOfAll-sumOfArr;
		
		System.out.println(missNum);
	}

}
