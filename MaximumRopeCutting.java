package reva.geeksforgeeks.solution;
public class MaximumRopeCutting {
	
	int max_mine(int a,int b, int c)
	{
		return Math.max(a,Math.max(b, c));
	}
	
	public int max_product(int n)
	{
		if(n==0 || n == 1)
			return 0;
		int max_val= 0;
		for(int i =1 ; i<=n;i++)
		{
			max_val = max_mine(max_val,i*(n-i),max_product(n-i-1));
			
		}
		return max_val;
	}
	

	public static void main(String[] args) {
		
		int n = 10;
		MaximumRopeCutting m = new MaximumRopeCutting();
		int result = m.max_product(n);
		System.out.println(result);
		
		
	}
}
