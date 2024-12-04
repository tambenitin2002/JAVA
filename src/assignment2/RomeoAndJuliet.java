package assignment2;

public class RomeoAndJuliet extends Book {
	
	private String bookName = "Romeo And Juliet";

	public String getBookName() {
		return bookName;
	}

	
	


	private int pages= 700;

	public int getPages() {
		return pages;
	}
	
	private String author=" WS ";
	private double price=250.0;
	
	
	
	public String getAuthor() {
		return author;
	}



	public double getPrice() {
		return price;
	}



	public RomeoAndJuliet(int quantity) {
		super(quantity);
		
	}

}

