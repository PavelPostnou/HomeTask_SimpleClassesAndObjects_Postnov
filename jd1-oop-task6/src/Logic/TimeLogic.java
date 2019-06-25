package Logic;
import Entity.Time;

public class TimeLogic {

	public static int SetHour (int i) {
		
		if (i>=24) {
			i = 0;
		}
		
		return i;
	}
	
	public static int SetMinute (int i) {
		
		if (i>=60) {
			i = 0;
		}
		
		return i;
	}
	
	public static int SetSecond (int i) {
		
		if (i>=60) {
			i = 0;
		}
		
		return i;
	}
	
	public static Time ChangeTime (Time time, int x, int y, int z) {
		
		x = time.getHour() + x;
		y = time.getMinute() + y;
		z = time.getSecond() + z;
		
		while (x > 23 && y > 60 && z > 60) {
		int countHours;
		countHours = 0;
		
		int countMinutes;
		countMinutes = 0;
		
		 
		 
		if (x == 23) {
			 x = 0;
		 }
		if (x >=23 ) {
			while (x >= 23) {
				x = x % 23;
			}
		}
		
		
		
		if (y >= 60) {
			while (y >= 60) {
				
			countHours++;
			y = y - 60;
			
		 }
		}
			x = x + countHours;
	
		
			
		if (z >= 60) {
			
			while (z >= 60) {
				
			countMinutes++;
			
			z = z - 60;
				
			}
			y = y + countMinutes;
			
			if (y >= 60) {
				x = x + y / 60;
				while (y >= 60) {
					
					y = y - 60;
					
				 }
			}
				
		}
		 
		}
	
		Time newTime = new Time(x,y,z);
		
		return newTime;
	
}
}
