package reva.geeksforgeeks.solution;

import java.util.Arrays;
import java.util.HashMap;

//Count all distinct pairs with difference equal to k
/*
 * Input: arr[] = {1, 5, 3, 4, 2}, k = 3
Output: 2
There are 2 pairs with difference 3, the pairs are {1, 4} and {5, 2} 

Input: arr[] = {8, 12, 16, 4, 0, 20}, k = 4
Output: 5
There are 5 pairs with difference 4, the pairs are {0, 4}, {4, 8}, 
{8, 12}, {12, 16} and {16, 20} 
 * 
 */

public class DistinctPairsK {

	public static void main(String[] args) {

		int arr [] = {1,5,3,4,2};
		System.out.println(displayDistintCountPairs(arr, 3));
		System.out.println(displayDistintCountPairs1(arr, 3));
		System.out.println(displayDistintCountPairs2(arr, 3));
	}

	public static int displayDistintCountPairs(int [] arr, int k)
	{
		int count=0;
		int n = arr.length;
		for(int i = 0; i < n; i ++)
			for(int j =0; j < n && j != i; j++)
			{
				if(Math.abs(arr[i]- arr[j])==k)
				{
					count++;
					break;
				}

			}
		return count;
	}
	public static int displayDistintCountPairs1(int [] arr, int k)
	{
		int [] arr1 = arr.clone();
		Arrays.sort(arr1);
		int count = 0;
		int n = arr1.length;
		for(int i = 0; i < n; i++)
		{
			int m = arr1[i]+k;
			if(search(m,arr1,0,n-1)==true)
				count++;


		}
		return count;

	}

	private static boolean search(int m, int[] arr, int low, int high) 
	{
		if(low>high)
			return false;

		int mid = (low+high)/2;
		if(arr[mid]==m)
			return true;
		else if(arr[mid]<m)
		{
			return(search(m,arr,mid+1,high));

		}
		else
		{
			return(search(m,arr,low,mid-1));
		}


	}

	public static int displayDistintCountPairs2(int [] arr, int k)
	{
		int count = 0;

		HashMap<Integer,Boolean> table = new HashMap<>();

		for(int i = 0; i < 100; i++)
		{
			
			table.put(i, false);

		}
		
		
			

		for(int i : arr)
		{
			table.put(i, true);
			if(i+k <100 && table.get(i+k) )
				count++;

			if((i-k) > 0 && table.get(i-k))
				count++;
			
		}

		return count;


	}

}
