package Lec13;

public class String_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		s1 = s1 + "Bye";
		System.out.println(s1);
		s2 = s2.concat("Ok");
		System.out.println(s2);
		String s5 = "Raj" + "kaju";
		String s6 = "Rajkaju";
		System.out.println(s5 == s6);
		int[] arr = new int[7];
		System.out.println(arr.length);
		System.out.println(s1.length());
		System.out.println(s1.charAt(4));
		

	}

}









