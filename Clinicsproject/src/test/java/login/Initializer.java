package login;
/**
'**************************************************************
'  Name        : Initialze of webdriver
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Sep 5, 2017
'--------------------------------------------------------------
'  Mod Date    :    
'  Mod By      : 
'  Change Made : 
'**************************************************************
**/

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Initializer {
public static WebDriver driver;
/*public static String failurl=null;
public static String failuser=null;
public static String failpass=null;*/
public static FileInputStream f=null;
public static Properties locatorprob=null;

public static void initialize(String browser)
{
	if (browser.equalsIgnoreCase("Firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Seleniumwork\\workspace\\Clinicsproject\\driversinitialize\\geckodriver.exe");
		driver = new FirefoxDriver();		
	}else if (browser.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumwork\\workspace\\Clinicsproject\\driversinitialize\\chromedriver.exe");
		driver = new ChromeDriver();
	}else if (browser.equalsIgnoreCase("Internet Explorer")){
		System.setProperty("webdriver.ie.driver", "C:\\Seleniumwork\\workspace\\Clinicsproject\\driversinitialize\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

public static void url(String url)
{
	driver.get(url);
	//driver.navigate().to(url);
}
}
