package leonz2code.org.udemy.section7;

public class Hamburgers {
	private String name;
	private String meat = "beef meat";
	private double price = 35;
	private String bread;
	private boolean letuce = false;
	private boolean tomato = false;
	private boolean onion = false;
	private boolean carrot = false;
	
	
	
	public Hamburgers(String name, String bread) {
		super();
		this.name = name;
		this.bread = bread;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price += price;
	}
	public String getBread() {
		return bread;
	}
	public void setBread(String bread) {
		this.bread = bread;
	}
	public boolean isLetuce() {
		return letuce;
	}
	public void setLetuce(boolean letuce) {
		this.letuce = letuce;
	}
	public boolean isTomato() {
		return tomato;
	}
	public void setTomato(boolean tomato) {
		this.tomato = tomato;
	}
	public boolean isOnion() {
		return onion;
	}
	public void setOnion(boolean onion) {
		this.onion = onion;
	}
	public boolean isCarrot() {
		return carrot;
	}
	public void setCarrot(boolean carrot) {
		this.carrot = carrot;
	}
	
	public double grandTotal() {
		if(letuce) {
			price += 3;
		}
		if(tomato) {
			price += 5;
		}
		if(onion) {
			price += 6;
		}
		if(carrot) {
			price += 4;
		}
		
		return price;
	}

	
}
