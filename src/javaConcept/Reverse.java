package javaConcept;

public class Reverse {
	public static void main(String[] args) {
		int i = 1234, r = 0;
		while(i !=0) {
			int d = i%10;
			r = r*10+d;
			i = i/10;
			//System.out.println(r);
		}
		System.out.println("Reverse Intger"+ r );
		
		
	}
	
	
	

}
