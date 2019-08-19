package leonz2code.org.udemy.section7;

public class HealthyBurger extends Hamburgers {

	private boolean quesse;
	private boolean tofu;

	
	
	public HealthyBurger(String name,boolean quesse, boolean tofu) {
		super(name,"brown rye bread roll");
		super.setPrice(10);	
	
	this.quesse = quesse;
	this.tofu = tofu;
		
	if(quesse) {
	super.setPrice(15);	
	}
	if(tofu) {
	super.setPrice(25);	
	}
	
	}

	
	public boolean isQuesse() {
		return quesse;
	}

	public void setQuesse(boolean quesse) {
		this.quesse = quesse;
	}

	public boolean isTofu() {
		return tofu;
	}

	public void setTofu(boolean tofu) {
		this.tofu = tofu;
	}


	public void setExtra() {
		

		
	}

	
	
}
