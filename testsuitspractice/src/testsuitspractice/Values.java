package testsuitspractice;

import java.util.ArrayList;
import java.util.List;

public class Values {
	int sum = 0;
	
	private int[][] arrayInput= new int[][]{
		{1,2}, {2,3}, {3,4}, {4,5}, {5,6}};
	private int x;
	
	public void addNumbers(){
		for (int i = 0; i < arrayInput.length; i++) {
			sum+= arrayInput[i][0];
			
		}
		System.out.println(sum);
	}
}

