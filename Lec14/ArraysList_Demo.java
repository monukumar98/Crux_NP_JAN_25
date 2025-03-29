package Lec14;

import java.util.*;

public class ArraysList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		// add
		ll.add(10);// O(1)
		ll.add(1);
		ll.add(7);
		ll.add(20);
		ll.add(1, -9);// O(N)
		System.out.println(ll);
		//get
		System.out.println(ll.get(1));//-9
		System.out.println(ll);
		// size
		System.out.println(ll.size());
		//update 
		ll.set(0, 2);// index , element
		System.out.println(ll);
		System.out.println(ll.remove(3));
		System.out.println(ll);

	}

}
