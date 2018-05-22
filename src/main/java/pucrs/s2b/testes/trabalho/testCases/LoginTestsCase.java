package pucrs.s2b.testes.trabalho.testCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pucrs.s2b.testes.trabalho.resources.DriverSetup;
import pucrs.s2b.testes.trabalho.tasks.LoginTasks;

public class LoginTestsCase {
	
	private WebDriver driver;
	private LoginTasks login;
	
	@Before
	public void setup() {
		this.driver = DriverSetup.getDriverConfigForChrome("https://moodle.pucrs.br/");
		this.login = new LoginTasks(driver);
	}
	
	@Test
	public void main() {
		this.login.preencherLogin("11111581", "12345678");
		this.login.sendFormLogin();
		
	}
	
	@After
	public void tearDown() {
		this.driver.quit();
	}

}
