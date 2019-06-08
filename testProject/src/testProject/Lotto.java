//package testProject;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class Lotto {
//
//	private double money;
//	private Scanner s;
//	private int lines;
//	private double change;
//
//	public double getMoney() {
//		return money;
//	}
//
//	public Lotto() {
//		this.s = new Scanner(System.in);
//	}
//
//	public void setMoney(double money) {
//		this.money = money;
//	}
//
//	public void askMoney() {
//		System.out.println("Whats your limit? : ");
//		money = Double.parseDouble(s.nextLine());
//		// System.out.println(money);
//		lines = (int) (money / 2.5d);
//		// System.out.println(lines);
//		change = money - (lines * 2.5d);
//	}
//
//	public void giveLines() {
//		Random random = new Random();
//		for (int i = 1; i <= lines; i++) {
//			System.out.print("your " + i + "th line is: ");
//			for (int j = 0; j < 5; j++) {
//				System.out.print(random.nextInt(50) + " ");
//			}
//			for (int j = 0; j < 2; j++) {
//				System.out.print(random.nextInt(11) + " ");
//			}
//			for (int j = 0; j < 5; j++) {
//				System.out.println(random.ints(1, 5));
//			}
//
//			System.out.println();
//		}
//
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Lotto play = new Lotto();
//		play.askMoney();
//		play.giveLines();
//		System.out.println("your Change is : " + play.change);
//		// System.out.println(play.change);
//
//	}
//
//}
