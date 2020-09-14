package javaConcept;

import java.io.File;
import java.io.IOException;

public class DirectoruPath {
	
	
	public static void main(String[] args) throws IOException {
		File file;
		String userDir = System.getProperty("user.dir");
		file = new File(userDir);
		System.out.println(file.getCanonicalPath());
		file = new File(userDir+"/..");
		System.out.println(file.getCanonicalPath());
		
	  }

}
