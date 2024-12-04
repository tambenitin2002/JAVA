package nonPrimitiveTypeCasting;

public class Child extends Parent {
	
	public void fromChild() {
		System.out.println("Hello from child class");
		
	}
public static void main(String[] args) {
		
		Parent p1=new Child();
		p1.fromParent();
		
	}
	

}

