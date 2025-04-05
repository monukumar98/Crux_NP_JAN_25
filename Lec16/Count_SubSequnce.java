package Lec16;

public class Count_SubSequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		System.out.println("\n" + CountSubSequnce(ques, ""));

	}

	public static int CountSubSequnce(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return 1;
		}
		char ch = ques.charAt(0);
		int x = CountSubSequnce(ques.substring(1), ans);// No
		int y = CountSubSequnce(ques.substring(1), ans + ch);// Yes
		return x + y;
	}

//	static int c = 0;
//
//	public static void print(String ques, String ans) {
//		if (ques.length() == 0) {
//			System.out.print(ans + " ");
//			c++;
//			return;
//		}
//		char ch = ques.charAt(0);
//		print(ques.substring(1), ans);// No
//		print(ques.substring(1), ans + ch);// Yes
//	}

}
