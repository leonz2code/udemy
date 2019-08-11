package leonz2code.org.courses;

public class NumberToWords {

	public static void main(String[] args) {


		//getDigitCount(2495);


		System.out.println(reverse(2));
		
	} 
	public static void numberToWords(int number) {
		if(number<0) {
			System.out.println("Invalid value");
		//	System.exit(0);
		}	else {
		reverse(number);
		String str1 = "" + number;			
		String[] str2 = new String[]{"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN"};		
		for(int i = 0; i < str1.length();i++) {		
			int itr = Integer.parseInt(""+str1.charAt(i));
			System.out.println(str2[itr]);	
		}
		}	
	}

	public static int reverse(int torevnum) {
		
		String str1 = ""+torevnum;		
		String str2 = "";
		
		for(int i = str1.length()-1 ; i>=0 ; i--) {			
			str2 = str2 + ""+str1.charAt(i);				
		}
				
		int res = Integer.parseInt(str2);
		
		return res;
	}
	
	public static int getDigitCount(int number) {
		if(number<0) {
			return -1;
		}		
		
		String str1 = ""+number;	
		
		int length = str1.length();
		
		return length;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
