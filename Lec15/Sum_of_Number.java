package Lec15;

public class Sum_of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(sumofnumber(n));
	}

	public static int sumofnumber(int n) {
		if (n == 1) {
			return 1;
		}

		int ans = sumofnumber(n - 1);
		return ans + n;

	}

}
