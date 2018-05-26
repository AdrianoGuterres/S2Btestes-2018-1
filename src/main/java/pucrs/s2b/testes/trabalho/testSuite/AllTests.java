package pucrs.s2b.testes.trabalho.testSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import pucrs.s2b.testes.trabalho.testCases.*;

@RunWith(Suite.class)
@SuiteClasses({
	LoginWithChomeTestsCase.class,
	LoginWithFirefoxTestsCase.class
})
public class AllTests {

}
