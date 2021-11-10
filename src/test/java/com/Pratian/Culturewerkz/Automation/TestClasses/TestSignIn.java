package com.Pratian.Culturewerkz.Automation.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Pratian.Culturewerkz.Automation.FileHandling.PropertyManager;
import com.Pratian.Culturewerkz.Automation.PageObjects.Home;
import com.Pratian.Culturewerkz.Automation.PageObjects.SignIn;

public class TestSignIn extends BaseTest {

	@Test(dataProvider = "signIn")
	public void signInWithValidCredentials(String userName, String password) throws IOException
	{	
		driver.get(PropertyManager.getProperty("url.app"));
		SignIn signIn= new SignIn(driver);
		signIn.provideUserName(userName);
		signIn.providePassword(password);
		Home home= signIn.clickSignInButton(driver);		
	}
	

	@DataProvider(name="signIn")			
	public Object[][] getCredentials() {			

		return new Object[][] {				

			{"prahas.kattimani@pratian.com","Qwerty123"} 	

		};
	}

	

}
