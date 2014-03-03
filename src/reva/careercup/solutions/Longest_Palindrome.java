package reva.careercup.solutions;

public class Longest_Palindrome {

	public static void main(String[] args) {

		String str =" abcbcaddabagffgafsdjkl";
		System.out.println(longestPalindrome(str));

	}

	public static String longestPalindrome(String str)
	{
		String result = null;
		int max= 0;

		for(int i = 1; i < str.length(); i ++)
		{
			for(int j = i -1, k = i+1; j >= 0 && k < str.length();j--,k++ )
			{
				if(str.charAt(j)== str.charAt(k))
				{	if(max < str.substring(j,k+1).length())
				{
					result = str.substring(j,k+1);
					max = result.length();
				}
				continue;
				}
				break;

			}


		}

		for(int i = 0; i < str.length(); i ++)
		{
			for(int j = i, k = i+1; j >= 0 && k < str.length();j--,k++ )
			{
				if(str.charAt(j)== str.charAt(k))
				{	if(max < str.substring(j,k+1).length())
				{
					result = str.substring(j,k+1);
					max = result.length();
				}
				continue;
				}
				break;

			}


		}
		return result ;
	}

}
