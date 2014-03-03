package reva.careercup.solutions;
/*
 * You are given two version numbers of a software,like Version 10.3.4 and Version 10.3.41.
 *  Write a program in Java to find out which of the version numbers are the latest.If version 1 is latest output -1, 
 *  if version number 2 is latest output +1 else output 0 if same version. 
 *  Both the version numbers are taken as string.
 * 
 */
public class Version_differentiator {



	public static void main(String[] args) {

		String s1 = "10.3.4.2";
		String s2 = "10.3.4.1";

		printVersion(s1, s2);
	}

	public static void printVersion(String s1, String s2)
	{
		String[] arrs1  = s1.split("\\.");
		String[] arrs2  = s2.split("\\.");
		int i, n1,n2;

		for(i = 0 ; i < arrs1.length && i <arrs2.length; i ++)
		{

			if(( n1 =Integer.parseInt(arrs1[i]))!=( n2=Integer.parseInt(arrs2[i])))
			{
				System.out.println((n1-n2)>0?-1:1);
				return;
			}


		}
		if(arrs1.length==arrs2.length)
			{
			System.out.println(0);
			return;
			}
		else if(arrs1.length>arrs2.length)
		{
			System.out.println(-1);
			return;
		}
		else 
		{
			System.out.println(1);
			return;
		}
		
	}



}
