package evaluation;
/**
'**************************************************************
'  Name        : patient registration
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Sep 13, 2017
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
import login.Logintestpage;

public class Evaluationtestpage extends Initializer{
	public static String evapatientidno;

public static void evapatientid(String patid) throws IOException, InterruptedException
{
	f=new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"Alllocators"+File.separator+"Evaluation.properties"));
	locatorprob=new Properties();
	locatorprob.load(f);
	evapatientidno=patid;
	driver.findElement(By.id("txt_patientid")).clear();
	Thread.sleep(2000);
	driver.findElement(By.id("txt_patientid")).sendKeys(patid);
	//WebDriverWait wait=new WebDriverWait(driver, 8);
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt_patientid"))).sendKeys(patid);
}
public static void evafromdate(String fromdate) throws InterruptedException
{
	Searchfilter.appfromdate(fromdate);
}
public static void evatodate(String todate) throws InterruptedException
{
	Searchfilter.apptodate(todate);
}
public static void clicksearchbutton() throws InterruptedException
{
	Searchfilter.searchbutton();
		
}
public static void evaaddcasesheet() throws InterruptedException//Click case sheet link
{
	Thread.sleep(5000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", valocators("locators_worklist_Assign_iconbutton"));
	valocators("locators_worklist_casesheet_iconbutton").click();
	//Thread.sleep(3000);
}
public static void casesheetpatientvali(String age, String sex, String mobile, String priviledgeno) throws InterruptedException
{
	WebDriverWait wait=new WebDriverWait(driver, 25);
	wait.until(ExpectedConditions.visibilityOf(valocators("locator_Generalinformation_link")));
	Thread.sleep(3000);
	if(!evapatientidno.equalsIgnoreCase(valocators("locators_casesheet_Patienid").getText()) && age.equalsIgnoreCase(valocators("locators_casesheet_Age").getText()) && sex.equalsIgnoreCase(valocators("locators_casesheet_Sex").getText()) && mobile.equalsIgnoreCase(valocators("locators_casesheet_Contactno").getText()) && priviledgeno.equalsIgnoreCase(valocators("locators_casesheet_Priviledgeno").getText()))
	{
		Assert.fail("The following fields are mismatched patientid, age, sex, mobileno, priviledgeno");
	}
}
//General fields
public static void chiefcomgn(String chiefcom) throws InterruptedException
{
	WebDriverWait wait=new WebDriverWait(driver, 25);
	wait.until(ExpectedConditions.visibilityOf(valocators("locator_Generalinformation_link"))).click();
	Thread.sleep(2000);
WebDriverWait wait1=new WebDriverWait(driver, 20);
wait1.until(ExpectedConditions.visibilityOf(valocators("locator_Generalinformation_Chief_complaints"))).sendKeys(chiefcom);
}
public static void presentcomgn(String presentcomp)
{
	valocators("locator_Generalinformation_Presenting_complaint").sendKeys(presentcomp);
}
public static void histpresentcomplangn(String hisprescomp)
{
	valocators("locator_Generalinformation_History_presenting_complaint").sendKeys(hisprescomp);
}
public static void prevocularhisgn(String preocuhis)
{
	valocators("locator_Generalinformation_Previous_ocular_history(Injury)").sendKeys(preocuhis);
}
public static void systeillnesgn(String sysilln)
{
	valocators("locator_Generalinformation_Systemic_Illness_History").sendKeys(sysilln);
}
public static void clininchistorygn(String clinhis)
{
	valocators("locator_Generalinformation_Clinical_history").sendKeys(clinhis);
}
public static void treatehistorygn(String treathis)
{
	valocators("locator_Generalinformation_Treatment_history").sendKeys(treathis);
}
public static void familyhistorygn(String famihis)
{
	valocators("locator_Generalinformation_Family_history").sendKeys(famihis);
}
public static void allergierygn(String allerg)
{
	valocators("locator_Generalinformation_Allergies").sendKeys(allerg);
}


//visual acuity fields 
public static void evavisualacu() throws InterruptedException//Click Visual Acuity
{
	WebDriverWait wait=new WebDriverWait(driver, 45);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("lbl_OPTPatientID")));
	WebElement id=driver.findElement(By.className("lbl_OPTPatientID"));
	//WebDriverWait wait = new WebDriverWait(driver, 8);
	//wait.until(ExpectedConditions.visibilityOf(id));
	String evapaid=id.getText();
	if(evapaid.equals(evapatientidno))
	{
		WebDriverWait wait1=new WebDriverWait(driver, 45);
		wait1.until(ExpectedConditions.visibilityOf(valocators("locator_visualacuity_link"))).click();
		//WebDriverWait waitn=new WebDriverWait(driver, 8);
	//waitn.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Visual Acuity"))).click();
	//Thread.sleep(2000);
	}else {
		faileva();
		//System.out.println("test case failed");
	}
}
public static void evavaunit(String vaunit) throws InterruptedException
{
	WebDriverWait wait=new WebDriverWait(driver, 25);
	wait.until(ExpectedConditions.visibilityOf(valocators("locator_visualacuity_unittype_Snellen(Meters)")));
	Thread.sleep(2000);
	if("Snellen(Feet)".equalsIgnoreCase(vaunit))
	{
		valocators("locator_visualacuity_unittype_Snellen(Feet)").click();
	}else if ("Decimal".equalsIgnoreCase(vaunit)) {
		valocators("locator_visualacuity_unittype_Decimal").click();
	}else if ("Visual Angle".equalsIgnoreCase(vaunit)) {
		valocators("locator_visualacuity_unittype_Visual_Angle").click();
	}else if ("Log MAR".equalsIgnoreCase(vaunit)) {
		valocators("locator_visualacuity_unittype_Log_MAR").click();
	}else if ("Snellen(Meters)".equalsIgnoreCase(vaunit)) {
		if (!valocators("locator_visualacuity_unittype_Snellen(Meters)").isSelected()) {
		valocators("locator_visualacuity_unittype_Snellen(Meters)").click();
		}
	}	
}
public static void rightunaideddist(String ruad) throws InterruptedException//VA value
{
	WebDriverWait wait=new WebDriverWait(driver, 25);
	wait.until(ExpectedConditions.visibilityOf(valocators("locator_visualacuity_righteye_UnAidedDistance")));
	Thread.sleep(1000);
//WebDriverWait wait=new WebDriverWait(driver, 12);
//wait.until(ExpectedConditions.visibilityOf(rightdist));
	
	//If Case sheet elements are Search Filter
	//vaselectby("locator_visualacuity_righteye_UnAidedDistance_datalist", valocators("locator_visualacuity_righteye_UnAidedDistance"), ruad);
	//If Case sheet elements are drop down
	vaselectby(valocators("locator_visualacuity_righteye_UnAidedDistance"), ruad);

	//valocators("locator_visualacuity_righteye_UnAidedDistance").sendKeys(ruad);
}
public static void rightunaidednear(String ruan)
{
	//If Case sheet elements are Search Filter
	//vaselectby("locator_visualacuity_righteye_UnAidedNear_datalist", valocators("locator_visualacuity_righteye_UnAidedNear"), ruan);
	//If Case sheet elements are drop down
	vaselectby(valocators("locator_visualacuity_righteye_UnAidedNear"), ruan);
	
	//valocators("locator_visualacuity_righteye_UnAidedNear").sendKeys(ruan);
}
public static void leftunaideddist(String luad)
{
	//If Case sheet elements are Search Filter
	//vaselectby("locator_visualacuity_lefteye_UnAidedDistance_datalist", valocators("locator_visualacuity_lefteye_UnAidedDistance"), luad);
	//If Case sheet elements are drop down
	vaselectby(valocators("locator_visualacuity_lefteye_UnAidedDistance"), luad);
	
	//valocators("locator_visualacuity_lefteye_UnAidedDistance").sendKeys(luad);
}
public static void leftunaidednear(String ruan)
{
	//If Case sheet elements are Search Filter
	//vaselectby("locator_visualacuity_lefteye_UnAidedNear_datalist", valocators("locator_visualacuity_lefteye_UnAidedNear"), ruan);
	//If Case sheet elements are drop down
	vaselectby(valocators("locator_visualacuity_lefteye_UnAidedNear"), ruan);
	
	//valocators("locator_visualacuity_lefteye_UnAidedNear").sendKeys(ruan);
}
public static void rightaideddist(String rad)
{
	//If Case sheet elements are Search Filter
	//vaselectby("locator_visualacuity_righteye_AidedDistance_datalist", valocators("locator_visualacuity_righteye_AidedDistance"), rad);
	//If Case sheet elements are drop down
	vaselectby(valocators("locator_visualacuity_righteye_AidedDistance"), rad);
	
	//valocators("locator_visualacuity_righteye_AidedDistance").sendKeys(rad);
}
public static void rightaidednear(String ran)
{
	//If Case sheet elements are Search Filter
	//vaselectby("locator_visualacuity_righteye_AidedNear_datalist", valocators("locator_visualacuity_righteye_AidedNear"), ran);
	//If Case sheet elements are drop down
	vaselectby(valocators("locator_visualacuity_righteye_AidedNear"), ran);
	
	//valocators("locator_visualacuity_righteye_AidedNear").sendKeys(ran);
}
public static void leftaideddist(String lad)
{
	//If Case sheet elements are Search Filter
	//vaselectby("locator_visualacuity_lefteye_AidedDistance_datalist", valocators("locator_visualacuity_lefteye_AidedDistance"), lad);
	//If Case sheet elements are drop down
	vaselectby(valocators("locator_visualacuity_lefteye_AidedDistance"), lad);
	
	//valocators("locator_visualacuity_lefteye_AidedDistance").sendKeys(lad);
}
public static void leftaidednear(String lan)
{
	//If Case sheet elements are Search Filter
	//vaselectby("locator_visualacuity_lefteye_AidedNear_datalist", valocators("locator_visualacuity_lefteye_AidedNear"), lan);
	//If Case sheet elements are drop down
	vaselectby(valocators("locator_visualacuity_lefteye_AidedNear"), lan);
	
	//valocators("locator_visualacuity_lefteye_AidedNear").sendKeys(lan);
}
public static void rightpinhole(String rpin)
{
	//If Case sheet elements are Search Filter
	//vaselectby("locator_visualacuity_righteye_Pinhole_datalist", valocators("locator_visualacuity_righteye_Pinhole"), rpin);
	//If Case sheet elements are drop down
	vaselectby(valocators("locator_visualacuity_righteye_Pinhole"), rpin);
	
	//valocators("locator_visualacuity_righteye_Pinhole").sendKeys(rpin);
	
}
public static void leftpinhole(String lpin)
{
	//If Case sheet elements are Search Filter
	//vaselectby("locator_visualacuity_lefteye_Pinhole_datalist", valocators("locator_visualacuity_lefteye_Pinhole"), lpin);
	//If Case sheet elements are drop down
	vaselectby(valocators("locator_visualacuity_lefteye_Pinhole"), lpin);
	
	//valocators("locator_visualacuity_lefteye_Pinhole").sendKeys(lpin);
}

//subjective acceptance fields
public static void sblink()
{
	valocators("locators_subjectiveaccptance_link").click();
}
public static void Rightsbdvsphear(String rightDVsph)
{
	WebDriverWait wait=new WebDriverWait(driver, 25);
	wait.until(ExpectedConditions.visibilityOf(valocators("locators_subjectiveaccptance_Righteye_DVSPH")));
	//If Case sheet elements are Search Filter
	//vaselectby("locators_subjectiveaccptance_Righteye_DVSPH_datalist", valocators("locators_subjectiveaccptance_Righteye_DVSPH"), rightDVsph);
	//If Case sheet elements are drop down
	vaselectby(valocators("locators_subjectiveaccptance_Righteye_DVSPH"), rightDVsph);
	
	//valocators("locators_subjectiveaccptance_Righteye_DVSPH").sendKeys(rightDVsph);
}
public static void Rightsbdvcylinder(String rightDVcyl)
{
	//If Case sheet elements are Search Filter
	//vaselectby("locators_subjectiveaccptance_Righteye_DVCYL_datalist", valocators("locators_subjectiveaccptance_Righteye_DVCYL"), rightDVcyl);
	//If Case sheet elements are drop down
	vaselectby(valocators("locators_subjectiveaccptance_Righteye_DVCYL"), rightDVcyl);
	
	//valocators("locators_subjectiveaccptance_Righteye_DVCYL").sendKeys(rightDVcyl);
}
public static void Rightsbdvaxis(String rightDVaxi)
{
	//If Case sheet elements are Search Filter
	//vaselectby("locators_subjectiveaccptance_Righteye_DVAxis_datalist", valocators("locators_subjectiveaccptance_Righteye_DVAxis"), rightDVaxi);
	//If Case sheet elements are drop down
	vaselectby(valocators("locators_subjectiveaccptance_Righteye_DVAxis"), rightDVaxi);
	
	//valocators("locators_subjectiveaccptance_Righteye_DVAxis").sendKeys(rightDVaxi);
}
public static void Rightsbdvva(String rightDVva)
{
	//If Case sheet elements are Search Filter
	//vaselectby("locators_subjectiveaccptance_Righteye_DVVA_datalist", valocators("locators_subjectiveaccptance_Righteye_DVVA"), rightDVva);
	//If Case sheet elements are drop down
	vaselectby(valocators("locators_subjectiveaccptance_Righteye_DVVA"), rightDVva);
	
	//valocators("locators_subjectiveaccptance_Righteye_DVVA").sendKeys(rightDVva);
}
public static void Leftsbdvsphear(String leftDVsph)
{
	//If Case sheet elements are Search Filter
	//vaselectby("locators_subjectiveaccptance_Lefteye_DVSPH_datalist", valocators("locators_subjectiveaccptance_Lefteye_DVSPH"), leftDVsph);
	//If Case sheet elements are drop down
	vaselectby(valocators("locators_subjectiveaccptance_Lefteye_DVSPH"), leftDVsph);
	
	//valocators("locators_subjectiveaccptance_Lefteye_DVSPH").sendKeys(leftDVsph);
}
public static void Leftsbdvcylinder(String leftDVcyl)
{
	//If Case sheet elements are Search Filter
	//vaselectby("locators_subjectiveaccptance_Lefteye_DVCYL_datalist", valocators("locators_subjectiveaccptance_Lefteye_DVCYL"), leftDVcyl);
	//If Case sheet elements are drop down
	vaselectby(valocators("locators_subjectiveaccptance_Lefteye_DVCYL"), leftDVcyl);	
	
	//valocators("locators_subjectiveaccptance_Lefteye_DVCYL").sendKeys(leftDVcyl);
}
public static void Leftsbdvaxis(String leftDVaxi)
{
	//If Case sheet elements are Search Filter
	//vaselectby("locators_subjectiveaccptance_Lefteye_DVAxis_datalist", valocators("locators_subjectiveaccptance_Lefteye_DVAxis"), leftDVaxi);
	//If Case sheet elements are drop down
	vaselectby(valocators("locators_subjectiveaccptance_Lefteye_DVAxis"), leftDVaxi);
	
	//valocators("locators_subjectiveaccptance_Lefteye_DVAxis").sendKeys(leftDVaxi);
}
public static void Leftsbdvva(String leftDVva)
{
	//If Case sheet elements are Search Filter
	//vaselectby("locators_subjectiveaccptance_Lefteye_DVVA_datalist", valocators("locators_subjectiveaccptance_Lefteye_DVVA"), leftDVva);
	//If Case sheet elements are drop down
	vaselectby(valocators("locators_subjectiveaccptance_Lefteye_DVVA"), leftDVva);
	
	//valocators("locators_subjectiveaccptance_Lefteye_DVVA").sendKeys(leftDVva);
}
public static void Rightsbnvsphear(String rightNVsph)
{
	//If Case sheet elements are Search Filter
	//vaselectby("locators_subjectiveaccptance_Righteye_NVSPH_datalist", valocators("locators_subjectiveaccptance_Righteye_NVSPH"), rightNVsph);
	//If Case sheet elements are drop down
	vaselectby(valocators("locators_subjectiveaccptance_Righteye_NVSPH"), rightNVsph);
	
	//valocators("locators_subjectiveaccptance_Righteye_NVSPH").sendKeys(rightNVsph);
}
public static void Rightsbnvcylinder()
{
	//If Case sheet elements are Search Filter
	/*if(!valocators("locators_subjectiveaccptance_Righteye_NVCYL").getAttribute("value").equalsIgnoreCase(valocators("locators_subjectiveaccptance_Righteye_DVCYL").getAttribute("value")))
	{
		faileva();
	}*/
	//If Case sheet elements are drop down
	if(!sbdropdown(valocators("locators_subjectiveaccptance_Righteye_NVCYL")).equalsIgnoreCase(sbdropdown(valocators("locators_subjectiveaccptance_Righteye_DVCYL"))))
	{
		faileva();
	}
}
public static void Rightsbnvaxis()
{
	//If Case sheet elements are Search Filter
	/*if(!valocators("locators_subjectiveaccptance_Righteye_NVAxis").getAttribute("value").equalsIgnoreCase(valocators("locators_subjectiveaccptance_Righteye_DVAxis").getAttribute("value")))
	{
		faileva();
	}*/
	//If Case sheet elements are drop down
	if(!sbdropdown(valocators("locators_subjectiveaccptance_Righteye_NVAxis")).equalsIgnoreCase(sbdropdown(valocators("locators_subjectiveaccptance_Righteye_DVAxis"))))
	{
		faileva();
	}
}
public static void Rightsbnvva(String rightNVva)
{
	//If Case sheet elements are Search Filter
	//vaselectby("locators_subjectiveaccptance_Righteye_NVVA_datalist", valocators("locators_subjectiveaccptance_Righteye_NVVA"), rightNVva);
	//If Case sheet elements are drop down
	vaselectby(valocators("locators_subjectiveaccptance_Righteye_NVVA"), rightNVva);
	
	//valocators("locators_subjectiveaccptance_Righteye_NVVA").sendKeys(rightNVva);
}
public static void Leftsbnvsphear(String leftNVsph)
{
	//If Case sheet elements are Search Filter
	//vaselectby("locators_subjectiveaccptance_Lefteye_NVSPH_datalist", valocators("locators_subjectiveaccptance_Lefteye_NVSPH"), leftNVsph);
	//If Case sheet elements are drop down
	vaselectby(valocators("locators_subjectiveaccptance_Lefteye_NVSPH"), leftNVsph);
	
	//valocators("locators_subjectiveaccptance_Lefteye_NVSPH").sendKeys(leftNVsph);
}
public static void Leftsbnvcylinder()
{
	//If Case sheet elements are Search Filter
	/*if(!valocators("locators_subjectiveaccptance_Lefteye_NVCYL").getAttribute("value").equalsIgnoreCase(valocators("locators_subjectiveaccptance_Lefteye_DVCYL").getAttribute("value")))
	{
		faileva();
	}*/
	//If Case sheet elements are drop down
	if(!sbdropdown(valocators("locators_subjectiveaccptance_Lefteye_NVCYL")).equalsIgnoreCase(sbdropdown(valocators("locators_subjectiveaccptance_Lefteye_DVCYL"))))
	{
		faileva();
	}

}
public static void Leftsbnvaxis()
{
	//If Case sheet elements are Search Filter
	/*if(!valocators("locators_subjectiveaccptance_Lefteye_NVAxis").getAttribute("value").equalsIgnoreCase(valocators("locators_subjectiveaccptance_Lefteye_DVAxis").getAttribute("value")))
	{
		faileva();
	}*/
	//If Case sheet elements are drop down
	if(!sbdropdown(valocators("locators_subjectiveaccptance_Lefteye_NVAxis")).equalsIgnoreCase(sbdropdown(valocators("locators_subjectiveaccptance_Lefteye_DVAxis"))))
	{
		faileva();
	}

}
public static void Leftsbnvva(String leftNVva)
{
	//If Case sheet elements are Search Filter
	//vaselectby("locators_subjectiveaccptance_Lefteye_NVVA__datalist", valocators("locators_subjectiveaccptance_Lefteye_NVVA"), leftNVva);
	//If Case sheet elements are drop down
	vaselectby(valocators("locators_subjectiveaccptance_Lefteye_NVVA"), leftNVva);
	
	//valocators("locators_subjectiveaccptance_Lefteye_NVVA").sendKeys(leftNVva);
}

//Intraocular pressure Fields
public static void intraocularpressurelink()
{
valocators("locators_Intraocularpressure_link").click();
}
public static void RightSchmax(String rsmax)
{
	WebDriverWait wait=new WebDriverWait(driver, 25);
	wait.until(ExpectedConditions.visibilityOf(valocators("locators_Intraocularpressure_Righteye_Schiotz_max")));
	//If Case sheet elements are Search Filter
	//vaselectby("locators_Intraocularpressure_Righteye_Schiotz_max_datalist", valocators("locators_Intraocularpressure_Righteye_Schiotz_max"), rsmax);
	//If Case sheet elements are drop down
	vaselectby(valocators("locators_Intraocularpressure_Righteye_Schiotz_max"), rsmax);
	
	//valocators("locators_Intraocularpressure_Righteye_Schiotz_max").sendKeys(rsmax);
}
public static void RightSchmin(String rsmin)
{
	//If Case sheet elements are Search Filter
	//vaselectby("locators_Intraocularpressure_Righteye_Schiotz_min_datalist", valocators("locators_Intraocularpressure_Righteye_Schiotz_min"), rsmin);
	//If Case sheet elements are drop down
	vaselectby(valocators("locators_Intraocularpressure_Righteye_Schiotz_min"), rsmin);
	
	//valocators("locators_Intraocularpressure_Righteye_Schiotz_min").sendKeys(rsmin);
}
public static void RightSchremarks(String rsr)
{
	valocators("locators_Intraocularpressure_Righteye_Schiotz_remarks").sendKeys(rsr);
}
public static void LeftSchmax(String lsmax)
{
	//If Case sheet elements are Search Filter
	//vaselectby("locators_Intraocularpressure_Lefteye_Schiotz_max_datalist", valocators("locators_Intraocularpressure_Lefteye_Schiotz_max"), lsmax);
	//If Case sheet elements are drop down
	vaselectby(valocators("locators_Intraocularpressure_Lefteye_Schiotz_max"), lsmax);

	//valocators("locators_Intraocularpressure_Lefteye_Schiotz_max").sendKeys(lsmax);
}
public static void LeftSchmin(String lsmin)
{
	//If Case sheet elements are Search Filter
	//vaselectby("locators_Intraocularpressure_Lefteye_Schiotz_min_datalist", valocators("locators_Intraocularpressure_Lefteye_Schiotz_min"), lsmin);
	//If Case sheet elements are drop down
	vaselectby(valocators("locators_Intraocularpressure_Lefteye_Schiotz_min"), lsmin);
	
	//valocators("locators_Intraocularpressure_Lefteye_Schiotz_min").sendKeys(lsmin);
}
public static void LeftSchremarks(String lsr)
{
	valocators("locators_Intraocularpressure_Lefteye_Schiotz_remarks").sendKeys(lsr);
}
public static void RightAppmax(String ramax)
{
	//If Case sheet elements are Search Filter
	//vaselectby("locators_Intraocularpressure_Righteye_Applanation_max_datalist", valocators("locators_Intraocularpressure_Righteye_Applanation_max"), ramax);
	//If Case sheet elements are drop down
	vaselectby(valocators("locators_Intraocularpressure_Righteye_Applanation_max"), ramax);
	
	//valocators("locators_Intraocularpressure_Righteye_Applanation_max").sendKeys(ramax);
}
public static void Rightappmin(String ramin)
{
	//If Case sheet elements are Search Filter
	//vaselectby("locators_Intraocularpressure_Righteye_Applanation_min_datalist", valocators("locators_Intraocularpressure_Righteye_Applanation_min"), ramin);
	//If Case sheet elements are drop down
	vaselectby(valocators("locators_Intraocularpressure_Righteye_Applanation_min"), ramin);
	
	//valocators("locators_Intraocularpressure_Righteye_Applanation_min").sendKeys(ramin);
}
public static void Rightappremarks(String rar)
{
	valocators("locators_Intraocularpressure_Righteye_Applanation_remarks").sendKeys(rar);
}
public static void Leftappmax(String lamax)
{
	//If Case sheet elements are Search Filter
	//vaselectby("locators_Intraocularpressure_Lefteye_Applanation_max_datalist", valocators("locators_Intraocularpressure_Lefteye_Applanation_max"), lamax);
	//If Case sheet elements are drop down
	vaselectby(valocators("locators_Intraocularpressure_Lefteye_Applanation_max"), lamax);
	
	//valocators("locators_Intraocularpressure_Lefteye_Applanation_max").sendKeys(lamax);
}
public static void Leftappmin(String lamin)
{
	//If Case sheet elements are Search Filter
	//vaselectby("locators_Intraocularpressure_Lefteye_Applanation_min_datalist", valocators("locators_Intraocularpressure_Lefteye_Applanation_min"), lamin);
	//If Case sheet elements are drop down
	vaselectby(valocators("locators_Intraocularpressure_Lefteye_Applanation_min"), lamin);
	
	//valocators("locators_Intraocularpressure_Lefteye_Applanation_min").sendKeys(lamin);
}
public static void Leftappremarks(String lar)
{
	valocators("locators_Intraocularpressure_Lefteye_Applanation_remarks").sendKeys(lar);
}
public static void Rightnoncatmax(String rncmax)
{
	//If Case sheet elements are Search Filter
	//vaselectby("locators_Intraocularpressure_Righteye_Non-Contact_max_datalist", valocators("locators_Intraocularpressure_Righteye_Non-Contact_max"), rncmax);
	//If Case sheet elements are drop down
	vaselectby(valocators("locators_Intraocularpressure_Righteye_Non-Contact_max"), rncmax);
	
	//valocators("locators_Intraocularpressure_Righteye_Non-Contact_max").sendKeys(rncmax);
}
public static void Rightnoncatmin(String rncmin)
{
	//If Case sheet elements are Search Filter
	//vaselectby("locators_Intraocularpressure_Righteye_Non-Contact_min_datalist", valocators("locators_Intraocularpressure_Righteye_Non-Contact_min"), rncmin);
	//If Case sheet elements are drop down
	vaselectby(valocators("locators_Intraocularpressure_Righteye_Non-Contact_min"), rncmin);
	
	//valocators("locators_Intraocularpressure_Righteye_Non-Contact_min").sendKeys(rncmin);
}
public static void Rightnoncatremarks(String rncr)
{
	valocators("locators_Intraocularpressure_Righteye_Non-Contact_remarks").sendKeys(rncr);
}
public static void Leftnoncatmax(String lncmax)
{
	//If Case sheet elements are Search Filter
	//vaselectby("locators_Intraocularpressure_Lefteye_Non-Contact_max_datalist", valocators("locators_Intraocularpressure_Lefteye_Non-Contact_max"), lncmax);
	//If Case sheet elements are drop down
	vaselectby(valocators("locators_Intraocularpressure_Lefteye_Non-Contact_max"), lncmax);
	
	//valocators("locators_Intraocularpressure_Lefteye_Non-Contact_max").sendKeys(lncmax);
}
public static void Leftnoncatmin(String lncmin)
{
	//If Case sheet elements are Search Filter
	//vaselectby("locators_Intraocularpressure_Lefteye_Non-Contact_min_datalist", valocators("locators_Intraocularpressure_Lefteye_Non-Contact_min"), lncmin);
	//If Case sheet elements are drop down
	vaselectby(valocators("locators_Intraocularpressure_Lefteye_Non-Contact_min"), lncmin);
	
	//valocators("locators_Intraocularpressure_Lefteye_Non-Contact_min").sendKeys(lncmin);
}
public static void Leftnoncatremarks(String lncr)
{
	valocators("locators_Intraocularpressure_Lefteye_Non-Contact_remarks").sendKeys(lncr);
}



public static void vasave() throws InterruptedException
{
	valocators("locators_casesheet_save_button").click();
	WebDriverWait wait=new WebDriverWait(driver, 35);
	wait.until(ExpectedConditions.visibilityOf(valocators("locators_casesheet_confirm_save_button")));
	Thread.sleep(3000);
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].scrollIntoView(true);", valocators("locators_casesheet_confirm_save_button"));
valocators("locators_casesheet_confirm_save_button").click();
}
public static void assigncons() throws InterruptedException
{
	WebDriverWait wait2=new WebDriverWait(driver, 35);
	wait2.until(ExpectedConditions.visibilityOf(valocators("locators_casesheet_confirm_casesheet_close"))).click();
	WebDriverWait wait=new WebDriverWait(driver, 35);
	wait.until(ExpectedConditions.visibilityOf(valocators("locators_casesheet_goto_appoinmentpage"))).click();
	Searchfilter.close();
	Thread.sleep(4000);
	Logintestpage.logout();
	driver.close();
}

//common functions
public static WebElement valocators(String xpath)
{
	return driver.findElement(By.xpath(locatorprob.getProperty(xpath)));	
}
public static List<WebElement> vadatalocators(String datalis)
{
	return driver.findElements(By.xpath(locatorprob.getProperty(datalis)));
}
//If Case sheet webelements are search 
/*public static void vaselectby(String datalis, WebElement webelement, String input)
{
	List<WebElement> data=vadatalocators(datalis);
	boolean r=false;
	for(int i=0;i<data.size();i++)
	{
		if(input.equalsIgnoreCase(data.get(i).getAttribute("value")))
		{
			webelement.clear();
			webelement.sendKeys(input);
			r=true;
			break;
		}
	}
	if(r==false)
	{
		Assert.fail("The input data is not present in this webelement");
	}
}*/
//If Case sheet webelements are Drop down
public static void vaselectby(WebElement element, String input)
{
	Select s=new Select(element);
	s.selectByVisibleText(input);
}
//If Case sheet are drop down getvalues
public static String sbdropdown(WebElement element)
{
	Select s=new Select(element);
	return s.getFirstSelectedOption().getAttribute("Value");
}
public static void faileva()
{
	Assert.fail("Right Values are not fetched with Left");
}
}
