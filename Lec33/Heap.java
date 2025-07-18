package Lec33;

import java.util.ArrayList;

public class Heap {
	private ArrayList<Integer> ll = new ArrayList<>();

	public void add(int item) {
		ll.add(item);
		upheapify(ll.size() - 1);

	}

	private void upheapify(int ci) {
		// TODO Auto-generated method stub
		int pi = (ci - 1) / 2;
		if (ll.get(pi) > ll.get(ci)) {
			// swap pi & ci
			swap(pi, ci);

			upheapify(pi);
		}

	}

	private void swap(int pi, int ci) {
		int pth = ll.get(pi);
		int cth = ll.get(ci);
		ll.set(pi, cth);// index , value
		ll.set(ci, pth);// index , value

	}

	public int get() {
		return ll.get(0);
	}

	public int size() {
		return ll.size();
	}

	public void display() {
		System.out.println(ll);
	}

	public int remove() {
		swap(0, ll.size() - 1);
		int rv = ll.remove(ll.size() - 1);
		downheapify(0);

		return rv;

	}

	private void downheapify(int pi) {
		// TODO Auto-generated method stub
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mini=pi;
		if(lci<ll.size() && ll.get(lci)<ll.get(mini)) {
			mini=lci;
		}
		if(rci<ll.size() && ll.get(rci)<ll.get(mini)) {
			mini=rci;
		}
		if(mini!=pi) {
			swap(mini, pi);
			downheapify(mini);
		}

	}
}



















