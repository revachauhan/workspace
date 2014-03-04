package reva.java.practice;

public class Stack_machine {

	int top;
	int length;
	int[] stack_array;



	public Stack_machine(String s) {

		stack_array = new int[s.length()];
		length= s.length();
		top =0;
		System.out.println(calculate(s));
		
	}

	void push(int element)
	{	

		stack_array[top++] = element;


	}

	int pop()
	{	

		return stack_array[--top];
	}

	int calculate(String s){

		for(int i =0;i <length;i++)
		{

			char  c = s.charAt(i);
			if(Character.isDigit(c))
				push(Integer.parseInt(Character.toString(c)));
			else
			{	
				switch(c)
				{
				case('+'):
				{
					int a = pop();
					int b = pop();
					int result = a+b;
					push(result);
					break;
				}

				case('*'):

				{
					int a = pop();
					int b = pop();
					int result = a*b;
					push((char) result);
					break;

				}

				}
			}






		}

		return stack_array[--top];
	}
}
