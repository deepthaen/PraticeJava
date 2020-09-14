package javaConcept;

import java.util.HashMap;
import java.util.Set;

public class DupliWord1 {
	public static void main(String[] args) {
		String s = " Deeptha is in mysore is in";
		duplicWord(s);
	}

	public static void duplicWord(String s) {
		String[] sa = s.split(" ");
		int len = sa.length;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (int i = 0; i < len; i++) {
			String key = sa[i];
			if(map.containsKey(key)) {
				int val = map.get(key)+1;
				map.put(key, val+1);
				
				
			}else {
				map.put(key, 1);
			}
			
			
		}
		System.out.println(map);
		
		Set<String> set = map.keySet();
		for (String key : set) 
		{
			if(map.get(key) == 1)
			{
				System.out.println(key);
			}
		}
		
	}

}
