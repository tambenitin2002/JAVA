package assignment2;

public class HarryPotter extends Book {
	private String bookName = "HarryPotter";

	public String getBookName() {
		return bookName;
	}

	private int pages= 1000;

	public int getPages() {
		return pages;
	}
	
	private String author=" JK ";
	private double price=300.0;
	
	
	
	public String getAuthor() {
		return author;
	}


	public double getPrice() {
		return price;
	}


	public HarryPotter(int quantity) {
		super(quantity);
		
	}


}
