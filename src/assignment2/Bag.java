package assignment2;

import java.util.Scanner;

import assignment2.Book;
import assignment2.HarryPotter;
import assignment2.TwoStates;
import assignment2.RomeoAndJuliet;

public class Bag {
	
	Book b;
	
	public void addBook(Book b)
	{
		if(this.b==null) {
			this.b=b;
			System.out.println("Book is successfully added.....");
		}
		else {
			System.out.println("Book is already added ...");
		}
	}
	
	public void checkBag() {
		if(this.b==null) {
			System.out.println("Bag is empty...");
		}
		else
		{
			System.out.println("Bag is empty...");
		}
	}
	
	public void removeBook() {
		if(this.b==null) {
			System.out.println("First add Book...");
		}
		else {
			this.b=null;
			System.out.println("Book removed successfully...");
		}
	}
	public void updateQuantity() {
		if (this.b == null) {
            System.out.println("First add a book.");
        } else {
        	Scanner sc= new Scanner(System.in);
			int newQuantity =sc.nextInt();
           this.b.setQuantity(newQuantity);
            System.out.println("Book quantity updated to " + newQuantity );
        }
		
	}
	
	public void showBook() {
		if(this.b==null) {
			System.out.println("First add Book...");
		}else {
			if(b instanceof HarryPotter) {
				HarryPotter h1=(HarryPotter)b;
				System.out.println("The book is  : "+h1.getBookName());
			}else if (b instanceof TwoStates){
				TwoStates t1=(TwoStates)b;
				System.out.println("The book is : "+t1.getBookName());
			}else {
				RomeoAndJuliet r1=(RomeoAndJuliet)b;
				System.out.println("The book is : "+r1.getBookName());
			}
		}
	}

	public void showTotal() {
		
		if (this.b == null) {
            System.out.println("No books in the bag to show total.");
        } else {
            System.out.println("Total quantity: " + b.getQuantity()*b.getPrice());
        }
		
	}

}
