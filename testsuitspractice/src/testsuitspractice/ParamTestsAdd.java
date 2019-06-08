package testsuitspractice;



//import 

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParamTestsAdd {
	
	//declare variables
	private int firstNum, secondNum, expectedResult;
	private Maths mathsClassUnderTest;
	//private Values v;
	
//prepare constructor to get values as functions for parameterized.parameters
	public ParamTestsAdd(int firstNum, int secondNum, int expectedResult) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection input() {
		//return Arrays.asList(a)
		//return null;
		return Arrays.asList(new Object[][]{
			{1, 2, 3}, {9, -1, 8}, {-2, -3, -5}, {45, 6, 51}, {0, 78, 78}
		});
	}
	
	@Before
	public void setUp() {
		mathsClassUnderTest = new Maths();
	}

	@Test
	public void test() {
		//System.out.println(expectedResult+ " = "+ firstNum + " + " + secondNum);
		assertEquals(expectedResult, mathsClassUnderTest.addNum(firstNum, secondNum));
	}

	
	@After
	public void tearDown() {
		mathsClassUnderTest = null;
	}

	
}
