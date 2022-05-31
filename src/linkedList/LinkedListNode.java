package linkedList;

public class LinkedListNode<T> {
		T data;
		public LinkedListNode<T> next;
		
		public LinkedListNode(T data)
		{
			this.data = data;
			next = null;
		}
}
