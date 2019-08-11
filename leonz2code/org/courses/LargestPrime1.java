package leonz2code.org.courses;

public class LargestPrime1 {

	// TAL COMO ESTA AHORA LO PODEMOS VER COMO ARBOL DE FACTORES 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getLargestPrime(31); 
	}

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        } else {
            int numberWithoutFoundPrimes = number;
            int greatestPrime = 1;
            for (int i = 2; i <= number; i++) {
            	
                while (numberWithoutFoundPrimes % i == 0) {
                    greatestPrime = i;
                    numberWithoutFoundPrimes = numberWithoutFoundPrimes / i;
                    
                    System.out.println("numberwithoutFoundPrimes: " + numberWithoutFoundPrimes);
                    System.out.println("greatestPrime: " + greatestPrime);
                    
                }
                
            }
            System.out.println(greatestPrime);
            return greatestPrime;
          }
    }
	
    
    
    /*
     * 
     * public class LargestPrime {
	public static int getLargestPrime (int num) {
		if (num < 2)
			return -1;	
		
		int prime = 2;
		while (num != 1) {
			if (num % prime == 0)
				num /= prime;
			else
				prime++;
		}
		return prime;
	}
}
     * 
     * 
     * */
}
