package reva.java.practice;

public class Merge_sort_driver {

	
	public static void main(String[] args) {
		
		int[] numbers = {13,3,45,8,23,7,1,9,10};
		Merge_sort m = new Merge_sort();
		m.sort(numbers);
		
		for(int i : numbers)
		System.out.print(i+"\t");
		
	}
}
