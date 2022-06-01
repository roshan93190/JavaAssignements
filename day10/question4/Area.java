package day10.question4;
import java.util.Scanner;

public class Area extends Shape {

	@Override
	public int rectangleArea(int length, int breadth) {
		// TODO Auto-generated method stub
		return length*breadth;
	}

	@Override
	public int sqaureArea(int side) {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public int circleArea(int radius) {
		// TODO Auto-generated method stub
		return (int) (3.14*radius*radius);
	}

	public static void main(String[] args) {
		Area area=new Area();
		Scanner input=new Scanner(System.in);
		System.out.println("for area of rectangle else just enter 0 0Enter length and breadth");
		int length=input.nextInt();
		int breadth=input.nextInt();
		area.rectangleArea(length,breadth);
		System.out.println("area of rectangle is: "+area.rectangleArea(length,breadth));
		
		System.out.println("for the area of square enter side");
//		System.out.println("for area of rectangle else just enter 0 0Enter length and breadth");
		int side=input.nextInt();
		System.out.println("area of square is: "+area.sqaureArea(side));
		
		System.out.println("Enter radius for the area of circle");
		int radius=input.nextInt();
		System.out.println("area of circle is: "+area.circleArea(radius));
		
	}
}
