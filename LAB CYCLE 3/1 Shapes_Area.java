package co3;
import java.util.Scanner;


public class Shapes_Area {
	void area (int side) {
		System.out.println("area of square is "+ side*side);
	}
	void area(float radius) {
		System.out.println("Area if circle is "+(3.14*radius*radius));
	}
	void area(int length, int breadth) {
		System.out.println("Area of rectanlge is "+length*breadth);
	}
	void area (float heigth, float width) {
		System.out.println("Area of triangle is "+(0.5*heigth*width));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shapes_Area ar=new Shapes_Area();
		System.out.println("Enter the side of square ");
		int side=sc.nextInt();
		System.out.println("Enter the radius of circle ");
		Float radius=sc.nextFloat();
		System.out.println("Enter the length and breadth of rectangle");
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		System.out.println("Enter the heigth and width of triangle");
		Float height=sc.nextFloat();
		Float width=sc.nextFloat();
		ar.area(side);
		ar.area(radius);
		ar.area(length,breadth);
		ar.area(height,width);
		// TODO Auto-generated method stub

	}

}