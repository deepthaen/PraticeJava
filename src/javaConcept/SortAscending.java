package javaConcept;

public class SortAscending {
	public static void main(String[] args) {
		
	
	int[] a  = {3,5,2,68,6,5,0};
	ascendign(a);

}

	private static void ascendign(int[] s) {
		int len = s.length;
		int temp;
		for (int i = 0; i < len; i++) {
			for (int j = i+1; j < len; j++) {
				
				if(s[i] < s[j]) {
					temp = s[i];
					s[i] = s[j];
					s[j] = temp;
					
				}
				
			}
			System.out.println(s[i]);
			
		}
		
	}
	
}
