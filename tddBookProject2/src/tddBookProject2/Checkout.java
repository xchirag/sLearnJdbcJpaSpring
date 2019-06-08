package tddBookProject2;

import static org.mockito.Mockito.mock;

//import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Checkout {

	private double basketPrice;
	private int discount;
	private double discountedBasketPrice;

	// private List<Book> listOfBooks;

	public Checkout() {
		// listOfBooks = new ArrayList<>();
		basketPrice = discountedBasketPrice = 0.0;
		discount = 0;
	}

	public double getBasketPrice() {
		return basketPrice;
	}

	public void setBasketPrice(double basketPrice) {
		this.basketPrice = basketPrice;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public double getDiscountedBasketPrice() {
		return discountedBasketPrice;
	}

	public void setDiscountedBasketPrice(double discountedBasketPrice) {
		this.discountedBasketPrice = discountedBasketPrice;
	}

	public double calculatePrice(List<Book> mockBasket) {
		// this.listOfBooks = mockBasket;
		Iterator<Book> bookMe = mockBasket.iterator();
		while (bookMe.hasNext()) {
			basketPrice = basketPrice + bookMe.next().getPrice();
		}
		int dicountPercentage = calculateDiscountPercentage(mockBasket.size());
		discountedBasketPrice = basketPrice - (basketPrice * dicountPercentage / 100);
		return discountedBasketPrice;
	}

	public int calculateDiscountPercentage(int size) {

		int percentage = 0;

		if (size >= 10)
			percentage += 10;

		for (int x = size; x > 0; x--) {
			if (x % 3 == 0)
				percentage++;
		}
		return percentage;
	}
}
