package LeetCode;

public class Get_the_Maximum_Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 2, 4, 5, 8, 10 };
		int[] arr2 = { 4, 6, 8, 9 };
	}

	 public static int Maximum_Score(int[] arr1, int[] arr2) {
			int i = 0, j = 0, s1 = 0, s2 = 0;
	        long ans = 0;
			int mod = 1000_000_007;
			while (i < arr1.length && j < arr2.length) {
				if (arr1[i] < arr2[j]) {
					i++;
				} else if (arr1[i] > arr2[j]) {
					j++;
				} else {
					long sum1 = sumofarray(arr1, s1, i);
					long sum2 = sumofarray(arr2, s2, j);
					ans = (ans + Math.max(sum1, sum2)) % mod;// ans= ans + Math.max(sum1, sum2);
					s1=i+1;
	                s2=j+1;
	                i++;
	                j++;
				

				}
			}
			long sum1 = sumofarray(arr1, s1, arr1.length - 1);
			long sum2 = sumofarray(arr2, s2, arr2.length - 1);
			ans = (ans + Math.max(sum1, sum2)) % mod;// ans= ans + Math.max(sum1, sum2);
			return (int) (ans);
		}

		public static long sumofarray(int[] arr, int i, int j) {
			long sum = 0;
			for (int k = i; k <= j; k++) {
				sum = (sum + arr[k]);// sum = sum + arr[k]
			}
			return (sum);
		}
}
