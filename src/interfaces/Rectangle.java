package interfaces;

public class Rectangle implements Shape {
	
	@Override
	public void getArea() {
		double lenth=10;
		double width=10;
		double areaOfRectangle=lenth*width;
		System.out.println("Area of Rectangle: "+areaOfRectangle);
	}

}
