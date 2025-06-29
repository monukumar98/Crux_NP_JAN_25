package Lec35;

import java.util.ArrayList;

public class HashMap<K, V> {
	class Node {
		K key;
		V value;
		Node next;
	}

	ArrayList<Node> bukt;
	private int size;

	public HashMap() {
		// TODO Auto-generated constructor stub
		this(4);

	}

	public HashMap(int n) {
		// TODO Auto-generated constructor stub
		bukt = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			bukt.add(null);
		}

	}

	public int Hashfun(K key) {
		int idx = key.hashCode() % bukt.size();
		if (idx < 0) {
			idx += bukt.size();
		}
		return idx;
	}

	public void put(K key, V value) {
		int idx = Hashfun(key);
		// ------------------------------//
		Node curr = bukt.get(idx);
		while (curr != null) {
			if (curr.key.equals(key)) {
				curr.value = value;
				return;
			}
			curr = curr.next;
		}
		// --------------------------------//
		Node nn = new Node();
		nn.key = key;
		nn.value = value;
		size++;
		curr = bukt.get(idx);
		nn.next = curr;
		bukt.set(idx, nn);
		double thf = 2.0;
		double lf = (1.0 * size) / bukt.size();
		if (lf > thf) {
			rehashing();
		}

	}

	private void rehashing() {
		// TODO Auto-generated method stub
		ArrayList<Node> newbukt = new ArrayList<>();
		for (int i = 0; i < 2 * bukt.size(); i++) {
			newbukt.add(null);
		}
		ArrayList<Node> oba = bukt;
		bukt = newbukt;
		size = 0;
		for (Node node : oba) {
			while (node != null) {
				put(node.key, node.value);
				node = node.next;
			}
		}

	}

	@Override
	public String toString() {
		String s="{";
		for (Node node : bukt) {
			while (node != null) {
			s= s+node.key+"="+node.value+",";
				node = node.next;
			}
		}
		return s+"}";

	}

	public V get(K key) {
		int idx = Hashfun(key);
		Node curr = bukt.get(idx);
		while (curr != null) {
			if (curr.key.equals(key)) {

				return curr.value;
			}
			curr = curr.next;
		}
		return null;
	}

	public boolean ContainsKey(K key) {
		int idx = Hashfun(key);
		Node curr = bukt.get(idx);
		while (curr != null) {
			if (curr.key.equals(key)) {

				return true;
			}
			curr = curr.next;
		}
		return false;
	}

	public int size() {
		return size;
	}

	public V remove(K key) {
		int idx = Hashfun(key);
		Node curr = bukt.get(idx);
		Node prev = null;
		while (curr != null) {
			if (curr.key.equals(key)) {
				break;
			}
			prev = curr;
			curr = curr.next;
		}
		if (curr == null) {
			return null;
		}
		if (prev == null) {
			bukt.set(idx, curr.next);
		} else {
			prev.next = curr.next;

		}
		curr.next = null;
		size--;
		return curr.value;

	}

}
