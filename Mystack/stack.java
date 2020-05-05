package Mystack;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		
		Stack<Integer> ob = new Stack<>();
		
		ob.push(23);
		ob.push(10);
		ob.push(30);
		
		System.out.println(ob.peek());
		
		System.out.println(ob.pop());
		
		System.out.println(ob.peek());

	}

}
