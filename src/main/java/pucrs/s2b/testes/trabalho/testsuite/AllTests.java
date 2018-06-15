package pucrs.s2b.testes.trabalho.testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import pucrs.s2b.testes.trabalho.testcases.*;

@RunWith(Suite.class)
@SuiteClasses({
	LoginWithChomeTestsCase.class,
	LoginWithFirefoxTestsCase.class
})
public class AllTests {

}
