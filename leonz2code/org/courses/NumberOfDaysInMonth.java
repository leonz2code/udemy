package leonz2code.org.courses;

import java.util.ArrayList;

public class NumberOfDaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//	System.out.println(isLeapYear(10000));
		
		System.out.println(getDaysInMonth(-1,13));
	}
	
	
 	public static boolean isLeapYear(int year) {
		boolean leapYear =  false;
		
		if(year<=0 || year>9999) {

			return false;
			
		}
		
		if( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ) {
			
			leapYear = true;
		}

		return leapYear;
	}	
		public static int getDaysInMonth(int month,int year) {

			if(month>12 || month<1) {
				return -1;
			}

			if(year>9999 || year<1) {
				return -1;
			}	
			
/*		
	jan	31
	fe	28 o 29
	mar	31
	apr	30
	may	31
	jun	30
	jul	31
	aug	31
	sep	30
	oct	31
	nov	30
	dec	31
	
*/	

		ArrayList<Integer> months = new ArrayList<Integer>();
		
		months.add(0);
		months.add(31);
		months.add(28);
		months.add(31);
		months.add(30);
		months.add(31);
		months.add(30);
		months.add(31);
		months.add(31);
		months.add(31);
		months.add(30);
		months.add(31);
		months.add(30);
		months.add(31);
		
		int daysInMonth = months.get(month);
		
		System.out.println(months);
		
	int month1  = 31;	
	int month2  = 28;	
	int month3  = 31;	
	int month4  = 30;	
	int month5  = 31;	
	int month6  = 30;	
	int month7  = 31;	
	int month8  = 31;	
	int month9  = 30;	
	int month10 = 31;	
	int month11 = 30;	
	int month12 = 31;	
		
		boolean isLeapYear = isLeapYear(year);
		
	
		
		if(isLeapYear && month == 2 ) {
			
			daysInMonth = daysInMonth +1;
		}
		
		
		
		return daysInMonth;
	}	
	
	
	

}
