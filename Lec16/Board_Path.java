package Lec16;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int end = 3;
		print(0, end, "");

	}

	public static void print(int curr, int end, String ans) {
		if (curr > end) {
			return;
		}
		if (curr == end) {
			System.out.println(ans);
			return;
		}
		for (int dice = 1; dice <=3; dice++) {
			print(curr+dice, end, ans+dice);
		}
//		print(curr + 1, end, ans + 1);
//		print(curr + 2, end, ans + 2);
//		print(curr + 3, end, ans + 3);
	}

}
