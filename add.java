package reva.java.practice;

public class add {
	
	
	public static void main(String[] args) {
		String str = "1490081293";
		int result = 0;
		for(int i =0;i < str.length();i++)
		{
			int num = 1+(str.charAt(i)-'1');
			result+=num;
			
			
		}
		String x1 = "big surprise";
		System.out.println( x1.toString() );
		String x = "test";
		System.out.println( x.length() ); //
		System.out.println(result);
	}

}
