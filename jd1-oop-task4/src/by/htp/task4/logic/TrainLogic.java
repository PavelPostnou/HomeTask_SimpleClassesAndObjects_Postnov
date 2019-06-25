package by.htp.task4.logic;
import java.util.Collections;

import by.htp.task4.entity.Train;

import java.util.ArrayList;

public class TrainLogic {

	public static ArrayList<Train> SortByNumber (ArrayList<Train> train) {
		
		Collections.sort(train, Train.CompareByNumber);
		
		return train;
	}
	
	public static Train FindNumber (ArrayList<Train> train, int number) {
		
		for (int i = 0; i < train.size();i++) {
			if (number == train.get(i).getTrainNumber()) {
				return train.get(i);
			}
		}
		return null;
	}
	
	public static ArrayList<Train> SortByDeparture (ArrayList<Train> train) {
		
				String dp = null;
				int dt = 0;
				int tn = 0;
				
			for (int i = 0; i<train.size()-1;i++){
				
			int num = Compare(train.get(i).getDeparturePoint(),train.get(i+1).getDeparturePoint());
		
			if (num>0){
				
				dp = train.get(i+1).getDeparturePoint();
				dt = train.get(i+1).getDepartureTime();
				tn = train.get(i+1).getTrainNumber();
	
				train.get(i+1).setTrainNumber(train.get(i).getTrainNumber());
				train.get(i+1).setDeparturePoint(train.get(i).getDeparturePoint());
				train.get(i+1).setDepartureTime(train.get(i).getDepartureTime());
				train.get(i).setTrainNumber(tn);
				train.get(i).setDeparturePoint(dp);
				train.get(i).setDepartureTime(dt);
			}
			else if (num == 0) {
				SortByNumberOne(train,i);
			}
			
		}
		
		return train;
	}
	
	public static int Compare (String f, String s) {
		
		return f.compareTo(s);
        
	}
	
public static ArrayList<Train> SortByNumberOne (ArrayList<Train> train, int i) {
		
		if (train.get(i).getDepartureTime() > train.get(i+1).getDepartureTime()) {
			int j;
			j = 0;
			j = train.get(i).getDepartureTime();
			train.get(i).setDepartureTime(train.get(i+1).getDepartureTime());
			train.get(i).setDepartureTime(j);
		}
		
		return train;
	}
	
	
}
