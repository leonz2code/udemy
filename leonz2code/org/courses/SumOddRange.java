package leonz2code.org.courses;

public class SumOddRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(sumOdd(100,10));
		
	}

	
	public static boolean isOdd(int number) {
	
		boolean odd = false;
		
		if(number<0) {
			return false;
		}
		
		if(number % 2 != 0) {
			
			odd = true;
			
		}
		
				
		return odd;
	}

	
	
	public static int sumOdd(int start,int end) {

		if( (end < start) || end < 0 || start < 0 ) {
			
			
			
		return -1;
		}
		
	    int	sum = 0;

		for (int i = start; i <= end; i++) {
			
			if(isOdd(i)) {
				
				sum = sum + i;
			}
			
		}
		
		
				
		return sum;
	}
	
	
}





















