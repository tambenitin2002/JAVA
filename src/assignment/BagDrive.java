package assignment;

import java.util.Scanner;

public class BagDrive {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Bag b1=new Bag();
		boolean exit=true;
		while(exit)
		{
			System.out.println("Enter the choice \n1.add Ball \n2.Check Bag \n3.Remove Ball \n4.Show Ball \n5.Exit");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				b1.addBall();
				/*
				 
				 //  ********Comment Part of Logic************
				 
				System.out.println("Enter the chice \n1.TennisBall \n2.BasketBall");
				int choice2=sc.nextInt();
				if(choice2==1) {
					System.out.println("enter the radius of Tennisball");
					double radius=sc.nextDouble();
					b1.addBall(new TennisBall(radius));
				}
				else if(choice2==2) {
					System.out.println("enter the radius of BasketBal");
					double radius=sc.nextDouble();
					b1.addBall(new BasketBall (radius));
				}
				else {
					System.out.println("Invalid choice...");
				}
				*/
				
			
			break;
			
			case 2:
			{
				b1.checkBag();
			}
			break;
			case 3:
			{
				b1.removeBall();
			}
			break;
			case 4:
			{
				b1.showGame();
			}
			break;
			case 5:
			{
				exit=false;
				System.out.println("Application closed.....");
			}
			break;
			default:
			{
				System.out.println("Invalid choice...");
			}
			break;
				
			
		}
		}
	}

}
