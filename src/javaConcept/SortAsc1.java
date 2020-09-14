package javaConcept;

import java.util.Set;

public class SortAsc1 {
	public static void main(String[] args) {
		int[] a = {2,4,6,7,2,5,60,};
		sortac(a);
	}

	public static void sortac(int[] a) {
		int len = a.length;
		int temp;
		for (int i = 0; i < len; i++) {
			for (int j = i+1; j < len; j++) {
				if(a[i] <  a[j]) {
					
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}
				
				
				
			}
			
		
			System.out.println(a[i]);
			
		}
		
	}

}
