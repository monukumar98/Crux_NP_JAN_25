package Lec12;

public class Time_Complexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		long start = System.currentTimeMillis();
//		for (int i = 0; i < 1000000; i++) {
//
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end - start);
		int n = 65789;
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		// linaer
		// binary
		int i = 0;
		while (i < n) {
			System.out.println("Hey");
			// O(1)
			i++;
		}
		while (i <= n) {
			System.out.println("Hey");
			// O(log(N)) base 2
			i *= 2;
		}
		while (n > 0) {
			System.out.println("Hey");
			// O(log(N)) base 2
			n /= 2;
		}
		while (i <= n) {
			System.out.println("Hey");
			// O(N)
			i += 2;
			i += 3;
		}
		while (i <= n) {
			System.out.println("Hey");
			// O(log(N)) base 6
			i *= 2;
			i *= 3;
		}
		while (n > 0) {
			System.out.println("Hey");
			// O(log(N)) base 6
			n /= 2;
			n /= 3;
		}
		int k = 2;
		while (i <= n) {
			System.out.println("Hey");
			// loop N/k time chalega
			i += k;
		}
		while (i <= n) {
			System.out.println("Hey");
			// O(log(N)) base k
			i *= k;
		}
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				// O(N^2)
				System.out.println("hey");
			}
		}
		for (i = 1; i * i <= n; i++) {
			System.out.println("hey");
			// O(sqrt(N))
		}
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i * i; j++) {
				for (k = 1; k <= n / 2; k++) {
					System.out.println("hey");
					// O(N^4)
				}
			}
		}
		for (i = 1; i <= n; i *= 2) {
			// O(log(N)) base 2
			System.out.println("hey");
		}
		for (i = n / 2; i <= n; i++) {
			for (int j = 1; j <= n / 2; j++) {
				for (k = 1; k <= n; k = k * 2) {
					System.out.println("hey");
					// O(N^2(Log(N))
				}
			}
		}
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j += i) {
				System.out.println("hey");
				// O(N(Log(N))
			}
		}
		// bubble
		// Selection
		// instersion

	}

}












