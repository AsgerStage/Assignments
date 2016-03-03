package CodeJudge;

import java.io.*;
import java.util.*;

class Node{
Node next;
int data;
public Node(){
	
}

public Node(int indata){
	this.data=indata;
}

}
class Queue {
	Node head;
	Node tail;
	public Queue(){
		
	}


	public void enqueue(int e) {
		Node add = new Node(e);
		if (head==null){
		add.next=head;
		head=add;
		tail=add;
		}
		else{
			tail.next=add;
			tail=add;
			tail.next=null;
		}
		
	/*	if (head==null){
			head=new Node(e);
			head.next=tail;
		}
		else if(tail==null)
		{
			tail=new Node(e);
			head.next=tail;
			tail.next=head;
		}
		else if (head!=null && tail!=null){
		Node add;
		add = new Node(e);
		add.next=tail;
		*/
		}
		
	

	public int dequeue() {
		int odata=head.data;
		head=head.next;
		return odata;
		
	}
}

// ##################################################
// # You do not need to modify anything below here. #
// ##################################################

public class QueueDriver
{
	public static void main(String[] args) throws IOException {
		new QueueDriver().run();
	}

	private void run() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(new BufferedOutputStream(System.out)));

		Queue queue = new Queue();

		int N = Integer.parseInt(in.readLine());

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			String type = st.nextToken();

			if (type.charAt(0) == 'E') {
				queue.enqueue(Integer.parseInt(st.nextToken()));
			} else {
				out.println(queue.dequeue());
			}
		}
		out.flush();
	}
}