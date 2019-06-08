package testsuitspractice;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.runners.*;

@RunWith(Suite.class) 
@SuiteClasses({ParamTestsAdd.class, ParamTestsMinus.class})
public class TestSuiteClass {

}
