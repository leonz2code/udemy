package leonz2code.org.courses;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//	isPalindrome(123456789);
		
		System.out.println(isPalindrome(-1221));
	}
	
	
	public static boolean isPalindrome(int number) {
		if(number<0) {
			
			number = number * -1;
		}
		
		
		
		int ctd = 0;
		String str1 = ""+number;
		char[] inv1 =new char[str1.length()];
		String str2 = "";
		
		
		for (int i = str1.length()-1; i >= 0; i--) {
			
			System.out.println(""+i);
			
			inv1[ctd] = str1.charAt(i);
			ctd++;
		}
		
		
		str2 = String.valueOf(inv1);
		
		
		System.out.println(number);
		System.out.println(inv1);
		System.out.println(str2);
		
		
		//str1 = "a";
		//str2 = "a";
		
		if(str1.equals(str2) ) {
			
			return true;
		}
		
		
		
		return false;
	}
	

}
