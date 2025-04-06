package Lec17;

public class Maze_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;// row
		int m = 4;// col
		print(0, 0, n - 1, m - 1, "");
	}

	// cr--> curr row | cc--> current col | er--> end row | ec--> end col
	public static void print(int cr, int cc, int er, int ec, String ans) {
		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}
		if (cr > er || cc > ec) {
			return;
		}
		print(cr, cc + 1, er, ec, ans + "H");
		print(cr + 1, cc, er, ec, ans + "V");

	}
}
