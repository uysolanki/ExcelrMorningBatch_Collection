package day26.collection.vector;

import java.util.Scanner;

public class MyStack {
		private int stack[]=new int[5];
		private int top=-1;
		Scanner sc=new Scanner(System.in);
		
		public boolean isFull()
		{
			if(top==stack.length-1)
				return true;
			else
				return false;
		}
		
		public boolean isEmpty()
		{
			if(top==-1)
				return true;
			else
				return false;
		}
		public void push()
		{
			if(isFull())
				System.out.println("STACK IS FULL");
			else
			{
				System.out.println("Enter Element to Push");
				int data=sc.nextInt();
				top++;
				stack[top]=data;
				System.out.println("Data Pushed");
			}
				
		}
		
		public void pop()
		{
			if(isEmpty())
				System.out.println("STACK IS EMPTY");
			else
			{
				int data=stack[top];
				System.out.println(data + " has been Poped");
				top--;
			}
				
		}
		
		public void display()
		{
			if(isEmpty())
				System.out.println("STACK IS EMPTY");
			else
			{
				for(int i=top;i>=0;i--)
					System.out.println(stack[i]);
			}
				
		}
		
		public int peek()
		{
			return(stack[top]);
		}
		
}
