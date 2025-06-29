package Lec35;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Group_Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(Group(str));
	}

	public static List<List<String>> Group(String[] str) {
		HashMap<String, List<String>> map = new HashMap<>();
		for (int i = 0; i < str.length; i++) {
			String key = Generate_Key(str[i]);
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<String>());
			}
			map.get(key).add(str[i]);
		}
		List<List<String>> ans = new ArrayList<>();
		for (String key : map.keySet()) {
			ans.add(map.get(key));
		}
		return ans;
	}

	private static String Generate_Key(String str) {
		// TODO Auto-generated method stub
		int[] freq = new int[26];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			freq[ch - 'a']++;// freq[ch - 'a']= freq[ch - 'a'] +1;

		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < freq.length; i++) {
			sb.append(freq[i]+" ");
		}
		return sb.toString();

	}

}















