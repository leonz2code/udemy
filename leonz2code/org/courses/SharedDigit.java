package leonz2code.org.courses;

public class SharedDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		hasSharedDigit(39,31);
		
	}

	public static boolean hasSharedDigit(int a,int b) {
		if( a > 99 || a < 10 || b > 99 || b < 10 ) {
			
			System.out.println("Enter validation");
			return false;
		}
		
int c1 = a / 10;
		
int c2 = Math.abs(a%10);		
		
int c3 = b / 10;

int c4 = Math.abs(b%10);	


	if (c1 == c3 || c1 == c4 || c2 == c3 || c2 == c4) {
		
		System.out.println("the is a match");
		
		System.out.println(""+c1+"_"+c2);
		
		return true;
	}

		
		System.out.println(""+c1+"_"+c2);
		
		return false;
	}
	
}
