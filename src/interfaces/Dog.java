package interfaces;

public class Dog implements Animal {
    @Override
    public void speak() {
    	System.out.println("Dog is barking");
    }
    
    @Override
    public void bark() {
    	
    }
    
    public static void main(String[] args) {
		Dog d1=new Dog();
		d1.speak();
	}
}
