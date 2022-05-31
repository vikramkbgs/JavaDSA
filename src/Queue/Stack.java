package Queue;
import java.util.LinkedList;
import java.util.Queue;
public class Stack {
	static Queue<Integer> q1;
	static Queue<Integer> q2;
	static int size;

    public Stack() {
        //Implement the Constructor
    	q1 = new LinkedList<Integer>();
    	q2 = new LinkedList<Integer>();
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        //Implement the getSize() function
    	return q1.size();
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
    	return q1.isEmpty();
    }

    public void push(int element) {
        //Implement the push(element) function
    	if(q1.size()==0)
            q1.add(element);
        else{
            int size = q1.size();
            // Copy elements of Queue1 to Queue2
            for(int j=0 ; j<size ; j++)

                q2.add(q1.remove());
            q1.add(element);
            // Copy elements for Queue2 to Queue1
            for(int k=0 ; k<size ; k++)
                q1.add(q2.remove());
        }
    }

    public int pop() {
        //Implement the pop() function
    	if(q1.size() == 0)
    		return -1;
    	return q1.remove();
    }

    public int top() {
        //Implement the top() function
    	if(q1.isEmpty())
    		return -1;
    	return q1.peek();
    }
}
