package leonz2code.org.courses;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getGreatestCommonDivisor(81,153));
		
	}

	
	public static int getGreatestCommonDivisor(int first,int second) {
		if(first<10 || second<10) {
			
			return -1;
		}
		
		int cd = 0;
		
		String str_first = "";
		String str_second = "";
		
		if(first<second) {
			
			cd = first;
		} else {
			cd = second;
		}
		
		System.out.println("the value of cd is: " +cd);
		
		for (int i = 1; i <= cd; i++) {
			
			if( first % i == 0) {
				
				//System.out.println("the divisor numbers for first are: " +i);
				
				//str_first = str_first +""+i;
			}
		
		}
		
	//	System.out.println("=============================================================================");
		
		for (int i = 1; i <= cd; i++) {
			
			if( second % i == 0) {
				
		//		System.out.println("the divisor numbers for second are: " +i);
				
		//		str_second = str_second +""+i;
			}
		
		}		
		
		// ESTO ES LO QUE HACE LA MAGIA QUE ONDA CON ESTE WHILE YA ESTABA PENSANDO EN UN ARRAY LIST, VER OTRAS SOLUCIONES
		
        while(first != second) {
            if(first>second)
            	first= first-second;
            else
            	second= second -first;
        }
        
        System.out.println("El MCD es:" + first);
		
		
		
//		System.out.println(str_first);
//		System.out.println(str_second.charAt(6));
		return first;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
