package reva.careercup.solutions;
//Code to convert a number to it binary and counting the number of continuous zeros 
public class convert_2_binary {
	
	public static void main(String[] args) {
		convert_2_binary c= new convert_2_binary();
		int result = c.convert_no_conti_zeroes(8);
		System.out.println(result);
	}
	
	int convert_no_conti_zeroes(int n)
	{
		int max_count = 0;
		int temp = 0;
		
		while(n>1)
		{
			
			if(n%2 == 0)
			{
				temp++;
				n = n/2;
				if(temp>max_count)
					max_count = temp;
				
				
			}
			else 
			{
				temp=0;
				n = (n-1)/2;
				
			}
			
			
		}
		return max_count;	
		
	}

}
