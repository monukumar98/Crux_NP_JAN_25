package Lec31;

public class Abstract_Demo_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract_Demo_Chlid ab1 = new  Abstract_Demo_Chlid();
		ab1.fun1();
		System.out.println(ab1.fun2());
		System.out.println(ab1.fun2());
		System.out.println(ab1.viewBal());
		Abstract_Demo ab = new Abstract_Demo() {

			@Override
			public void fun1() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public int fun2() {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};

	}

}
