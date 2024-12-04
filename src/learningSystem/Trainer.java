package learningSystem;

public class Trainer extends NTCode{
	private String tname;
	private int tempid;
	private String email;
	private long phoneNumber;
	private String password;
	public Trainer(String branch, String city, int branchId, String tname, int tempid, String email, long phoneNumber,
			String password) {
		super(branch, city, branchId);
		this.tname = tname;
		this.tempid = tempid;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getTempid() {
		return tempid;
	}
	public void setTempid(int tempid) {
		this.tempid = tempid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	
	
}
