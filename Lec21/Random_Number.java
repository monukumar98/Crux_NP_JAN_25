package Lec21;

import java.util.Random;

public class Random_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn = new Random();
		int lo = 10;
		int hi = 100;
		for (int i = 0; i < 10; i++) {
			int n = rn.nextInt(hi - lo + 1) + lo;// 91--> 0 to 90
			System.out.println(n);

		}

	}

}
