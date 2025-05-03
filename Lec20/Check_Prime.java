package Lec20;

public class Check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 89;
		System.out.println(Isprime(n));

	}

	public static boolean Isprime(int n) {
		int div = 2;
		while (div * div <= n) {
			if(n%div==0) {
				return false;
			}

			div++;
		}
		return true;
//		for(int j=2; j*j<=n; j++) {
//			
//		}

	}

}
