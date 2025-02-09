package Lec6;

public class Fun_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		int a = 7;
		int b = 9;
		addition(a, b);
		System.out.println("Bye");

	}

	public static void addition(int a, int b) {

		int c = a + b;
		sub(c, a);
		System.out.println(c);

	}

	public static void sub(int a, int b) {

		int c = a - b;

		System.out.println(c);

	}
}


