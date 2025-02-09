package Lec6;

public class Fun_Demo3 {
	static int val = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		int a = 7;
		int b = 9;
//		int x = addition(a, b);
//		System.out.println(x);
		System.out.println(val);// 100
		System.out.println(addition(a, b));// 23
		System.out.println(val);// ??
		System.out.println("Bye");

	}

	public static int addition(int a, int b) {

		int c = a + b;
		int val = 90;
		Fun_Demo3.val = Fun_Demo3.val - 5;
		return c - sub(b, c);

	}

	public static int sub(int a, int b) {

		int c = a - b;

		return c;

	}
}
