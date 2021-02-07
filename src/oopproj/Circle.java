package oopproj;

public class Circle {
	
	int radius;
	float pi=3.14f;

	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public void calculateArea() {
		float area = pi*radius*radius;
		System.out.println("Area of the Circle : "+area);
	}	
	
}

