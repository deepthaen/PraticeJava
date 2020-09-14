package javaConcept;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DupliStr {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter string");
	String s = sc.next();
	duplistr(s);
	}

	private static void duplistr(String s) {
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
