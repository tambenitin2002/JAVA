package interfaces;

public class MainFirst {
	public static void main(String[] args) {
		
	
 RectangleFirst rec=new RectangleFirst(100,200);
 
 rec.printSize();
 
 rec.resizeWidth(150);
 rec.resizeHeight(300);
 
 rec.printSize();
}
}