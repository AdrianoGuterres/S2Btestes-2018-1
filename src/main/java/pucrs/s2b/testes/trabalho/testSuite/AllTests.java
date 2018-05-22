package pucrs.s2b.testes.trabalho.testSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import pucrs.s2b.testes.trabalho.testCases.LoginTestsCase;

@RunWith(Suite.class)
@SuiteClasses({
	LoginTestsCase.class
})
public class AllTests {

}
