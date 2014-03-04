package reva.careercup.solutions;

import java.util.HashMap;

public class Anagram {

	static HashMap<Character,Integer> Anagram_table = new HashMap<Character,Integer>();
	
	
	public static boolean checkIfAnagram(String s1,String s2)
	{
		if(s1.length()!=s2.length())
			return false;

		for(int i =0;i < s1.length();i++)
		{	
			char c = s1.charAt(i);

			if(!Anagram_table.containsKey(c))
				Anagram_table.put(c,0);

			Anagram_table.put(c,(Anagram_table.get(c))+1);			
		}

		for(int j =0;j<s2.length();j++)
		{
			char c = s2.charAt(j);
			if(Anagram_table.containsKey(c))
			{
				Anagram_table.put(c,Anagram_table.get(c)-1);
				if(Anagram_table.get(c)==0)
					Anagram_table.remove(c);
			}
			else 
				return false;



		}

		return(Anagram_table.isEmpty());	

	}

}


/*
 int count[256]

 int i;

 if(s1.lenth! = s2.lenth())
 return false
 for(int i =0;i<=s1.lenth();i++)
 count[s1[i]]++;
 count[s2[i]]--;

 for(j =0;j<256;j++)
 if(count[j])
 return false 
 else true;




 */
