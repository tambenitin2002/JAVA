package polymorphism;

public class VmChild extends VmParent{
	
	String s1= "SubClass";
	
	public static void main(String[] args) {
		VmParent p1=new VmParent();
		System.out.println(p1.s1);
		
		VmChild c1=new VmChild();
		System.out.println(c1.s1);
		
		VmParent p2=new VmChild();
		System.out.println(p2.s1);
	}

}
