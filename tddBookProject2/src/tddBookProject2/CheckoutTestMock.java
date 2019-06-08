package tddBookProject2;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CheckoutTestMock {

	private Book mockBook;

	@InjectMocks
	private Checkout target;

	// @Mock
	// private List<Book> mockBasket;
	// we cannot mock this because there is no dependency in the original class!
	private List<Book> mockBasket;

	@Before
	public void setup() {

		mockBook = new Book("authorIs", "bookName", 15);
		mockBasket = new ArrayList<>();
	}

	@Test
	public void test_CalculatePrice_ReturnsDoubleZeroPointZeroWhenPassedAnEmptyBasket() {
		// test code

		// mockBasket.add(mockBook);
		double price = target.calculatePrice(mockBasket);
		assertEquals(0, price, 0.0001);

	}

	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithOneBook() {

		mockBasket.add(mockBook);
		double price = target.calculatePrice(mockBasket);
		assertEquals(15, price, 0.0001);
	}

	@Test
	public void test_CalculatePrice_ReturnsPricesOfBooksInBasket_WhenPassedBasketWithTwoBooks() {

		mockBasket.add(mockBook);
		mockBasket.add(mockBook);
		double price = target.calculatePrice(mockBasket);
		assertEquals(30.0, price, 0.0001);
	}

	// If the calculate price method of checkout is called with a basket 7
	// books, it should return the sum of the prices, minus 2%.

	@Test
	public void test_CalculatePrice_ReturnsPricesofBooksInBasket_minus2percentDiscount_whenPassedBasketWithSevenBooks() {

		for (int i = 0; i < 7; i++) {
			mockBasket.add(mockBook);
		}
		assertEquals(102.9, target.calculatePrice(mockBasket), 0.001);
	}

	// If the calculate price method of checkout is called with a basket 10
	// books, it should return the sum of the prices, minus 13%.
	@Test
	public void test_CalculatePrice_ReturnsPricesofBooksInBasket_minus13percentDiscount_whenPassedBasketWithTenBooks() {

		for (int i = 0; i < 10; i++) {
			mockBasket.add(mockBook);
		}
		assertEquals(130.5, target.calculatePrice(mockBasket), 0.001);
	}
	
	//@Test
	public void test_2Mock_CalculatePrice_ReturnsPricesofBooksInBasket_minus13percentDiscount_whenPassedBasketWithTenBooks() {

//		for (int i = 0; i < 10; i++) {
//			mockBasket.add(mockBook);
//		}
		when(target.calculatePrice(mockBasket)).thenReturn(130.5); // this will not work as when requires mock object!
		assertEquals(130.5, target.calculatePrice(mockBasket), 0.001);
		
		//when(target.calculatePrice(mockBasket)).thenReturn(value, values)
		
//		when(mockBasket.)
		
		//when(mockBasket)
	}
}
