package Lec23;

public class Queue {
	private int[] arr;
	private int front = 0;
	int size = 0;//
//	int rear=0;

	public Queue() {
		// TODO Auto-generated constructor stub
		this(5);
	}

	public Queue(int n) {
		// TODO Auto-generated constructor stub
		arr = new int[n];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isfull() {
		return size == arr.length;
	}

	public int size() {
		return size;
	}

	public void Enqueue(int item) throws Exception {
		if (isfull()) {
			throw new Exception("Bklol Queue full hogya ");
		}
		int idx = (front + size) % arr.length;
		arr[idx] = item;
		// rear++;
		size++;
	}

	public int dequeue() throws Exception {
		if (isEmpty()) {
			throw new Exception("Bklol Queue Empty hogya ");
		}
		int v = arr[front];
		front = (front + 1) % arr.length;
		size--;
		return v;
	}

	public int get() throws Exception {
		if (isEmpty()) {
			throw new Exception("Bklol Queue Empty hogya ");
		}
		return arr[front];
	}

	public void Display() {
		for (int i = 0; i < size; i++) {
			int idx = (front + i) % arr.length;
			System.out.print(arr[idx]+" ");

		}
		System.out.println();
	}
}















