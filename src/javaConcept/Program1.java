package javaConcept;

public class Program1 {
	public static void main(String[] args) {
		String s = "abc";  // stores in string Pool 
		
		String s1 = new String("abc");  //  Stores in Heap Memory
		String s2 = "abc"; //String pool

		//s and S2 both are poninting  same object - string pool
		System.out.println(s+ " " +s1+ "  "+ s2);
		 s = s+"d";
		 System.out.println(s+ " " +s1+ "  "+ s2);
		 
		 s1 = s1+"de";
		 System.out.println(s+ " " +s1+ "  "+ s2);
		 
		 
		 String a = "abc";
		 a.charAt(2);
		char[] b =  a.toCharArray();
		 
		 System.out.println(b);
		 
		 int i ;
		 
		 
		
		
		
		
		
		
		
		
		
	}

}
