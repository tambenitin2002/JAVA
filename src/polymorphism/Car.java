package polymorphism;

public class Car {
//   String brand;
//   String name;
//   String color;
//   String cNumber;
//   long contactNumber;
   
   Car(String brand, String name ){
//	   this.brand=brand;
//	   this.name=name;
	   System.out.println("Car brand : "+brand);
	   System.out.println("Car name: "+name);
   }
   Car(String color, String cNumber,long contactNumber){
//	   this.color=color;
//	   this.cNumber=cNumber;
//	   this.contactNumber=contactNumber;

	   System.out.println("Car color: "+color);
	   System.out.println("Car Number: "+cNumber);
	   System.out.println("Contact Number : "+ contactNumber);
   }
   

   public static void main(String[] args) {
	Car c1=new Car("BMW","XYZ");
	
	Car c2=new Car("Red","AS 1223",88888888);
	
}
}
