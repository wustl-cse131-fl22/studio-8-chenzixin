package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Time {

	
	private int hourIn;
	private int minuteIn;
	private boolean formatIn;
	
	/**
	 * 
	 * @param hour
	 * @param minute
	 * @param format
	 */
	public Time(int hour, int minute, boolean format)
	{
		hourIn = hour;
		minuteIn = minute;
		formatIn = format;
	}
	
	
	
	@Override
	public String toString() {
		return "Time [hourIn=" + hourIn + ", minuteIn=" + minuteIn + ", formatIn=" + formatIn + "]";
	}






	@Override
	public int hashCode() {
		return Objects.hash(hourIn, minuteIn);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hourIn == other.hourIn && minuteIn == other.minuteIn;
	}



	public static void main(String[] args) {
 
    	Time a = new Time(11, 59, true);
    	Time b = new Time(11, 50, true);
    	System.out.println(a);
    	LinkedList<Time> list = new LinkedList<Time>();
    	list.add(a);
    	list.add(b);
    	System.out.println(list);
    }

}