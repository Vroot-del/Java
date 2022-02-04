package entities;

public class rectangle {
	
	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return (height * 2) + (width * 2);
	}
	
	public double diagonal() {	
		return Math.sqrt((width = width * width) + (height = height * height));
	}
	
	public String toString() {
		return "AREA = "
				+ area()
				+ "\n"
				+ "PERIMETER = "
				+ perimeter()
				+ "\n"
				+ "DIAGONAL =  "
				+ diagonal();
	}

}
