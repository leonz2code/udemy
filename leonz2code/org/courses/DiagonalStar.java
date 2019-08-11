package leonz2code.org.courses;

public class DiagonalStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printSquareStar(5);
		
	}

	
	public static void printSquareStar(int number) {
		if(number < 5 ) {
			System.out.println("Invalid Value");
			number = 0;
		}
	 	int ctd = 0;
	 	int right_diagR = 1;
	 	int right_diagC = number-2;
		
		// UPPER LINE
		for(int i = 0; i<number;i++) {
			
			for(int x = 0;x <number;x++) {

				if(ctd == number) {
					System.out.println("");
					ctd = 0;
				}	
				// des comentar para imprimir cubo
				//System.out.print("*");
				
				// de aqui hacia abajo tratar de modificar				
				
				// linea superior
				if(i == 0) {
					System.out.print("*");
				}
				// linea inferior
				if(i == number-1) {
					System.out.print("*");
				}
				
				// inside square begin
				if(i >= 1 && i < number-1 ) {
	

// TRY BEGIN
					
					
					if(i == right_diagR && right_diagC == x ) {
						System.out.print("*");		
						
						right_diagR+=1;
						right_diagC-=1;
						
					} else if(i == x){
						System.out.print("*");	
						
						
					}else if(x == 0){
						System.out.print("*");	
					}else if(x == number-1){
						System.out.print("*");	
					}else{
						System.out.print(" ");	
					}
					

// TRY END

					
					
				} // inside square end
				
				ctd++;			
			}
			
			
		
		}
		
		
		
	}
	
	
}
