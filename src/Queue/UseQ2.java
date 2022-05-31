package Queue;

public class UseQ2 {

	public static void main(String[] args) {
		Stack stackQueue = new Stack();
//		System.out.println(stackQueue.getSize());
		
		stackQueue.push(1);
		stackQueue.push(2);
		stackQueue.push(3);
		stackQueue.push(4);
//		stackQueue.push(11);
//		stackQueue.pop();
//		stackQueue.pop();
		System.out.println(stackQueue.pop());
//		System.out.println(stackQueue.isEmpty());
	}

}
