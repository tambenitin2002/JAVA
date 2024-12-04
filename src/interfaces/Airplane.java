package interfaces;

public class Airplane implements Flyable {
	public void fly_obj() {
		System.out.println("Airplane is flying");
	}
	public static void main(String[] args) {
		Flyable[] flyingObjects= {new Spacecraft(), new Airplane(), new Helicopter()};
		
		for(Flyable obj: flyingObjects) {
			obj.fly_obj();
			}
	}
	
	
}
