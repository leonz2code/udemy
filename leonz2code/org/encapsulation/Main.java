package leonz2code.org.encapsulation;

public class Main {

	// ENCAPSULTAION FOR SECURITY REASONS
	
	/*
	In the below scenario we can see that 
	we can assign directly values to a variables from 
	objects created in main method that is not
	desired behaviour.
	
	if we donthave a contructors and manually assing fields we can easily not initialice one field (instance variable )
	we can manage in best way by using encapsulation
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Player player = new Player();
//		
//		player.name = "leo";
//		//player.health = 20;
//		player.weapon = "double dages";
//		
//		int damage = 10;
//		
//		player.loseHelth(damage);
//		System.out.println("Reamaining health = " + player.healthRemaining());
//		
//		damage = 11;
//		player.health = 200;
//		player.loseHelth(damage);
//		System.out.println("Reamaining health = " + player.healthRemaining());
//			
//		
//		EnhancedPlayer player = new EnhancedPlayer("Leo", 80, "double daggers");
//		System.out.println(player.getHealth());
//		
		
		Printer printer = new Printer(50,false);
		
		System.out.println("initial page count =" +printer.getPagesPrinted());
		
		int pagesPrinted = printer.printPages(4);
		System.out.println("Pages printed was " + pagesPrinted + "new total print count for printer = " +printer.getPagesPrinted());
		pagesPrinted = printer.printPages(2);
		
		System.out.println("Pages printed was " + pagesPrinted + "new total print count for printer = " +printer.getPagesPrinted());
		
	}

}
