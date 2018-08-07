package consultationcatract;
/**
'**************************************************************
'  Name        : catract pageobject for consultation
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Sep 20, 2017
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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.gson.JsonObject;

import labregistration.Labpatientregpage;
import login.Initializer;
import login.Logintestpage;

public class Consultcataracttestpage extends Initializer{


public static void surgerybutton() throws IOException
{
	catproperties();
	getcatlocator("Locators_catract_casesheet_surgery_button").click();
}
public static void opetype(String opetype)//Operation type
{
WebDriverWait wait=new WebDriverWait(driver, 40);
wait.until(ExpectedConditions.visibilityOf(getcatlocator("Locators_catract_sugery_deatails_operation_type")));
Labpatientregpage.selectby(getcatlocator("Locators_catract_sugery_deatails_operation_type"), opetype);
}
public static void oprname(String opename) throws InterruptedException//Operation name
{
	Thread.sleep(1500);
	WebDriverWait wait=new WebDriverWait(driver, 25);
	wait.until(ExpectedConditions.visibilityOf(getcatlocator("Locators_catract_sugery_deatails_operation_name")));
	Labpatientregpage.selectby(getcatlocator("Locators_catract_sugery_deatails_operation_name"), opename);
}
public static void eyeofope(String eyes)//Operation Eyes
{
Labpatientregpage.selectby(getcatlocator("Locators_catract_sugery_deatails_operation_eye"), eyes);
}
public static void gennotes(String gennotes)//Operation Notes
{
	getcatlocator("Locators_catract_sugery_deatails_operation_general_notes").sendKeys(gennotes);
}
public static void savesurgery() throws InterruptedException
{
	getcatlocator("Locators_catract_sugery_deatails_operation_Savebutton").click();
	WebDriverWait wait=new WebDriverWait(driver, 25);
	wait.until(ExpectedConditions.visibilityOf(getcatlocator("Locators_catract_sugery_GotoAppoinmentPage"))).click();
		WebDriverWait wait1 = new WebDriverWait(driver, 25);
		wait1.until(ExpectedConditions.visibilityOf(getcatlocator("Locators_catract_sugery_Close_link"))).click();
Logintestpage.logout();
driver.quit();
}

//common get locators
public static void catproperties() throws IOException
{
	f=new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"Alllocators"+File.separator+"Catractcon.properties"));
	locatorprob=new Properties();
	locatorprob.load(f);
}
public static WebElement getcatlocator(String xpath)
{
	return driver.findElement(By.xpath(locatorprob.getProperty(xpath)));
}
}
