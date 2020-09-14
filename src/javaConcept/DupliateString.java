package javaConcept;

import java.util.HashMap;
import java.util.Set;

public class DupliateString {
	
	public static void main(String[] args) {
		String s = "aanndnnshshcc";
		duplicateStrings(s);
	}
	public static void duplicateStrings(String a) {
		int len = a.length();
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < len; i++) {
			char key = a.charAt(i);
			if(map.containsKey(key)) {
				int val = map.get(key);
				map.put(key, val+1);
				
			}else {
				map.put(key, 1);  			
		}
		
	}
		System.out.println( map);
		
		Set<Character> set = map.keySet();
		for (Character key : set) {
			if(map.get(key) == 1) {   // if == then check for unique and if > then check for duplicate
				System.out.println(key);
				
			}
			
		}
        
}
}
