package day26.collection.vector;

import java.util.Scanner;

public class StackDemo {

	public static void main(String[] args) {
	MyStack mystack=new MyStack();
	Scanner sc=new Scanner(System.in);
	do
	{
	System.out.println("*******STACK MENU*************");
	System.out.println("1. PUSH");
	System.out.println("2. POP");
	System.out.println("3. DISPLAY");
	System.out.println("4. PEEK");
	System.out.println("5. EXIT");
	System.out.println("ENTER CHOICE ");
	int choice=sc.nextInt();
	
	switch(choice)
	{
	case 1 : mystack.push(); break;
	case 2 : mystack.pop(); break;
	case 3 : mystack.display(); break;
	case 4 : System.out.println("Element at top is" + mystack.peek()); break;
	case 5 : System.exit(0); break;
	default : System.out.println("Invalid input");
	}
	}while(true);

	}

}
