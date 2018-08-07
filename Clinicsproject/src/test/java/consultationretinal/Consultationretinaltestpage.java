package consultationretinal;
/**
'**************************************************************
'  Name        : Retinal non catract pageobject for consultation
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Sep 25, 2017
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

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import login.Initializer;
import login.Logintestpage;

public class Consultationretinaltestpage extends Initializer{
public static String retiroomothers;
public static String retireferdept;

public static void clickothers() throws IOException
{
	f=new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"Alllocators"+File.separator+"Retinalnoncatract.properties"));
	locatorprob=new Properties();
	locatorprob.load(f);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", getretcatlocators("Locators_retinal_catract_casesheet_others_button"));
}
public static void noncatretinalroom(String others) throws InterruptedException
{
	Thread.sleep(2000);
	retiroomothers=others;
	clickrefer();//click anyone of these radio button
}
public static void retireferdepartment(String referdepart) throws InterruptedException
{
	if("Refer to department".equalsIgnoreCase(retiroomothers))
	{
		clickreftodep(referdepart);
	}
}
public static void retireferinvestigation(String firstinv, String secondinv, String thirdinv, String fourthinv)
{
	if("Investigation room".equalsIgnoreCase(retiroomothers))
	{
		investca(firstinv, secondinv, thirdinv, fourthinv);
	}
}
public static void retireferlab(String firstlab, String secondlab, String thirdlab, String fourthlab)
{
	if ("Lab settings".equalsIgnoreCase(retiroomothers)) {
		assilab(firstlab, secondlab, thirdlab, fourthlab);
	}
}
public static void retispecialprocedure(String procedure)
{
	if("Special procedure".equalsIgnoreCase(retiroomothers))
	{
		Select s=new Select(getretcatlocators("Locators_retinal_catract_Specialprocedure_procedure_dropdown"));
		s.selectByVisibleText(procedure);
	}
}
public static void retinext() throws InterruptedException //go to next room locators are different so define seperate actions
{
if("Refer to department".equalsIgnoreCase(retiroomothers))
{
	assandwait();//after that actions are also different for refer to depart
}else if ("Investigation room".equalsIgnoreCase(retiroomothers)) {
	assandwaitn();//after that actions are also different for investigation
}else if ("Lab settings".equalsIgnoreCase(retiroomothers)) {
	assandwaitr();//after that actions are also different for assign to lab
}else if ("Special procedure".equalsIgnoreCase(retiroomothers)) {
	assandwaits();//after the actions are also different for special procedure
}
}

public static void clickrefer()//which one others room
{
List<WebElement> ref=driver.findElements(By.name("Department"));
for(int i=0; i<ref.size(); i++)
{
	String room=ref.get(i).getAttribute("title");
if(room.equalsIgnoreCase(retiroomothers))
{
	ref.get(i).click();
	break;
}
}
}
public static void clickreftodep(String department) throws InterruptedException//which one need to select in refer to department
{	
List<WebElement> refro=driver.findElements(By.className("RdDepartmentNames"));
for(int i=0; i<refro.size(); i++)
{
	String ret=refro.get(i).getAttribute("title");
if(ret.equalsIgnoreCase(department))
{
	refro.get(i).click();
	break;
}
}
}
public static void investca(String fiinas, String seinas, String thinas, String foinas)//what are the need to check in investigation
{
	String[] str={fiinas, seinas, thinas, foinas};
	List<WebElement> inv=driver.findElements(By.className("ChkImageTypes"));
for(int j=0;j<str.length;j++)
{
	for(int i=0; i<inv.size(); i++)
	{
		String ins=inv.get(i).getAttribute("title");
		if(ins.equalsIgnoreCase(str[j]))
		{
			inv.get(i).click();
			break;
		}
	}
}
}
public static void assilab(String finas, String senas, String thnas, String fonas)//what are the need to check in assign to lab
{
	String[] str={finas, senas, thnas, fonas};
	List<WebElement> assi=driver.findElements(By.className("ChkLabSettings"));
for(int j=0;j<str.length;j++)
{
	for(int i=0; i<assi.size(); i++)
	{
		String ass=assi.get(i).getAttribute("title");
		if(ass.equalsIgnoreCase(str[j]))
		{
			assi.get(i).click();
			break;
		}
	}
}
}
public static void assandwait() throws InterruptedException//assign and close for refer to dept.
{
	getretcatlocators("Locators_retinal_catract_Nextaction_Go_button").click();
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(getretcatlocators("Locators_retinal_catract_refertodepartment_assign_room"))).click();
	WebDriverWait waitn=new WebDriverWait(driver, 20);
	waitn.until(ExpectedConditions.visibilityOf(getretcatlocators("Locators_retinal_catract_common_CloseSurgery"))).click();
Thread.sleep(3000);
Logintestpage.logout();
driver.close();
}
public static void assandwaitn() throws InterruptedException//assign and close for investigation
{
	getretcatlocators("Locators_retinal_catract_Nextaction_Go_button").click();
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(getretcatlocators("Locators_retinal_catract_common_assign_room"))).click();
	WebDriverWait waitn=new WebDriverWait(driver, 20);
	waitn.until(ExpectedConditions.visibilityOf(getretcatlocators("Locators_retinal_catract_common_CloseSurgery"))).click();
Thread.sleep(3000);
Logintestpage.logout();
driver.close();
}
public static void assandwaitr() throws InterruptedException//assign and close for assign to lab
{
	getretcatlocators("Locators_retinal_catract_Nextaction_Go_button").click();
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(getretcatlocators("Locators_retinal_catract_common_assign_room"))).click();
	WebDriverWait waitn=new WebDriverWait(driver, 20);
	waitn.until(ExpectedConditions.visibilityOf(getretcatlocators("Locators_retinal_catract_common_CloseSurgery"))).click();
	Thread.sleep(3000);
	Logintestpage.logout();
	driver.close();
}
public static void assandwaits() throws InterruptedException
{
	getretcatlocators("Locators_retinal_catract_Nextaction_Go_button").click();
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(getretcatlocators("Locators_retinal_catract_specialprocedure_alertclose"))).click();
	getretcatlocators("Locators_retinal_catract_Nextaction_close_button").click();
	Thread.sleep(3000);
	Logintestpage.logout();
	driver.close();
}
public static WebElement getretcatlocators(String xpath)
{
	return driver.findElement(By.xpath(locatorprob.getProperty(xpath)));
}
}
