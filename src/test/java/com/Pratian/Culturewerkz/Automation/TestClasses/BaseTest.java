package com.Pratian.Culturewerkz.Automation.TestClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import com.Pratian.Culturewerkz.Automation.FileHandling.PropertyManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	protected WebDriver driver;
	
	@BeforeClass
	public void setUp() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	

}
