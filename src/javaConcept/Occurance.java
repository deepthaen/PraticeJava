package javaConcept;

public class Occurance {
	
	public static void main(String[] args) {
		int[] a = {4,3,6,2,6,4,2,3,4,3,3};
		System.out.println("occcrance of element :" + findoccuranceelement(a));
	}

	public static int findoccuranceelement(int[] a) {
		int xor = 0;
		for(int i : a) {
			xor = xor^i;
		}
		
		
		return xor;
	}

}
