package Lec34;

import java.util.*;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		// add
		map.put("Raj", 78);
		map.put("Kunal", 67);
		map.put("Komal", 55);
		map.put("Amisha", 88);
		map.put("Ankit", 78);
		map.put("Ankita", 62);
		map.put("Amisha", 58);
		// map.put(null, 77);
		System.out.println(map);
//		// ContainsKey
//		System.out.println(map.containsKey("Amit"));
//		System.out.println(map.containsKey("Amisha"));
//		// get
//		System.out.println(map.get("Raj"));
//		System.out.println(map.get("Amit"));
//		// remove
//		System.out.println(map.remove("Raj"));
//		System.out.println(map.remove("Amit"));
//		System.out.println(map);
		TreeMap<String, Integer> map1 = new TreeMap<>();
		// add
		map1.put("Raj", 78);
		map1.put("Kunal", 67);
		map1.put("Komal", 55);
		map1.put("Amisha", 88);
		map1.put("Ankit", 78);
		map1.put("Ankita", 62);
		map1.put("Amisha", 58);
		System.out.println(map1);
		
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		// add
		map2.put("Raj", 78);
		map2.put("Kunal", 67);
		map2.put("Komal", 55);
		map2.put("Amisha", 88);
		map2.put("Ankit", 78);
		map2.put("Ankita", 62);
		map2.put("Amisha", 58);
		//map2.put(null, 77);
		System.out.println(map2);
		Set<String> keyset=map.keySet();
		for(String key: keyset) {
			System.out.println(key+" "+map.get(key));
		}

	}

}

















