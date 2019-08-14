package leonz2code.org.udemy.oop;

public class Cuboid extends Rectangle {
	
	private double height;

	public Cuboid(double width, double length, double height) {
		super(width, length);
		this.height = height;
		if(height > 0 ) {
			this.height = height;
		}else {
			this.height = 0;
		}
	}
	public double getHeight() {
		return height;
	}
	public double getVolume() {
		double volume = getArea() * height;
		return volume;
	}

}
