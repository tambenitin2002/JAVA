package assignment;

import java.util.Scanner;

public class Bag {

	Ball b;
	Scanner sc=new Scanner(System.in);
	
	public void addBall()
	{
		/*
		 
		  //  ********Comment Part of Logic************
		  
		  
		if(this.b==null) {
			this.b=b;
			System.out.println("Ball is successfully added.....");
		}
		else {
			System.out.println("Ball is already added ...");
		}
		*/
		if(this.b==null) {
			System.out.println("Enter the choice \n 1. BasketBall \n2. TennisBall ");
			int choice= sc.nextInt();
			if(choice==1) {
				System.out.println("Enetr the radius");
				double rad=sc.nextDouble();
				this.b=new BasketBall(rad);
				System.out.println("You Choose BasketBall ");
				
				
				
			}else if(choice ==2) {
				System.out.println("Enetr the radius");
				double rad=sc.nextDouble();
				this.b=new TennisBall(rad);
				System.out.println("You Choose Tennis Ball ");
			}else {
				System.out.println("Invalid Choice.. ");
			}
			System.out.println("Ball is successfully added.....");
		}
		else {
			System.out.println("Ball is already added ...");
		}
	}
	
	public void checkBag() {
		if(this.b==null) {
			System.out.println("Bag is empty...");
		}
		else
		{
			System.out.println("Bag  is not empty...");
		}
	}
	
	public void removeBall() {
		if(this.b==null) {
			System.out.println("First add ball...");
		}
		else {
			this.b=null;
			System.out.println("Ball removed successfully...");
		}
	}
	public void showGame() {
		if(this.b==null) {
			System.out.println("First add ball...");
		}else {
			if(b instanceof TennisBall) {
				TennisBall t1=(TennisBall)b;
				System.out.println("You can Play : "+t1.getGname());
			}else {
				BasketBall b2=(BasketBall)b;
				System.out.println("You can play : "+b2.getGname());
			}
		}
	}
}
