package javaConcept;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWords {
	public static void main(String[] args) {
		String s = "Deeptha is in is Mysore Mysore";
		duplicateWords(s);
	}
	
	
	public static void duplicateWords(String str) {
		String[] l = str.split(" ");
		int len = l.length;
		HashMap<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < len; i++) {
			String key = l[i];
			if(map.containsKey(key)) {
				int val = map.get(key);
				map.put(key, val+1);
				
			}else {
				map.put(key, 1);
			}
		}
			System.out.println(map);
			
			
			Set<String> set = map.keySet();
			for (String key : set) { 				
			if(map.get(key)> 1) {
				System.out.println(key);
			}
			}
			
		
		}
		
	}


