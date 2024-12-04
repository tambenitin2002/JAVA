package learningSystem;

import java.util.Scanner;

public class Admin extends NTCode{
	
	public Admin(String branch, String city, int branchId) {
		super(branch, city, branchId);
	}
	Trainer t;
	Course c;
	Student s;
	Scanner sc=new Scanner(System.in);
	
	public void addStudent() {
		if(this.s==null) {
			System.out.println("Account is not created yet....");
		}else {
			System.out.println("Enter the studet Id ");
			int sid=sc.nextInt();
			
			System.out.println("Enter the studet Name ");
			String sname=sc.next();
			
			System.out.println("Enter the studet Phone Number ");
			long number=sc.nextLong();
			
			System.out.println("Enter the studet email ");
			String semail=sc.next();
			
			System.out.println("Enter the PassWord ");
			String passward=sc.next();
			
			}
	}
	
	public void deleteAccount()
	{
		if(this.s==null) {
			
			System.out.println("Account is not created yet....");
			
		}else {
			 
			this.s=null;
			
		}
	}
	
	public void updateStudent() {
          if(this.s==null) {
			
			System.out.println("Account is not created yet....");
			
		}else {
			 
			System.out.println("Update the student email");
			String email=sc.next();
			this.s.setEmail(email);
			
			System.out.println("Update the student Phone");
			long phone=sc.nextLong();
			this.s.setPhoneNo(phone);
			
		}
		
	}
	
	public void showDetail() {
		 if(this.s==null) {
				
				System.out.println("Account is not created yet....");
				
			}else {
				 
				System.out.println("The Student ID : "+this.s.getId());
				System.out.println("The Student Name : "+this.s.getSname());
				System.out.println("The Student Email : "+this.s.getEmail());
				System.out.println("The Student Phone : "+this.s.getPhoneNo());
					
			}
	}
	
	public void addTrainer() {
		if(this.t==null) {
			System.out.println("Account is not created yet....");
		}else {
			System.out.println("Enter the studet Id ");
			int tempid=sc.nextInt();
			
			System.out.println("Enter the studet Name ");
			String tname=sc.next();
			
			System.out.println("Enter the studet Phone Number ");
			long tphone=sc.nextLong();
			
			System.out.println("Enter the studet email ");
			String temail=sc.next();
			
			System.out.println("Enter the PassWord ");
			String tpassward=sc.next();
			
			}
	}
	
	public void deleteTrainer() {
		if(this.t==null) {
			System.out.println("Account is not created yet....");
		}else {
			this.t=null;
		}
	}
	
	public void showTrainer() {
		if(this.t==null) {
			System.out.println("Account is not created yet....");
		}else {
			System.out.println("The Student ID : "+this.t.getTempid());
			System.out.println("The Student Name : "+this.t.getTname());
			System.out.println("The Student Email : "+this.t.getEmail());
			System.out.println("The Student Phone : "+this.t.getPhoneNumber());
		}
	}
	
	public void updateTrainer() {
        if(this.t==null) {
			
			System.out.println("Account is not created yet....");
			
		}else {
			 
			System.out.println("Update the student email");
			String email=sc.next();
			this.t.setEmail(email);
			
			System.out.println("Update the student Phone");
			long phone=sc.nextLong();
			this.t.setPhoneNumber(phone);
			
		}
		
	}
	
	public void addCourse() {
     
			 
			if(this.c==null) {
				
				System.out.println("Course Not added....");
				
			}else {
				 
				System.out.println("Enter the course Id ");
				int courceId=sc.nextInt();
				
				System.out.println("Enter the Course Name ");
				String courseName=sc.next();
				
				System.out.println("Enter the Course Price ");
				int coursePrice=sc.nextInt();
					
			}			
		}
	
	public void deleteCourse() {
		if(this.c==null) {
			
			System.out.println("Course Not added....");
			
		}else {
			 
			this.c=null;
				
		}
	}
		
		
	}

 