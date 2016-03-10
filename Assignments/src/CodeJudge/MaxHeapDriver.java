package CodeJudge;

import java.io.*;
import java.util.*;

class MaxHeap {
	
	public int[] elements = new int[10001];
	 int size = 0;

	
	public void insert(int e) {
		size+=1;
		elements[size]=e;
		bubbleUp(size);
	}

	private void bubbleUp(int e) {
		int tmp;

		while(elements[e]>elements[parent(e)]){
			tmp=elements[parent(e)];
			elements[parent(e)]=elements[e];
			elements[e]=tmp;
			e=parent(e);
			
			
		}
	}

	public int extractMax() {
		int r=elements[1];
		elements[1]=elements[size];
		size-=1;
		bubbleDown(1);
		return r;
		
	}

	private void bubbleDown(int e) {
		int tmp;
		
		if(elements[e*2]>=elements[(e*2)+1]){
		while(elements[e]<elements[e*2]){
			
				tmp=elements[e*2];
			elements[e*2]=elements[e];
			elements[e]=tmp;
			e=e*2;
			if(e>size)return;
		}}
			
			else if (elements[e*2]<elements[(e*2)+1]){
			while(elements[e]<elements[(e*2)+1]){
				tmp=elements[(e*2)+1];
				elements[(e*2)+1]=elements[e];
				elements[e]=tmp;
				e=(e*2)+1;
				if(e>size)return;
				}
			}
			
		}
		
		
	
	public int parent(int i){
	int r=(int) Math.floor(i/2);
	if (r<=0)r=1;
	
	return r;
	}


	// ##################################################
	// # You do not need to modify anything below here. #
	// ##################################################

	public void print(PrintWriter out) {
		for (int i = 1; i <= size; i++) {
			out.print(elements[i] + " ");
		}
		out.println();
	}
}


public class MaxHeapDriver
{
	public static void main(String[] args) throws IOException {
		new MaxHeapDriver().run();
	}

	private void run() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(new BufferedOutputStream(System.out)));

		MaxHeap maxHeap = new MaxHeap();

		int N = Integer.parseInt(in.readLine());

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			String type = st.nextToken();

			if (type.charAt(0) == 'I') {
				maxHeap.insert(Integer.parseInt(st.nextToken()));
			} else if (type.charAt(0) == 'E') {
				out.println(maxHeap.extractMax());
			} else {
				maxHeap.print(out);
			}
		}
		out.flush();
	}
}