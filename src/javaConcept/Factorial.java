
package javaConcept;

public class Factorial {
	
	public static void main(String[] args) {
		int n = 5;
		fact(n);
	}

	private static void fact(int n) {
		int i, factr = 1;
		for (int j = 1; j < n; j++) {
			factr = factr*j;
			
		}
		
		System.out.println("Factorial of number 5 is :"+factr);
	}
	

}
