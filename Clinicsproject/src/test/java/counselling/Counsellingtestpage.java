package counselling;
/**
'**************************************************************
'  Name        : Catract runner for consultation
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Sep 27, 2017
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

public class Counsellingtestpage extends Initializer{

public static int patward;//purpose of store the value only for bed selection locators
public static String agelim=null;
public static String patagecou=null;
public static String surgeryform;
private static boolean selectunit;
private static String patiid;
private static String patiappfrom;
private static String patiappto;
public static String surgeryname;

//Surgery details workflow
public static void patientidcou(String patientidcou) throws InterruptedException
{
	patiid=patientidcou;
	Searchfilter.patientidseacrh(patientidcou);
}
public static void patientappfrom(String patifrom) throws InterruptedException
{
	patiappfrom=patifrom;
	Searchfilter.appfromdate(patifrom);
}
public static void patientappto(String patito) throws InterruptedException
{
	patiappto=patito;
	Searchfilter.apptodate(patito);
}
public static void agelimitcou(String agelimit) throws IOException
{
	agelim=agelimit;
	counselprob();
	getmylocacounsel("Locators_worklist_patientid_link").click();
	WebDriverWait wait=new WebDriverWait(driver, 25);
	wait.until(ExpectedConditions.visibilityOf(getmylocacounsel("Locators_worklist_patientid_caseinfo_table1")));
	caseinfotable1();//find patient age
	getmylocacounsel("Locators_worklist_patientid_caseinfo_closebutton").click();
}
public static void surgerycontentcou(String continu, String parent) throws InterruptedException
{
	scrollconsell(getmylocacounsel("Locators_worklist_admission_icon"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", getmylocacounsel("Locators_worklist_surgerycontent_icon"));
WebDriverWait wait=new WebDriverWait(driver, 25);
wait.until(ExpectedConditions.visibilityOf(getmylocacounsel("Locators_worklist_surgerycontent_surgerycontentupload_link")));
getmylocacounsel("Locators_worklist_surgerycontent_surgerycontentupload_link").click();
String[] age=patagecou.split("\\s");
String[] ageli=agelim.split("\\s");
if(ageli[1].equalsIgnoreCase(age[1]))//check if age and agelimit text are same or not. ex: 15Years and 17Years 
{
	int agelimit=Integer.parseInt(ageli[0]);
	int ageno=Integer.parseInt(age[0]);
	if(ageno<agelimit)//check age ex:15 and 17
	{
		fillsurgerycontentform_counsell(continu, parent);//then give ask continue as yes or no
	}else {
		fillsurgyform(parent);//if age is above agelimit, then no need to ask
	}
}else
{
	fillsurgerycontentform_counsell(continu, parent);//then give ask continue as yes or no
}
}
public static void packcou() throws InterruptedException
{
	Thread.sleep(2000);
	scrollconsell(getmylocacounsel("Locators_worklist_admission_icon"));
	getmylocacounsel("Locators_worklist_addpackage_icon").click();
}
public static void validatedoctorinfo(String surtype, String surname, String eyetoope) throws InterruptedException
{
	surgeryname=surname;
	WebDriverWait wait=new WebDriverWait(driver, 25);
	wait.until(ExpectedConditions.visibilityOf(getmylocacounsel("Locators_addpackage_selectsurgery_Doctor_Surgerytype")));
	WebDriverWait wait1=new WebDriverWait(driver, 25);
	wait1.until(ExpectedConditions.visibilityOf(getmylocacounsel("Locators_addpackage_selectsurgery_Doctor_Surgeryname")));
	WebDriverWait wait2=new WebDriverWait(driver, 25);
	wait2.until(ExpectedConditions.visibilityOf(getmylocacounsel("Locators_addpackage_selectsurgery_Doctor_Eyetooperated")));
	Thread.sleep(3000);
	String docsurtype=getmylocacounsel("Locators_addpackage_selectsurgery_Doctor_Surgerytype").getText();
	String docsurname=getmylocacounsel("Locators_addpackage_selectsurgery_Doctor_Surgeryname").getText();
	String docsureye=getmylocacounsel("Locators_addpackage_selectsurgery_Doctor_Eyetooperated").getText();
	if(!surtype.equalsIgnoreCase(docsurtype) && !surname.equalsIgnoreCase(docsurname) && !eyetoope.equalsIgnoreCase(docsureye))
	{
		Assert.fail("Surgery type or surgery name or eye to operated fields are mismatched");
	}
}
public static void surgerynamecou() throws InterruptedException
{
	WebDriverWait wait=new WebDriverWait(driver, 35);
	wait.until(ExpectedConditions.visibilityOf(getmylocacounsel("Locators_addpackage_selectsurgery_surgeryname")));//datalist used in html so clear the field
	if(surgeryname.equalsIgnoreCase(getmylocacounsel("Locators_Package_Selectsurgery_packagename_datalist_dropdown").getAttribute("name")))
	{
	getmylocacounsel("Locators_addpackage_selectsurgery_savebutton").click();
	Thread.sleep(5000);
	WebDriverWait waitn=new WebDriverWait(driver, 30);
	waitn.until(ExpectedConditions.visibilityOf(getmylocacounsel("Locators_addpackage_selectsurgery_saveconfirmation"))).click();
	Thread.sleep(5000);
	Searchfilter.close();
	}
	else {
		Assert.fail("Surgery name is mismatched with input");
	}
	}
public static void IOLcou() throws InterruptedException//Click IOL in worklist
{
	Thread.sleep(3000);
	scrollconsell(getmylocacounsel("Locators_worklist_admission_icon"));
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOf(getmylocacounsel("Locators_worklist_IOL_icon"))).click();
}
public static void lenscou(String lense) throws InterruptedException//lense Name
{
	WebDriverWait wait=new WebDriverWait(driver, 35);
	wait.until(ExpectedConditions.visibilityOf(getmylocacounsel("Locators_purchase_IOL_lensname")));
List<WebElement> len=getalllocacoun("Locators_purchase_IOL_datalist_drop");
boolean r=false;
for (int i=0;i<len.size();i++)
{
	if(lense.equalsIgnoreCase(len.get(i).getAttribute("name")))
	{
		getmylocacounsel("Locators_purchase_IOL_lensname").sendKeys(lense);
		r=true;
		break;
	}
}
if(r==false)
{
	Assert.fail("Lense name is not present in IOL Name list");
}
}
public static void remarklencou(String remarks)
{
	getmylocacounsel("Locators_purchase_IOL_remarks").sendKeys(remarks);
}
public static void lenssavecou() throws InterruptedException
{
	getmylocacounsel("Locators_purchase_IOL_savebutton").click();
	Thread.sleep(1500);
	WebDriverWait wait=new WebDriverWait(driver, 35);
	wait.until(ExpectedConditions.elementToBeClickable(getmylocacounsel("Locators_purchase_IOL_saveconfirmation"))).click();
	Thread.sleep(3000);
	Searchfilter.close();
}
public static void admitlinkcou() throws InterruptedException, IOException//admission link in worklist
{
	Thread.sleep(3000);
	counselprob();
	scrollconsell(getmylocacounsel("Locators_worklist_admission_icon"));
	WebDriverWait wait=new WebDriverWait(driver, 25);
	wait.until(ExpectedConditions.visibilityOf(getmylocacounsel("Locators_worklist_admission_icon"))).click();
}
public static void unitcou(String unit)//Select the unit
{
	if(unit.isEmpty())
	{
		selectunit=false;
	}else {
		selectunit=true;
	}
	if(selectunit==true)
	{
WebDriverWait wait=new WebDriverWait(driver, 35);
wait.until(ExpectedConditions.visibilityOf(getmylocacounsel("Locators_admission_beddetails_unit")));
selectbyunit(getmylocacounsel("Locators_admission_beddetails_unit"), unit);
	}
	}
public static void wardsecou(String ward) throws InterruptedException//Select the ward
{
	if(selectunit==true)
	{
	Thread.sleep(2000);
	if("Deluxe Ward".equalsIgnoreCase(ward))
	{
		patward=1;
		getmylocacounsel("Locators_admission_beddetails_Deluxe_Ward").click();
	}else if ("Semi Deluxe Ward".equalsIgnoreCase(ward)) {
		patward=2;
		Thread.sleep(1000);
		getmylocacounsel("Locators_admission_beddetails_Semi_Deluxe_Ward").click();
	}else if ("Private Ward".equalsIgnoreCase(ward)) {
		patward=3;
		Thread.sleep(1000);
		getmylocacounsel("Locators_admission_beddetails_Private_Ward").click();
	}else if ("Free Male ward".equalsIgnoreCase(ward)) {
		patward=4;
		Thread.sleep(1000);
		getmylocacounsel("Locators_admission_beddetails_Free_Male_ward").click();
	}else if ("Free Female ward".equalsIgnoreCase(ward)) {
		patward=5;
		Thread.sleep(1000);
		getmylocacounsel("Locators_admission_beddetails_Free_Female_ward").click();
	}else if ("Paid Female ward".equalsIgnoreCase(ward)) {
		patward=6;
		Thread.sleep(1000);
		getmylocacounsel("Locators_admission_beddetails_Paid_Female_ward").click();
	}
	}
	}
public static void bedsecou()//Select the bed as in specify ward
{
	if(selectunit==true)
	{
		selectbedcounsel();
	}
}
public static void eyeoperateside(String bot, String sid)//Check the Which eye to be operate
{
	if("yes".equalsIgnoreCase(bot))
	{
		scrollconsell(getmylocacounsel("Locators_admission_Admission_Details_eye_operated"));
		selectbyunit(getmylocacounsel("Locators_admission_Admission_Details_eye_operated"), sid);
	}else if ("no".equalsIgnoreCase(bot)) {
		Select s=new Select(getmylocacounsel("Locators_admission_Admission_Details_eye_operated"));
		String eyevalue=s.getFirstSelectedOption().getText();
		if (getmylocacounsel("Locators_admission_Admission_Details_eye_operated").isEnabled()) {
			Assert.fail("Eye to operated field is not disabled");
		}
		if(!sid.equalsIgnoreCase(eyevalue))
		{
			Assert.fail("The input data is mismatched with eye to operated field");
		}
	}
	}
public static void admitandassign() throws InterruptedException//Click to admit the patient
{
	Thread.sleep(2000);
	scrollconsell(getmylocacounsel("Locators_admission_Admit_button"));
	Thread.sleep(1000);
	getmylocacounsel("Locators_admission_Admit_button").click();
	if(selectunit==false)
	{
		WebDriverWait wait=new WebDriverWait(driver, 35);
		wait.until(ExpectedConditions.visibilityOf(getmylocacounsel("Locators_admission_without_select_unit_alert_close"))).click();
		Thread.sleep(3000);
		Searchfilter.clicksearchlink();
		Searchfilter.patientidseacrh(patiid);
		Searchfilter.appfromdate(patiappfrom);
		Searchfilter.apptodate(patiappto);
		Searchfilter.searchbutton();
		Thread.sleep(4000);
		scrollconsell(getmylocacounsel("Locators_worklist_patientcaseselect_icon"));
		getmylocacounsel("Locators_worklist_patientcaseselect_icon").click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-250);", "");
		getmylocacounsel("Locators_worklist_Inprocess_AssignToOperation_button").click();
		WebDriverWait wait1=new WebDriverWait(driver, 35);
		wait1.until(ExpectedConditions.visibilityOf(getmylocacounsel("Locators_Counselling_assign_next_room_button"))).click();
		WebDriverWait wait2=new WebDriverWait(driver, 35);
		wait2.until(ExpectedConditions.visibilityOf(getmylocacounsel("Locators_admission_without_select_unit_alert_close"))).click();
	}else if (selectunit==true) {
		WebDriverWait wait=new WebDriverWait(driver, 35);
		wait.until(ExpectedConditions.visibilityOf(getmylocacounsel("Locators_Counselling_assign_next_room_button"))).click();
	}
	Thread.sleep(2000);
	Logintestpage.logout();
	driver.close();
}

//Package Workflow
public static void packagevalidate_docinfo(String docsurtype, String docsurname, String doceye) throws InterruptedException
{
	WebDriverWait wait=new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOf(getmylocacounsel("Locators_addpackage_selectsurgery_surgeryname")));
	Thread.sleep(2000);
	getmylocacounsel("Locators_Package_Selectsurgery_package_link").click();
	validatedoctorinfo(docsurtype, docsurname, doceye);
}
public static void packagename_package(String ppackage) throws InterruptedException
{
	Thread.sleep(2000);
	List<WebElement> datali=getalllocacoun("Locators_Package_Selectsurgery_packagename_datalist_dropdown");
	boolean r=false;
	for(int i=0;i<datali.size();i++)
	{
		if(datali.get(i).getAttribute("name").equalsIgnoreCase(ppackage))
		{
			datalist_package(getmylocacounsel("Locators_Package_Selectsurgery_packagename"), ppackage);
			r=true;
			break;
		}
	}
	if(r==false)
	{
		Assert.fail("Package name is mismatched with input");
	}
	Thread.sleep(2000);
	getmylocacounsel("Locators_addpackage_selectsurgery_savebutton").click();
	Thread.sleep(5000);
	WebDriverWait waitn=new WebDriverWait(driver, 30);
	waitn.until(ExpectedConditions.visibilityOf(getmylocacounsel("Locators_addpackage_selectsurgery_saveconfirmation"))).click();
	Thread.sleep(5000);
	Searchfilter.close();
}
public static void assign_package() throws InterruptedException
{
	Thread.sleep(3000);
	scrollconsell(getmylocacounsel("Locators_Package_Worklist_assign_icon"));
	getmylocacounsel("Locators_Package_Worklist_assign_icon").click();
	WebDriverWait wait=new WebDriverWait(driver, 35);
	wait.until(ExpectedConditions.visibilityOf(getmylocacounsel("Locators_Counselling_assign_next_room_button"))).click();
	Searchfilter.close();
	Thread.sleep(3000);
	Logintestpage.logout();
	driver.close();	
}

//POST OPERATION SCENARIO IN REPORT TAB
public static void reporttab_post() throws IOException
{
	counselprob();
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(getmylocacounsel("Locators_Post_operation_Worklist_Reported_Tab"))).click();
}
public static void VAicon_post() throws InterruptedException
{
	Thread.sleep(4000);
	scrollconsell(getmylocacounsel("Locators_Post_operation_Worklist_PostVA_icon"));
	getmylocacounsel("Locators_Post_operation_Worklist_PostVA_icon").click();
}
public static void VAunit_post(String postunit) throws InterruptedException
{
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(getmylocacounsel("Locators_Post_operation_PostVA_Unit_Snellen(Meters)")));
	Thread.sleep(2000);
	if("Snellen(Feet)".equalsIgnoreCase(postunit))
	{
		getmylocacounsel("Locators_Post_operation_PostVA_Unit_Snellen(Feet)").click();
	}else if ("Decimal".equalsIgnoreCase(postunit)) {
		getmylocacounsel("Locators_Post_operation_PostVA_Unit_Decimal").click();
	}else if ("Visual Angle".equalsIgnoreCase(postunit)) {
		getmylocacounsel("Locators_Post_operation_PostVA_Unit_VisualAngle").click();
	}else if ("Log MAR".equalsIgnoreCase(postunit)) {
		getmylocacounsel("Locators_Post_operation_PostVA_Unit_LogMAR").click();
	}else if ("Snellen(Meters)".equalsIgnoreCase(postunit)) {
		if (!getmylocacounsel("Locators_Post_operation_PostVA_Unit_Snellen(Meters)").isSelected()) {
			getmylocacounsel("Locators_Post_operation_PostVA_Unit_Snellen(Meters)").click();
		}
	}
	Thread.sleep(1000);
}
public static void RightUAdistance_post(String postruad)
{
	selectbyunit(getmylocacounsel("Locators_Post_operation_PostVA_RightUnaided_Distance"), postruad);
}
public static void RightUAnear_post(String postruan)
{
	selectbyunit(getmylocacounsel("Locators_Post_operation_PostVA_RightUnaided_Near"), postruan);
}
public static void LeftUAdistance_post(String postluad)
{
	selectbyunit(getmylocacounsel("Locators_Post_operation_PostVA_LeftUnaided_Distance"), postluad);
}
public static void LeftUAnear_post(String postluan)
{
	selectbyunit(getmylocacounsel("Locators_Post_operation_PostVA_LeftUnaided_Near"), postluan);
}
public static void RightAdistance_post(String postrad)
{
	selectbyunit(getmylocacounsel("Locators_Post_operation_PostVA_Rightaided_Distance"), postrad);
}
public static void RightAnear_post(String postran)
{
	selectbyunit(getmylocacounsel("Locators_Post_operation_PostVA_Rightaided_Near"), postran);
}
public static void LeftAdistance_post(String postlad)
{
	selectbyunit(getmylocacounsel("Locators_Post_operation_PostVA_Leftaided_Distance"), postlad);
}
public static void LeftAnear_post(String postlan)
{
	selectbyunit(getmylocacounsel("Locators_Post_operation_PostVA_Leftaided_Near"), postlan);
}
public static void Rightpinhole_post(String postrpin)
{
	selectbyunit(getmylocacounsel("Locators_Post_operation_PostVA_Right_pinhole"), postrpin);
}
public static void Leftpinhole_post(String postlpin)
{
	selectbyunit(getmylocacounsel("Locators_Post_operation_PostVA_Left_pinhole"), postlpin);
}
public static void VAsave_post()
{
	getmylocacounsel("Locators_Post_operation_PostVA_Save_button").click();
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(getmylocacounsel("Locators_Post_operation_PostVA_Alert_close"))).click();
}
public static void Medicineicon_post() throws InterruptedException
{
	Thread.sleep(2000);
	scrollconsell(getmylocacounsel("Locators_Post_operation_PostVA_worklist_medicinedrugs_icon"));
	getmylocacounsel("Locators_Post_operation_PostVA_worklist_medicinedrugs_icon").click();
	Thread.sleep(1000);
}
public static void Medicinetitle_post(String postmedicine)
{
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(getmylocacounsel("Locators_Post_operation_PostVA_medicine_templateTitile_drop")));
	selectbyunit(getmylocacounsel("Locators_Post_operation_PostVA_medicine_templateTitile_drop"), postmedicine);
}
public static void Savemedicine_post() throws InterruptedException
{
	Thread.sleep(2000);
	getmylocacounsel("Locators_Post_operation_PostVA_medicine_save_button").click();
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(getmylocacounsel("Locators_Post_operation_PostVA_medicine_Alert_close_button"))).click();
	Thread.sleep(2000);
	Logintestpage.logout();
	driver.close();
}



//Common functions for counseling
public static void selectbyunit(WebElement ele, String un)
{
	Select s=new Select(ele);
	s.selectByVisibleText(un);
}
public static void counselprob() throws IOException
{
	f=new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"Alllocators"+File.separator+"Counselling.properties"));
locatorprob=new Properties();
locatorprob.load(f);
}
public static WebElement getmylocacounsel(String xpath)
{
	return driver.findElement(By.xpath(locatorprob.getProperty(xpath)));
}
public static List<WebElement> getalllocacoun(String xpath)
{
	return driver.findElements(By.xpath(locatorprob.getProperty(xpath)));
}
public static void scrollconsell(WebElement ele)
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);", ele);
}
public static void caseinfotable1()//find patient age in patient case information table
{
	WebElement table=getmylocacounsel("Locators_worklist_patientid_caseinfo_table1");
	List<WebElement> row=table.findElements(By.tagName("tr"));
	for(int i=0;i<row.size();i++)
	{
		String head=row.get(i).findElement(By.tagName("th")).getText();
		if(head.equalsIgnoreCase("Age"))
		{
			patagecou=row.get(i).findElement(By.tagName("td")).getText();
			break;
		}
	}
}
public static void selectbedcounsel()
{
	String ret=".//img[starts-with(@id,'img_Status_"+patward+"_')]";
	List<WebElement> bed=driver.findElements(By.xpath(ret));
	for (int i=0;i<bed.size();i++)
	{
		if(bed.get(i).getAttribute("class").equals("green"))
		{
			bed.get(i).click();
			break;
		}
	}
}
public static void fillsurgerycontentform_counsell(String contine, String parent)
{
	WebDriverWait wait=new WebDriverWait(driver, 15);
	wait.until(ExpectedConditions.visibilityOf(getmylocacounsel("Locators_worklist_surgerycontent_agelimit_confirmation_alert")));
	if(contine.equalsIgnoreCase("yes"))
	{
		getmylocacounsel("Locators_worklist_surgerycontent_agelimit_confirmation_accept").click();
		fillsurgyform(parent);
	}else
	{
		getmylocacounsel("Locators_worklist_surgerycontent_agelimit_confirmation_decline").click();
		getmylocacounsel("Locators_worklist_surgerycontent_surgerycontentupload_close").click();
	}
}
public static void fillsurgyform(String parent)
{
	scrollconsell(getmylocacounsel("Locators_worklist_surgerycontent_form_parent_name"));
	getmylocacounsel("Locators_worklist_surgerycontent_form_parent_name").sendKeys(parent);
	scrollconsell(getmylocacounsel("Locators_worklist_surgerycontent_surgerycontentupload_saveandupload_button"));
	getmylocacounsel("Locators_worklist_surgerycontent_surgerycontentupload_saveandupload_button").click();
	Searchfilter.close();
}
public static void datalist_package(WebElement ele, String data) throws InterruptedException
{
	String[] str=data.split("\\s");
	for(int i=0;i<str.length;i++)
	{
		char[] ch=str[i].toCharArray();
		StringBuffer first=new StringBuffer();
		StringBuffer last=new StringBuffer();
		for(int j=0;j<ch.length;j++)
		{
			if(j==ch.length-1)
			{
				last.append(ch[j]);
			}else {
				first.append(ch[j]);
			}
		}
		if(i==str.length-1)
		{
			ele.sendKeys(first);
			Thread.sleep(4000);
			ele.sendKeys(last);
		}else {
			ele.sendKeys(first);
			ele.sendKeys(last);
			ele.sendKeys(" ");
			Thread.sleep(2000);
			first=null;
			last=null;
		}
	}	
}
}

