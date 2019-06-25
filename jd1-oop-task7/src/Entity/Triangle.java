package Entity;

public class Triangle {
	
	private double firstPoint1;
	private double firstPoint2;
	private double secondPoint1;
	private double secondPoint2;
	private double thirdPoint1;
	private double thirdPoint2;
	
	public Triangle (double firstPoint1, double firstPoint2, double secondPoint1, double secondPoint2, double thirdPoint1, double thirdPoint2) {
		
		this.firstPoint1 = firstPoint1;
		this.firstPoint2 = firstPoint2;
		this.secondPoint1 = secondPoint1;
		this.secondPoint2 = secondPoint2;
		this.thirdPoint1 = thirdPoint1;
		this.thirdPoint2 = thirdPoint2;
		
	}

	public double getFirstPoint1() {
		return firstPoint1;
	}

	public void setFirstPoint1(double firstPoint1) {
		this.firstPoint1 = firstPoint1;
	}

	public double getFirstPoint2() {
		return firstPoint2;
	}

	public void setFirstPoint2(double firstPoint2) {
		this.firstPoint2 = firstPoint2;
	}

	public double getSecondPoint1() {
		return secondPoint1;
	}

	public void setSecondPoint1(double secondPoint1) {
		this.secondPoint1 = secondPoint1;
	}

	public double getSecondPoint2() {
		return secondPoint2;
	}

	public void setSecondPoint2(double secondPoint2) {
		this.secondPoint2 = secondPoint2;
	}

	public double getThirdPoint1() {
		return thirdPoint1;
	}

	public void setThirdPoint1(double thirdPoint1) {
		this.thirdPoint1 = thirdPoint1;
	}

	public double getThirdPoint2() {
		return thirdPoint2;
	}

	public void setThirdPoint2(double thirdPoint2) {
		this.thirdPoint2 = thirdPoint2;
	}

	@Override
	public String toString() {
		return "Triangle [firstPoint1=" + firstPoint1 + ", firstPoint2=" + firstPoint2 + ", secondPoint1="
				+ secondPoint1 + ", secondPoint2=" + secondPoint2 + ", thirdPoint1=" + thirdPoint1 + ", thirdPoint2="
				+ thirdPoint2 + "]";
	}

}


