package leonz2code.org.udemy.oop;

public class Point {
	
	private int x;
	private int y;
	
	public Point() {
		
	}

	public Point(int x,int y) {
		
		this.x = x;
		this.y = y;
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public double distance() {
		
		double calcDist = 
				
				( 0 - this.x ) * (0 - this.x) + (0 - this.y) * (0 - this.y);
				
				;
				
				double distanceB = Math.sqrt(calcDist);			
		
		return distanceB;
		
	}
	
	public double distance(int xB, int yB) {
		
		double calcDist = 
				
				( xB - this.x ) * (xB - this.x) + (yB - this.y) * (yB - this.y);
				
				;
				
				double distanceB = Math.sqrt(calcDist);			
		
		return distanceB;
	}
	
	public double distance(Point another) {
		
		double calcDist = 
				
				( another.x - this.x ) * (another.x - this.x) + (another.y - this.y) * (another.y - this.y);
				
				;
				
				double distanceB = Math.sqrt(calcDist);			
		
		return distanceB;
		
	}
	
	
	
}
