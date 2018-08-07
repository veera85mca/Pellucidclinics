package consultationnoncatract;
/**
'**************************************************************
'  Name        : Non catract pageobject for consultation
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Sep 22, 2017
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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import login.Initializer;
import login.Logintestpage;

public class Consultnoncataracttestpage extends Initializer{
	public static FileInputStream fnc;
	public static Properties proncon;

//save as draft or finalize
public static void nonfin(String finalize) throws InterruptedException, IOException//Click to Finalize button
{
	noncatproperties();//property file locators
	Thread.sleep(3000);
	if (finalize.equalsIgnoreCase("Save as Draft")) {
		saveasdraft();
	}else if (finalize.equalsIgnoreCase("Finalize")) {
		getmylocator("Locators_noncatract_Reporttab_GenerateReport_finalizebutton").click();
	}
}

public static void righteyedvsphere(String rdvsph)
{
	WebDriverWait wait= new WebDriverWait(driver, 35);
	wait.until(ExpectedConditions.visibilityOf(getmylocator("GlassPrescription_Right_eyeDV_Sphere")));
	WebElement rdvsp=getmylocator("GlassPrescription_Right_eyeDV_Sphere");
	selectconby(rdvsp, rdvsph);
}
public static void righteyedvcylinder(String rdvcyl)
{
	WebElement rdvli=getmylocator("GlassPrescription_Right_eyeDV_Cylinder");
	selectconby(rdvli, rdvcyl);
}
public static void righteyedvaxis(String rdvaxis)
{
	WebElement rdvax=getmylocator("GlassPrescription_Right_eyeDV_Axis");
	selectconby(rdvax, rdvaxis);
}
public static void righteyedvvisualacuity(String rdvva)
{
	WebElement rdvval=getmylocator("GlassPrescription_Right_eyeDV_Visual_Acuity");
	selectconby(rdvval, rdvva);
}
public static void lefteyedvsphere(String ldvsph)
{
	WebElement ldvsp=getmylocator("GlassPrescription_Left_eyeDV_Sphere");
	selectconby(ldvsp, ldvsph);
}
public static void lefteyedvcylinder(String ldvcyl)
{
	WebElement ldvcy=getmylocator("GlassPrescription_Left_eyeDV_Cylinder");
	selectconby(ldvcy, ldvcyl);
}
public static void lefteyedvaxis(String ldvAxis)
{
	WebElement ldvax=getmylocator("GlassPrescription_Left_eyeDV_Axis");
	selectconby(ldvax, ldvAxis);
}
public static void lefteyedvvisualacuity(String ldvva)
{
	WebElement ldvvan=getmylocator("GlassPrescription_Left_eyeDV_Visual_Acuity");
	selectconby(ldvvan, ldvva);
}
public static void righteyenvsphere(String rnvsph)
{
	WebElement rnvsp=getmylocator("GlassPrescription_Right_eyeNV_Sphere");
	selectconby(rnvsp, rnvsph);
}
public static void righteyenvvisualacuity(String rnvva)
{
	WebElement rnva=getmylocator("GlassPrescription_Right_eyeNV_Visual_Acuity");
	selectconby(rnva, rnvva);
}
public static void lefteyenvsphere(String lnvsph)
{
	WebElement lnvsp=getmylocator("GlassPrescription_Left_eyeNV_Sphere");
	selectconby(lnvsp, lnvsph);
}
public static void lefteyenvvisualacuity(String lnvva)
{
	WebElement lnava=getmylocator("GlassPrescription_Left_eyeNV_Visual_Acuity");
	selectconby(lnava, lnvva);
}
public static void pubildistance(String pubildis)
{
	getmylocator("GlassPrescription_Pupil_distance_value").sendKeys(pubildis);

}
public static void glassremark(String remark)
{
	getmylocator("GlassPrescription_Remarks").sendKeys(remark);
}
public static void saveglass()//save GLASS DESCRIPTION Values
{
	getmylocator("GlassPrescription_Savebutton").click();
}
public static void medicinetemp(String medite) throws InterruptedException//Select Medicine Template
{
	Thread.sleep(3500);
	WebDriverWait wait=new WebDriverWait(driver, 35);
	wait.until(ExpectedConditions.visibilityOf(getmylocator("Medicine_template_title")));
	WebElement medi=getmylocator("Medicine_template_title");
	selectconby(medi, medite);
	
}
public static void savemedi() throws InterruptedException
{
	Thread.sleep(3000);
	WebDriverWait wait1=new WebDriverWait(driver, 20);
	wait1.until(ExpectedConditions.visibilityOf(getmylocator("Medicine_savebutton"))).click();
	Thread.sleep(3000);
	getmylocator("Medicine_confirm_continued").click();
	//driver.findElement(By.linkText("Close")).click();
	Thread.sleep(6000);
	Logintestpage.logout();
	driver.close();
}

//save as draft functions 
public static void saveasdraft() throws InterruptedException
{
	getmylocator("Locators_noncatract_Reporttab_GenerateReport_SaveasDraftbutton").click();
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(getmylocator("Locators_noncatract_Reporttab_GenerateReport_SaveasDraft_close"))).click();
	Thread.sleep(6000);
	Logintestpage.logout();
	driver.close();
}



//common for non catract functions
public static void noncatproperties() throws IOException
{
	fnc=new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"Alllocators"+File.separator+"Noncatractlocator.properties"));
	proncon=new Properties();
	proncon.load(fnc);
}
public static WebElement getmylocator(String xpath)
{
	return driver.findElement(By.xpath(proncon.getProperty(xpath)));
}
public static List<WebElement> getallmylocators(String xpath)
{
	return driver.findElements(By.xpath(proncon.getProperty(xpath)));
}

public static void selectconby(WebElement element, String value)
{
	Select s=new Select(element);
	s.selectByVisibleText(value);
}
public static void subicdvalue(String code)//select the Surgical or MOH code Value
{
	String[] carray=code.split(",");
	WebDriverWait wait= new WebDriverWait(driver, 15);
	wait.until(ExpectedConditions.visibilityOf(getmylocator("Locators_noncatract_Reporttab_GenerateReport_ICDcodesvalue_textbox"))).click();
	List<WebElement> chcicd=getallmylocators("Locators_noncatract_Reporttab_GenerateReport_ICDcode_allvalues");
	for(int i=0;i<carray.length;i++)
	{
		for(int j=0;j<chcicd.size();j++)
		{
		String ricd=chcicd.get(j).getAttribute("name");
		if(ricd.equals(carray[i]))
		{
			getmylocator("Locators_noncatract_Reporttab_GenerateReport_ICDcodesvalue_searchbox").sendKeys(carray[i]);
			chcicd.get(j).click();
			getmylocator("Locators_noncatract_Reporttab_GenerateReport_ICDcodesvalue_searchbox").clear();
		}
	}
}
}



//**SAVE AS DRAFT SCENARIO steps**//
public static void rightdiasavedraft(String Srightvalidiagnosis) throws IOException, InterruptedException
{
	Thread.sleep(7000);
	noncatproperties();//property file locators
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(getmylocator("Locators_noncatract_Reporttab_GenerateReport_Title")));
	String[] rightdia=Srightvalidiagnosis.split(",");
	String strtext=getmylocator("Locators_noncatract_ReportTab_Righteye_diagnosis_textbox").getAttribute("value");
	String[] rightdiatext=strtext.split(", ");
	for(int i=0;i<rightdia.length;i++)
	{
		boolean check=false;
		for(int j=0;j<rightdiatext.length;j++)
		{
			System.out.print(rightdia[i]+" ");
			System.out.print(rightdiatext[j]);
			System.out.println();
			if (rightdia[i].equalsIgnoreCase(rightdiatext[j])) {
				check=true;
				break;
			}
		}
		if(check==false)
		{
			Assert.fail("Right eye diagnosis values are not selected as in save as draft");
		}
	}
}
public static void leftdiasavedraft(String Sleftvalidiagnosis) throws InterruptedException
{
	String[] leftdia=Sleftvalidiagnosis.split(",");
	String strtext=getmylocator("Locators_noncatract_ReportTab_Lefteye_diagnosis_textbox").getAttribute("value");
	String[] leftdiatext=strtext.split(", ");
	for(int i=0;i<leftdia.length;i++)
	{
		boolean check=false;
		for(int j=0;j<leftdiatext.length;j++)
		{
			System.out.print(leftdia[i]+" ");
			System.out.print(leftdiatext[j]);
			System.out.println();
			if (leftdia[i].equalsIgnoreCase(leftdiatext[j])) {
				check=true;
				break;
			}
		}
		if(check==false)
		{
			Assert.fail("Left eye diagnosis values are not selected as in save as draft");
		}
	}
}
public static void advicetitlesavedraft(String Sadvice, String Stitle) throws InterruptedException
{
	if(!Sadvice.equalsIgnoreCase(getdropdown(getmylocator("Locators_noncatract_ReportTab_Advice_dropdown"))))
	{
		Assert.fail("Advice is not selected as give in save as draft");
	}
	if(!Stitle.equalsIgnoreCase(getdropdown(getmylocator("Locators_noncatract_Reporttab_GenerateReport_Title"))))
	{
		Assert.fail("Report title is not selected as give in save as draft");
	}
}

//common for save and draft
public static String getdropdown(WebElement r)
{
	Select s=new Select(r);
	System.out.println(s.getFirstSelectedOption().getText());
	return s.getFirstSelectedOption().getText();
}
public static List<WebElement> getalldropdown(WebElement e)
{
	Select s=new Select(e);
	return s.getOptions();
	
}



//*ADD ADDENDUM Scenario for non catract*//
public static void reporttabaddendum() throws IOException
{
	noncatproperties();//property file locators
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(getmylocator("Locators_Addendum_Report_Addaddendum_reporttab"))).click();
}
public static void addendumdetail(String aadendum)
{
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(getmylocator("Locators_Addendum_Report_Addaddendum_button"))).click();
	WebDriverWait wait1=new WebDriverWait(driver, 20);
	wait1.until(ExpectedConditions.visibilityOf(getmylocator("Locators_Addendum_Report_Addaddendum_Textarea"))).sendKeys(aadendum);
}
public static void saveaddendum() throws InterruptedException
{
	getmylocator("Locators_Addendum_Report_Addaddendum_Save").click();
	Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(getmylocator("Locators_Addendum_Report_Addaddendum_close"))).click();
	Thread.sleep(6000);
	Logintestpage.logout();
	driver.quit();
}

}
