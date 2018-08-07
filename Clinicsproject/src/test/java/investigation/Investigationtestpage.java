package investigation;
/**
'**************************************************************
'  Name        : Investigation room
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Oct 21, 2017
'--------------------------------------------------------------
'  Mod Date    :    
'  Mod By      : 
'  Change Made : 
'**************************************************************
**/

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import login.Initializer;

public class Investigationtestpage extends Initializer{
public static String invebrowse;

public static void invibrowser(String browse) throws IOException
{
	invebrowse=browse;
	initialize(browse);
	properinvest();
}	
public static void iconimageinvi()
{
	getlocainvest("Locators_worklist_imgaeupload_icon").click();
}
public static void invimachine(String mach)//Select the machine type 
{
	WebDriverWait wait=new WebDriverWait(driver, 35);
	wait.until(ExpectedConditions.visibilityOf(getlocainvest("Locators_imageupload_Machine_dropdown")));
	Select s= new Select(getlocainvest("Locators_imageupload_Machine_dropdown"));
	s.selectByVisibleText(mach);
}
public static void lefteyeinvi() throws IOException, InterruptedException//upload left image
{
	getlocainvest("Locators_imageupload_lefteyeimage_browselink").click();
	Thread.sleep(3000);
	windowpopup();
	Thread.sleep(2000);
}
public static void righteyeinvi() throws IOException, InterruptedException//upload right image
{
	getlocainvest("Locators_imageupload_righteyeimage_browselink").click();
	Thread.sleep(3000);
	windowpopup();
Thread.sleep(2000);
}
public static void otherinvi() throws InterruptedException, IOException
{
	getlocainvest("Locators_imageupload_Otherimage_browselink").click();
	Thread.sleep(3000);
	windowpopup();
Thread.sleep(2000);
}
public static void reportinvi() throws InterruptedException, IOException
{
	getlocainvest("Locators_imageupload_Reports_browselink").click();
	Thread.sleep(3000);
	windowpopup();
Thread.sleep(2000);
}
public static void uploadinvi()//upload investigation reports
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", getlocainvest("Locators_imageupload_upload_button"));
	getlocainvest("Locators_imageupload_upload_button").click();
WebDriverWait wait=new WebDriverWait(driver, 40);
wait.until(ExpectedConditions.visibilityOf(getlocainvest("Locators_imageupload_common_alert_close"))).click();
JavascriptExecutor js1=(JavascriptExecutor)driver;
js1.executeScript("arguments[0].scrollIntoView(true)", getlocainvest("Locators_imageupload_common_alert1_close"));
getlocainvest("Locators_imageupload_common_alert1_close").click();
}



//common for investigation
public static void properinvest() throws IOException
{
	f=new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"Alllocators"+File.separator+"Investigation.properties"));
	locatorprob=new Properties();
	locatorprob.load(f);
}
public static WebElement getlocainvest(String xpath)
{
	return driver.findElement(By.xpath(locatorprob.getProperty(xpath)));
}
public static void windowpopup() throws IOException
{
	String firefoximage=System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"investigation"+File.separator+"autoid"+File.separator+"firefoxscript.exe";
	String Chromeimage=System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"investigation"+File.separator+"autoid"+File.separator+"chromescript.exe";
	if(invebrowse.equalsIgnoreCase("Firefox"))
	{
		Runtime.getRuntime().exec(firefoximage);
	}else if (invebrowse.equalsIgnoreCase("Chrome")) {
		Runtime.getRuntime().exec(Chromeimage);
	}
		}
}
