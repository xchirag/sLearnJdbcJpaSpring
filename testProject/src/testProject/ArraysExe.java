package testProject;

import java.awt.print.Book;

public class ArraysExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = new String[15];

		names[0] = "zeroth";
		names[1] = "first";
		names[2] = "second";
		names[3] = "third";
		names[4] = "fourth";

		char[] grades = new char[15];

		grades[0] = 'A';
		grades[1] = 'B';
		grades[2] = 'C';
		grades[3] = 'D';
		grades[4] = 'F';

		for (int i = 0; i < names.length; i++) {
			if (names[i] != null)
				System.out.println(names[i]);

		}

//		Book[] booksArray = new Book[5];
//
//		booksArray[0] = new Book("test", "test", 1);
//
//		for (Book b : booksArray) {
//			if (b != null)
//				b.printBook();

		}

	}

//}
