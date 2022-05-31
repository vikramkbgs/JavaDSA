package stack;

import java.util.Stack;

public class StackUse {

	
	public static boolean isBalanced(String expression) {
        //Your code goes here
        Stack<Character> stack = new Stack<>();
        
		for(int i = 0; i<expression.length(); i++)
		{
			if(expression.charAt(i) == '(' ||
					expression.charAt(i) == '{' 
					||expression.charAt(i) =='[')
			{
				stack.push(expression.charAt(i));
			}
			else if(stack.peek() == '(' && expression.charAt(i) == ')')
			{
				stack.pop();
			}
			else if(stack.peek() == '{' && expression.charAt(i) == '}')
			{
				stack.pop();
			}
			else if(stack.peek() == '[' && expression.charAt(i) == ']')
			{
				stack.pop();
			}
			else
			{
				return false;
			}
		}
        return stack.empty();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s = "[())]";
			System.out.println(isBalanced(s));
	}

}
