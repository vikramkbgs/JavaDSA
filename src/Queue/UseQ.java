package Queue;

public class UseQ {
	public static void main(String[] args) {
		Queue arr = new Queue();
		arr.enqueue(0);
		arr.enqueue(1);
		arr.enqueue(2);
		arr.enqueue(3);
		arr.dequeue();
		arr.dequeue();
		arr.enqueue(4);
		arr.dequeue();
		arr.dequeue();
		arr.dequeue();
		arr.dequeue();
		arr.enqueue(0);
		arr.enqueue(5);
		arr.dequeue();
		System.out.println(arr.front());
		
	}
}
