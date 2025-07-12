package Lec38;

import java.util.*;

public class BellMan_Ford {

	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public BellMan_Ford(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void Addedge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);

	}

	class EdgePair {
		int e1, e2, cost;

		public EdgePair(int e1, int e2, int cost) {
			// TODO Auto-generated constructor stub
			this.e1 = e1;
			this.e2 = e2;
			this.cost = cost;

		}
	}

	public List<EdgePair> getallEdge() {
		List<EdgePair> ll = new ArrayList<>();
		for (int e1 : map.keySet()) {
			for (int e2 : map.get(e1).keySet()) {
				int cost = map.get(e1).get(e2);
				ll.add(new EdgePair(e1, e2, cost));
			}
		}
		return ll;
	}

	public void BellMan_Algo() {
		List<EdgePair> ll = getallEdge();
		int v = map.size();
		int[] dis = new int[v + 1];
		// src = 1
		for (int i = 2; i < dis.length; i++) {
			dis[i] = 567899;
		}
		for (int i = 1; i <= v; i++) {
			for (EdgePair e : ll) {
				if (i == v && (dis[e.e2] > dis[e.e1] + e.cost)) {
					System.out.println("-ve  wt ka cycle hai");
					return;
				}
				if (dis[e.e2] > dis[e.e1] + e.cost) {
					dis[e.e2] = dis[e.e1] + e.cost;
				}
			}
		}
		for (int i = 1; i < dis.length; i++) {
			System.out.print(dis[i] + " ");
		}
	}

	public static void main(String[] args) {
		BellMan_Ford bf = new BellMan_Ford(5);
		bf.Addedge(1, 2, 8);
		bf.Addedge(1, 3, 4);
		bf.Addedge(1, 4, 5);
		bf.Addedge(3, 4, -3);
		bf.Addedge(4, 5, 4);
		bf.Addedge(5, 2, 1);
		bf.Addedge(2, 5, -2);
		bf.BellMan_Algo();

	}

}
