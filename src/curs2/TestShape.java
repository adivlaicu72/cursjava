package curs2;


public class TestShape {

	public static void main(String[] args) {
		
		//patrat
		Shape patrat = new Shape(0);
		System.out.println("The area of the square is: " +patrat.calculateSquareArea(8));
	
		//dreptunghi
		Shape dreptunghi = new Shape(0,0);
		System.out.println("The area of the rectangle is: " +dreptunghi.calculateSquareArea(4, 2));
		
		//cerc
		 Shape cerc = new Shape(0);
		 System.out.println("The area of the circle is: " +cerc.calculateCircleArea(3));

	}

}
