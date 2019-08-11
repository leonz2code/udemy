package leonz2code.org.courses;

public class FactorPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printFactors(6);
	}
	
	public static void printFactors(int num){
		if(num<1) {
			System.out.println("Invalid Value");
		}else {
			
			int ctd = 0;
			
			
			/*
			while (num >= 1) {

				System.out.println(num);
				
				num = Math.round( num / 2);
				

			}
			
			*/

			while( ctd < num) {
				ctd++;			
				
				if(num%ctd==0) {
				
				System.out.println(ctd);
				}

				
			}
			
			
			
			
			
		}
		

	}

}
