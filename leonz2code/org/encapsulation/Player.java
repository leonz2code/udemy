package leonz2code.org.encapsulation;

public class Player {
	public String name;
	public int health;
	public String weapon;

	
	public void loseHelth(int damage) {
		this.health = this.health - damage;			
		if(this.health <=0) {
			System.out.println("Player knocked out");
		}
		
	}
	public int healthRemaining() {
		return this.health;
	}
}
