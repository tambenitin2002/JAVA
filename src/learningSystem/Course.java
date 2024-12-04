package learningSystem;

import java.util.Scanner;

public class Course extends NTCode {
  
    String courseName;
    int courseId;
    int price;
	public Course(String branch, String city, int branchId, String courseName, int courseId, int price) {
		super(branch, city, branchId);
		this.courseName = courseName;
		this.courseId = courseId;
		this.price = price;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
    
    
}
