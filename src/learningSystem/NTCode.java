package learningSystem;

public class NTCode {
 
	String branch;
	String city;
	int branchId;
	public NTCode(String branch, String city, int branchId) {
		this.branch = branch;
		this.city = city;
		this.branchId = branchId;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	
}
