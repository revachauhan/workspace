package reva.careercup.solutions;
//Print all possible combinations of r elements in a given array of size n
public class PrintCombination {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5};
		_printCombination(a, 2);


	}

	public static void _printCombination(int []a,int r)
	{
		int [] data = new int[r];
		int n = a.length;

		combinationUtil(a,data,0,n-1,0,r);

	}

	private static void combinationUtil(int[] a, int[] data, int start, int end, int index, int r) 
	{

		if(index==r)
		{
			print(data);
			return;
		}

		for(int i = start;i <= end;i++)
		{
			if((end-i +1)>= (r-index))
			{
				data[index] = a[i];

				combinationUtil(a, data, i+1, end, index+1, r);
			}
		}



	}

	private static void print(int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] +" ");

		}
		System.out.println();

	}



}
