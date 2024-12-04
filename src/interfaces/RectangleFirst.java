package interfaces;

public class RectangleFirst implements Resizable {
	 int width;
	 int height;
	
	public RectangleFirst(int width, int height) {
		this.width=width;
		this.height=height;
	}
	
	public void resizeWidth(int width) {
		this.width=width;
	}
	public void resizeHeight(int height) {
		this.height=height;
	}
	public void printSize() {
		System.out.println("Width: "+width+", Height: "+height);
	}

}
