package polymorphism;

public class MsChild extends MsParent {

	 public static void test() {
		  System.out.println("This is a test() Child");
	  }
	 public static void main(String[] args) {
		MsParent p1=new MsParent();
		p1.test();// This is a test() Parent
		
		MsChild c1= new MsChild();
		c1.test();// This is a test() Child
		
		MsParent p2= new MsChild();
		p2.test();// This is a test() Parent
		
	}
}
