package linkedList;

public class LinkedListUse {
 
	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
		//Your code goes here
		if(head == null)
			return null;
		LinkedListNode<Integer> tail = head, temp = head;
		int prev = head.data;
		temp = head.next;
		while(temp != null)
		{
			if(prev != temp.data)
			{
				tail.next = temp;
				tail = temp;
				prev = temp.data;
			}
			temp = temp.next;
		}
		return head;  
	}
	
	public static LinkedListNode<Integer> insertAtBeg(LinkedListNode<Integer> head, int data)
	{
		LinkedListNode<Integer> temp =new LinkedListNode<>(data);
		temp.next = head;
		head = temp;
		return head;
	}
	
	public static void insertAtEnd(LinkedListNode<Integer> head, int data)
	{
		LinkedListNode<Integer> temp =new LinkedListNode<>(data);
		LinkedListNode<Integer> prev = head;
		
		while(prev.next != null)
		{
			prev = prev.next;
		}
		prev.next = temp;
		return;
	}
	
	public static LinkedListNode<Integer> insertAtPos(LinkedListNode<Integer> head, int pos, int data)
	{
		LinkedListNode<Integer> temp =new LinkedListNode<>(data);
		LinkedListNode<Integer> prev = head;
		
		if(pos == 0)
		{
			if(head == null)
				return temp;
			else
			{
				temp.next = head;
				head = temp;
				return head;
			}
		}
		int i = 0;
		int cnt = 0;
		
		LinkedListNode<Integer> cp = head;
		while(cp != null)
		{
			cnt++;
			cp = cp.next;
		}
		
		if(cnt < pos){
			System.out.println("Invalid Position.");
			return head;
			}
		
		
		while(i < pos-1)
		{
			i++;
			prev = prev.next;
		}
		
		temp.next = prev.next;
		prev.next = temp;
		return head;
	}
	
	public static void print(LinkedListNode<Integer>head)
	{
		LinkedListNode<Integer> temp;
		temp = head;
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp  = temp.next;
		}
		System.out.println();
		return;
	}
	
	static LinkedListNode<Integer> fhead;
	
	public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
		//Your code goes here
		
        if(head == null || head.next == null)
        {
        	 fhead = head;
             return head;
        }
           
        LinkedListNode<Integer> lastIndex = reverseLinkedListRec(head.next);
        lastIndex.next = head;
        return head;
	}
	
	public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer>head, int i , int j)
	{
		if(head == null)
		return head;
		
		LinkedListNode<Integer> prev = null,  temp = head;
		int cnt =0;
		
		if(i > j)
			j = i;
		
		while(temp != null)
		{
			if(cnt == i)
			{
				prev = temp;
			}
			if(cnt == j)
			{
				int temp2 = prev.data;
				prev.data = temp.data;
				temp.data = temp2;
				return head;
			}
			cnt++;
			temp = temp.next;
		}
		
		return head;
	}
	
	public static LinkedListNode<Integer>bubbleSort(LinkedListNode<Integer> head)
	{
		if(head == null || head.next == null)
			return head;
		LinkedListNode<Integer> temp;
		temp = head;
		
		while(temp.next != null)
		{
			LinkedListNode<Integer> temp2 = temp.next;
			while(temp2 != null)
			{
				if(temp.data > temp2.data)
				{
					int xchange = temp.data;
					temp.data = temp2.data;
					temp2.data = xchange;
				}
				temp2 = temp2.next;
			}
			temp = temp.next;
		}
		return head;
	}
	
	public static LinkedListNode<Integer>evenAfterOdd(LinkedListNode<Integer> head)
	{
//		if(head == null)
//			return head;
//		
//		LinkedListNode<Integer> temp = head, temp2 = head;
//		LinkedListNode<Integer> evenIndex = null;
//		boolean flag = false;
//		
//		while(temp2 != null)
//		{
//			while(temp != null)
//		
//			{
//				if(temp.data%2 == 0 && !flag)
//				{
//					evenIndex = temp;
//					flag = true;
//				}
//				if(flag)
//				{
//					if(temp.data%2 != 0)
//					{
//						int numTemp = evenIndex.data;
//						evenIndex.data = temp.data;
//						temp.data = numTemp;
//						evenIndex = temp;
//					}
//				}
//				temp = temp.next;
//			}
//			temp2 = temp2.next;
//		}
//		return head;
		
		LinkedListNode<Integer>oddhead = null;
		LinkedListNode<Integer>oddtail = null;
		LinkedListNode<Integer>evenhead = null;
		LinkedListNode<Integer>eventail = null;
		LinkedListNode<Integer>currenthead = head;
		
		while(currenthead != null)
		{
			int item = currenthead.data;
			
			if(item % 2 == 0)
			{
				if(evenhead == null)
				{
					evenhead = currenthead;
					eventail = evenhead;
				} else
				{
					eventail.next = currenthead;
					eventail = eventail.next;
				}
			}
			else
			{
				if(oddhead == null)
				{
					oddhead = currenthead;
					oddtail = oddhead;
				}
				else
				{
					oddtail.next = currenthead;
					oddtail = oddtail.next;
				}
			}
			 currenthead = currenthead.next;
		}
		if(oddhead == null || evenhead == null)
		{
			return head;
		}
		oddtail.next = evenhead;
		eventail.next = null;
		head = oddhead;
		return head;
	}
	
	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N)
	{
		
		if(head == null || M == 0)
			return null;
		
		LinkedListNode<Integer>temp = head;
		LinkedListNode<Integer>ttail = null;
		int i = 0, j = 0;
		
		while(temp != null) {
		
		while(temp != null && i < M-1)
			{
			temp = temp.next;
			i++;
			}
		ttail = temp;
		System.out.println(ttail.data);
		while(temp != null && j < N-1)
		{
			temp = temp.next;
			j++;
		}
		if(temp != null)
		ttail.next = temp.next;
//		else
//			ttail = null;
		i = 0;
		j = 0;
		}
		return head;
	}
	
	
	public static void changeLL(LinkedListNode<Integer> head) {
		// Write your code here
        
        if(head == null || head.next == null)
        	return;
        int mx = 0;
        LinkedListNode<Integer> temp = head;
        while(temp != null)
        {
        	if(mx < temp.data)
        	{
        		mx = temp.data;
        	}
        	temp = temp.next;
        }
        
        temp = head;
        while(temp.next != null)
        {
        	LinkedListNode<Integer> temp2 = temp.next;
        	while(temp2 != null)
        	{
        		if(temp.data == temp2.data)
        			temp2.data = ++mx;
        		temp2 = temp2.next;
        	}
        	temp = temp.next;
        }
        return;
	}
	
	
	static LinkedListNode<Integer> insertRec(LinkedListNode<Integer> head, int pos, int data)
	{
		if(head == null && pos > 0)
			return head;
		if(pos == 0)
		{
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			newNode.next = head;
			head= newNode;
			return head;
		}
		LinkedListNode<Integer> smallhead;
		smallhead = insertRec(head.next, pos-1, data);
		head.next = smallhead;
		return head;
	}
	
	public static void main(String[] args) {
		
		LinkedListNode<Integer> head = new LinkedListNode<>(1);
		head = insertRec(head, 0, 10);
		head = insertRec(head, 1, 15);
		head = insertRec(head, 2, 45);
		head = insertRec(head, 0, 40);
		print(head);
		
	}	
}
