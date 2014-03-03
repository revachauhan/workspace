package reva.careercup.solutions;

public class Segregate_even_odd {
	
	public static void main(String[] args) {
		int [] arr = {2,4,6,3,5,1};
		
		segreagteEvenOdd(arr);
		for(int i : arr)
			System.out.print(i+ "->");
	}
	
	public static void segreagteEvenOdd(int [] arr)
	{
		int left = 0 ;
		int right = arr.length-1;
		int temp = 0;
		
		while (left < right)
		{
			while(arr[left]%2!=0&& left < right )
				left++;
		    while(arr[right]%2==0 && left < right)
				right--;
			
			
			
		    temp = arr[left];
		    arr[left] = arr[right];
		    arr[right] = temp;		
			
		}
	}

}
