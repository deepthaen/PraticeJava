package javaConcept;

public class RevWord1 {
	
	public static void main(String[] args) {
		String s = "Deeptha is in mysore is in";
		revword(s);
	}

	public static void revword(String s) {
		String[] sa = s.split(" ");
		int len  = sa.length;
		String  v = "";
		for (int i = len-1; i >=0; i--) {
			String val = sa[i];
			v = v+val+" "; 
			
		}
		System.out.println(v);
	}

}
