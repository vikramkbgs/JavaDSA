package Queue;

public class Queue {
	private static Node front;
    private static Node rear;
    private static int size;
    

	public Queue() {
		//Implement the Constructor
        
	}
	


	/*----------------- Public Functions of Stack -----------------*/


	public int getSize() { 
		//Implement the getSize() function
        return size;
    }


    public boolean isEmpty() { 
    	//Implement the isEmpty() function
        if(size == 0)
            return true;
        return false;
    }


    public void enqueue(int data) {
    	//Implement the enqueue(element) function
        if(front == null){
        front = new Node(data);
        rear = front; 
        }
        else
        {
            rear.next = new Node(data);
            rear = rear.next;
        }
        size++;
    }


    public int dequeue() {
    	//Implement the dequeue() function
        if(front == null)
            return -1;
        else
        {
            int data = front.data;
            front = front.next;
            size--;
            return data;
        }
       
    }


    public int front() {
    	//Implement the front() function
    	if(front == null)
    		return -1;
        return front.data;
    }
}
