package leonz2code.org.udemy.section7;

public class PC {
	private Case thecase;
	private Monitor monitor;
	private MotherBoard motherboard;
	public PC(Case thecase, Monitor monitor, MotherBoard motherboard) {
		super();
		this.thecase = thecase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}
	
	public void powerUp() {
		this.thecase.pressPowerButton();
		drawLogo();
	}
	
	private void drawLogo() {
		//Fancy graphics
		monitor.drawPixelAt(1200, 50, "yellow");
	}
	


	
}