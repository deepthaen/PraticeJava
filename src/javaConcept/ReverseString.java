package javaConcept;

public class ReverseString {
	public static void main(String[] args) {
		String s = "Deeptha";
		reverseString(s);
	}
	
	public static void reverseString(String a) {
		int len = a.length();
		String r ="";
		for (int i = len-1; i>=0; i--) {
		char c = a.charAt(i);
			r = r+c;
		}
		System.out.println("Reversed String"+" :"+r);
	}

}
