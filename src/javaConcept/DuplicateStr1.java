package javaConcept;

import java.util.HashMap;
import java.util.Set;

public class DuplicateStr1 {
	public static void main(String[] args) {
		String s = "management";
		dupliStr(s);
	}

	public static void dupliStr(String s) {
		int len = s.length();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < len; i++) {
			char key = s.charAt(i);
			if(map.containsKey(key)) {
				int val = map.get(key);
				map.put(key, val+1);
			}else {
				map.put(key, 1);
				
			}
		
		}
		
		System.out.println(map);
		
		Set<Character> set = map.keySet();
		for (Character key : set) {
			
			if(map.get(key) == 1) {
				System.out.println(key);
				
			}
			
		}
	}

}
