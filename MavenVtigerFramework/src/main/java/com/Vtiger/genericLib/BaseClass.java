package com.Vtiger.genericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Vtiger.ObjectRepositary.HomePageElementCreate;

import com.Vtiger.ObjectRepositary.LoginPageElements;

public class BaseClass {
	
	public  static  WebDriver driver;
	public Datautilities data= new Datautilities();
	public WebDriverCommonUtils wdu=new WebDriverCommonUtils();
	
	@BeforeSuite
	public void configBS()
	{
		System.out.println("---DataBase connected---");
	}
	@BeforeClass
	public void configBC() throws IOException
	{
		System.out.println(" ---Browser launching starts---");
		String browser=data.getDataFormProperty("browser");
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get(data.getDataFormProperty("url"));
		System.out.println("---Browser launching ends---");
	
	}
	@BeforeMethod
	public void configBM() throws IOException
	{
		System.out.println("---LogIn Strats---");
		//LoginPageElements login=PageFactory.initElements(driver, LoginPageElements.class);
		com.Vtiger.ObjectRepositary.LoginPageElements login = PageFactory.initElements(driver,com.Vtiger.ObjectRepositary.LoginPageElements.class);
		login.loginToApp(data.getDataFormProperty("username"), data.getDataFormProperty("password"));
		
		System.out.println("---LogIn end---");
	}
	@AfterMethod
	public void configAM()
	
	{
		System.out.println("---logOut Starts---");
		HomePageElementCreate hp=PageFactory.initElements(driver,HomePageElementCreate.class);
		hp.logoutFromApp();
		
		System.out.println("---Logout Ends---");
		
	}
	@AfterClass
	public void configAC()
	{
		System.out.println("---Close Browser--");
		driver.quit();
	}
	@AfterSuite
	public void configAS()
	{
		System.out.println("---DataBase Ends--");
	}

}
