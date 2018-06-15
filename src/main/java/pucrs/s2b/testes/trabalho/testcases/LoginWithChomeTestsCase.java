package pucrs.s2b.testes.trabalho.testcases;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pucrs.s2b.testes.trabalho.resources.DriverSetup;
import pucrs.s2b.testes.trabalho.tasks.LoginTasks;
import pucrs.s2b.testes.trabalho.verificationpoints.LoginVerificationPoint;

public class LoginWithChomeTestsCase {
	
	private LoginVerificationPoint verificationPoint;
	private LoginTasks tasks;
	private WebDriver driver;
	
	@Before
	public void setup() {
		this.driver = DriverSetup.getDriverConfigForChrome("https://moodle.pucrs.br/");				
		this.verificationPoint =new LoginVerificationPoint(this.driver);
		this.tasks = new LoginTasks(driver);		
	}
	
	@Test
	public void main() {
		this.tasks.preencherLogin("11111581", "9999999");
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
