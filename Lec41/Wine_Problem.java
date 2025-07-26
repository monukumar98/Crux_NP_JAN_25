package Lec41;

public class Wine_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wine = { 2, 3, 5, 1, 4 };
		System.out.println(Maximum_profits(wine, 0, wine.length-1, 1));

	}
	public static int Maximum_profits(int[] wine) {
		int [] [] dp = new int [wine.length][wine.length];
		int year=wine.length;
		for (int i = 0; i < dp.length; i++) {
			dp[i][i]=wine[i]*year;
		}
		year--;
		for (int gap = 1; gap < wine.length; gap++) {
			for (int j = gap; j < wine.length; j++) {
				int i=j-gap;
				int f=wine[i]*year+dp[i+1][j];
				int l=wine[j]*year+dp[i][j-1];
				dp[i][j]=Math.max(f, l);
			}
			year--;
		}
		return dp[0][dp[0].length-1];
	}
	public static int Maximum_profits(int[] wine, int i, int j, int year) {
		if(i>j) {
			return 0;
		}
		int f=wine[i]*year+Maximum_profits(wine, i+1, j, year+1);
		int l=wine[j]*year+Maximum_profits(wine, i, j-1, year+1);
		return Math.max(f, l);

	}
}
