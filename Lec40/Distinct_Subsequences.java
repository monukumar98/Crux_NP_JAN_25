package Lec40;

import java.util.Arrays;

public class Distinct_Subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "rabbbit", t = "rabbit";
		int [] [] dp = new int [s.length()][t.length()];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Coin_Change(s, t, 0, 0, dp));
	}

// s--> coin --> i | t--> amount --> j
	public static int Coin_Change(String s, String t, int i, int j, int[][] dp) {
		if (j == t.length()) {
			return 1;
		}
		if (i == s.length()) {
			return 0;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int inc = 0, exc = 0;
		if (s.charAt(i) == t.charAt(j)) {// amount>=coin[i]
			inc = Coin_Change(s, t, i + 1, j + 1, dp);
		}
		exc = Coin_Change(s, t, i + 1, j, dp);
		return dp[i][j] = inc + exc;
	}
}
