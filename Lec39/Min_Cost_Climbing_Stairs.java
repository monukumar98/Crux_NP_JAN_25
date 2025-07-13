package Lec39;

import java.util.Arrays;

public class Min_Cost_Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cost = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
		int[] dp = new int[cost.length];
		Arrays.fill(dp, -1);
		int f = Climbing_Stairs(cost, 0, dp);
		int s = Climbing_Stairs(cost, 1, dp);
		System.out.println(Math.min(f, s));

	}

	public static int Climbing_Stairs(int[] cost, int i, int[] dp) {
		if (i >= cost.length) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int f = Climbing_Stairs(cost, i + 1, dp);
		int s = Climbing_Stairs(cost, i + 2, dp);
		return dp[i] = Math.min(f, s) + cost[i];

	}
}
