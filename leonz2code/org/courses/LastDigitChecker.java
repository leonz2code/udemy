package leonz2code.org.courses;

public class LastDigitChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		hasSharedDigit(22,23,34);
		
	}

	public static boolean hasSharedDigit(int a,int b,int c) {
		if( a > 999 || a < 10 || b > 999 || b < 10 || c < 10 || c > 999 ) {
			
			System.out.println("Enter validation");
			return false;
		}
		
int a1 = a / 100;
		
int a2 = (Math.abs(a%100))/10;		
		
int a3 = Math.abs(a%10);

int b1 = b / 100;	

int b2 =(Math.abs(b%100))/10;	

int b3 = Math.abs(b%10);	

int c1 = c / 100;	

int c2 = (Math.abs(c%100))/10;	

int c3 = Math.abs(c%10);	

	if (a3 == b3 || a3 == c3 || b3 == c3 ) {


		System.out.println(""+a1+"_"+a2+"_"+a3);

		System.out.println(""+b1+"_"+b2+"_"+b3);
		
		System.out.println(""+c1+"_"+c2+"_"+c3);
		return true;
}

		

		
		return false;
	}
	
	
	public static boolean isValid(int num) {
		if( num > 999 || num < 10 ) {
			
			System.out.println("Enter validation");
			return false;
		}		
		
		
		
		
		return true;
	}
	
	
}
