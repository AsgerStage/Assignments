package CodeJudge;

import java.io.*;
import java.util.*;
/* 
class Node{
Node next;
int data;
public Node(){
	
}

public Node(int indata){
	this.data=indata;
}

}


class Stack {
	Node head;
	public Stack(){
		head = new Node();
	}

	public void push(int e) {
		Node temp = head;
		head = new Node(e);
		head.next =temp;
	}

	public int pop() {
		int dat=head.data;
		head=head.next;
		return dat;
		
	}
}
*/
public class StackDriver
{
	public static void main(String[] args) throws IOException {
		new StackDriver().run();
	}

	private void run() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(new BufferedOutputStream(System.out)));

		Stack stack = new Stack();

		int N = Integer.parseInt(in.readLine());

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			String type = st.nextToken();

			if (type.equals("PU")) {
				stack.push(Integer.parseInt(st.nextToken()));
			} else {
				out.println(stack.pop());
			}
		}
		out.flush();
	}
}
