package ds.queue;

public class Queue {
	private int maxSize; // initializes the set number of slots
	private long[] queArray; //slots to maintain the data.
	private int front; // this will be the index position for the element in the front.
	private int rear;  // index in the back position of the element
	private int nItems; // counter to maintain the number of of items in our queue.
	
	
	public Queue(int size) {
		this.maxSize = size;
		this.queArray = new long[size];
		this.front = 0; //index position of the first slot of the array.
		rear = -1; // there is no item in the array yet to be considered as the last item
		this.nItems = 0; // no elements in array yet
	}
	
	
	public void insert(long j) {
		if(rear == maxSize - 1) {
			rear = -1;
		}
		rear++;
		this.queArray[rear] = j;
		this.nItems++;
	}
	public long remove() {
		long temp = this.queArray[front];
		queArray[front] = 0;
		front++;
		if(front == maxSize) {
			front = 0; // rest front to zero
		}
		nItems--;
		System.out.println(temp);
		return temp;
	}
	
	
	
	public boolean isEmpty() {
		return (nItems == 0);
	}
	
	public boolean isFull() {
		return (nItems == maxSize);
	}
	
	
	public long peekFront() {
		return queArray[front];
	}
	
	public void view() {
		System.out.print("[");
		for (int i = 0; i < queArray.length; i++) {
			System.out.print(this.queArray[i]);
			if(i != queArray.length -1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}
	
}
















