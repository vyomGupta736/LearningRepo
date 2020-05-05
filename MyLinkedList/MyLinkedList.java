package MyLinkedList;

public class MyLinkedList 
{
	Node head;
	public void add(int data)
	{
		Node toAdd = new Node(data);
		if(head == null)
		{
			head = toAdd;
			return;
		}
		Node temp = head;
		while(temp.next!=null)
		{
			temp = temp.next;
		}
		temp.next = toAdd;
		toAdd.prev = temp;
		return;
	}
	
	public void add(int pos, int data)
	{
		Node toAdd = new Node(data);
		if(head == null)
		{
			head = toAdd;
			return;
		}
		if(pos == 0)
		{
			toAdd.next = head;
			head.prev = toAdd;
			head = toAdd;
			return;
		}
		int i = 0;
		Node temp = head;
		while(temp.next!=null&&i<pos-1)
		{
			temp = temp.next;
			i++;
		}
		Node temp1 = temp.next;
		temp.next = toAdd;
		toAdd.next = temp1;
		toAdd.prev = temp;
		temp1.prev = toAdd;
		return;
	}
	
	public void addAll(MyLinkedList ob)
	{
		if(head == null)
		{
			head = ob.head;
			return;
		}
		Node temp = head;
		while(temp.next!=null)
		{
			temp = temp.next;
		}
		temp.next = ob.head;
		ob.head.prev = temp;
	}
	
	public void removeLast()
	{
		if(head.next == null)
		{
			head = null;
			return;
		}
		Node temp = head;
		while(temp.next!=null)
		{
			temp = temp.next;
		}
		temp.prev.next = null;
		temp = null;
		return;
	}
	
	public void removeFirst()
	{
		if(head.next == null)
		{
			head = null;
			return;
		}
		head.next.prev = null;
		head = head.next;
		return;
	}
	
	public int size()
	{
		if(head.next == null)
		{
			return 1;
		}
		Node temp = head;
		int i=0;
		while(temp!=null)
		{
			i++;
		}
		return i;
	}
	
	public int[] toArray()
	{
		int size = size();
		int a[] = new int[size];
		Node temp = head;
		int i=0;
		while(temp!=null)
		{
			a[i++] = temp.data;
			temp = temp.next;
		}
		return a;
	}
	
	public void print()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
		return;
	}
	
   static class Node
   {
	   int data;
	   Node next;
	   Node prev;
	   
	   public Node(int data)
	   {
		   this.data = data;
		   this.next = null;
		   this.prev = null;
	   }
   }
}
