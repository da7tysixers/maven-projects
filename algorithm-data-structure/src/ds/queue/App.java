package ds.queue;

public class App {
	public static void main(String[] args) {
		Queue myQueue = new Queue(5);
		myQueue.insert(100);
		myQueue.insert(1000);
		myQueue.insert(14);
		myQueue.insert(12);
		myQueue.insert(44);
		
		myQueue.view();
		
		System.out.println();
		myQueue.remove();
		myQueue.remove();
		
		myQueue.remove();
	
		System.out.println("#############");
		myQueue.insert(9999);
		myQueue.remove();
		myQueue.view();
		
	}
}
