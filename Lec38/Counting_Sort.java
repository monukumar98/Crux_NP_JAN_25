package Lec38;

//import java.net.Socket;
import java.util.Arrays;

public class Counting_Sort {
	public static void main(String[] args) {
		int[] arr = { 2, 1, 1, 0, 1, 2, 5, 4, 0, 2, 8, 7, 9, 2, 6, 1, 9 };
		System.out.println(Arrays.toString(sort(arr)));
	}

	public static int[] sort(int[] arr) {
		int max = Arrays.stream(arr).max().getAsInt();// 9
		int[] freq = new int[max + 1];
		for (int i = 0; i < arr.length; i++) {
			freq[arr[i]]++;// freq[arr[i]] = freq[arr[i]] + 1;
		}
		for (int i = 1; i < freq.length; i++) {
			freq[i] = freq[i] + freq[i - 1];
		}
		int[] ans = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			int x = arr[i];
			int c = freq[x];
			ans[c - 1] = x;
			freq[x]--;

		}
		return ans;
	}
}

