package javaConcept;

public class DuplicateInInteger {
	public static void main(String[] args) {
		int a[] = {2,4,5,3,2,4,2,4,5,6};
		duplicateIntegers(a);
		
	}

	private static void duplicateIntegers(int b[]) {
		int len = b.length;
		for (int i = 0; i < len; i++) {
			for (int j = i+1; j <len ; j++) {
				
				if(b[i] == b[j]) {
					System.out.println(b[i]);
					
				}
				
				
			}
			
		}
		
	}

}
