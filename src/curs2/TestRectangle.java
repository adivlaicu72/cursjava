package curs2;

public class TestRectangle {

	public static void main(String[] args) {
		
		Rectangle rectangle1 = new Rectangle();
		rectangle1.setLenght(4.0);
		rectangle1.setWidth(2.0);
		
		System.out.println(rectangle1.calculateArea());
	
		
		
		Rectangle rectangle2 = new Rectangle();
		rectangle2.setLenght(5.0);
		rectangle2.setWidth(3.0);
		
		System.out.println(rectangle2.calculateArea());
		
		
		
		Rectangle rectangle3 = new Rectangle();
		rectangle3.setLenght(3.0);
		rectangle3.setWidth(2.0);
		
		System.out.println(rectangle3.calculateArea());
	
	
	}

}
