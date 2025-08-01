package Lec40;

public class Uncrossed_Lines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int LCSBU(int [] text1, int [] text2) {
		int[][] dp = new int[text1.length + 1][text2.length + 1];
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if (text1[i - 1] == text2[j - 1]) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					int f = dp[i - 1][j];
					int s = dp[i][j - 1];
					dp[i][j] = Math.max(f, s);
				}
			}
		}
		return dp[dp.length - 1][dp[0].length - 1];

	}
}
