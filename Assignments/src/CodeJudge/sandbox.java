package CodeJudge;

public class sandbox {

	public static void main(String[] args) {
	Queue sd = new Queue();
		sd.enqueue(1);
		sd.enqueue(2);
		System.out.println(sd.dequeue());
		System.out.println(sd.dequeue());
		sd.enqueue(7);
		System.out.println(sd.dequeue());
		sd.enqueue(4);
		System.out.println(sd.dequeue());
	
		
		sd.enqueue(5);
		sd.enqueue(6);
		sd.enqueue(7);
	}
}
