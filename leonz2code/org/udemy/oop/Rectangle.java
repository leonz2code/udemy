package leonz2code.org.udemy.oop;

public class Rectangle {
	
	private double width;
	private double length;
	public Rectangle(double width, double length) {
		super();
		if( width > 0 ) {
		this.width = width;
		}else {
			this.width = 0;
		}
		if( length > 0 ) {
		this.length = length;
		}else {
			this.length = 0;
		}
	}
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
	
	public double getArea() {
		double area = width * length;
		return area;
	}
	

}
