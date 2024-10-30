package studio7;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double area() {
		return length * width;
		
	}
	
	public double perimeter() {
		return 2* (length * width);
	}
	
	public boolean isSquare() {
		return length == width;
	}
	public String toString() {
		return "Rectangle [ Length: " + length + ", Width: " + width + ", Area " + area() +", Perimeter: " + perimeter()+ ", is Square? " + isSquare() + "]";
	}
	
	public static void main(String[]args) {
		Rectangle rect1 = new Rectangle(5,10);
		Rectangle rect2 = new Rectangle(5,5);
		
		System.out.println(rect1);
		System.out.println(rect2);
		
		if(rect1.area() < rect2.area()) {
			System.out.println("Rectangle 1 is smaller than Rectangle 2.");
		} else if(rect1.area() > rect2.area()) {
			System.out.println("Rectangle 1 is larger than Rectangle 2. ");
		} else {
			System.out.println("Both rectangles are the same size. ");
		}
		
		
		
		
	}
	
}


