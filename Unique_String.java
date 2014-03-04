package reva.java.practice;

public class Unique_String {
	
	
	public static void main(String[] args) {
		String str = "Reva";
		isUniqueChar(str);
	}
	
	public static boolean isUniqueChar(String s)
	{
		boolean[] char_set = new boolean[256];
		   
		for(int i =0;i < s.length();i++)
		{
			
			int m = s.charAt(i);
			if(char_set[m]=false)
			char_set[m] = true;
			else 
				return false;
		}
		
		
		
		return true;
				
	}

}
