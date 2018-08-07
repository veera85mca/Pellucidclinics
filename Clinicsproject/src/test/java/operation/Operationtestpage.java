package operation;
/**
'**************************************************************
'  Name        : Operation pageobject
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Oct 17, 2017
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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import generationreport.Searchfilter;
import login.Initializer;
import registration.Patientregispage;
import ward.Wardtestpage;

public class Operationtestpage extends Initializer{

public static void patientidsearch(String patient) throws IOException, InterruptedException
{
	opearationlocators();
	Patientregispage.patientid=patient;
	Searchfilter.patientidseacrh(patient);
}
public static void preopericon()
{
	scrolloperation(locatoroperation("Locators_worklist_preoperation_info_icon"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", locatoroperation("Locators_worklist_preoperation_info_icon"));
}
public static void patientid_valiopera() throws IOException
{
	Wardtestpage.wardproperties();
	WebDriverWait wait=new WebDriverWait(driver, 25);
	wait.until(ExpectedConditions.attributeToBe(Wardtestpage.locatorward("Locators_Preoperativeexam_patientdetails_patientid"), "id", "txt_patientID"));
	if(!Patientregispage.patientid.equalsIgnoreCase(fieldvalioper("Locators_Preoperativeexam_patientdetails_patientid")))
	{
		Assert.fail("Patient id mismatched");
	}
}
public static void BSL_valioper(String bslmax, String bslmin) throws IOException
{
	if(!bslmax.equalsIgnoreCase(dropvaliope("Locators_Preoperativeexam_Bloodreport_BSL_max")) && bslmin.equalsIgnoreCase(dropvaliope("Locators_Preoperativeexam_Bloodreport_BSL_min")))
	{
		Assert.fail("BSL max and min values are mismatched");
	}
}
public static void HB_valioper(String hbmax, String hbmin) throws IOException
{
	if(!hbmax.equalsIgnoreCase(dropvaliope("Locators_Preoperativeexam_Bloodreport_HB_max")) && hbmin.equalsIgnoreCase(dropvaliope("Locators_Preoperativeexam_Bloodreport_HB_min")))
	{
		Assert.fail("BSL max and min values are mismatched");
	}
}
public static void rs_valiopera(String rsmmhg) throws IOException
{
	if(!rsmmhg.equalsIgnoreCase(fieldvalioper("Locators_Preoperativeexam_Examination_Rs_Text")))
	{
		Assert.fail("Rs value is mismatched");
	}
}
public static void CVC_valiopera(String cvcmmhg) throws IOException
{
	if(!cvcmmhg.equalsIgnoreCase(fieldvalioper("Locators_Preoperativeexam_Examination_CVC_Text")))
	{
		Assert.fail("cvc value is mismatched");
	}
}
public static void CNS_valiopera(String cnsmmhg) throws IOException
{
	if(!cnsmmhg.equalsIgnoreCase(fieldvalioper("Locators_Preoperativeexam_Examination_CNS_Text")))
	{
		Assert.fail("cns value is mismatched");
	}
}
public static void PA_valiopera(String pammhg) throws IOException
{
	if(!pammhg.equalsIgnoreCase(fieldvalioper("Locators_Preoperativeexam_Examination_PA_Text")))
	{
		Assert.fail("pa value is mismatched");
	}
}
public static void Temp_valioper(String temp, String celci) throws IOException
{
	if(!temp.equalsIgnoreCase(dropvaliope("Locators_Preoperativeexam_Examination_Temp_max")) && celci.equalsIgnoreCase(dropvaliope("Locators_Preoperativeexam_Examination_Temp_min")))
	{
		Assert.fail("Temperature & celcious values are mismatched");
	}
}
public static void Pulse_valioper(String pulse) throws IOException
{
	if(!pulse.equalsIgnoreCase(dropvaliope("Locators_Preoperativeexam_Examination_Pulse")))
	{
		Assert.fail("Pulse value is mismatched");
	}
}
public static void BP_valioper(String bpmax, String bpmin) throws IOException
{
	if(!bpmax.equalsIgnoreCase(dropvaliope("Locators_Preoperativeexam_Examination_Bp_max")) && bpmin.equalsIgnoreCase(dropvaliope("Locators_Preoperativeexam_Examination_Bp_min")))
	{
		Assert.fail("BP max and min values are mismatched");
	}
}
public static void RR_valioper(String rrmax, String rrmin) throws IOException
{
	if(!rrmax.equalsIgnoreCase(dropvaliope("Locators_Preoperativeexam_Examination_RR_max")) && rrmin.equalsIgnoreCase(dropvaliope("Locators_Preoperativeexam_Examination_RR_min")))
	{
		Assert.fail("RR max and min values are mismatched");
	}
}
public static void ECG_valiopera(String ecg) throws IOException
{
	if(!ecg.equalsIgnoreCase(fieldvalioper("Locators_Preoperativeexam_Examination_ECG_Finding")))
	{
		Assert.fail("ecg value is mismatched");
	}
}
public static void fit_valiopera(String fit)
{
	if("yes".equalsIgnoreCase(fit))
	{
		if(!Wardtestpage.locatorward("Locators_Preoperativeexam_Advice_Fitforsurgery").isSelected())
		{
			Assert.fail("Patient Fit for surgery is not selected");
		}
	}else if ("no".equalsIgnoreCase(fit)) {
		if(Wardtestpage.locatorward("Locators_Preoperativeexam_Advice_Fitforsurgery").isSelected())
		{
			Assert.fail("Patient Fit for surgery is selected");
		}
	}
}
public static void physopinion_valiopera(String opinion)
{
	if("yes".equalsIgnoreCase(opinion))
	{
		if(!Wardtestpage.locatorward("Locators_Preoperativeexam_Advice_Physicianopinion").isSelected())
		{
			Assert.fail("Patient Fit for surgery is not selected");
		}
	}else if ("no".equalsIgnoreCase(opinion)) {
		if(Wardtestpage.locatorward("Locators_Preoperativeexam_Advice_Physicianopinion").isSelected())
		{
			Assert.fail("Patient Fit for surgery is selected");
		}
	}
}
public static void treatment_valiopera(String treat, String advice) throws IOException
{
	Wardtestpage.wardproperties();
	if("yes".equalsIgnoreCase(treat))
	{
		if(Wardtestpage.locatorward("Locators_Preoperativeexam_Advice_Treatment").isSelected())
		{
			
		}else {
			Assert.fail("Patient Fit for surgery is not selected");
		}
	}else if ("no".equalsIgnoreCase(treat)) {
		if(Wardtestpage.locatorward("Locators_Preoperativeexam_Advice_Treatment").isSelected())
		{
			Assert.fail("Patient Fit for surgery is selected");
		}
	}
	opearationlocators();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", locatoroperation("Locators_worklist_preoperation_examination_close"));
}
public static void iconopeinfo() throws IOException
{
	opearationlocators();
	scrolloperation(locatoroperation("Locators_worklist_postoperation_info_icon"));
	locatoroperation("Locators_worklist_postoperation_info_icon").click();
}
/*public static void postponeddate(String dates) throws InterruptedException
{
	WebDriverWait wait=new WebDriverWait(driver, 40);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Generate_report")));
	datepick(dates);
}*/
public static void surgeonope(String surgeonname)//Surgeon name
{
	WebDriverWait wait=new WebDriverWait(driver, 40);
	wait.until(ExpectedConditions.visibilityOf(locatoroperation("Locators_worklist_postoperation_Operated_surgeon")));
Select s=new Select(locatoroperation("Locators_worklist_postoperation_Operated_surgeon"));
s.selectByVisibleText(surgeonname);
}
public static void cosurgeonope(String cosurgeonname)//Co-Surgeon name
{
	locatoroperation("Locators_worklist_postoperation_Cosurgeon").sendKeys(cosurgeonname);
}
public static void anesthesiadr(String anesthesianame)//Anesthesia name
{
	locatoroperation("Locators_worklist_postoperation_Anesthesia_Doctor").sendKeys(anesthesianame);
}
public static void helpersope(String helpers)//Helpers
{
	locatoroperation("Locators_worklist_postoperation_Helpers").sendKeys(helpers);
}
public static void generalope(String gene)//General
{
	locatoroperation("Locators_worklist_postoperation_Generalnotes").sendKeys(gene);
}
public static void saveope() throws InterruptedException//Save the operation details
{
	scrolloperation(locatoroperation("Locators_worklist_postoperation_Save_button"));
	locatoroperation("Locators_worklist_postoperation_Save_button").click();
	Thread.sleep(2000);
WebDriverWait wait=new WebDriverWait(driver, 20);
wait.until(ExpectedConditions.visibilityOf(locatoroperation("Locators_worklist_postoperation_commonalert_close"))).click();
}


//DIRECT OPERATION WORKFLOW



//Common for operation
public static void opearationlocators() throws IOException
{
	f=new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"Alllocators"+File.separator+"Operation.properties"));
	locatorprob=new Properties();
	locatorprob.load(f);
}
public static void scrolloperation(WebElement ele)
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);", ele);
}
public static WebElement locatoroperation(String xpath)
{
	return driver.findElement(By.xpath(locatorprob.getProperty(xpath)));
}
public static String fieldvalioper(String loca) throws IOException
{
	Wardtestpage.wardproperties();
	return Wardtestpage.locatorward(loca).getAttribute("value");
}
public static String dropvaliope(String loca) throws IOException
{
	Wardtestpage.wardproperties();
	Select s= new Select(Wardtestpage.locatorward(loca));
	return s.getFirstSelectedOption().getText();
}

/*
//Date picker
public static void datepick(String date) throws InterruptedException
{
driver.findElement(By.xpath(".//input[@id='txt_ActualOperDate']")).click();

WebDriverWait wait=new WebDriverWait(driver, 40);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='datepicker-days']//table//thead//tr//th[@class='datepicker-switch']"))).click();//click center
WebDriverWait wait1=new WebDriverWait(driver, 40);
wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='datepicker-months']//table//thead//tr//th[@class='datepicker-switch']"))).click();//click center
String pick[]=date.split("\\s");//split the dates and store in array
//select the years
List<WebElement> first=driver.findElements(By.xpath("//div[@class='datepicker-years']//table//tbody//tr//td//span"));
for(int i=0;i<first.size();i++)
{
	if(first.get(i).getText().equalsIgnoreCase(pick[2]))
	{
		first.get(i).click();
		break;
	}
}
//select the month
List<WebElement> mth=driver.findElements(By.xpath("html/body/div[10]/div[2]/table/tbody/tr/td/span"));// locator //div[@class='datepicker-months']//table//tbody//tr//td//span
for(int i=0;i<mth.size();i++)
{
	if(mth.get(i).getText().equalsIgnoreCase(pick[0]))
	{
		mth.get(i).click();
		break;
	}
}
//select the day
WebElement table=driver.findElement(By.xpath("//div[@class='datepicker-days']//table//tbody"));
List<WebElement> r=table.findElements(By.tagName("tr"));
for (int i=0;i<r.size();i++)
{
boolean r=false;
	List<WebElement> c=r.get(i).findElements(By.tagName("td"));
	for (int j=0;j<c.size();j++)
	{
		String chadate=c.get(j).getAttribute("class");
		if(chadate.equalsIgnoreCase("day") || chadate.equalsIgnoreCase("day active") && c.get(j).getText().equalsIgnoreCase(pick[1]))
		{
			c.get(j).click();
			r=true;
			break;
		}
	}
	if(r==true)
	{
	break;
}
}
*/
}
