package reva.careercup.solutions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Sum_k_pair {
	int x;
	int y;

	public Sum_k_pair(int x, int y)
	{
		this.x = x ;
		this.y = y ;
	}

	public String toString()
	{
		return ("("+ x + ","+ y+ ")" );

	}


	public static Set<Sum_k_pair> printSumK(int [] arr, int k)
	{
		Set<Sum_k_pair> list = new HashSet<Sum_k_pair>();
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i ++)
		{

			if(findNum(arr,k-arr[i], 0 ,arr.length-1))
			{
				list.add(new Sum_k_pair(arr[i], k -arr[i]));
			}


		}

		return list;

	}


	private static boolean findNum(int [] arr, int i,int low, int high) {

		if(low> high)
			return false;

		int mid = (low+high)/2;
		if(arr[mid]== i)
			return true;
		else if(arr[mid]>i)
			return findNum(arr, i, low, mid-1);
		else if(arr[mid]<i)
			return findNum(arr, i, mid+1, high);
	
		return false;
	}

	
	public static void main(String[] args) {
		int arr[] = {0,1,2,3,4,5,6,7,8,9,10};
		
		Set<Sum_k_pair> result = printSumK(arr, 9);
		System.out.println(result);
		printPairs(arr, 9);
		
	}
	
	public static void printPairs(int[] arr, int k )
	{
		HashMap<Integer, Integer> result = new HashMap<>();
		for(int i : arr)
		{
			if(result.containsKey(i))
				System.out.print("("+result.get(i)+","+i +")");
			result.put(k - i, i);
		}
		
		
		
		
	}
}
