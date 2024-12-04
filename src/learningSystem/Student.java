package learningSystem;

public class Student extends NTCode {
	
	private int id;
	private String sname;
	private long phoneNo;
	private String email;
	private String password;
	public Student(String branch, String city, int branchId, int id, String sname, long phoneNo, String email,
			String password) {
		super(branch, city, branchId);
		this.id = id;
		this.sname = sname;
		this.phoneNo = phoneNo;
		this.email = email;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
