package reva.java.practice;


public class MergeSort
{


	public static void main(String[] args) {

		int[] numbers = {13,3,45,8,23,7,1,9,10,12};
		mergeSort(numbers, 0,numbers.length-1);		
		for(int i : numbers)
			System.out.print(i+"\t");

	}


	public static void mergeSort(int [] arr, int low , int high)
	{    
		if(low>=high)
			return;
		else
		{
			int mid = (low+high)/2;
			mergeSort(arr,low,mid);
			mergeSort(arr,mid+1,high);
			merger(arr,low,mid,high);    
		}
	}


	public static void merger(int [] arr, int low, int mid, int high)
	{
		int [] temp = new int[high+1];

		for(int i = low; i <=high; i ++)
		{
			temp[i] = arr[i];
		}

		int i = low;
		int j = mid+1;
		int k  = low;

		while(i <=mid && j <=high)
		{
			if(temp[j]<=temp[i])
			{
				arr[k] = temp[j];
				j++;

			}
			else 
			{
				arr[k] = temp[i];
				i++;
			}  
			k++;  

		}
		while(i <=mid)
		{
			arr[k] = temp[i];
			i++;
			k++;
		}
	}
}