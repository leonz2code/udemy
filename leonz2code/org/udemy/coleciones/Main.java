package leonz2code.org.udemy.coleciones;

public class Main {

	public static void main(String[] args) {


		Theatre theatre = new Theatre("Olympian", 8,12);

			theatre.getSeats();
			
			if(theatre.reserveSeat("H11")) {
				System.out.println("Please Pay");
			} else {
				System.out.println("sorry, seat is ocupado alv");
			}
		
			if(theatre.reserveSeat("H11")) {
				System.out.println("Please Pay");
			} else {
				System.out.println("sorry, seat is ocupado alv");
			}
		
		
	}

}
