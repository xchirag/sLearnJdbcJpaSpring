package com.fdmgroup.tddBook.tddBookProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Catalogue {

	private List<Book> listOfBooks;
	//private Book book;

	public Catalogue() {
		listOfBooks = new ArrayList<Book>();
	}

	public List<Book> getAllBooks() {
		return listOfBooks;

	}

	public void addBook(Book book) {
		listOfBooks.add(book);
	}

	public void removeBook2(int index){
		
		listOfBooks.remove(index);
		
	}
	public void removeBook(int isbnNumber) {
		
		Iterator<Book> iterator = listOfBooks.iterator();
		while (iterator.hasNext()) {
			Book book = (Book) iterator.next();
			if (book.getIsbnNumber() == isbnNumber)
				listOfBooks.remove(book);
		}
	}
	
}