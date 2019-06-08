package com.fdmgroup.pensions.task3;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PensionController pc = new PensionController();
		ArrayList<Person> personArray = new ArrayList<>();
		// personArray.add();
		personArray.add(new Person("victor", "vim", "28/06/1993"));
		personArray.add(new Person("Jane", "Doe", "05/01/1950"));
		personArray.add(new Person("Fred", "Bloggs", "12/12/1949"));
		personArray.add(new Person("kimlo", "dummy", "12/04/1953"));

		pc.handlePensions(personArray);
		
		

		// while (System.out.println(personArray);

		// for (Person person : personArray){
		// System.out.print(person.getFirstname());
		// System.out.print(person.getLastname());
		// System.out.print(person.getDateOfBirth());
		// System.out.println();
		// }
		//
//		Iterator<Person> personLoop = personArray.iterator();
//		while (personLoop.hasNext()) {
//			
//			Person person = personLoop.next();
//			
//			System.out.print(person.getFirstname());
//			System.out.print(" "+ person.getLastname());
//			System.out.println(" " +person.getDateOfBirth());
//
////			better structure via iterator as Above
////			System.out.println(personLoop.next().getFirstname());
////			System.out.println(personLoop.next().getLastname());
////			System.out.println(personLoop.next().getDateOfBirth());
//		}

	}

}
