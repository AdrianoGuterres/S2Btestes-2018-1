package pucrs.s2b.testes.trabalho.tasks;

import org.openqa.selenium.WebDriver;

import pucrs.s2b.testes.trabalho.appobjects.LoginAppObject;

public class LoginTasks {
	
	private LoginAppObject appObjects;
	
	
	public LoginTasks(WebDriver driver) {
		this.appObjects = new LoginAppObject(driver);		
	}
	
	
	public void preencherLogin(String matricula, String password) {
		this.appObjects.getMatriculaTextfield().sendKeys(matricula);
		this.appObjects.getSenhaTextfield().sendKeys(password );
		this.appObjects.getLembrarUsuarioRadioButton().click();
	}
	
	public void sendFormLogin() {
		this.appObjects.getAcessoButton().click();		
	}


}
