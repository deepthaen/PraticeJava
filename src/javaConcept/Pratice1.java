package javaConcept;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Pratice1 {
	public static void main(String[] args) {
		int a = 12345;
		reverseint(a);
		String s = "management";
		reverseString(s);
		String word = "deeptha is in mysore";
		reverseword(word);
		String d= "management";
		duplicateString(d);
		String str = "Deeptha is in Mysore is in";
		duplicateWord(str);
		int[] t = {1,2,3,4,5,7,8,9};
		missingNumb(t);
	}

	
		
	

	private static void missingNumb(int[] t) {
		int n = t.length;
		int sumofArray = 0;
		int sumofNum ;
		sumofNum = ((n*(n+1))/2);
		for (int i = 0; i < n-1; i++) {
			sumofArray = sumofArray+t[i];
		}
		int missing = sumofNum - sumofArray;
		System.out.println(missing);
	}





	private static void duplicateWord(String s) {
		String[] f = s.split(" ");
		int len = f.length;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < len; i++) {
			String key = f[i];
			if(map.containsKey(key)) {
				int val = map.get(key)+1;
				map.put(key, val);
			}else {
				map.put(key, 1);
			}
		}
		System.out.println(map);
		Set<String> set = map.keySet();
		for (String key : set) {
			if(map.get(key)==1) {
				System.out.println(key);
			}
		}
	}

	private static void duplicateString(String d) {
	   int len = d.length();
	   HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	   for (int i = 0; i < len; i++) {
		char key = d.charAt(i);
		if(map.containsKey(key)) {
			int val = map.get(key)+1;
			map.put(key, val);
		}else {
			map.put(key, 1);
		}
	}
	   System.out.println(map);
	   Set<Character> set = map.keySet();
	   for (Character key : set) {
		   if(map.get(key) ==1)
			   System.out.println(key);
		
	}
		
	}

	private static void reverseword(String w) {
		String[] s = w.split(" ");
		int len = s.length;
		String r = "";
		 for (int i = len-1 ; i>=0; i--) {
			
			r = r+s[i]+ " ";
		}
		System.out.println(r);
	}

	private static void reverseString(String s) {
	  int len = s.length();
	  String r = "";
	  for (int i = len-1; i >=0; i--) {
		char c = s.charAt(i);
		r = r+c;
	}
	  System.out.println(r);
	}
	

	private static void reverseint(int a) {
		int r = 0;
		while(a !=0) {
			int d = a%10;
			r = r*10+d;
			a = a/10;
		}
		
		System.out.println(r);
	}

}
