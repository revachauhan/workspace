package reva.geeksforgeeks.solution;

public class Max_sum_subMatrix {
	
	int max_submatrix_sum(int a[][])
	{
		int Columns  =  a[0].length;
		int Rows  = a.length;
		int max = 0;
		
		for(int left = 0;left<Columns;Columns++)
		{	
			int [] b = new int[Rows];
			
			for(int right = left;right<Columns;right++)
			{
				for(int i = 0;i<Rows;i++)
				{
					b[i] += a[i][right];
				}
				max = Math.max(max,Max_value_contiguos_subsequence.maxsum(b));
					
				
			}
		
		}	
		return max;
				
	}
	

}
