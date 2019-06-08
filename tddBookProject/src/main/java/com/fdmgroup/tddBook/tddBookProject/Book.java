package com.fdmgroup.tddBook.tddBookProject;

public class Book {

	String title, author;
	int IsbnNumber, totalPage;
	double price;
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
	public int getIsbnNumber() {
		return IsbnNumber;
	}
	public void setIsbnNumber(int isbnNumber) {
		IsbnNumber = isbnNumber;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book(String title, String author, int isbnNumber, int totalPage, double price) {
		super();
		this.title = title;
		this.author = author;
		IsbnNumber = isbnNumber;
		this.totalPage = totalPage;
		this.price = price;
	}
	
}
