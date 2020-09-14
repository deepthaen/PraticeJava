package javaConcept;

import java.io.IOException;

public class Dirtectory {
	
	
	public static void main(String[] args) throws IOException {
	       String input  ="/Users/ar/Desktop";
	       
	       String input2 ="../Music"; //  -- ../../abc
	       
	       String[] spl = input.split("/");
	       String[] spl2 = input2.split("/");
	       
	       
	      System.out.println("pwd :: "+input);
	      System.out.println("relative path:: "+input2);

	       String s ="";
	      
	       if(spl2[0].equalsIgnoreCase("..")) {
	       for (int i = 1; i < spl.length-1; i++) {
	         s=s+"/"+spl[i]; //  s= /Users/ar
	           }
	              s=s+"/"+spl2[1]; // /users/ar/Music
	}
	      
	      System.out.println("relative path :: "+s);
	       
	    }

}
