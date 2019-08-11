package leonz2code.org.courses;

public class LargestPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//getLargestPrime(7); //que tiene que regresar 7 por que es el mas grande
		//	getLargestPrime(45); //que tiene que regresar 7 por que es el mas grande
			getLargestPrime(1); //que tiene que regresar 7 por que es el mas grande
		
		// getLargestPrime(31);// que tiene que regresar 31 que por que es el mas grande pff
		
	}

	public static int getLargestPrime(int number) {
		if(number<=1) {
			System.out.println("the number is invalid");
			return -1;			
		}
		
		int max_prime = 0;	
		int next = 0;
		
		for(int i = number ; i>0; i-- ) {			
			if(number%i == 0) {						
			System.out.println(i);					
			next = number / i;			
			System.out.println("next is: " +next);			
			if(next>max_prime) {
				max_prime = next;
			}
			
			number = i;	
			
			}
		}
		
		System.out.println("el varlor el numero primo mas grande es: "+max_prime);
		
		return max_prime;
	}
}	
