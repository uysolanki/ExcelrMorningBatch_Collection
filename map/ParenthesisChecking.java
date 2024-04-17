package day27.collection.map;
import java.util.Stack;

public class ParenthesisChecking {
   public static boolean expressionEvaluation(String input)
   {
	   Stack<Character> stack=new Stack<>();
		
		char k;
		for(int i=0;i<input.length();i++)
		{
			char z;
			k=input.charAt(i);
			if(k=='[' || k=='{' || k=='(')
			{
				stack.push(k);
				continue;
			}
			
			if(stack.isEmpty())
				return false;
			
			switch(k)		//]
			{
				case ']':
						z=stack.pop();	
						if(z=='{' || z=='(' )  
						{
							return false;
						}
						break;
						
				
				case '}':
						z=stack.pop();	
						if(z=='(' || z=='[' )
						{
							return false;
						}
						break;
						
				case ')':
						z=stack.pop();	 // (
						if(z=='{' || z=='[' )
						{
							return false;
						}
						break;
			}
			
			
		}
		
		return(stack.isEmpty());
   }
	public static void main(String[] args) {
		String exp="{[()]}";
		if(expressionEvaluation(exp))
		{
			System.out.println("Balanced Expression");
		}
		else
		System.out.println("Not A Balanced Expression");
	}

}
