package reva.careercup.solutions;
//Google question number 1 //Pattern matching 

public class pattern_matching1 {

	public static void main(String[] args) {

		boolean result = findMatch("lhw", "hello world");
		System.out.println(result);

	}

	public static  boolean findMatch(String pattern, String text)			
	{

		if(pattern.length() == 0)
			return true;
		if(text.length() ==0)
			return false;


		char [] p = pattern.toCharArray();
		char [] t = text.toCharArray();
		int m = t.length;
		int n = p.length;
		int count= 0;
		int i=0 ,  j = 0 ;
		for(; i < n; i++)
		{	
			for(; j< m; j++)
			{
				if(p[i]==t[j])
				{
					count++;
					j++;
					break;
				}

			}
			if(j==m-1)
				break;

		}	
		if(count == n)
			return true;
		else
			return false;

	}



}