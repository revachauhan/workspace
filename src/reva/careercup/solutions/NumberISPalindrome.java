package reva.careercup.solutions;
//Check if a number is palindrome or not using recursion
public class NumberISPalindrome {

	public static boolean isPalindrome(int num)
	{
		int anothernum = num;
		return _checkUtil(num, anothernum);
	}

	public static boolean _checkUtil(int num, int anothernum)
	{

		if(onedigit(num))
			return(num == (anothernum%10));
		if(!_checkUtil(num/10, anothernum))
			return false;
		anothernum = anothernum/10;

		return(num%10 == anothernum%10);



	}

	private static boolean onedigit(int num) {

		return (num>=0 && num <10);
		
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(1221));

	}

}
