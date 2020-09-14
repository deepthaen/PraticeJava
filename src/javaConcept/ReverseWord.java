package javaConcept;

public class ReverseWord {
	public static void main(String[] args) {
		String str = "Deeptha is on Mysore";
		reversWord(str);
	}
	 public static void  reversWord(String s) {
		 String[] sa = s.split(" ");
		 int len = sa.length;
		 String r = "";
		 for (int i = len-1 ; i>=0; i--) {
			 r = r+sa[i]+" ";
		 }
		 System.out.println("Reverse word is :"+" "+r);
		 
	 }

}
