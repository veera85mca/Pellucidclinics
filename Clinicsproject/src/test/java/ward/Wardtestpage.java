package ward;
/**
'**************************************************************
'  Name        : Ward pageobject
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Oct 9, 2017
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

import counselling.Counsellingtestpage;
import generationreport.Searchfilter;
import login.Initializer;
import login.Logintestpage;
import registration.Patientregispage;

public class Wardtestpage extends Initializer{

private static String wardunit;
//*Pre-operative Examination Details*//
public static void patientidward(String Patientid) throws InterruptedException
{
	Patientregispage.patientid=Patientid;
	Searchfilter.patientidseacrh(Patientid);
}
public static void selectward(String war) throws IOException//select ward for search the patient
{
	wardunit=war;
	wardproperties();
	WebDriverWait wait=new WebDriverWait(driver, 25);
	wait.until(ExpectedConditions.elementToBeClickable(locatorward("Locators_worklist_Ward_Deluxe")));
	//wait.until(ExpectedConditions.visibilityOf(locatorward("Locators_worklist_Ward_Deluxe")));
	if("Semi Deluxe Ward".equalsIgnoreCase(war))
	{
		locatorward("Locators_worklist_Ward_Semideluxe").click();
	}else if ("Private Ward".equalsIgnoreCase(war)) {
		locatorward("Locators_worklist_Ward_Private").click();
	}else if ("Free Male ward".equalsIgnoreCase(war)) {
		locatorward("Locators_worklist_Ward_Freemale").click();
	}else if ("Free Female ward".equalsIgnoreCase(war)) {
		locatorward("Locators_worklist_Ward_Freefemale").click();
	}else if ("Paid Female ward".equalsIgnoreCase(war)) {
		locatorward("Locators_worklist_Ward_Paidfemale").click();
	}
}
public static void anessecondform() throws IOException//Click Anesthesia Consent in worklist
{
	wardproperties();
	scrollhori(locatorward("Locators_worklist_Anesthesia_Consent_icon"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", locatorward("Locators_worklist_Anesthesia_Consent_icon"));
	//locatorward("Locators_worklist_Anesthesia_Consent_icon").click();
}
public static void fillanesthesiaward(String physician)//upload Anesthesia Consent form
{
	WebDriverWait wait=new WebDriverWait(driver, 25);
	wait.until(ExpectedConditions.visibilityOf(locatorward("Locators_Anesthesia_Consent_formfill_openlink"))).click();
	WebDriverWait wait1=new WebDriverWait(driver, 25);
	wait1.until(ExpectedConditions.visibilityOf(locatorward("Locators_Anesthesia_Consent_form_header")));
	locatorward("Locators_Anesthesia_Consent_form_Physician_name_text").sendKeys(physician);
	locatorward("Locators_Anesthesia_Consent_form_Save_button").click();
	close();
}

public static void preoperativeicon() throws InterruptedException//Preoperation info link in worklist 
{
	scrollhori(locatorward("Locators_worklist_Preoperativeexam_icon"));
	Thread.sleep(4000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", locatorward("Locators_worklist_Preoperativeexam_icon"));
	//locatorward("Locators_worklist_Preoperativeexam_icon").click();
	Thread.sleep(4000);
	WebDriverWait wait=new WebDriverWait(driver, 35);
	wait.until(ExpectedConditions.visibilityOf(locatorward("Locators_Preoperativeexam_patientdetails_patientid")));
	if(!locatorward("Locators_Preoperativeexam_patientdetails_patientid").getAttribute("value").equals(Patientregispage.patientid))
	{
		Assert.fail("Patient id mismatched in pre operative examination");
	}
}
public static void bslblood(Integer bslmax, Integer bslmin)
{
	if(bslmax > bslmin)
	{
	selectoptcom(locatorward("Locators_Preoperativeexam_Bloodreport_BSL_max"), bslmax);
	selectoptcom(locatorward("Locators_Preoperativeexam_Bloodreport_BSL_min"), bslmin);
	}else {
		Assert.fail("BSL minimum value is greater than maximum value");
	}
}
public static void hbblood(Integer hbmax, String hbmin)
{
selectoptcom(locatorward("Locators_Preoperativeexam_Bloodreport_HB_max"), hbmax);
selectopt(locatorward("Locators_Preoperativeexam_Bloodreport_HB_min"), hbmin);
}
public static void rsexam(String rsvalue)
{
	locatorward("Locators_Preoperativeexam_Examination_Rs_Text").sendKeys(rsvalue);
}
public static void cvcexam(String cvcvalue)
{
	locatorward("Locators_Preoperativeexam_Examination_CVC_Text").sendKeys(cvcvalue);
}
public static void cnsexam(String cnsvalue)
{
	locatorward("Locators_Preoperativeexam_Examination_CNS_Text").sendKeys(cnsvalue);
}
public static void paexam(String pavalue)
{
	locatorward("Locators_Preoperativeexam_Examination_PA_Text").sendKeys(pavalue);
}
public static void tempexam(Integer temp, String celsi)
{
selectoptcom(locatorward("Locators_Preoperativeexam_Examination_Temp_max"), temp);
selectopt(locatorward("Locators_Preoperativeexam_Examination_Temp_min"), celsi);
}
public static void pulseexam(String puls)
{
selectopt(locatorward("Locators_Preoperativeexam_Examination_Pulse"), puls);
}
public static void bpexam(Integer bpmax, Integer bpmin)
{
	if(bpmax > bpmin)
	{
		selectoptcom(locatorward("Locators_Preoperativeexam_Examination_Bp_max"), bpmax);
		selectoptcom(locatorward("Locators_Preoperativeexam_Examination_Bp_min"), bpmin);
	}else {
		Assert.fail("BP minimum value is greater than maximum value");
	}
}
public static void rrexam(Integer rrmax, Integer rrmin)
{
	if(rrmax > rrmin)
	{
		selectoptcom(locatorward("Locators_Preoperativeexam_Examination_RR_max"), rrmax);
		selectoptcom(locatorward("Locators_Preoperativeexam_Examination_RR_min"), rrmin);
	}else {
		Assert.fail("BP minimum value is greater than maximum value");
	}
}
public static void ecgexam(String ecg)
{
	locatorward("Locators_Preoperativeexam_Examination_ECG_Finding").sendKeys(ecg);
}
public static void sugeryadv(String fit)
{
	if("yes".equalsIgnoreCase(fit))
	{
		locatorward("Locators_Preoperativeexam_Advice_Fitforsurgery").click();
	}
}
public static void phyopadv(String phy)
{
	if("yes".equalsIgnoreCase(phy))
	{
		locatorward("Locators_Preoperativeexam_Advice_Physicianopinion").click();
	}
}
public static void treatadv(String trea, String adv)
{
	if("yes".equalsIgnoreCase(trea))
	{
		locatorward("Locators_Preoperativeexam_Advice_Treatment").click();
		locatorward("Locators_Preoperativeexam_Advice_Treatmentadviced").sendKeys(adv);
	}
}
public static void savepreopr()//Save Pre-operation info 
{
	scrollhori(locatorward("Locators_Preoperativeexam_Save_button"));
	locatorward("Locators_Preoperativeexam_Save_button").click();
	close();
}
public static void postponeopeward(String postpone, String postdate, String posttime, String reason) throws InterruptedException, IOException
{
	Thread.sleep(4000);
	if("yes".equalsIgnoreCase(postpone))
	{
		scrollhori(locatorward("Locators_worklist_patient_select_checkbox"));
		locatorward("Locators_worklist_patient_select_checkbox").click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-250);", "");
		locatorward("Locators_worklist_postpone_operation_button").click();
		WebDriverWait wait=new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.visibilityOf(locatorward("Locators_ward_bed_admissiondetails_operationdate_icon")));
		datepick(postdate);
		operationtimeward(posttime);
		locatorward("Locators_postpone_operation_Reason").sendKeys(reason);
		locatorward("Locators_postpone_operation_postponebutton").click();
		WebDriverWait wait1=new WebDriverWait(driver, 25);
		wait1.until(ExpectedConditions.visibilityOf(locatorward("Locators_ward_common_alert_close_button"))).click();
	}
}

public static void assignward(String assign) throws InterruptedException
{
	Thread.sleep(4000);
if("yes".equalsIgnoreCase(assign))
{
	scrollhori(locatorward("Locators_worklist_patient_assign_icon"));
	locatorward("Locators_worklist_patient_assign_icon").click();
	Thread.sleep(3000);
	if(locatorward("Locators_worklist_patient_assign_postponedpatient_confirmation_alert").isDisplayed())//if case is postponed, then alert msg click to "yes"
	{
		locatorward("Locators_worklist_patient_assign_postponedpatient_confirmation_alert").click();
	}
	WebDriverWait wait= new WebDriverWait(driver, 45);
	wait.until(ExpectedConditions.visibilityOf(locatorward("Locators_worklist_patient_assignroom_button"))).click();
	close();
	Thread.sleep(4000);
	Logintestpage.logout();
driver.close();
}else {
	Thread.sleep(4000);
	Logintestpage.logout();
driver.close();
}
}



//**PACKAGE Details and Postponed in ward**//
public static void selectbedward() throws IOException, InterruptedException
{
		Counsellingtestpage.counselprob();
		scrollhori(Counsellingtestpage.getmylocacounsel("Locators_worklist_admission_icon"));
		Counsellingtestpage.getmylocacounsel("Locators_worklist_admission_icon").click();
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(Counsellingtestpage.getmylocacounsel("Locators_admission_beddetails_unit")));
		wardproperties();
		List<WebElement> ward=alllocatorward("Locators_Admission_Ward_Listofwards");
		for(int i=0;i<ward.size();i++)
		{
			if(ward.get(i).isSelected())
			{
				Counsellingtestpage.patward=i+1;
			Counsellingtestpage.selectbedcounsel();
			break;
			}	
		}
}
public static void eyetooperateward(String wboth, String weye) throws IOException
{
	Counsellingtestpage.counselprob();
	scrollhori(Counsellingtestpage.getmylocacounsel("Locators_admission_Admission_Details_eye_operated"));
	if("yes".equalsIgnoreCase(wboth))
	{
		selectopt(Counsellingtestpage.getmylocacounsel("Locators_admission_Admission_Details_eye_operated"), weye);
	}else if ("no".equalsIgnoreCase(wboth)) {
		Select s=new Select(Counsellingtestpage.getmylocacounsel("Locators_admission_Admission_Details_eye_operated"));
		String eyevalue=s.getFirstSelectedOption().getText();
		if (Counsellingtestpage.getmylocacounsel("Locators_admission_Admission_Details_eye_operated").isEnabled()) {
			Assert.fail("Eye to operated field is not disabled");
		}
		if(!weye.equalsIgnoreCase(eyevalue))
		{
			Assert.fail("The input data is mismatched with eye to operated field");
		}
	}
}
public static void datepick(String date) throws InterruptedException, IOException
{
wardproperties();
locatorward("Locators_ward_bed_admissiondetails_operationdate_icon").click();
Thread.sleep(3000);
WebDriverWait wait3=new WebDriverWait(driver, 25);
wait3.until(ExpectedConditions.visibilityOf(locatorward("Locators_ward_bed_admissiondetails_operationdate_currentdate"))).click();
/*JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].click();", locatorward("Locators_ward_bed_admissiondetails_operationdate_currentdate"));*/
WebDriverWait wait1=new WebDriverWait(driver, 25);
wait1.until(ExpectedConditions.visibilityOf(locatorward("Locators_ward_bed_admissiondetails_operationdate_dayscurrentcenter")));
JavascriptExecutor js1=(JavascriptExecutor)driver;
js1.executeScript("arguments[0].click();", locatorward("Locators_ward_bed_admissiondetails_operationdate_dayscurrentcenter"));
WebDriverWait wait2=new WebDriverWait(driver, 25);
wait2.until(ExpectedConditions.visibilityOf(locatorward("Locators_ward_bed_admissiondetails_operationdate_monthscurrentcenter")));
JavascriptExecutor js2=(JavascriptExecutor)driver;
js2.executeScript("arguments[0].click();", locatorward("Locators_ward_bed_admissiondetails_operationdate_monthscurrentcenter"));
String pick[]=date.split("\\s");//split the dates and store in array
//select the years
List<WebElement> first=alllocatorward("Locators_ward_bed_admissiondetails_operationdate_yearselection");
for(int i=0;i<first.size();i++)
{
	if(first.get(i).getText().equalsIgnoreCase(pick[2]))
	{
		first.get(i).click();
		break;
	}
}
//select the month
List<WebElement> mth=alllocatorward("Locators_ward_bed_admissiondetails_operationdate_monthselection");
for(int i=0;i<mth.size();i++)
{
	if(mth.get(i).getText().equalsIgnoreCase(pick[1]))
	{
		mth.get(i).click();
		break;
	}
}
//select the day
WebDriverWait wait4=new WebDriverWait(driver, 25);
wait4.until(ExpectedConditions.visibilityOf(locatorward("Locators_ward_bed_admissiondetails_operationdate_dayselection")));
WebElement table=locatorward("Locators_ward_bed_admissiondetails_operationdate_dayselection");
boolean ran;
List<WebElement> r=table.findElements(By.tagName("tr"));
for (int i=0;i<r.size();i++)
{
	ran=false;
	List<WebElement> c=r.get(i).findElements(By.tagName("td"));
	for (int j=0;j<c.size();j++)
	{
		String chadate=c.get(j).getAttribute("class");
		if(c.get(j).getText().equalsIgnoreCase(pick[0]) && (chadate.equalsIgnoreCase("day") || chadate.equalsIgnoreCase("day active")))
		{
			c.get(j).click();
			ran=true;
			break;
		}
	}
	if(ran==true)
	{
		break;
	}
}
Thread.sleep(4000);
}
public static void operationtimeward(String woperationtime)
{
	WebElement time=locatorward("Locators_ward_bed_admissiondetails_operationtime");
	List<WebElement> tr=time.findElements(By.tagName("tr"));
	boolean ti;
	for(int i=0;i<tr.size();i++)
	{
		ti=false;
		List<WebElement> td=tr.get(i).findElements(By.tagName("td"));
			for(int j=0;j<td.size();j++)
			{
				if(td.get(j).getText().equalsIgnoreCase(woperationtime))
				{
					td.get(j).click();
					ti=true;
					break;
				}
			}
			if(ti==true)
			{
				break;
			}
	}
	scrollhori(locatorward("Locators_ward_bed_admissiondetails_operation_dateandtime_okbutton"));
	locatorward("Locators_ward_bed_admissiondetails_operation_dateandtime_okbutton").click();
}
public static void admitandassignward() throws IOException, InterruptedException
{
	Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", locatorward("Locators_ward_bed_admissiondetails_Admitbutton"));
	WebDriverWait wait1= new WebDriverWait(driver, 45);
	wait1.until(ExpectedConditions.visibilityOf(locatorward("Locators_worklist_patient_assignroom_button"))).click();
	Thread.sleep(4000);
	Logintestpage.logout();
	driver.close();	
}




//common methods
public static void wardproperties() throws IOException
{
	f=new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"Alllocators"+File.separator+"Wardroom.properties"));
	locatorprob=new Properties();
	locatorprob.load(f);
}
public static WebElement locatorward(String xpath)
{
	return driver.findElement(By.xpath(locatorprob.getProperty(xpath)));
}
public static List<WebElement> alllocatorward(String xpath)
{
	return driver.findElements(By.xpath(locatorprob.getProperty(xpath)));
}
public static void scrollhori(WebElement ele)
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);", ele);
}
public static void close()
{
	WebDriverWait wait1=new WebDriverWait(driver, 40);
	wait1.until(ExpectedConditions.visibilityOf(locatorward("Locators_ward_common_alert_Title")));
	locatorward("Locators_ward_common_alert_close_button").click();
}
public static void selectoptcom(WebElement ele, Integer value)
{
	String maxmin=Integer.toString(value);
	selectopt(ele, maxmin);
}
public static void selectopt(WebElement element, String vari)
{
	Select s=new Select(element);
	s.selectByVisibleText(vari);
}
}
