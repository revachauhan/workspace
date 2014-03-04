package reva.careercup.solutions;

public class Anagram_driver {

	public static void main(String[] args) {
		
		String s1 = "Anagram";
		String s2 = "Aaagnmr";
		
		boolean result = Anagram.checkIfAnagram(s1, s2);
		System.out.println(result);
	}

}
