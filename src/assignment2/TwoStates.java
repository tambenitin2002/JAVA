package assignment2;

public class TwoStates extends Book{
	
	private String bookName = "Two States";

	public String getBookName() {
		return bookName;
	}


	private int pages= 1000;

	public int getPages() {
		return pages;
	}
	
	private String author=" Chetan Bhagat ";
	private double price=300.0;
	
	public String getAuthor() {
		return author;
	}



	public double getPrice() {
		return price;
	}
	
	public TwoStates(int quantity) {
		super(quantity);
		
	}
	

}

