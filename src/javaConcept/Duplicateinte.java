package javaConcept;

import java.util.ArrayList;

public class Duplicateinte {
	
	public static void main(String[] args) {
		int[] a = {2,4,2,3,5,6,3,5,7};
		duplicateint(a);
	}

	private static void duplicateint(int[] a) {
		//int len = a.length;
		ArrayList<Integer> lst = new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			if(!lst.contains(a[i])) {
				System.out.println(a[i]);
				lst.add(a[i]);
			}
			
		}
		
		
	}

}
