package studio8;

import java.util.Objects;

public class appointment {

	Object dateIn;
	Object timeIn;
	
	public appointment(Object Date, Object Time)
	{
		dateIn = Date;
		timeIn = Time;
	}
	
	




	@Override
	public int hashCode() {
		return Objects.hash(dateIn, timeIn);
	}






	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		appointment other = (appointment) obj;
		return Objects.equals(dateIn, other.dateIn) && Objects.equals(timeIn, other.timeIn);
	}






	public static void main(String[] args) {
		// TODO Auto-generated method stub

		appointment a = new appointment(a, b);
	}

}
