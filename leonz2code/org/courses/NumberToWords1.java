package leonz2code.org.courses;

public class NumberToWords1 {

	
	public static void main(String[] args) {
		
		
		numberToWords(2456);
	}
	
	

	public static void numberToWords(int number){
		if (number<0){
			System.out.println("Invalid Value");
		}
		if (number==0){
			System.out.println("Zero");
		}

		int revNum=0,ext;
		revNum=reverse(number);

		int originalCount,reversedCount;
		originalCount=getDigitCount(number);
		reversedCount=getDigitCount(revNum);

		while(revNum!=0){

			ext=revNum%10;

			if(ext ==0){
				System.out.println("Zero");
			} if (ext ==1){
				System.out.println("One");
			} if (ext ==2){
				System.out.println("Two");
			}if (ext ==3){
				System.out.println("Three");
			} if (ext ==4){
				System.out.println("Four");
			} if (ext ==5){
				System.out.println("Five");
			}if (ext ==6){
				System.out.println("Six");
			} if (ext ==7){
				System.out.println("Seven");
			} if (ext ==8){
				System.out.println("Eight");
			}if (ext ==9){
				System.out.println("Nine");}

			revNum=revNum/10;
		}

		if(originalCount!=reversedCount){
			for(int i=reversedCount;i<=originalCount-1;i++){
				System.out.println("Zero");
			}
		}
	}

	public static int reverse(int number){
		int reverse=0,lastDigit=0;

		while(number!=0){
			lastDigit=number%10;
			reverse=reverse*10+lastDigit;
			number=number/10;
		}
		return reverse;
	}

	public static int getDigitCount(int number){
		if(number<0){
			return -1;
		}
		int count=0;
		if(number==0){
			return 1;
		}
		while (number!=0){
			count++;
			number=number/10;
		}
		return count;
	}
}