package Lec16;

public class print_SubSequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		print(ques, "");

	}

	public static void print(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans+" ");
			return;
		}
		char ch = ques.charAt(0);
		print(ques.substring(1), ans);// No
		print(ques.substring(1), ans + ch);// Yes
	}
}
