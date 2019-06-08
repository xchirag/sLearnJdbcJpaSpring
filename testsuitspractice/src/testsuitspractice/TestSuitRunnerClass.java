package testsuitspractice;

import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
import org.junit.runner.Result;
//https://www.guru99.com/create-junit-test-suite.html

public class TestSuitRunnerClass {
	
	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(TestSuiteClass.class);
		
		for(Failure failure: result.getFailures()){
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}

}
