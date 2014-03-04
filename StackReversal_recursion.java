package reva.careercup.solutions;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;




public class StackReversal_recursion {
	
	public static void main(String[] args) {
		
	
		
		Stack<Integer> s = new Stack<>() ;
		for(int i =0; i < 4; i ++){
			s.push(i);
			
		}
		
		reversal(s);
		while(s.size()>0)
			System.out.print(s.pop() + " ");
			
	}
	public static void reversal(Stack<Integer> s)
	{
		if(s.size()==0)
			return;
		int n = getLast(s);
		reversal(s);
		s.push(n);
		
		
	}

	private static int getLast(Stack<Integer> s) {
		int a = s.pop();
		if(s.size()==0)
			return a;
		else
		{
			int k = getLast(s);
			s.push(a);
			return k;
			
			
		}
		
	}

}
