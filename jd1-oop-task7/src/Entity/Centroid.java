package Entity;

public class Centroid {
		private double firstCoordinate;
		private double secondCoordinate;
	
	public Centroid (double firstCoordinate, double secondCoordinate) {
		this.firstCoordinate = firstCoordinate;
		this.secondCoordinate = secondCoordinate;
	}

	public double getFirstCoordinate() {
		return firstCoordinate;
	}

	public double getSecondCoordinate() {
		return secondCoordinate;
	}

	@Override
	public String toString() {
		return "Centroid [firstCoordinate=" + firstCoordinate + ", secondCoordinate=" + secondCoordinate + "]";
	}

}