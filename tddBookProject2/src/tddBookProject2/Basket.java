package tddBookProject2;

import java.util.ArrayList;
import java.util.List;

public class Basket {

	private List<Book> basketOfBooks;
	
	public Basket(){
		basketOfBooks = new ArrayList<>();
	}

	public List<Book> getBooksInBasket() {
		// TODO Auto-generated method stub
		return basketOfBooks;
	}

	public void addBook(Book testBook) {
		// TODO Auto-generated method stub
		basketOfBooks.add(testBook);
	}
}
