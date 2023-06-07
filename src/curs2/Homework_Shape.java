package curs2;

public class Homework_Shape {
		//variabile
		private int lenght;
		private int width;
		private double radius;
		
		//constructor patrat
		public Homework_Shape(int lenght) {
			this.setLenght(lenght);
			System.out.println("The area of the square is: " +calculateSquareArea(8));
			
	
		}
		
		//constructor dreptunghi
		public Homework_Shape(int lenght, int width) {
			this.setLenght(lenght);
			this.setWidth(width);
			System.out.println("The area of the rectangle is: " +calculateSquareArea(4, 2));
		}
		
		//constructor cerc
		public Homework_Shape(double radius) {
			this.setRadius(radius);	
			System.out.println("The area of the circle is: " +calculateCircleArea(3.0));
		}
		
		
		//metoda calcul aria patrat
		public int calculateSquareArea(int lenght) {
			int squareArea = lenght * lenght;
			return squareArea;
		}
		//metoda calcul aria dreptunghi
		public int calculateSquareArea(int lenght, int width) {
			int squareArea = lenght * width;
			return squareArea;
		}
		
		//metoda calcul aria cerc
		public double calculateCircleArea(double radius) {
			double circleArea = Math.PI * radius * radius;
			return circleArea;
			
		}

	
		public double getRadius() {
			return radius;
		}

		public void setRadius(double radius) {
			this.radius = radius;
		}

		public int getWidth() {
			return width;
		}

		public void setWidth(int width) {
			this.width = width;
		}

		public int getLenght() {
			return lenght;
		}

		public void setLenght(int lenght) {
			this.lenght = lenght;
		}
		
	}
