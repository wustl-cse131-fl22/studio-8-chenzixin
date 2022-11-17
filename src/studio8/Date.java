package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {


	private int dayIn;
	private int monthIn;
	private int yearIn;
	private boolean holidayIn;
	
	/**
	 * 
	 * @param day
	 * @param month
	 * @param year
	 * @param holiday
	 */
	public Date(int day, int month, int year, boolean holiday)
	{
		dayIn = day;
		monthIn = month;
		yearIn = year;
		holidayIn = holiday;
	}
	
	
    
	@Override
	public String toString() {
		return "Date [dayIn=" + dayIn + ", monthIn=" + monthIn + ", yearIn=" + yearIn + ", holidayIn=" + holidayIn
				+ "]";
	}







	@Override
	public int hashCode() {
		return Objects.hash(dayIn, monthIn);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return dayIn == other.dayIn && monthIn == other.monthIn;
	}



	public static void main(String[] args) {

    	Date a = new Date(17, 11, 2022, false);
    	Date b = new Date(17, 11, 2022, false);
    	Date c = new Date(15, 11, 2022, false);
    	Date d = new Date(17, 9, 2022, false);
    	Date e = new Date(10, 11, 2022, false);
    	System.out.println(b.equals(a));
    	LinkedList<Date> list = new LinkedList<Date>();
    	list.add(a);
    	list.add(b);
    	list.add(c);
    	list.add(d);
    	list.add(e);
    	System.out.println(list);
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(a);
    	set.add(b);
    	set.add(c);
    	set.add(d);
    	set.add(e);
    	System.out.println(set);
    }

}
