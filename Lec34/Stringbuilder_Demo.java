package Lec34;

public class Stringbuilder_Demo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		// add
		sb.append("Hello");
		sb.append(1);
		sb.append(true);
		sb.append('a');
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.charAt(1));
		System.out.println(sb.substring(1, 4));
		//System.out.println(sb.reverse());
		sb.append("Codin");
		System.out.println(sb.length());
		sb.append('b');
		System.out.println(sb.capacity());
	}

}
