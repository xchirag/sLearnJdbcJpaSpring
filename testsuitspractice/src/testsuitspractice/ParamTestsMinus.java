package testsuitspractice;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

// good read but old way of doing things: https://www.guru99.com/junit-parameterized-test.html

@RunWith(Parameterized.class)
public class ParamTestsMinus {
	
	private int num1, numb2, expected;
	private Maths mathsClassUnderTest;

	@Before
	public void setUp() throws Exception {
		mathsClassUnderTest = new Maths();
	}
	
	
	
	public ParamTestsMinus(int num1, int numb2, int expected) {
		super();
		this.num1 = num1;
		this.numb2 = numb2;
		this.expected = expected;
	}


	@Parameterized.Parameters
	public static Collection input(){
		
		return Arrays.asList(new Object[][] {
			{0, -2, 2}, {1, -5, 6}, {-1, -7, 6}, {6, 3, 3}, {3, 6, -3}
		});
		
	}
	
	@Test
	public void test() {
		assertEquals(expected, mathsClassUnderTest.minusNum(num1, numb2));
	}

	@After
	public void tearDown() throws Exception {
		
		mathsClassUnderTest = null;
	}

	

}
