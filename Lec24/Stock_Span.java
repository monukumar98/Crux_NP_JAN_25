package Lec24;

import java.util.Stack;

public class Stock_Span {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 5, 2, 10 };
		Cal_Span(arr);

	}

	public static void Cal_Span(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
				st.pop();
			}
			// cal span
			if (!st.isEmpty()) {
				ans[i] = i - st.peek();
			} else {
				ans[i] = i + 1;
			}
			st.push(i);
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

}
