package Lec34;

public class Stringbuilder_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringbuilderadd();
	//	Stringadd();
	}

	private static void Stringadd() {
		// TODO Auto-generated method stub
		String s = "";
		for (int i = 0; i < 1000000; i++) {
			s = s + i;
		}
	}

	private static void Stringbuilderadd() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 1000000; i++) {
			sb.append(i);
		}

	}

}
