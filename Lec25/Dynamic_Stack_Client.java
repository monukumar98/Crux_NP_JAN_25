package Lec25;

import Lec23.Stack;

public class Dynamic_Stack_Client {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Stack ds = new Dynamic_Stack();
		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		ds.push(150);
		ds.push(11);
		ds.push(111);
		ds.display();

	}

}
