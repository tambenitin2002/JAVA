package assignment2;

import java.util.Scanner;

import assignment2.Book;
import assignment2.HarryPotter;
import assignment2.TwoStates;
import assignment2.RomeoAndJuliet;

public class BagDrive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Bag b1=new Bag();
		boolean exit=true;
		while(exit)
		{
			System.out.println("Enter the choice \n1.add Book \n2.Check Bag \n3.Remove Book \n4.Update quantity  \n5.Show Book \n6.Show Total  \n7.Exit");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the chice \n1.HarryPotter \n2.TwoStates \n3.RomeoAndJuliet");
				int choice2=sc.nextInt();
				if(choice2==1) {
					System.out.println("enter the quantity of HarryPotter");
					int quantity =sc.nextInt();
					b1.addBook(new HarryPotter(quantity));
				}
				else if(choice2==2) {
					System.out.println("enter the quantity of TwoStates");
					int quantity =sc.nextInt();
					b1.addBook(new TwoStates (quantity));
				}
				else if(choice2==3){
					System.out.println("enter the quantity of RomeoAndJuliet");
					int quantity =sc.nextInt();
					b1.addBook(new RomeoAndJuliet (quantity));
				}else {
					System.out.println("Invalid choice...");
				}
				
				
			
			break;
			
			case 2:
			{
				b1.checkBag();
			}
			break;
			case 3:
			{
				b1.removeBook();
			}
			break;
			case 4:
			{
				b1.updateQuantity();
			}
			break;
			case 5:
			{
				b1.showBook();
			}
			break;
			case 6:
			{
				b1.showTotal();
			}
			break;
			case 7:
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
