package reva.geeksforgeeks.solution;

import java.util.ArrayList;
import java.util.List;
//Another  implementation is using Stack
/*
 * 
 * Recursively remove all adjacent duplicates
Given a string, recursively remove adjacent duplicate characters from string. 
The output string should not have any adjacent duplicates. See following examples.

Input:  azxxzy
Output: ay
First "azxxzy" is reduced to "azzy". The string "azzy" contains duplicates, 
so it is further reduced to "ay".

Input: geeksforgeeg
Output: gksfor
First "geeksforgeeg" is reduced to "gksforgg". The string "gksforgg" contains 
duplicates, so it is further reduced to "gksfor".

Input: caaabbbaacdddd
Output: Empty String

Input: acaaabbbacdddd
Output: acac
 * 
 */
public class RecursivelyRemoval {

	public static void main(String[] args) {

		List<Character> list = new ArrayList<>();	
		String str = "caaabbbaacdddd";
		System.out.println(recursiveRemoval(str, list));


	}

	public static ArrayList<Character> recursiveRemoval(String str, List<Character> list)
	{


		for(int i = 0; i < str.length();i++)
		{

			list.add(str.charAt(i));

		}


		ArrayList<Character> result = utilFunction(list);
		return result;


	}

	private static ArrayList<Character> utilFunction(List<Character> list) {

		int flag = 0;
		for(int i =0; i < list.size()-1; i ++)
		{
			if(list.get(i)==list.get(i+1))
			{
				if(i<list.size()-1&&list.get(i+1)==list.get(i+2))
					list.remove(i);

				list.remove(i);
				list.remove(i);
				if(i == list.size()-1)
					list.remove(i);
				flag=1;
				break;

			}
			



		}

		if(flag==1)
			return utilFunction(list);
		else 
			return (ArrayList<Character>) list;

	}



}
