package binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class BinaryTreeUse {
	static Scanner s = new Scanner(System.in);
	
	public static BinaryTreeNode<Integer> buildTreeHelper(int pre[], int in[], int preS, int preE, int inS, int inE) {
		if (inS > inE) {
			return null;
		}

		int rootData = pre[preS];
		int rootIndex = -1;
		for (int i = inS; i <= inE; i++) {
			if (in[i] == rootData) {
				rootIndex = i;
				break;
			}
		}

		int lInS = inS; //left inorder start
		int lInE = rootIndex - 1;//left inorder end
		int lPreS = preS + 1;//left preorder start
		int lPreE = lInE - lInS + lPreS;//left preorder end
		int rPreS = lPreE + 1;//right preorder start
		int rPreE = preE;//right preorder end
		int rInS = rootIndex + 1;//right inorder start
		int rInE = inE;//right inorder end
		BinaryTreeNode<Integer>  root = new BinaryTreeNode<Integer>(rootData);
		root.left = buildTreeHelper(pre, in, lPreS, lPreE, lInS, lInE);
		root.right = buildTreeHelper(pre, in, rPreS, rPreE, rInS, rInE);
		return root;
	}
	
	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		//Your code goes here
		return buildTreeHelper(preOrder,inOrder,0,preOrder.length-1,0,inOrder.length-1);
	}
	
	public static void changeToDepthTree(BinaryTreeNode<Integer>root, int level)
	{
		if(root == null)
			return;
		 root.data = level;
		changeToDepthTree(root.left, root.data+1);
		changeToDepthTree(root.right, root.data+1);
	}
	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
	    //Your code goes here
		changeToDepthTree(root, 0);
	}

	
	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
	    //Your code goes here
        if (root == null)
        return false;
 
    if (root.data == x)
        return true;
 
    boolean flag1 = isNodePresent(root.left, x);
   
    if(flag1) return true;
 
    
    boolean flag2 = isNodePresent(root.right, x);
 
    return flag2;
	}

	
	public static int height(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(height(root.left), height(root.right));
	}
		public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
			//Your code goes here
	        if (root == null) {
			return 0;
		}

		int option1 = height(root.left) + height(root.right);
		int option2 = diameterOfBinaryTree(root.left);
		int option3 = diameterOfBinaryTree(root.right);
		return 1 + Math.max(option1, Math.max(option2, option3));
		}
	
	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
		//Your code goes here
        if(root == null)
            return;
        if(root.left == null && root.right == null)
        {
            return;
        }
        BinaryTreeNode<Integer> temp = root.left;
    
    	root.left=root.right;
    	root.right=temp;
        
        mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);
	}
	
	
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if(root == null)
	        return;
	   
	    Queue<BinaryTreeNode<Integer>> previousNode = new LinkedList<BinaryTreeNode<Integer>>() ;
	    previousNode.add(root);
	    
	    while(!previousNode.isEmpty())
	    {
	    	BinaryTreeNode<Integer> front= previousNode.poll();
	        System.out.print(front.data+":");
	        
	        if(front.left != null)
	        {   previousNode.add(front.left);
	            System.out.print("L:"+front.left.data);
	        }
	         else
	             System.out.print("L:-1");
	        
	        System.out.print(",");
	        
	        if(front.right != null)
	       {
	        	previousNode.add(front.right); 
	       System.out.println("R:"+front.right.data);
	       }
	        else
	             System.out.println("R:-1");
        }
	}

	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if(root==null)
	        return;
	    
	    if(root.left != null && root.right == null)
	    {  
	    	System.out.print(root.left.data);
	    	printNodesWithoutSibling(root.left); 
	    }
	     else if(root.left == null && root.right != null)
	    {  
	    	 System.out.print(root.right.data);
    	printNodesWithoutSibling(root.right); 
	    }
		else 
	    {
			printNodesWithoutSibling(root.left); 
	        printNodesWithoutSibling(root.right);
	    }
	}
	
	public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
		//Your code goes here
		if(root == null)
			return 0;
		int count = 0;
		int smallSum = root.data;
		count += countNodesGreaterThanX(root.left, x);
		count += countNodesGreaterThanX(root.right, x);
		if(smallSum > x)
			count++;
		return count;
	}

	
	
	static void postOrder(BinaryTreeNode<Integer> root)
	{
		if(root == null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
		return;
	}
	
	static void preorderTree(BinaryTreeNode<Integer> root)
	{
		if(root == null)
			return;
		System.out.print(root.data+" ");
		preorderTree(root.left);
		preorderTree(root.right);
		return;
	}
	
	static int sumNode(BinaryTreeNode<Integer> root)
	{
		if(root == null)
			return 0;
		int smallSum = root.data;
		smallSum+=sumNode(root.left);
		smallSum+=sumNode(root.right);
//		System.out.println("root : "+root.data);
		return smallSum;
	}
	
	
	
	static BinaryTreeNode<Integer> makeTreeDetailed(boolean isRoot, int presentData, boolean isLeft)
	{
		if(isRoot)
		{
			System.out.println("Enter root element: ");
		}
		else
		{
			if(isLeft)
				System.out.println("Enter left child of "+presentData+": ");
			else
				System.out.println("Enter right child of "+presentData+": ");
		}
		
		int rootelement = s.nextInt();
		if(rootelement == -1)
			return null;
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootelement);
	
		root.left = makeTreeDetailed(false, rootelement, true);
		root.right = makeTreeDetailed(false, rootelement, false);
		
		return root;
	}
	
	static void printTree(BinaryTreeNode<Integer> root)
	{
		if(root == null)
			return;
		
		System.out.print(root.data+": ");
		if(root.left != null)
			System.out.print("L"+root.left.data+" ");
		
		if(root.right != null)
			System.out.print("R"+root.right.data+" ");
		System.out.println();
		printTree(root.left);
		printTree(root.right);
		return;
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = makeTreeDetailed(true, 0, true);
		BinaryTreeUse.printTree(root);
//		System.out.println(BinaryTreeUse.sumNode(root));
//		BinaryTreeUse.preorderTree(root);
//		int a = BinaryTreeUse.countNodesGreaterThanX(root, 3);
//		System.out.println("no. of node greater than x: "+a);
	}

}
