package stack;
import java.util.Stack;
public class RevStack {
	
	static Stack<Integer> st = new Stack<Integer>();
	static Stack<Integer> extra = new Stack<Integer>();
	
	public static void revUsingExtra(int x)
	{
		if(extra.empty())
			extra.push(x);
		else
		{
			int a = extra.peek();
			extra.pop();
			revUsingExtra(a);
			st.push(a);
		}
	}
	
	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		//Your code goes here
		while(!input.empty())
			extra.push(input.pop());
		revUsingExtra(-1);
	}
	
	 public static void main(String[] args)
	    {
	         
	        // push elements into
	        // the stack
	        st.push(1);
	        st.push(2);
	        st.push(3);
	        st.push(4);
	         
	        System.out.println("Original Stack");
	         
	        System.out.println(st);
	         
	        // function to reverse
	        // the stack
	        reverseStack(st, extra);
	        System.out.println("Reversed Stack");
	         
	        System.out.println(st);
	    }
}
