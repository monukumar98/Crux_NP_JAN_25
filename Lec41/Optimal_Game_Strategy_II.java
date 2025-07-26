package Lec41;

public class Optimal_Game_Strategy_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 1, 13, 4 };
		System.out.println(Strategy(arr, 0, arr.length - 1));

	}

	public static int Strategy(int[] arr, int i, int j) {
		if(i>j) {
			return 0;
		}
		
		int f=arr[i]+Math.min(Strategy(arr, i+2, j), Strategy(arr, i+1, j-1));
		int l=arr[j]+Math.min(Strategy(arr, i+1, j-1), Strategy(arr, i, j-2));
		return Math.max(f, l);

	}
}

