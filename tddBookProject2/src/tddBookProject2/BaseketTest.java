package tddBookProject2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class BaseketTest {
	
	private Basket target;
	private List<Book> listofBooks;
	private Book testBook;

	@Before
	public void setup(){
		
		target = new Basket();
		listofBooks = new ArrayList<>();
		testBook = new Book("Author", "book", 15);
	}
	@Test
	public void test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBooksHaveBeenAdded(){
		
		listofBooks = target.getBooksInBasket();
		int expected = listofBooks.size();
		assertEquals(0, expected);
		assertEquals(true, listofBooks.isEmpty());
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithOneBook(){
		
		target.addBook(testBook);
		listofBooks = target.getBooksInBasket();
		int expected = listofBooks.size();
		assertEquals(1, expected);
		
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthTwo_AfterAddBookMethodIsCalledWithTwoBooks(){
		
		target.addBook(testBook);
		target.addBook(testBook);
		listofBooks = target.getBooksInBasket();
		int expected = listofBooks.size();
		assertEquals(2, expected);
		
	}

}
