package curs2;

public class Rectangle {
	//variabile
	private double lenght;
	private double width;
	
	public double getLenght() {
		return lenght;
	}
	
	public void setLenght(double lenght) {
		this.lenght = lenght;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	//constructor
//	public Rectangle(double lenght, double width) {
//		this.lenght = lenght;
//		this.width = width;
//	}
	//metoda
	public double calculateArea() {
		return lenght * width;
	}
	
	
}
