package pucrs.s2b.testes.trabalho.testCases;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pucrs.s2b.testes.trabalho.resources.DriverSetup;
import pucrs.s2b.testes.trabalho.tasks.LoginTasks;
import pucrs.s2b.testes.trabalho.verificationPoints.LoginVerificationPoint;

public class LoginWithFirefoxTestsCase {
	
	private LoginVerificationPoint verificationPoint;
	private LoginTasks tasks;
	private WebDriver driver;
	
	@Before
	public void setup() {
		this.driver = DriverSetup.getDriverConfigFirefox("https://moodle.pucrs.br/");				
		this.verificationPoint =new LoginVerificationPoint(this.driver);
		this.tasks = new LoginTasks(this.driver);		
	}
	
	@Test
	public void main() {
		this.tasks.preencherLogin("11111581", "98292112");
		this.tasks.sendFormLogin();
		boolean expected = true;
		boolean actual = verificationPoint.loginResult();		
		assertEquals(expected, actual);
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
