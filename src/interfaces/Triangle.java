package interfaces;

public class Triangle implements Shape {
	
	@Override
	public void getArea() {
		double b=10;
		double h=10;
		double areaOfTriangle=(b*h)/2;
		System.out.println("Area of Triangle: "+areaOfTriangle);
	}
	
	public static void main(String[] args) {
		Circle c1=new Circle();
		Rectangle r1=new Rectangle();
		Triangle t1=new Triangle();
		c1.getArea();
		r1.getArea();
		t1.getArea();
	}

}
