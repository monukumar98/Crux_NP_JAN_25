package Lec10;

import java.util.Arrays;

public class Aggressive_cows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stall = { 1, 2, 8, 4, 9 };
		int noc = 3;
		Arrays.sort(stall);
		System.out.println(largest_minimum(stall, noc));

	}

	public static int largest_minimum(int[] stall, int noc) {
		int hi = stall[stall.length - 1] - stall[0];
		int lo = 0;
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isitpossible(stall, noc, mid) == true) {
				ans = mid;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		return ans;
	}

	public static boolean isitpossible(int[] stall, int noc, int mid) {
		int pos = stall[0];
		int cow = 1;
		for (int i = 1; i < stall.length; i++) {
			if (stall[i] - pos >= mid) {
				cow++;
				pos = stall[i];
			}
			if (cow == noc) {
				return true;
			}
		}
		return false;
	}

}
