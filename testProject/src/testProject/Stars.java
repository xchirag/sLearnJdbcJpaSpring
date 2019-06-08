package testProject;

public class Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int j = 0; j < 10; j++) {

			for (int i = 0; i < 10; i++) {
				if(i%2 == 0)
					System.out.print("*");
				else
					System.out.print("^");

			}
			System.out.println("");
		}
	}

}
