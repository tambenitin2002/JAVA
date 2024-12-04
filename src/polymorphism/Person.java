package polymorphism;

public class Person {
	
	Person (String name ){
		System.out.println("Name of person = "+name);
	}
	
	Person (String name , String voterId){
		System.out.println("Name of person = "+name);
		System.out.println("Voter Id Of "+name+" = "+ voterId);
	
	}
	
 public static void main(String[] args) {
	Person p1=new Person("Ravi");
	Person p2=new Person("Ram", "12345678");
}
}
