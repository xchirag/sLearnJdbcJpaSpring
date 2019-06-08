package com.fdmgroup.teaenum;

import java.io.InputStream;
import java.util.Scanner;

public class TeaEnumPractice {

	public enum Chai {

		NORMAL(2, 40, 60, 3, 0), MASALA(2, 50, 50, 2, 5), GREEN(1, 0, 100, 0, 0), FRUIT(2, 0, 100, 1, 0);

		private final int teaBags, milk, water, sugar, masala;

		Chai(int teaBags, int milkPercentage, int waterPercentage, int sugarTeaspoons, int masalaInput) {
			this.teaBags = teaBags;
			this.milk = milkPercentage;
			this.water = waterPercentage;
			this.sugar = sugarTeaspoons;
			this.masala = masalaInput;
		}
	}

	public static void main(String[] args) {

		//Chai c = Chai.NORMAL;
		// .out.println(c.teaBags);
		//printRecepie(c);
		
		int x = printMenu();
		takeSelection(x);
	}

	private static void takeSelection(int x) {
		if (x == 1)
			printRecepie(Chai.NORMAL);
		if (x==2)
			printRecepie(Chai.MASALA);
		if (x==3)
			printRecepie(Chai.GREEN);
		if(x==4)
			printRecepie(Chai.FRUIT);
	}

	private static int printMenu() {
		System.out.println("what type of Chai do you want to make?:");
		System.out.println("1: Normal Chai");
		System.out.println("2: Masala");
		System.out.println("3: Green");
		System.out.println("4: Fruit");
		
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		return x;
	}

	private static void printRecepie(Chai chai) {
		System.out.println("you need following to make to make  " + chai + " tea: ");
		System.out.println("Number of teaBags:" + chai.teaBags);
		System.out.println("Milk Percentage(%) : " + chai.milk);
		System.out.println("water percentage (%) : " + chai.water);
		System.out.println("Sugar Tea spoons: " + chai.sugar);
		System.out.println("masala percentage: " + chai.masala);
		
		if (chai == Chai.NORMAL)
			System.out.println("this is also known ROutine Chai!");
		
		if (chai == Chai.FRUIT)
			System.out.println("this is also known as luxUry Chai!");
		
		if (chai == Chai.GREEN)
			System.out.println("this is a healthy and Favourite of Munnaji!");
		
		if (chai == Chai.MASALA)
			System.out.println("Ludhiana people dring this often!");
	}

}
