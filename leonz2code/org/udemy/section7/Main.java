package leonz2code.org.udemy.section7;


//composition encapsulation polymorphism 

// COMPOSITON , HAS - A relationship, 

// in the below example pc has a case pc has a motherboard pc has a monitor, for example

public class Main {


	
	public static void main(String[] args) {
		
//		Wall wall1 = new Wall("West");
//		Wall wall2 = new Wall("East");
//		Wall wall3 = new Wall("South");
//		Wall wall4 = new Wall("North");
//		
//		Ceiling ceiling = new Ceiling(12,55);
//		
//		Bed bed = new Bed("modern", 4,3,2,1);
//		
//		Lamp lamp = new Lamp("Classic", false, 75);
//		
//		Bedroom bedRoom =  new Bedroom ("Leos",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
//		
//		bedRoom.makeBed();
//		bedRoom.getLamp().turnOn();\
		
		
		Integer entero1;
		int entero2;
		
	//	entero2 = entero1 ;
		
		
		HealthyBurger leos1 = new HealthyBurger("leo",true,true);
		
		
		
	double xz =	leos1.grandTotal();

		System.out.println("Hamburger Price: " + xz);
	
	}	

}
