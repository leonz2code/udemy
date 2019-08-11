package leonz2code.org.courses;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		isPerfectNumber(-8128);
	}

	public static boolean isPerfectNumber(int number) {
		if(number<1) {
			return false;
		}
		int ctd = 0;
		
		int res = 0;
		
		while( ctd < number) {
			ctd++;			
			
			if(number%ctd==0 && ctd != number ) {
			
			System.out.println(ctd);
			res = res + ctd;
			
			}
			
		}

		System.out.println("the sum of the remainders is: "+res);
		
		if(res == number) {
			return true;
		}
		
		return false;
	}
	
	
	
	
	
	
	
}
