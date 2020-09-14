package javaConcept;

import java.util.Scanner;

public class LargestNumberInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter array value");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		largestNumber(a);
			
	}

	private static void largestNumber(int[] a) {
		int val = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>val) {
				val = a[i];
			}
			
		}
		System.out.println(val);
	}

	

	

}
