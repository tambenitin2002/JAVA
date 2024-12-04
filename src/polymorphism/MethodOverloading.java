package polymorphism;

public class MethodOverloading {
	
	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		m.add();
		m.add(13,13);
		m.add(23,10,15);
		
	}
	public void add() {
		
	}
	public void add(int a, int b) {
		int res= a+b;
		System.out.println(res);
	}
	public void add(int a, int b, int c) {
		int res = a+b+c;
		System.out.println(res);
	}

}
