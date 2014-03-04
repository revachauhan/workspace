package reva.geeksforgeeks.solution;

public class Driver_geeksForGeeks {
	
	public static void main(String[] args) {
		
		/**********************************************************/
		//Permutation_String p1 = new Permutation_String();
		//p1.permutation("Reva");
		
		/**********************************************************/
		
		int [] a = {2,11,-4,13,-5};
		Max_value_contiguos_subsequence m1 = new Max_value_contiguos_subsequence();
		int result = m1.maxsum(a);
		System.out.println(result);
		
		/**********************************************************/
		char[] str = {'b','n','b','a','c','b','d','a','b'};
		Longest_Palindrome_subsequence l1 = new Longest_Palindrome_subsequence();
		System.out.println(l1.lps_DP(str));
	}
	
	

}
