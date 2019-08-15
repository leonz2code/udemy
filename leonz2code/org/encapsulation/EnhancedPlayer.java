package leonz2code.org.encapsulation;

public class EnhancedPlayer {
	private String name;
	private int hitPoints;
	private String weapon;
	public EnhancedPlayer(String name, int health, String weapon) {
		super();
		if(health > 0 && health <= 100) {
			this.hitPoints = health;
		}
		this.name = name;
		this.hitPoints = health;
		this.weapon = weapon;
	}
	
	public void loseHelth(int damage) {
		this.hitPoints = this.hitPoints - damage;			
		if(this.hitPoints <=0) {
			System.out.println("Player knocked out");
		}
		
	}

	public int getHealth() {
		return hitPoints;
	}
	
}
