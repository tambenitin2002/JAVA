//This is a program for toString , equals method

package objectClass;

public class EmployeeDriver {
	
	public static void main(String[] args) {
		Employee e1= new Employee("Rohan",12);
		Employee e2= new Employee("Rohan",12);

		System.out.println(e1.equals(e2));
		System.out.println(e1==e2);
	}

}
