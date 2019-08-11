package leonz2code.org.courses;

public class FlourPacker1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(canPack(4,18,19)); 
		
	}

	public static boolean canPack(int bigCount,int smallCount,int goal) {	
		
		int bigFlour = bigCount * 5;
		
		System.out.println(goal%5);
		
        if((bigCount < 0) || (smallCount < 0) || (goal < 0) || ((bigFlour + smallCount) < goal) || ((goal % 5) > smallCount)){
            return false;
	
        }
		
				return true;
	}
	

		

	}
	
	
	
	
