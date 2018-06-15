package pucrs.s2b.testes.trabalho.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginAppObject {
	private WebDriver driver;
	
	public LoginAppObject(WebDriver driver) {
		this.driver = driver;		
	}
	
	public WebElement getMatriculaTextfield() {		
		return this.driver.findElement(By.xpath("//*[@id=\"login_username\"]")) ;
	}
	
	public WebElement getSenhaTextfield() {		
		return this.driver.findElement(By.xpath("//*[@id=\"login_password\"]")) ;
	}
	
	public WebElement getLembrarUsuarioRadioButton() {		
		return this.driver.findElement(By.xpath("//*[@id=\"rememberusername\"]")) ;
	}
	
	public WebElement getAcessoButton() {		
		return this.driver.findElement(By.xpath("//*[@id=\"login\"]/button")) ;
	}

}
