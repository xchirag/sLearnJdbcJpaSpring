package testsuitspractice;

import java.awt.datatransfer.StringSelection;

public class Maths {

	private int x, y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int addNum(int x, int y) {
		//System.out.println(x + y);
		return (x+y);
	}
	
	public int minusNum(int x, int y){
		return (x-y);
	}
	
//	public static void main(String args[]){
//		
//		Values v = new Values();
//		v.addNumbers();
//		//System.out.println(v.addNumbers());
//	}
	
	
}
