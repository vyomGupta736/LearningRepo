package MyLinkedList;

public class ApplyLinked 
{
  public static void main(String args[])
  {
	  MyLinkedList ob = new MyLinkedList();
	  
	  ob.add(3);
	  
	  ob.add(23);
	  
	  ob.add(12);
	  
	  ob.add(0,45);
	  
	  MyLinkedList l2 = new MyLinkedList();
	  
	  l2.add(10);
	  l2.add(10);
	  l2.add(10);
	  
	  ob.addAll(l2);
	  
	  ob.removeFirst();
	  
	  ob.removeLast();
	  
	  ob.print();
	
  }
}
