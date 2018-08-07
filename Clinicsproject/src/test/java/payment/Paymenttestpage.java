package payment;
/**
'**************************************************************
'  Name        : Payment room
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Oct 30, 2017
'--------------------------------------------------------------
'  Mod Date    :    
'  Mod By      : 
'  Change Made : 
'**************************************************************
**/
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import login.Initializer;
import login.Logintestpage;

public class Paymenttestpage extends Initializer {

public static void paymenttablink()
{
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//a[@title='Payment']"))).click();
}
public static void penpaymentlink() throws InterruptedException
{
	Thread.sleep(1000);
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//a[@title='Pending payment']"))).click();
}
public static void patientidsearch(String patiid)
{
	WebDriverWait wait=new WebDriverWait(driver, 35);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@id='uniform-rd_PatientID']"))).click();
driver.findElement(By.id("Patient_Search")).sendKeys(patiid,Keys.TAB);
}
public static void payallpayment(String pay)
{
switch (pay) {
case "Registration payment":
{	
	driver.findElement(By.xpath(".//img[@class='Img_Registraion']")).click();
	break;
}
case "Spectacle payment":
{	
	driver.findElement(By.xpath(".//img[@class='Img_Spectacle']")).click();
	break;
}
case "Operation payment":
{	
	driver.findElement(By.xpath(".//img[@class='Img_Operation']")).click();
	break;
}
case "Admission payment":
{	
	driver.findElement(By.xpath(".//img[@class='Img_App']")).click();
	break;
}
case "IOL payment":
{	
	driver.findElement(By.xpath(".//img[@class='Img_IOL']")).click();
	break;
}
case "Modality payment":
{	
	driver.findElement(By.xpath(".//img[@class='Img_Mod']")).click();
	break;
}
case "Lab payment":
{	
	driver.findElement(By.xpath(".//img[@class='Img_Lab']")).click();
	break;
}
case "Special procedure payment":
{	
	driver.findElement(By.xpath(".//img[@class='Img_Special']")).click();
	break;
}
case "Package payment":
{	
	driver.findElement(By.xpath(".//img[@class='Img_Package']")).click();
	break;
}
case "Medicine payment":
{	
	driver.findElement(By.xpath(".//img[@class='Img_Medicine']")).click();
	break;
}
case "All payment":
{	
	driver.findElement(By.xpath(".//img[@class='Img_All']")).click();
	break;
}
default:
	break;
}
}

public static void saveregpayment() throws InterruptedException
{
driver.findElement(By.xpath(".//input[@id='btnBiling_Tran_save']")).click();
WebDriverWait wait=new WebDriverWait(driver, 40);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//button[@class='close'][@onclick='javascript:Alert_Close()']"))).click();
Logintestpage.logout();
driver.close();
}
}
