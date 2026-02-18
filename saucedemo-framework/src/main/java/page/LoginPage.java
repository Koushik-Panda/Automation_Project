package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void credential(String user, String pass)
	{
		WebElement username1 = driver.findElement(By.id("user-name"));
		username1.sendKeys(user);
		WebElement password1 = driver.findElement(By.id("password"));
		password1.sendKeys(pass);
		
		driver.findElement(By.id("login-button")).click();
	}

}
