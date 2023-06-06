package curs2;


public class Homework_TestShape {

	public static void main(String[] args) {
		
		//patrat
		Homework_Shape patrat = new Homework_Shape(0);
		System.out.println("The area of the square is: " +patrat.calculateSquareArea(8));
	
		//dreptunghi
		Homework_Shape dreptunghi = new Homework_Shape(0,0);
		System.out.println("The area of the rectangle is: " +dreptunghi.calculateSquareArea(4, 2));
		
		//cerc
		 Homework_Shape cerc = new Homework_Shape(0);
		 System.out.println("The area of the circle is: " +cerc.calculateCircleArea(3));

	}

}
