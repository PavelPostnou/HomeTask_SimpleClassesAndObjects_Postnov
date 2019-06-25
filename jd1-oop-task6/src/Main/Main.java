package Main;
import Entity.Time;
import Logic.TimeLogic;

public class Main {

	public static void main(String[] args) {
		
		Time time = new Time(23,45,56);
		TimeLogic.SetHour(23);
		TimeLogic.SetMinute(15);
		TimeLogic.SetSecond(45);
		System.out.println(TimeLogic.ChangeTime(time, 14, 56, 1300));
		
	}

}
