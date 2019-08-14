package leonz2code.org.udemy.oop;

public class Miata extends Car{

	private int roadServiceMonths;


	public Miata(int roadServiceMonths) {
		super("Miata", "RWD", 4, 2, 6, true);
		this.roadServiceMonths = roadServiceMonths;
	}

		public void accelerate(int rate) {
			
			int newVelocity = getCurrentVelocity() + rate;
			
			if(newVelocity == 0) {
				stop();
				changeGear(1);
			} else if ( newVelocity > 0 && newVelocity <=10) {
				changeGear(1);
				
			}else if ( newVelocity > 0 && newVelocity <=20) {
				changeGear(2);
				
			}else if ( newVelocity > 0 && newVelocity <=30) {
				changeGear(3);			
				
			}else if ( newVelocity > 0 && newVelocity <=40) {
				changeGear(4);			
				
			}else if ( newVelocity > 0 && newVelocity <=50) {
				changeGear(5);			
				
			}else if ( newVelocity > 0 && newVelocity <=60) {
				changeGear(6);			
				
			}
			
			if(newVelocity > 0) {
				changeVelocity(newVelocity, getCurrentDirection());
			}
			
		}


	public void openRoof() {
		
		
	}
	
}
