package by.htp.task4.main;
import java.util.ArrayList;

import by.htp.task4.entity.Train;
import by.htp.task4.logic.TrainLogic;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Train> train = new ArrayList<>();
		train.add(new Train("Minsk", 1, 3));
		train.add(new Train("Vilnius", 4, 6));
		train.add(new Train("Moskau",3, 7));
		train.add(new Train("Kiev", 5, 2));
		train.add(new Train("Riga", 2, 1));
		
			TrainLogic.SortByNumber(train);
			System.out.println(train);
			System.out.println(TrainLogic.FindNumber(train, 4));
			TrainLogic.SortByDeparture(train);
			System.out.println(train);
			
	}
	

}
