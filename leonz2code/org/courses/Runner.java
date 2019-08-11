package leonz2code.org.courses;

public class Runner {
/*
 * 
 * Examples of input/output:

* area(5.0); should return 78.53975

* area(-1);  should return -1 since the parameter is negative

* area(5.0, 4.0); should return 20.0 (5 * 4 = 20)

* area(-1.0, 4.0);  should return -1 since first the parameter is negative

	TIP: The formula for calculating the area of a rectangle is x * y.

TIP: The formula for calculating a circle area is radius * radius * PI.

TIP: For PI use a constant from Math class e.g. Math.PI
	
	
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Why this thing is in white? oh.. Excuse me amm Hello World!! y asi ");
		
	System.out.println(area(5.0, 4.0));
		
	}

    public static double area(double radius){
    	double circle_area = (radius * radius) * Math.PI;
    	
    	if(radius<0){
            
            return -1.0;
        }
        return circle_area;
    }
	
	public static double area(double x,double y) {
		double rectangle_area = x * y;
		
		if(x<0 || y < 0){
            
            return -1.0;
        }
		
		
		return rectangle_area;
	}
	
	
	

}
