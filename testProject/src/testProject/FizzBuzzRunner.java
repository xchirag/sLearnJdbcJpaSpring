package testProject;

import org.omg.CORBA.PRIVATE_MEMBER;

public class FizzBuzzRunner {

	public void fizzBuzz(int number) {

		for (int i = 1; i <= number; i++) {

			if (i % 3 != 0 && i % 5 != 0)
				System.out.print(i);

			if (i % 15 == 0)
				System.out.print("FizzBuzz");
			else {

				if (i % 3 == 0)
					System.out.print("Fizz");
				if (i % 5 == 0)
					System.out.print("Buzz");
			}

			System.out.print(" ");
		}
	}

	// private boolean fizz(int num) {
	// if (num%3 == 0)
	// return true;
	// else
	// return false;
	// }

	public boolean fizz(int num) {

		if (num % 3 == 0)
			return true;
		else
			return false;

	}

	public boolean buzz(int num) {

		if (num % 5 == 0)
			return true;
		else
			return false;

	}
	
	public boolean fizzbuzz(int num) {

		if (num % 15 == 0)
			return true;
		else
			return false;

	}
	public static void main(String[] args) {

		FizzBuzzRunner fz = new FizzBuzzRunner();
		fz.fizzBuzz(50);
	}
}
