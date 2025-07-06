package Lec37;

import java.util.*;

public class Prims_Algorithm {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Prims_Algorithm(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public void Prims_Algo() {
		PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<>() {

			@Override
			public int compare(PrimsPair o1, PrimsPair o2) {
				// TODO Auto-generated method stub
				return o1.cost-o2.cost;
			}
			
		});
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new PrimsPair(1, 1, 0));
		while (!pq.isEmpty()) {
			// 1. remove
			PrimsPair pr = pq.poll();
			// 2. Ignore if already visited
			if (visited.contains(pr.vtx)) {
				continue;
			}
			// 3. marked visited
			visited.add(pr.vtx);
			// 4. self work
			System.out.println(pr);// sum = sum + pr.cost;
			// 5. Add nbrs
			for(int nbrs:map.get(pr.vtx).keySet()) {
				if(!visited.contains(nbrs)) {
					int cost=map.get(pr.vtx).get(nbrs); 
					pq.add(new PrimsPair(nbrs, pr.vtx, cost));
				}
			}
		}
	}

	class PrimsPair {
		int vtx;
		int acqvtx;
		int cost;

		public PrimsPair(int vtx, int acqvtx, int cost) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.acqvtx = acqvtx;
			this.cost = cost;
		}
		@Override
		public String toString() {
			return vtx+" "+acqvtx+" @ "+cost;
		}
	}
	public static void main(String[] args) {
		Prims_Algorithm pa = new Prims_Algorithm(7);
		pa.AddEdge(1, 2, 2);
		pa.AddEdge(2, 3, 3);
		pa.AddEdge(1, 4, 10);
		pa.AddEdge(4, 5, 8);
		pa.AddEdge(3, 4, 1);
		pa.AddEdge(5, 6, 5);
		pa.AddEdge(5, 7, 6);
		pa.AddEdge(6, 7, 4);
		pa.Prims_Algo();
		
	}
}
