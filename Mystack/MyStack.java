package Mystack;

import MyLinkedList.MyLinkedList;

public class MyStack
{
   
	private MyLinkedList ob = new MyLinkedList();
	
	public void push(int data)
	{
		ob.add(0, data);
		return;
	}
	
}
