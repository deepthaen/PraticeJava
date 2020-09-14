package javaConcept;

import java.util.Scanner;

public class Fact1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		fact(i);
	}

	public static void fact(int i) {
		int fatr = 1;
		for (int j = 1; j < i; j++) {
			fatr= fatr*j;
		
			
		}
		System.out.println(fatr);
		
	}

}
