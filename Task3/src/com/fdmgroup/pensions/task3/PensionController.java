package com.fdmgroup.pensions.task3;

import java.util.ArrayList;
import java.util.Iterator;

public class PensionController {
	
	private PensionLogic pl = new PensionLogic();
	private View v = new View();
	
	public void handlePensions(ArrayList<Person> people){
		
		Iterator<Person> tempIterator = people.iterator();
		
		while(tempIterator.hasNext()){
			Person p = tempIterator.next();
			//System.out.println(p.getDateOfBirth().substring(5, 9));
			
			String temp = p.getDateOfBirth().substring(6, 10);
			//System.out.println(temp);
			boolean b = pl.isPensionable(p, temp);
			
			if(b)
				v.printEligible(p);
			else
				v.printIneligible(p);
			
		}
		
	}

}
