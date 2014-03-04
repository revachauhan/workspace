package reva.geeksforgeeks.solution;

public class Longest_Palindrome_subsequence {

	int lps_DP(char [] str)
	{	int n = str.length;
		int [][] table = new int[n][n] ;
		
		for(int i = 0;i<n;i++)
			table[i][i] = 1;
		
		for(int len = 2;len <=n;len++)
		{
			for(int i = 0;i <n-len+1;i++)
				{
				int j = i + len - 1;
				if(str[i]==str[j] && len ==2)
					table[i][j] = 2;
				else if(str[i]==str[j])
					table[i][j] = table[i+1][j-1]+2;
				else
					table[i][j] =Math.max(table[i][j-1],table[i+1][j]);
				}
			
			
		}
		
		
		return table[0][n-1];
	}
	
}
