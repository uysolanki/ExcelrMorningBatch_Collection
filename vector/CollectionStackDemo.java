package day26.collection.vector;

import java.util.Stack;

public class CollectionStackDemo {
public static void main(String[] args) {
	Stack stack=new Stack();
	stack.push(10);
	stack.push(20);
	stack.push(30);
	
	System.out.println(stack.peek());
	stack.pop();
	System.out.println(stack.peek());
	System.out.println(stack.isEmpty());
}
}
