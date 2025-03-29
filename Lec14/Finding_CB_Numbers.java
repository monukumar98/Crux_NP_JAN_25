package Lec14;

import java.util.Scanner;

public class Finding_CB_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		print_All_SubString(str);

	}

	public static void print_All_SubString(String s) {
		int c = 0;
		boolean[] visited = new boolean[s.length()];
		for (int len = 1; len <= s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				int i = j - len;
				long num = Long.parseLong(s.substring(i, j));// SubString ko number me convert kra
				if (IsCbnumber(num) && Isvisited(visited, i, j)) {
					c++;
					// visisted marked
					for (int k = i; k < j; k++) {
						visited[k] = true;
					}
				}
			}
		}
		System.out.println(c);
	}

	public static boolean Isvisited(boolean[] visited, int i, int j) {// i to j-1 tk check krna hai char
		// TODO Auto-generated method stub
		for (int k = i; k < j; k++) {
			if (visited[k] == true) {
				return false;
			}
		}
		return true;
	}

	public static boolean IsCbnumber(long num) {
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		if (num == 0 || num == 1) {
			return false;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (num % arr[i] == 0) {
				return false;
			}
		}
		return true;

	}
}
