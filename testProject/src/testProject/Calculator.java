package testProject;

import java.io.InputStream;
import java.util.Scanner;

public class Calculator {

	private double firstInput, secondInput;
	private Scanner scanner;

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public String oper;

	public Calculator() {
		this.scanner = new Scanner(System.in);
	}

	public double getFirstInput() {
		return firstInput;
	}

	public void setFirstInput(int firstInput) {
		this.firstInput = firstInput;
	}

	public double getSecondInput() {
		return secondInput;
	}

	public void setSecondInput(int secondInput) {
		this.secondInput = secondInput;
	}

	public void addNumbers(double i, double j) {
		System.out.println("The addition is : " + (i + j));
	}

	public void subNumbers(double i, double j) {
		System.out.println("The subtraction is : " + (i - j));
	}

	public void mulNumbers(double i, double j) {
		System.out.println("The multiplication is : " + (i * j));
	}

	public void divNumbers(double i, double j) {
		System.out.println("The multiplication is : " + (i / j));
	}

	public void modNumbers(double i, double j) {
		System.out.println("The modulus is : " + (i % j));
	}

	public void getNumbers() {
		System.out.println("input first number: ");
		firstInput = Double.parseDouble(scanner.nextLine());
		System.out.println("input second number: ");
		secondInput = Double.parseDouble(scanner.nextLine());

		System.out.println("input operator to operate from + - * / or %");
		oper = scanner.nextLine();
		System.out.println(String.valueOf(firstInput) + " " + String.valueOf(secondInput) + " " + oper);

	}

	public void conditionLogic() {
		// if (oper == "+")
		// addNumbers(firstInput, secondInput);
		//
		// if (Boolean.valueOf(oper.compareTo("+")))

		if (oper.equals("+"))
			addNumbers(firstInput, secondInput);

		if (oper.equals("-"))
			subNumbers(firstInput, secondInput);

		if (oper.equals("*"))
			mulNumbers(firstInput, secondInput);

		if (oper.equals("/"))
			divNumbers(firstInput, secondInput);

		if (oper.equals("%"))
			modNumbers(firstInput, secondInput);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
			System.out.println("hi Calculator");
			//
			// Calculator c = new Calculator();
			// c.getNumbers();
			// c.conditionLogic();
			//
			// System.out.println(" ");
			// System.out.println("do you want to continue (Y: Yes and N:No):
			// ");
			// c.setScanner(System.in);

			// Scanner temp = c.getScanner();

			// Scanner s = new Scanner(System.in); //how can we assign input
			// stream to existing stream
			// String temp = s.nextLine();
			//// if (s.equals("N"))
			//// break;
			//// Scanner s = c.getScanner();
			//// System.in;
			////
			//// if (scanner.equals("N"))
			//// break;
			//
			// if (temp.equals("N"))
			// break;

		} while (false);

		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 10; i++) {
				System.out.print("*");
				if(i==9)
					System.out.println("");
			}
			//System.out.println("");
		}

	}
}
