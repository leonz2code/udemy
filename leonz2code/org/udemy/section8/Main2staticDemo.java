package leonz2code.org.udemy.section8;

public class Main2staticDemo {
	
	public static int multiplier = 7;

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		StaticTest firstInstance = new StaticTest("1st Instance");
//		System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//		
//		StaticTest secondInstance = new StaticTest("2st Instance");
//		System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());	
//		
//		StaticTest thirdInstance = new StaticTest("3st Instance");
//		System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());	
//	
		
		int answer =  multiply (6);
		
		System.out.println("the answer is: " + answer);
		System.out.println("Multiplier is: " + multiplier);
		
		
	}
	
	public static int multiply(int number) {
		return number * multiplier;
	}
	
}
