package Lec20;

public class Sieve_of_Eratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int Prime_Sieve(int n) {
		int[] prime = new int[n];
		prime[0] = 1;// not prime
		prime[1] = 1;// not prime
		for (int i = 2; i * i < prime.length; i++) {
			if (prime[i] == 0) {// i prime number hai
				for (int j = 2; i * j < prime.length; j++) {
					prime[i*j]=1;// not prime
				}
			}

		}
		int c=0;
		for (int i = 2; i < prime.length; i++) {
			if(prime[i]==0) {
				c++;
			}
		}
		return c;
	}

}
