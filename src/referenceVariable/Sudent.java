package referenceVariable;

public class Sudent {

	String sname;
	int sid;
	public Sudent(String sname,int sid) {
		
		this.sname=sname;
		this.sid=sid;
	}
	public static void main(String[] args) {
		Sudent s1= new Sudent("Rahul",12);
		Sudent s2=s1;
		Sudent s3=s2;
		
		System.out.println(s2.sname);
		System.out.println(s3.sname);
		System.out.println(s3.sid);
		System.out.println(s2.sid);
		
		s2.sname="Rohan";
		
		System.out.println(s1.sname);
		System.out.println(s3.sname);
		
		
	}
	
}

