package javaConcept;

public class IntegerRev1 {
	public static void main(String[] args) {

		int a = 12345;
		revinnte(a);
		
	}

	public static void revinnte(int s) {
	int r =0;
	while(s != 0) {
		int d = s%10;
		 r = r*10+d;
		 s= s/10;
		
	}
	System.out.println(r);
		
		
		
	}

}
