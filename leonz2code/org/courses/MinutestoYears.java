package leonz2code.org.courses;

public class MinutestoYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printYearsAndDays(561600);
	}

	public static void printYearsAndDays(long minutes) {

		long years;
		long days;
		long hours;
		long remain_days;
		
		if(minutes<0) {
			System.out.println("Invalid Value");
		} else {
			
			hours = minutes/60;
			
			days = hours/24;		
			
			years = days/365;
			
			remain_days = days - (years * 365);
			
			System.out.println(minutes +" min = " + years + " y and " + remain_days + " d");
		}

	}
	
	
}
