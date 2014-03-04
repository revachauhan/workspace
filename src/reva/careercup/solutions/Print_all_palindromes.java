package reva.careercup.solutions;

import java.util.HashMap;
import java.util.LinkedList;

/*
 * 
 * input: A string
output: A list of all palindromes in the string

for e.g. abcbcaddabagfgafsdjkl
bcb,adda, agfga

There are 2 cases one is odd occurring palindrome and other is even occurring palindrome 
 */
public class Print_all_palindromes {

	public static void main(String[] args) {

		String str = "abcbcaddabagffgafsdjkl";
		printAllPalindromes(str);



	}

	public static void printAllPalindromes(String str)
	{
		HashMap<Integer, String> map = new HashMap();


		for(int i = 1 ; i <str.length()-1; i++)//Odd occurences of palindrome
		{
			for(int j = i-1,k = i+1;j >= 0 && k < str.length();j--, k++ )
			{
				if(str.charAt(j) == str.charAt(k))
				{
					map.put(i-1, str.substring(j, k+1));
					continue;
				}
				break;

			}


		}

		int n = map.size();

		for(int i = 0 ; i <str.length()-1; i++)//Even occurences of palindrome
		{
			for(int j = i,k = i+1;j >= 0 && k < str.length();j--, k++ )
			{
				if(str.charAt(j) == str.charAt(k))
				{
					if(str.substring(j, k+1).length()>2)
						map.put(n, str.substring(j, k+1));
					continue;
				}

				break;
			}
			n++;

		}

		System.out.println(map);
	}





}
