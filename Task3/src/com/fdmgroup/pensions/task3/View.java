package com.fdmgroup.pensions.task3;

import javax.security.auth.x500.X500Principal;

public class View {

	public void printEligible(Person person){
		
		System.out.print(person.getFirstname() + " " + person.getLastname() + " ");
		System.out.print("is eligible for pension");
		System.out.println();
		
	}
	public void printIneligible(Person person){
		
		System.out.print(person.getFirstname() + " " + person.getLastname() + " ");
		System.out.print("is NOT eligible for pension");
		System.out.println();
	}

//	public static void main(String args[]) { 
//	    String s1 = "abc";
//	    String s2 = new String("abc");
//
//	    if(s1 == s2)
//	        System.out.println(1);
//	    else
//	        System.out.println(2);
//	    if(s1.equals(s2))
//	        System.out.println(3);
//	    else
//	        System.out.println(4);
//	    }
//	
//	try {
//		return;
//	} finally {
//		System.out.println("what");
//	}
//	}
}
