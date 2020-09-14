package javaConcept;

import java.util.Scanner;

public class Palindrom {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String s = sc.next();
		palindrom(s);
	}

	private static void palindrom(String s) {
		String r = "";
		int len = s.length();
		for (int i = len-1; i>0; i--) {
			char a = s.charAt(i);
			r = r+a;
		}
		
		if(s.equals(r)) {
			System.out.println("palindrom" + " "+r);
			
		}else {
			System.out.println("Not Palindrom"+ " "+s);
		}
		
	}

}
