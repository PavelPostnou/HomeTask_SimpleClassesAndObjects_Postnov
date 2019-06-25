package Logic;
import Entity.Centroid;
import Entity.Triangle;

public class TriangleLogic {

	public static Triangle triangle (int x1,int y1, int x2, int y2, int x3, int y3) {
		
		Triangle triangle = new Triangle(x1, y1, x2 , y2, x3, y3);
		
		return triangle;
		
	}
	
	public static double Square (Triangle triangle, double perimetr) {
		
		double square;
		
		double halfPerimetr;
		
		halfPerimetr = perimetr/2;
		
		square = Math.sqrt(halfPerimetr * (halfPerimetr - FindFirstSide(triangle)) * (halfPerimetr - FindSecondSide(triangle)) * (halfPerimetr - FindFirstSide(triangle)));
		
		return square;
	}
	
	public static double Perimetr (Triangle triangle) {
		
		double perimetr;
		
		perimetr = FindFirstSide(triangle) + FindSecondSide(triangle) + FindThirdSide(triangle);

		return perimetr;
		
	}
	
	public static Centroid centroid (Triangle triangle) {
		
		double firstCoordinate;
		double secondCoordinate;
		
		firstCoordinate = (triangle.getFirstPoint1() + triangle.getSecondPoint1() + triangle.getThirdPoint1())/3;
		secondCoordinate = (triangle.getFirstPoint2() + triangle.getSecondPoint2() + triangle.getThirdPoint2())/3;
		Centroid centroid = new Centroid(firstCoordinate, secondCoordinate);
		return centroid;
	}
	
	public static double FindFirstSide (Triangle triangle) {
		
		double firstSide;
		
		firstSide = Math.sqrt(Math.pow(triangle.getSecondPoint1() - triangle.getFirstPoint1(),2) + (Math.pow(triangle.getSecondPoint2() - triangle.getFirstPoint2(),2)));
		
		return firstSide;
		
	}
	public static double FindSecondSide (Triangle triangle) {
		
		double secondSide;
		
		secondSide = Math.sqrt(Math.pow(triangle.getThirdPoint1() - triangle.getSecondPoint1(),2) + (Math.pow(triangle.getThirdPoint2() - triangle.getSecondPoint2(),2)));
		
		return secondSide;
		
	}
	public static double FindThirdSide (Triangle triangle) {
		
		double thirdSide;
		
		thirdSide = Math.sqrt(Math.pow(triangle.getFirstPoint1() - triangle.getThirdPoint1(),2) + (Math.pow(triangle.getFirstPoint2() - triangle.getThirdPoint2(),2)));
		
		return thirdSide;
		
	}
}
