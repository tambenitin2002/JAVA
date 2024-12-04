// This is a Program of Constructor Overloading


package polymorphism;

public class Student {

  String name;
  int rollNo;
  String className;
  boolean isFromCity;
  
  Student (String name , int rollNo){
	  this.name=name;
	  this.rollNo=rollNo;
  }
  
  Student (String name , int rollNo, String className, boolean isFromCity){
	  this.name=name;
	  this.rollNo=rollNo;
	  this.className= className;
	  this.isFromCity=isFromCity;
  }
   
  public void studentData()
  {
	  System.out.println("Name of Student = " + name);
	  System.out.println("Roll no = "+rollNo);
	  System.out.println("Class Name= "+className);
	  System.out.println("Is student  belongs to city= "+isFromCity);
  }
  
  public static void main(String[] args) {
	  Student s1=new Student("Ravi",1);
	  s1.studentData();
	  
	  Student s2 = new Student ("Ram",2,"MCA",true);
	  s2.studentData();
  }
	  
  }
	