package javaConcept;

public class SortDescending {
	
	public static void main(String[] args) {
		int[] a = {3,5,7,9,3,1,5,8,0};
		descending(a);
	}

	private static void descending(int[] a) {
		int len = a.length;
		int temp;
		for (int i = 0; i < len; i++) {
			
			for (int j =  i+1; j < len; j++) {
				
				if(a[i] > a[j]) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
			
		}
			System.out.print("{"+" "+a[i]+" "+"}");
		
	}

}
}