package Lec25;

import Lec23.Queue;

public class Dynamic_Queue extends Queue {

	@Override
	public void Enqueue(int item) throws Exception {
		if (isfull()) {
			int[] new_arr = new int[2 * arr.length];
			for (int i = 0; i < arr.length; i++) {
				int idx = (front + i) % arr.length;
				new_arr[i] = arr[idx];
			}
			arr = new_arr;
			front = 0;
		}
		super.Enqueue(item);
	}
	

}
