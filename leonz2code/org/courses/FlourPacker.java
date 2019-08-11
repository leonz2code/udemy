package leonz2code.org.courses;

public class FlourPacker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//	System.out.println(canPack(0,5,4)); // true
			System.out.println(canPack(0,5,6)); // false
	//	System.out.println(canPack(2,1,12)); // false
	//	System.out.println(canPack(2,1,5)); // true
	//	System.out.println(canPack(5,3,24));  //false
	
		
	// el metodo regresara verdadero si es posible hace un paquete con la cantidad objetivo (goal) usando sacos de 5 y 1 kilos dados	
		
	//	System.out.println(canPack(4,18,19)); 
	}

	public static boolean canPack(int bigCount,int smallCount,int goal) {
		if( bigCount < 0 ||  smallCount < 0  ||  goal< 0  ) {
			return false;
		}

		boolean pack = true;
		int bigFlour = bigCount * 5;

		if(	goal%5 > smallCount || ( (goal % 5) > smallCount) || bigFlour + smallCount < goal ) {
			return false;
		}		
		return pack;

	}
}
