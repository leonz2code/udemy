package leonz2code.org.courses;

import java.util.Scanner;

public class InputCalculator {
   // Write your code here
   
   	public static void inputThenPrintSumAndAverage() {
		
		
		int sum = 0;
		int elements = 0;
		double avg ;

	//	boolean tuDale = true;

		Scanner scanner = new Scanner (System.in);

		while(true) {
		//	System.out.println("Enter number");


			boolean hasNextInt = scanner.hasNextInt();

			if(hasNextInt){

				
				int other_number = scanner.nextInt();		
				
				sum = sum + other_number;
				elements++;
			

			}else {

				double d1 = (double)sum;
				double d2 = (double)elements;
								
				
				avg = d1/d2;
				//System.out.println(avg);
				
				
				
				long l = Math.round(avg);
				
				System.out.println("SUM = "+sum + " AVG = "+l);
			//	System.out.println("The average is: "+(sum/elements));
				
				scanner.close();

				break;
			}	
		}
	}
   
}