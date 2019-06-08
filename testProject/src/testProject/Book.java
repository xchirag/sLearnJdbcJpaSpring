package testProject;

public class Book {

	private String title;
	private String author;
	private double priceOfBook;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPriceOfBook() {
		return priceOfBook;
	}

	public void setPriceOfBook(double priceOfBook) {
		this.priceOfBook = priceOfBook;
	}

//	public Book(String author) {
//		//super();
//		this.author = author;
//
//	}

//	public Book(String author, double price) {
//		//super();
//		this.author = author;
//		this.priceOfBook = price;
//	}

	public Book(String title, String author, double price) {
		//super();
		this.title = title;
		this.author = author;
		this.priceOfBook = price;
	}

	public void printBook() {
		System.out
				.println("book title is:" + this.title + "book author is:" + this.author + "book price is:" + this.priceOfBook);
	}

}
