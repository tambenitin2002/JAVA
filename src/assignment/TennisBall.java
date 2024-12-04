package assignment;

public class TennisBall extends Ball {
	private String gname="Tennis";

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public TennisBall(double radius) {
		super(radius);
		
	}
	

}
