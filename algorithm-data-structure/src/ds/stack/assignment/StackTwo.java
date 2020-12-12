package ds.stack.assignment;

public class StackTwo {
	int maxSize;
	char[] wordArray;
	int top;
	
	public StackTwo(int size) {
		this.maxSize = size;
		this.wordArray = new char[this.maxSize];
		this.top = -1;
	}
	
	
	public void push(char j) {
		if(isFull()) {
			System.out.println("The stack is full");
		}else {
			top++;
			wordArray[top] = j;
		}
		}
		
	public char pop() {
		if(isEmpty()) {
			System.out.println("The stack is empty");
			return 'O';
		}else {
			int value = top;
			top--;
			return wordArray[value];
		}
		}
	
	public boolean isFull() {
		// TODO Auto-generated method stub
		return (maxSize -1 == top);
	}


	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (top == -1);
	}

}
