package consultation;
/**
'**************************************************************
'  Name        : Common pageobject for consultation
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Sep 18, 2017
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
import java.util.regex.Pattern;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import generationreport.Searchfilter;
import login.Initializer;

public class Consultationcommontestpage extends Initializer{

public static String conpatientid;
public static String diag[]=null;
	
public static void conspatid(String patid) throws IOException, InterruptedException
{
	consultcommonlocators();
	conpatientid=patid;	
	Searchfilter.patientidseacrh(patid);
}
public static void appfromdate(String appfrom) throws InterruptedException
{
	Searchfilter.appfromdate(appfrom);
	}
public static void apptodate(String todate) throws InterruptedException
{
	Searchfilter.apptodate(todate);
}
public static void consearchbutton()
{
	Searchfilter.searchbutton();
}
public static void clickpatiname() throws InterruptedException
{
	Thread.sleep(3000);
	getlocaxpath("Locators_consultation_worklist_patientname_link").click();
}
public static void casesheetclick(String age, String sex, String contactno, String procedure) throws InterruptedException
{
	Thread.sleep(7000);
	WebDriverWait wait=new WebDriverWait(driver, 45);
	wait.until(ExpectedConditions.textToBePresentInElement(getlocaxpath("Locators_consultation_Report_Patient_patientid"), conpatientid));
	WebDriverWait wait1=new WebDriverWait(driver, 45);
	wait1.until(ExpectedConditions.textToBePresentInElement(getlocaxpath("Locators_consultation_Report_Patient_age"), age));
	WebDriverWait wait2=new WebDriverWait(driver, 45);
	wait2.until(ExpectedConditions.textToBePresentInElement(getlocaxpath("Locators_consultation_Report_Patient_sex"), sex));
	WebDriverWait wait3=new WebDriverWait(driver, 45);
	wait3.until(ExpectedConditions.textToBePresentInElement(getlocaxpath("Locators_consultation_Report_Patient_contactno"), contactno));
	WebDriverWait wait4=new WebDriverWait(driver, 45);
	wait4.until(ExpectedConditions.textToBePresentInElement(getlocaxpath("Locators_consultation_Report_Patient_procedure"), procedure));
	if(conpatientid.equals(getlocaxpath("Locators_consultation_Report_Patient_patientid").getText())&&age.equals(getlocaxpath("Locators_consultation_Report_Patient_age").getText())&&sex.equals(getlocaxpath("Locators_consultation_Report_Patient_sex").getText())&&contactno.equals(getlocaxpath("Locators_consultation_Report_Patient_contactno").getText())&&procedure.equals(getlocaxpath("Locators_consultation_Report_Patient_procedure").getText()))
{
	getlocaxpath("Locators_consultation_Report_caseSheet_tab").click();
}else
{
	failmytestcase();
}
}

//case sheet general field validation
public static void gencheifcomcons(String chiefcomp) throws InterruptedException
{
	Thread.sleep(7000);
	WebDriverWait wait=new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(getlocaxpath("Locators_consultation_Report_casesheet_General_Chief_complaints")));
			commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_General_Chief_complaints"), chiefcomp);
}
public static void genprescompcons(String presentcomp)
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_General_Presenting_complaint"), presentcomp);
}
public static void genhisprescompcons(String hisprescomp)
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_General_History_of_presenting_complaint"), hisprescomp);
}
public static void genpreocuhiscons(String preocuhis)
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_General_Previous_ocular_history"), preocuhis);
}
public static void gensysillcons(String sysilln)
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_General_Systemic_Illness"), sysilln);
}
public static void genclinhiscons(String clinhis)
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_General_Clinical_history"), clinhis);
}
public static void gentreahiscons(String treathis)
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_General_Treatment_history"), treathis);
}
public static void genfamihiscons(String famihis)
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_General_Family_history"), famihis);
}
public static void genallercons(String allerg)
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_General_Allergies"), allerg);
}

//cashe sheet VA field validation 
public static void ruadistance(String ruad)
{
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(getlocaxpath("Locators_consultation_Report_casesheet_VA_Right_eye_UnAided_Distance")));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);", getlocaxpath("Locators_consultation_Report_casesheet_VA_Right_eye_UnAided_Distance"));
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_VA_Right_eye_UnAided_Distance"), ruad);
}
public static void ruanear(String ruan)
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_VA_Right_eye_UnAided_Near"), ruan);
}
public static void luadistance(String luad)
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_VA_Left_eye_UnAided_Distance"), luad);
}
public static void luanear(String luan)
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_VA_Left_eye_UnAided_Near"), luan);
}
public static void varightadistancecons(String rad)
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_VA_Right_eye_Aided_Distance"), rad);
}
public static void varightanearcons(String ran)
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_VA_Right_eye_Aided_Near"), ran);
}
public static void valeftadistancecons(String lad)
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_VA_Left_eye_Aided_Distance"), lad);
}
public static void valeftanearcons(String lan)
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_VA_Left_eye_Aided_Near"), lan);
}
public static void varightapinholecons(String rpinhole)
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_VA_Right_eye_Pinhole"), rpinhole);
}
public static void valeftapinholecons(String lpinhole)
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_VA_Left_eye_Pinhole"), lpinhole);
}

//case sheet subjective acceptance field validation
public static void sarightdvspherecons(String rightDVSPH)
{
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(getlocaxpath("Locators_consultation_Report_casesheet_Subjectiveacceptance_Right_eyeDV_Sphere")));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);", getlocaxpath("Locators_consultation_Report_casesheet_Subjectiveacceptance_Right_eyeDV_Sphere"));
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_Subjectiveacceptance_Right_eyeDV_Sphere"), rightDVSPH);
}
public static void sarightdvcylindercons(String rightDVCYL)
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_Subjectiveacceptance_Right_eyeDV_Cylinder"), rightDVCYL);
}
public static void sarightdvaxiscons(String rightDVAxis)
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_Subjectiveacceptance_Right_eyeDV_Axis"), rightDVAxis);
}
public static void sarightdvvisualacucons(String rightDVVA)
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_Subjectiveacceptance_Right_eyeDV_VisualAcuity"), rightDVVA);
}
public static void saleftdvspherecons(String leftDVSPH)
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_Subjectiveacceptance_Left_eyeDV_Sphere"), leftDVSPH);
}
public static void saleftdvcylindercons(String leftDVCYL)
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_Subjectiveacceptance_Left_eyeDV_Cylinder"), leftDVCYL);
}
public static void saleftdvaxiscons(String leftDVAxis)
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_Subjectiveacceptance_Left_eyeDV_Axis"), leftDVAxis);
}
public static void saleftdvvisualacucons(String leftDVVA)
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_Subjectiveacceptance_Left_eyeDV_VisualAcuity"), leftDVVA);
}
public static void sarightnvspherecons(String rightNVSPH)
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_Subjectiveacceptance_Right_eyeNV_Sphere"), rightNVSPH);
}
public static void sarightnvcylindercons()
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_Subjectiveacceptance_Right_eyeNV_Cylinder"), getlocaxpath("Locators_consultation_Report_casesheet_Subjectiveacceptance_Right_eyeDV_Cylinder").getText());
}
public static void sarightnvaxiscons()
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_Subjectiveacceptance_Right_eyeNV_Axis"), getlocaxpath("Locators_consultation_Report_casesheet_Subjectiveacceptance_Right_eyeDV_Axis").getText());
}
public static void sarightnvvisualacucons(String rightNVVA)
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_Subjectiveacceptance_Right_eyeNV_VisualAcuity"), rightNVVA);
}
public static void saleftnvspherecons(String leftNVSPH)
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_Subjectiveacceptance_Left_eyeNV_Sphere"), leftNVSPH);
}
public static void saleftnvcylindercons()
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_Subjectiveacceptance_Left_eyeNV_Cylinder"), getlocaxpath("Locators_consultation_Report_casesheet_Subjectiveacceptance_Left_eyeDV_Cylinder").getText());
}
public static void saleftnvaxiscons()
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_Subjectiveacceptance_Left_eyeNV_Axis"), getlocaxpath("Locators_consultation_Report_casesheet_Subjectiveacceptance_Left_eyeDV_Axis").getText());
}
public static void saleftnvvisualacucons(String leftNVVA)
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_Subjectiveacceptance_Left_eyeNV_VisualAcuity"), leftNVVA);
}

//case sheet intraocular pressure validation
public static void icrightschiotzcons(String rsmax, String rsmin)
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);", getlocaxpath("Locators_consultation_Report_casesheet_Intraocularpressure_Right_eye_Schiotz"));
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_Intraocularpressure_Right_eye_Schiotz"), rsmax+rsmin);
}
public static void icleftschiotzcons(String lsmax, String lsmin)
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_Intraocularpressure_Left_eye_Schiotz"), lsmax+lsmin);
}
public static void icrightapplancons(String ramax, String ramin)
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_Intraocularpressure_Right_eye_Applanation"), ramax+ramin);
}
public static void icleftapplancons(String lamax, String lamin)
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_Intraocularpressure_Left_eye_Applanation"), lamax+lamin);
}
public static void icrightnoncatcons(String rncmax, String rncmin)
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_Intraocularpressure_Right_eye_Non_Contact"), rncmax+rncmin);
}
public static void icleftnoncatcons(String lncmax, String lncmin)
{
	commonconvalidation(getlocaxpath("Locators_consultation_Report_casesheet_Intraocularpressure_Left_eye_Non_Contact"), lncmax+lncmin);
}

//Report tab in diagnosis for value
public static void righteyediagreport(String righteyediag) throws InterruptedException
{
	Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(".//*[@id='Generate_report']")));
	diag=righteyediag.split(",");
	getlocaxpath("Locators_ReportTab_Righteye_diagnosis_textbox").click();
	List<WebElement> rightdrop=driver.findElements(By.className("DIAGNOSIS_RIGHT"));
	for(int i=0;i<diag.length;i++)
	{
		for(int j=0;j<rightdrop.size();j++)
		{
			if(rightdrop.get(j).getAttribute("onclick").contains(diag[i]))
			{
				JavascriptExecutor js1=(JavascriptExecutor)driver;
				js1.executeScript("arguments[0].click();", rightdrop.get(j));
				break;
			}
		}
	}
}
public static void lefteyediagreport(String lefteyediag)
{
	diag=lefteyediag.split(",");
	getlocaxpath("Locators_ReportTab_Lefteye_diagnosis_textbox").click();
	List<WebElement> leftdrop=driver.findElements(By.className("DIAGNOSIS_LEFT"));
	for(int i=0;i<diag.length;i++)
	{
		for(int j=0;j<leftdrop.size();j++)
		{
			if(leftdrop.get(j).getAttribute("onclick").contains(diag[i]))
			{
				JavascriptExecutor js1=(JavascriptExecutor)driver;
				js1.executeScript("arguments[0].click();", leftdrop.get(j));
				break;
			}
		}
	}
}
public static void advicereport(String advice)
{
	selectcom(getlocaxpath("Locators_ReportTab_Advice_dropdown"), advice);
}
public static void titlediagnosis(String titdia, String comments)
{
	if("Title".equalsIgnoreCase(titdia))
	{
		WebElement rep=driver.findElement(By.id("ddl_Reporttitle"));
		selectcom(rep, comments);
	}else if ("Diagnosis".equalsIgnoreCase(titdia)) {
		driver.switchTo().frame("txtDescriptionHTMLEditor_ifr");
		driver.findElement(By.className("mceContentBody")).sendKeys(comments);
		driver.switchTo().defaultContent();
	}
	JavascriptExecutor js1=(JavascriptExecutor)driver;
	js1.executeScript("arguments[0].click();", getlocaxpath("Locators_ReportTab_Righteye_diagnosis_textbox"));
}

//common for consult
public static void consultcommonlocators() throws IOException
{
	f=new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"Alllocators"+File.separator+"Consultcommon.properties"));
	locatorprob=new Properties();
	locatorprob.load(f);
}
public static void failmytestcase()
{
	Assert.fail("Evaluation Values are mismatched with consulattion case sheet");
}
public static void commonconvalidation(WebElement valloc, String valinput)
{
	if(!valloc.getText().equalsIgnoreCase(valinput))
	{
		failmytestcase();
	}	
}
public static WebElement getlocaxpath(String xpath)
{
	return driver.findElement(By.xpath(locatorprob.getProperty(xpath)));
}
public static void selectcom(WebElement ele, String value)
{
	Select se=new Select(ele);
	se.selectByVisibleText(value);
}
}
