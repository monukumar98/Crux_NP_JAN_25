package Lec14;

public class Wrapper_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		Integer a1 = 10;
		System.out.println(a);
		System.out.println(a1);
		long x = 19;
		Long ll = (long) (19);// 19l
		// auto Boxing
		int b = 12;
		Integer b1 = 103;
		b1 = b;// auto Boxing

		// Un-Boxing
		b = b1;// Un-Boxing

		Integer c1 = 12;
		Integer c2 = 12;
		Integer c3 = 152;
		Integer c4 = 152;
		System.out.println(b1 == c1);// true
		int c = 152;
		System.out.println(c == c3);// true content compare ho raha hai
//		System.out.println(c1 == c2);// true addreass compare ho rha hai 
//		System.out.println(c3 == c4);// false addreass compare ho rha hai 
//		Character ch = 'a';
//		Character ch1 = 'a';
//		System.out.println(ch == ch1);// true addreass compare ho rha hai 
//		Boolean b4 = false;
//		Boolean b5 = false;
//		System.out.println(b4 == b5);// true addreass compare ho rha hai 

	}

}
