package AlgorithmObli;


class Node{
Node next;
Node prev;
String data;
public Node(){
	
}

public Node(String indata){
	this.data=indata;
}

}
class DoubleLinkedList {
	Node head;
	Node tail;
	public DoubleLinkedList(){
		
	}


	public void enqueue(String e) {
		Node add = new Node(e);
		if (head==null){
		add.next=head;
		add.prev=tail;
		head=add;
		head.prev=null;
		tail=add;
		}
		else{
			add.prev=tail;
			tail.next=add;
			tail=add;
			tail.next=null;
		}
		
		}
		
	public void swap(Node x, Node y){
		
	}

	public String dequeue() {
		String odata=head.data;
		head=head.next;
		return odata;
		
	}
}


