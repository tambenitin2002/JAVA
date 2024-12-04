//This is a program for toString method


package objectClass;

public class Employee {
	
	String ename;
	int eid;
	
	public Employee(String ename , int eid) {
		this.ename=ename;
		this.eid=eid;
	}
	
	@Override
	public String toString() {
		
		return this.ename+" "+this.eid;
	}
	
//	public boolean equals(Object i) {
//		
//		return this.ename.equals(i);
//	}
	
	@Override
	public boolean equals(Object o) {
		Employee e=(Employee)o;
		
		return this.ename.equals(e.ename);
	}
	

}
