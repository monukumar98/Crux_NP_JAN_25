package Lec6;

import java.util.Scanner;

public class Is_Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Armstrong_Number(n));
	}

	public static boolean Armstrong_Number(int n) {
		int cod = count_of_digit(n);
		int sum = 0;
		int p=n;
		while (n > 0) {
			int rem = n % 10;
			sum = (int) (sum + Math.pow(rem, cod));
			n = n / 10;
		}
		if (sum == p) {
			return true;
		} else {
			return false;
		}
	}

	public static int count_of_digit(int n) {
		int c = 0;
		while (n > 0) {
			n = n / 10;
			c++;
		}
		return c;
	}
}
