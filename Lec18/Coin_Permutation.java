package Lec18;

public class Coin_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 2, 3, 4, 5 };
		int amount = 10;
		print(coin, amount, "");
	}

	public static void print(int[] coin, int amount, String ans) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < coin.length; i++) {
			if (amount >= coin[i]) {
				//amount -= coin[i];
				print(coin, amount-coin[i], ans + coin[i]);
				//amount += coin[i];
			}
		}
	}

}
