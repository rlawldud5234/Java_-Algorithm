class Node{
	Node nextNode;
	int value;
	
	Node(int argValue, Node argNextNode){
		value = argValue;
		nextNode = argNextNode;
	}
}

// Queue class
class MyQueueListVersion{
	Node head, tail;
	int numOfData;
	
	// ������
	MyQueueListVersion(){
		tail = new Node(0, null);
		head = new Node(0, tail);
	}
	
	// numOfData�� ���� ��������� true�� ��ȯ
	boolean IsEmpty() {
		if(numOfData == 0)
			return true;
		return false;
	}

	// enqueue
	void enqueue(int argValue) {
		Node temp = head;
		while(temp.nextNode != tail)
			temp = temp.nextNode;
		
		Node newNode = new Node(argValue, tail);
		temp.nextNode = newNode;
		numOfData++;
	}
	
	// queue ������ ��ȯ
	int getSize() {
		return numOfData;
	}
	
	// dequeue
	int dequeue() {
		if(IsEmpty())
			return Integer.MAX_VALUE;
		
		// Head nextNode �ּ� ȹ��
		Node deletedNode = head.nextNode;
		
		// a Node�� value �� ȹ��
		int value = deletedNode.value;
		
		// Head nextNode = a.nextNode
		head.nextNode = deletedNode.nextNode;
		
		// a Node = Null;
		deletedNode = null;
		
		// numOfData--;
		numOfData--;
		
		// �� ��ȯ
		return value;
		
	}
	
	// ���ڿ� ��ȯ
	public String toString() {
		String msg = "";
		Node temp = head.nextNode;
		while(temp.nextNode!=null) {
			msg+=" "+temp.value;
			temp = temp.nextNode;
		}
		return msg;
	}
	
}

public class TP30 {

	public static void main(String[] args) {
		
		MyQueueListVersion myQueue = new MyQueueListVersion();
		
		System.out.println("Enqueue : 1 "); myQueue.enqueue(1);
		System.out.println("Enqueue : 2 "); myQueue.enqueue(2);
		System.out.println("Enqueue : 3 "); myQueue.enqueue(3);
		System.out.println(myQueue);
		
		System.out.println("Dequeue : "+ myQueue.dequeue());
		System.out.println(myQueue);
		System.out.println("Dequeue : "+ myQueue.dequeue());
		System.out.println(myQueue);
		
		System.out.println("Enqueue : 6 "); myQueue.enqueue(6);
		System.out.println(myQueue);
		
		System.out.println("Dequeue : "+ myQueue.dequeue());
		System.out.println(myQueue);

	}

}