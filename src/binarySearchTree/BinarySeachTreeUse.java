package binarySearchTree;
import binaryTree.BinaryTreeNode;

public class BinarySeachTreeUse {

	public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root,int k1,int k2){
		  
		   if ( root == null )  
		        return;  
		  
		    if ( k1 < root.data )  
		        elementsInRangeK1K2(root.left, k1, k2);  
		   
		    if ( k1 <= root.data && k2 >= root.data )  
		        System.out.print(root.data+" ");  
		      
		    if ( k2 > root.data )  
		        elementsInRangeK1K2(root.right, k1, k2);  
	}
	
	public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
		if(root == null)
			return false;
		boolean flag = false;
		if(root.data == k)
			flag = true;
		if(flag)
			return true;
		if(root.data > k)
		flag = searchInBST(root.left, k);
		
		if(flag)
			return true;
		if(root.data < k)
		flag = searchInBST(root.right,k);
		return flag;
	}
	public static void main(String[] args) {
		
	}

}
