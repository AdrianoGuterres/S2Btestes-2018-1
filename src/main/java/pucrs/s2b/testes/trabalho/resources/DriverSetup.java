package pucrs.s2b.testes.trabalho.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {
	
	
	public static WebDriver getDriverConfigForChrome(String url) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		return driver;				
	}
		
	
	public WebDriver getDriverConfigFirefox(String url) {
		WebDriver driver;
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get(url);
		return driver;	
	}	
	
	public WebDriver getDriverConfigEdge(String url) {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get(url);
		return driver;		
	}

	
}
