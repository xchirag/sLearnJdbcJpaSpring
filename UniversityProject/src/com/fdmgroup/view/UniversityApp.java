package com.fdmgroup.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.fdmgroup.model.University;

public class UniversityApp {
	
	private List<University> listOfUni;
	
	public UniversityApp(){
		
		listOfUni = new ArrayList<>();
	}
	
	public static void main(String[] args) {
		
		UniversityApp newApp = new UniversityApp();
		University university = new University("University of Leicester", 12000, 10, 620);
		University university2 = new University("University of Loughborough", 8000, 8, 420);
		University university3 = new University("De Montfront", 6230, 29, 800);
		newApp.listOfUni.add(university);
		newApp.listOfUni.add(university2);
		newApp.listOfUni.add(university3);

		Iterator<University> itrateOverUni = newApp.listOfUni.iterator();
		
		for (University university4 : newApp.listOfUni) {
			System.out.println(university4.toString());
		}
	}

}
