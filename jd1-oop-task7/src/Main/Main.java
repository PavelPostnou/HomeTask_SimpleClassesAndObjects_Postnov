package Main;
import Entity.Triangle;
import Logic.TriangleLogic;

public class Main {

	public static void main(String[] args) {
		
		Triangle triangle = TriangleLogic.triangle(1,1,3,3,0,6);
		double perimetr = TriangleLogic.Perimetr(triangle);
		System.out.println(perimetr);
		System.out.println(TriangleLogic.Square(triangle, perimetr));
		System.out.println(TriangleLogic.centroid(triangle));
		
	}

}
