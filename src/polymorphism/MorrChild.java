package polymorphism;

public class MorrChild extends MorrParent {
	public void test() {
		System.out.println("Hello this is a test() Child");
	}

	public static void main(String[] args) {
		System.out.println(" This is a Method Overriding "); 
		
		MorrParent m1=new MorrParent();
		m1.test();
	
		MorrChild c1=new MorrChild();
		c1.test();
		
		MorrParent m2=new MorrChild();
		m2.test();
	}
	
}
