package Lec25;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(2, 7));
		System.out.println(add(2, 7, 9));
		System.out.println(add(2, 7, 9.6));
		System.out.println(add(2, 7, 1, 2, 1, 1, 1, 23, 1, 44, 1, 1, 23, 2, 56, 2, 721));

	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static int add(int a, int b, double c) {
		return (int) (a + b + c);
	}

	public static int add(int x, int... a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum+x;
	}
}












