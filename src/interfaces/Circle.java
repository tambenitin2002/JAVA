package interfaces;

public class Circle implements Shape{

	public void getArea() {
		double red=10.0;
		
		double areaOfCircle=3.14*red*red;
		System.out.println("Area of Circle: "+areaOfCircle);
	}
}
