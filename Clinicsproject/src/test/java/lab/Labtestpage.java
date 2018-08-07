package lab;
/**
'**************************************************************
'  Name        : Lab room
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: OCt 27, 2017
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
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.runtime.junit.Assertions;
import login.Initializer;


public class Labtestpage extends Initializer {

public static void labiconclick() throws IOException
{
	proplabroom();
getlablocator("Locators_worklist_addlabreport_icon").click();
}
public static void heamoglobinlab(String heamo)
{
	visiblelab();
	getlablocator("Locators_Labreport_Haemoglobin").sendKeys(heamo);
}
public static void tclab(String tc)
{
	visiblelab();
	getlablocator("Locators_Labreport_TC").sendKeys(tc);
}
public static void dclab(String dc)
{
	visiblelab();
	getlablocator("Locators_Labreport_DC").sendKeys(dc);
}
public static void rbccountlab(String rbc)
{
	visiblelab();
	getlablocator("Locators_Labreport_RBCCount").sendKeys(rbc);
}
public static void saveassignlab(String directsave)
{
	if("direct".equalsIgnoreCase(directsave))
	{
		getlablocator("Locators_Labreport_Directtodoctor_button").click();
		WebDriverWait wait=new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOf(getlablocator("Locators_Lab_autoassignto_room"))).click();
		WebDriverWait wait1=new WebDriverWait(driver, 40);
		wait1.until(ExpectedConditions.visibilityOf(getlablocator("Locators_Lab_common_alert"))).click();	
	}else if ("save".equalsIgnoreCase(directsave)) {
		getlablocator("Locators_Labreport_Save_button").click();
		WebDriverWait wait1=new WebDriverWait(driver, 40);
		wait1.until(ExpectedConditions.visibilityOf(getlablocator("Locators_Lab_common_alert"))).click();
		WebDriverWait wait=new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOf(getlablocator("Locators_Worklist_assign_icon"))).click();
		WebDriverWait wait2=new WebDriverWait(driver, 40);
		wait2.until(ExpectedConditions.visibilityOf(getlablocator("Locators_Lab_manualassignto_room"))).click();
		WebDriverWait wait3=new WebDriverWait(driver, 40);
		wait3.until(ExpectedConditions.visibilityOf(getlablocator("Locators_Lab_common_alert"))).click();	
	}
	
}



//common
public static void proplabroom() throws IOException
{
	f=new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"Alllocators"+File.separator+"Lab.properties"));
	locatorprob=new Properties();
	locatorprob.load(f);
}
public static WebElement getlablocator(String xpath)
{
	return driver.findElement(By.xpath(locatorprob.getProperty(xpath)));
}
public static void visiblelab()
{
	WebDriverWait wait=new WebDriverWait(driver, 40);
	wait.until(ExpectedConditions.visibilityOf(getlablocator("Locators_Labreport_LabreportTab")));
}
}
