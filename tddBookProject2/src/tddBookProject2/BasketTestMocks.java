package tddBookProject2;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BasketTestMocks {

	@InjectMocks
	private Basket target;
	
	@Mock
	private List<Book> mockBasketOfBooks;
	
	@Mock
	private Book mockBook;
	
	@Test
	public void test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBooksHaveBeenAdded() {
		assertEquals(0, target.getBooksInBasket().size());
	}

	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithOneBook(){
		
		//when(target.getBooksInBasket()).thenReturn(mockBasketOfBooks);
		//when(mockBasketOfBooks.get)
		//mockBasketOfBooks.add(mockBook);
		//assertEquals(1, target.getBooksInBasket());
		
		when(target.getBooksInBasket().size()).thenReturn(1);
		target.addBook(mockBook);
		assertEquals(1, target.getBooksInBasket().size()); // this result depends upon when scenario created above!
		verify(mockBasketOfBooks, times(1)).add(mockBook); // this verifies that the target.addBook calls in add method of list
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthTwo_AfterAddBookMethodIsCalledWithTwoBooks(){
		
		target.addBook(mockBook);
		target.addBook(mockBook);
		
		when(target.getBooksInBasket().size()).thenReturn(2);
		assertEquals(2, target.getBooksInBasket().size());
		verify(mockBasketOfBooks, times(2)).add(mockBook);
	}
	


}
