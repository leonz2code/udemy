package leonz2code.org.udemy.oop;

public class Main extends Object{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//
//		Animal animal = new Animal("Animal",1,1,5,5);
//		
//		Dog dog = new Dog("YorkiE",8,20,2,4,1,20,"long silky");
//		
//	//	dog.eat();
//		
//		dog.walk();
//		//dog.run();
//		
		
	    // Challenge.
        // Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
        // Finally, create another class, a specific type of Car that inherits from the Car class.
		
		
        // You should be able to hand steering, changing gears, and moving (speed in other words).
		
		
        // You will want to decide where to put the appropriate state and behaviours (fields and methods).
		
        // As mentioned above, changing gears, increasing/decreasing speed should be included.
		
		
        // For you specific type of vehicle you will want to add something specific for that type of car.
		
		Miata miata = new Miata(36);		
		miata.steer(45);
		miata.accelerate(30);
		miata.accelerate(20);
		miata.accelerate(-42);
		
		
		
		
	}

}
