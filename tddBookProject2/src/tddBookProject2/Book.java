package tddBookProject2;

public class Book {
	
	private String authorName, bookName;
	private int price;
	
	public Book(String authorName, String bookName, int price) {
		super();
		this.authorName = authorName;
		this.bookName = bookName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [authorName=" + authorName + ", bookName=" + bookName + ", price=" + price + "]";
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
