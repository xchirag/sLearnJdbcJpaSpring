package com.fdmgroup.pensions.task3;

import java.util.Calendar;


public class PensionLogic {

	public boolean isPensionable(Person person, String year) {

		int bornYear = Integer.parseInt(year);

		// int bornYear = Integer.parseInt(year);

		// int age =

		// if (year.equals("2014")){
		// return true;
		// }
		// else{
		// return false;
		// }
		// System.out.println(bornYear);
		// Date d = new DateTimeAtProcessing(system)
		Calendar c = Calendar.getInstance();
		// System.out.println(c.get(Calendar.YEAR));
		// int presentyear = Integer.parseInt(c.get(Calendar.YEAR))
		int presentyear = c.get(Calendar.YEAR);

		if (presentyear - bornYear >= 65) 
			return true;
		else
			return false;
	}

}
