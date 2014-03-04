package reva.geeksforgeeks.solution;

public class Max_value_contiguos_subsequence {
	
	public static int maxsum(int [] a)
	{
		int n = a.length;
		int max = 0,final_max= 0;
		
		for(int i = 0;i <n ;i++)
		{
			max = Math.max(0,max+a[i]);
			final_max = Math.max(max, final_max);
			
		}
		return final_max;
	}

}
