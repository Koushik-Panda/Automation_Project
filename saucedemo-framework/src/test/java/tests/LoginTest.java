
package tests;

import base.BaseClass;
import page.LoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {
	
	
	
	@Test
	
	public void validlogintest()
	{
		LoginPage lp= new LoginPage (driver);
		lp.credential("standard_user", "secret_sauce");
		
		String currenturl = driver.getCurrentUrl();
		
		Assert.assertTrue(currenturl.contains("inventory"),"login failed!");
	}
	
	
	@Test
	public void invalidlogintest()
	{
		LoginPage lp= new LoginPage (driver);
		lp.credential("standard_use", "secret_sauc");
		
		String currenturl = driver.getCurrentUrl();
		Assert.assertFalse(currenturl.contains("inventory"),"login not suucessfull");
	}
	
	

}
