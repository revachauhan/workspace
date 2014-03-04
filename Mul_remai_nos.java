package reva.careercup.solutions;
/*Given a array of numbers, for each element give the product of
  every other number. eg 1 2 4 3--> 24 12 6 8*/
public class Mul_remai_nos {
	
	public static void multipy(int[] a)
	{
		int multi_result = 1;
		for(int i : a)
		{	
			multi_result = multi_result*i;
			
		}
		for(int j=0;j< a.length;j++)
		{
			
			a[j] = multi_result/a[j];
			
		}
		
	}
	
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		for(int i : a)
		System.out.print(i+"\t");
		multipy(a);
		System.out.println();
		for(int i : a)
		System.out.print(i+"\t");
	}

}
