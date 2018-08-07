package generationreport;
/**
'**************************************************************
'  Name        : search filter common for all rooms 
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Sep 6, 2017
'--------------------------------------------------------------
'  Mod Date    :    
'  Mod By      : 
'  Change Made : 
'**************************************************************
**/


/**
'**************************************************************
'  Name        : Search for common
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Sep 8, 2017
'--------------------------------------------------------------
'  Mod Date    :    
'  Mod By      : 
'  Change Made : 
'**************************************************************
**/
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import login.Initializer;

public class Searchfilter extends Initializer{

	public static void clickworklist()
	{
		WebDriverWait wait=new WebDriverWait(driver, 35);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//a[@title='Worklist']"))).click();
	}
	public static void clicksearchlink() throws InterruptedException
	{
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver, 35);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//a[@onclick='Search_ShowHide()']")));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath(".//a[@onclick='Search_ShowHide()']")));
		Thread.sleep(3500);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@onclick='Search_ShowHide()']"))).click();
	}
	public static void assigngo()
	{
		//driver.findElement(By.xpath("(.//input[@id='Button1'])[4]")).click();
		WebDriverWait wait=new WebDriverWait(driver, 35);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//input[@id='Button1'])[4]"))).click();
		/*WebElement assign=driver.findElement(By.xpath(".//input[@onclick='GotoAppoinmentPage();']"));
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].click()", assign);*/
		/*WebElement fra=driver.findElement(By.xpath("html/body/div[3]/div[2]/div[9]/div[19]/div/div"));
		driver.switchTo().frame(fra);
		Actions act=new Actions(driver);
		WebElement assign=driver.findElement(By.xpath(".//input[@onclick='GotoAppoinmentPage();']"));
		act.moveToElement(assign).click().build().perform();*/
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//input[@id='Button1'][@class='btn btn-success'][@title='Go'][@value='Go']"))).click();
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body/div[3]/div[2]/div[7]/div/div/div[3]/input"))).click();
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("Button1")));
	}
	public static void assignimagebutton()
	{
		WebDriverWait wait=new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//img[@class='hand'][@title='Click here to assign']"))).click();
		//driver.findElement(By.xpath(".//img[@class='hand'][@title='Click here to assign']")).click();
	}
	public static void close()
	{
		WebDriverWait wait = new WebDriverWait(driver, 35);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//button[@onclick='javascript:Alert_Close()']"))).click();
	}
	public static void patientidseacrh(String patid) throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt_patientid"))).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("txt_patientid")).sendKeys(patid);
	}
	public static void appfromdate(String appfrom) throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='FromAppDate']"))).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("FromAppDate")).sendKeys(appfrom);
	}
	public static void apptodate(String appto) throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='ToAppDate']"))).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("ToAppDate")).sendKeys(appto);
		driver.findElement(By.xpath(".//*[@id='Txt_ProcedureName']")).click();
	}
	public static void searchbutton()
	{
		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn_Search_Go"))).click();
	}
	public static void clearbutton()
	{
		driver.findElement(By.xpath(".//*[@id='btn_Cancel_Search']")).click();
	}
	public static boolean presenceofelement(WebElement ele)
	{
		if(ele.isDisplayed())
		{
			return true;
		}else
		{
			return false;
		}
	}

}
