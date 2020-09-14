package javaConcept;

public class RevStr1 {
	public static void main(String[] args) {
		String s = "management";
		rev(s);
		
	}

	public static void rev(String s) {
		int len = s.length();
		String r = "";
		for (int i = len-1; i>=0; i--) {
			char c = s.charAt(i);
			r = r+c;
			
			
		}
		System.out.println(r);
		
	}

}
