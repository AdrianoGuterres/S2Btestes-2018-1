package pucrs.s2b.testes.trabalho.verificationpoints;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pucrs.s2b.testes.trabalho.tasks.LoginTasks;

public class LoginVerificationPoint {
	
	private WebDriver driver;
	
	private LoginTasks loginTasks;
	
	public LoginVerificationPoint(WebDriver driver) {
		this.driver = driver;
				
	}
	
	public boolean loginResult() {
		final String expectedMessage = "Painel";
		
		if(this.driver.getPageSource().contains(expectedMessage)){
			return true;			
		} else {
			return false;			
		}		
		
	}

}
