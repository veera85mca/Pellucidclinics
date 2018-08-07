package labregistration;
/**
'**************************************************************
'  Name        : lab patient registration
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


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import login.Initializer;
import login.Logintestpage;

public class Labpatientregpage extends Initializer {

public static void labregpat()
{
WebDriverWait wait = new WebDriverWait(driver, 30);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Lab Patient Reg."))).click();
//wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Lab Patient Reg."))).click();
	//driver.findElement(By.linkText("Lab Patient Reg.")).click();
}
public static void labregfirstname(String first)
{
WebDriverWait wait=new WebDriverWait(driver, 40);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt_PLabfrstName")));
WebElement name = driver.findElement(By.id("txt_PLabfrstName"));
name.sendKeys(first);
}
public static void labregcontactno(String mobile)
{
Pattern p=Pattern.compile("[0-9]*");
Matcher m=p.matcher(mobile);
if(m.matches())
{
	driver.findElement(By.xpath(".//*[@id='txt_LabContactNo']")).sendKeys(mobile);
}else
{
Assert.fail("Mobile number alloweded only numeric");
}
}
public static void labreglast(String last)
{
	driver.findElement(By.xpath(".//*[@id='txt_PLablstName']")).sendKeys(last);
}
public static void labregage(String age)
{
	WebElement patage = driver.findElement(By.xpath(".//*[@id='txt_LabAge']"));
selectby(patage, age);
}
public static void labregsex(String sex)
{
WebElement labgen = driver.findElement(By.xpath(".//*[@id='ddl_LabGender']"));
selectby(labgen, sex);
}
public static void labregrefer(String refer)
{
	driver.findElement(By.xpath(".//*[@id='Txt_ReferredBy']")).sendKeys(refer);
}
public static void labregclickreg() throws InterruptedException
{
	driver.findElement(By.xpath(".//*[@id='Btn_Register']")).click();
	WebDriverWait wait=new WebDriverWait(driver, 40);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//input[@title='Yes'][@value='Yes']")));
	driver.findElement(By.xpath(".//input[@title='Yes'][@value='Yes']")).click();
	}
public static void labheamoreport(String heamo)
{
	if("Check".equals(heamo))
	{
		WebDriverWait wait=new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//input[@name='1'][@id='ChkLab_1']"))).click();
//		driver.findElement(By.xpath(".//input[@name='1'][@id='ChkLab_1']")).click();
		//reportcheckbox(heamore);
	}
}
public static void labtcreport(String tc)
{
	if("Check".equals(tc))
	{
		WebDriverWait wait=new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//input[@name='2'][@id='ChkLab_2']"))).click();
//		driver.findElement(By.xpath(".//input[@name='2'][@id='ChkLab_2']")).click();
		//reportcheckbox(tcre);
	}
}
public static void labdcreport(String dc)
{
	if("Check".equals(dc))
	{
		WebDriverWait wait=new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//input[@name='3'][@id='ChkLab_3']"))).click();
		//driver.findElement(By.xpath(".//input[@name='3'][@id='ChkLab_3']")).click();
		//reportcheckbox(dcre);
	}
}
public static void labrbcreport(String rbc)
{
	if("Check".equals(rbc))
	{
		WebDriverWait wait=new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//input[@name='4'][@id='ChkLab_4']"))).click();
		//		driver.findElement(By.xpath(".//input[@name='4'][@id='ChkLab_4']")).click();
		//reportcheckbox(rbcre);
	}
}
public static void labsavereport() throws InterruptedException
{
	WebDriverWait wa=new WebDriverWait(driver, 40);
	wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='Btn_SavelabSettings']"))).click();
	WebDriverWait wait=new WebDriverWait(driver, 35);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//input[@onclick='GotoAppoinmentPageLab();']"))).click();
	WebDriverWait wait1=new WebDriverWait(driver, 35);
	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//input[@id='Button11'][@onclick='ReportClose();']"))).click();
	Logintestpage.logout();
driver.close();
}




public static void selectby(WebElement common, String gave)
{
	Select s=new Select(common);
	s.selectByVisibleText(gave);
}
/*public static void reportcheckbox(int chk)
{
WebDriverWait wait= new WebDriverWait(driver, 10);
wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ChkLab")));
	List<WebElement> lapreport=driver.findElements(By.className("ChkLab"));
for(int i=1;i<=lapreport.size();i++)
{
	lapreport.get(chk).click();
}
}*/
}
