package Lec23;

import java.util.Stack;

public class Stack_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		// add
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
//		Vector<Integer> v1 = new Vector<>(100);
//		v1.add(1);
		System.out.println(st);
		// get olny top element
		System.out.println(st.peek());
		// remove
		System.out.println(st.pop());
		System.out.println(st.size());
		System.out.println(st.isEmpty());
		for (int v : st) {
			System.out.print(v + " ");
		}
	}

}
