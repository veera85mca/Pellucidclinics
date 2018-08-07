package optical;
/**
'**************************************************************
'  Name        : Optical room
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Oct 23, 2017
'--------------------------------------------------------------
'  Mod Date    :    
'  Mod By      : 
'  Change Made : 
'**************************************************************
**/

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import login.Initializer;

public class Opticaltestpage extends Initializer{

public static void optiiconspec() throws IOException
{
	propoptical();
	getlocaoptical("Locators_Worklist_purchase_spectacles_icon").click();
}
public static void spectaclename(String spec)
{
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(getlocaoptical("Locators_purchase_spectacles_Spectacle_name")));
	datalistvali("Locators_purchase_spectacles_Spectacle_name_datalist", "Locators_purchase_spectacles_Spectacle_name", spec);
}
public static void framename(String fram)
{
	datalistvali("Locators_purchase_spectacles_Frame_name_datalist", "Locators_purchase_spectacles_Frame_name", fram);
}
public static void contactlenseopt(String contact)
{
	datalistvali("Locators_purchase_spectacles_Contactlense_name_datalist", "Locators_purchase_spectacles_Contactlense_name", contact);
}
public static void sunglassessopt(String sungla)
{
	datalistvali("Locators_purchase_spectacles_Sunglassess_name_datalist", "Locators_purchase_spectacles_Sunglassess_name", sungla);
}
public static void othersopt(String other)
{
	datalistvali("Locators_purchase_spectacles_Others_datalist", "Locators_purchase_spectacles_Others", other);
}
public static void generalnotes(String general)
{
	getlocaoptical("Locators_purchase_spectacles_general_notes").sendKeys(general);
}
public static void saveoptiinfo()
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);", getlocaoptical("Locators_purchase_spectacles_Save_button"));
	getlocaoptical("Locators_purchase_spectacles_Save_button").click();
	WebDriverWait wait=new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOf(getlocaoptical("Locators_purchase_spectacles_feedback_alert_close"))).click();
	WebDriverWait wait1=new WebDriverWait(driver, 30);
	wait1.until(ExpectedConditions.visibilityOf(getlocaoptical("Locators_purchase_spectacles_alert1_close"))).click();
}

//common for Optical
public static void propoptical() throws IOException
{
	f=new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"Alllocators"+File.separator+"Optical.properties"));
	locatorprob=new Properties();
	locatorprob.load(f);
}
public static WebElement getlocaoptical(String xpath)
{
	return driver.findElement(By.xpath(locatorprob.getProperty(xpath)));
}
public static List<WebElement> getallloca(String xpath)
{
	return driver.findElements(By.xpath(locatorprob.getProperty(xpath)));
}
public static void datalistvali(String xpathdatalist, String xpath, String value)
{
	boolean r=false;
	List<WebElement> li=getallloca(xpathdatalist);
	for(int i=0;i<li.size();i++)
	{
		if(value.equals(li.get(i).getAttribute("value")))
		{
			getlocaoptical(xpath).sendKeys(value);
			r=true;
			break;
		}
	}
if(r==false)
{
	Assert.fail("The input data is not present in respective feature");
}
}
}
