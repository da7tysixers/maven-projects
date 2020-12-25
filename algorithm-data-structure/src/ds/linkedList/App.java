package ds.linkedList;

public class App {
	public static void main(String[] args) {
		Node nodeA = new Node();
		nodeA.data = 4;
		
		
		Node nodeB = new Node();
		nodeB.data = 3;
		nodeA.next = nodeB;
		
		
		Node nodeC = new Node();
		nodeC.data = 7;
		nodeB.next = nodeC;
		
		Node nodeD = new Node();
		nodeD.data = 8;
		nodeC.next = nodeD;
		
	}

}
