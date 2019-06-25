package by.htp.task4.entity;
import java.util.Comparator;

public class Train {

	private String departurePoint;
	private int trainNumber;
	private int departureTime;
	
	public Train (String departurePoint, int trainNumber, int departureTime ) {
		this.departurePoint = departurePoint;
		this.trainNumber = trainNumber;
		this.departureTime = departureTime;
	}

	public String getDeparturePoint() {
		return departurePoint;
	}

	public void setDeparturePoint(String departurePoint) {
		this.departurePoint = departurePoint;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public int getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(int departureTime) {
		this.departureTime = departureTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departurePoint == null) ? 0 : departurePoint.hashCode());
		result = prime * result + departureTime;
		result = prime * result + trainNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		if (departurePoint == null) {
			if (other.departurePoint != null)
				return false;
		} else if (!departurePoint.equals(other.departurePoint))
			return false;
		if (departureTime != other.departureTime)
			return false;
		if (trainNumber != other.trainNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Train" + "\n" + "departurePoint=" + departurePoint + "\n" + "trainNumber=" + trainNumber + "\n" + "departureTime="
				+ departureTime + "\n";
	}
	
	  public static  Comparator<Train> CompareByNumber = new Comparator<Train>() {
	        @Override
	        public int compare(Train firstNumber, Train secondNumber) {
	            return firstNumber.getTrainNumber() - secondNumber.getTrainNumber();
	        }
	    };
	    
	  /*  public int compareTo(Train train) {
	        return train(0).getDeparturePoint().compareTo(train.get(1).getDeparturePoint());
	    }*/

}

