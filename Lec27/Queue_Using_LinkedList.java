package Lec27;

import java.util.*;

public class Queue_Using_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LinkedList<Integer> ll = new LinkedList<>();
		Queue<Integer> ll = new LinkedList<>();
		ll.add(10);// add last--> enqueue
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		System.out.println(ll.remove());// remove first Dqeueue
		System.out.println(ll.poll());// remove first Dqeueue
		System.out.println(ll.peek());// get first

	}

}
