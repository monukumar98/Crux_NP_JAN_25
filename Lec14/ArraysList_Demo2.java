package Lec14;

import java.util.ArrayList;
import java.util.Collections;

public class ArraysList_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		// add
		ll.add(10);// O(1)
		ll.add(1);
		ll.add(7);
		ll.add(20);
		ll.add(1, -9);// O(N)
		ll.add(71);
		ll.add(201);
		System.out.println(ll);
		// sort
		Collections.sort(ll);
		System.out.println(ll);
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		System.out.println();
		int[] arr = new int[5];
		
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println();
        for(int v:ll) {
        	System.out.print(v+" ");	
		}

	}

}














