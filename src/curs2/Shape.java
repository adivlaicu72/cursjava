package curs2;

public class Shape {
		//variabile
		private int lenght;
		private int width;
		private double radius;
		
		//constructor patrat
		public Shape(int lenght) {
			this.setLenght(lenght);
	
		}
		
		//constructor dreptunghi
		public Shape(int lenght, int width) {
			this.setLenght(lenght);
			this.setWidth(width);
		}
		
		//constructor cerc
		public Shape(double radius) {
			this.setRadius(radius);
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
