package Lec1;

public class Inc_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 8;
//		System.out.println(--x);// x = x +1;
//		System.out.println(x);
		int c = x++ + 7 + --x + x-- - x-- - --x - x++ + ++x;
		System.out.println(c);
	
	}

}
