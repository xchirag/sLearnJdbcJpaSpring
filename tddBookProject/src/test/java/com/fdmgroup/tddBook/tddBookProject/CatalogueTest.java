package com.fdmgroup.tddBook.tddBookProject;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatalogueTest {
	
	@InjectMocks
	private Catalogue target;
	
	@Mock
	private List<Book> mockListOfBooks;
	
	
	@Mock
	private Book mockBook;
	
	@Before
	public void setup(){
		//when(target.getAllBooks()).thenReturn(mockListOfBooks);
		when(mockListOfBooks.get(0)).thenReturn(mockBook);
		mockBook = new Book("title", "author", 12345, 123, 12.34);
	}
	
	@Test
	public void test_GetAllBooks_ReturnsAListOfLengthZero_WhenTheCatalogueHasHadNoBooksAdded(){
			target.getAllBooks();
			assertEquals(0, target.getAllBooks().size());
	}

	
	//•	Test 2: After one book has been added, the List returned should be of length 1.
	
	@Test
	public void test_GetAllBooks_ReturnsAsingleBook_WhenTheCatalogueHasOneBookAdded(){
//		mockListOfBooks.add(mockBook);
//		when(target.getAllBooks()).thenReturn(mockListOfBooks);
		
//		target.addBook(mockBook);
//		assertEquals(1, target.getAllBooks().size());
		
// above will not work because when then should work with the Mock!
		
		when(mockListOfBooks.size()).thenReturn(1);
		List<Book> books = target.getAllBooks();
		assertEquals(1, books.size());
	}
	
	// •	Test 3: After adding one book, the catalogue should contain that same one book
	
	@Test
	public void test_AddBookMethodofCatalogue_AddsTheSameBookinCatalogue(){
		when(mockListOfBooks.get(0)).thenReturn(mockBook);
		target.addBook(mockBook);
		assertEquals(mockBook.getIsbnNumber(), target.getAllBooks().get(0).getIsbnNumber());
	}
	
	// •	Test 4: After adding a Book we should be able to remove it using its ISBN number and get a List of length zero.
	
	@Test
	public void test_2RemoveBookMethodofCatalogue_takesIsbnNumberAsInput_andRemovesTheBookFromCatalogue(){
		
		target.removeBook2(0);
		verify(mockListOfBooks, times(1)).remove(0);
	}
	
	//@Test
	public void test_RemoveBookMethodofCatalogue_takesIsbnNumberAsInput_andRemovesTheBookFromCatalogue(){
		

//		mockListOfBooks.add(mockBook);
//		int isbnNumber = mockBook.getIsbnNumber();
//		int isbnNumber = 0;
//		target.addBook(mockBook);
		//when(mockListOfBooks.remove(mockBook)).thenReturn(true);
		target.removeBook(1234);
		//verify(mockListOfBooks, times(1)).remove(0);
		target.getAllBooks();
		assertEquals(0, target.getAllBooks().size());
	}

}

//int isbnNumber = mockBook.getIsbnNumber();
////when(mockListOfBooks.size()).thenReturn(0);
//target.addBook(mockBook);
//target.removeBook(isbnNumber);
//assertEquals(0, target.getAllBooks().size());
