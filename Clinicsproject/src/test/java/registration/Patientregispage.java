package registration;
/**
'**************************************************************
'  Name        : patient registration
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Sep 7, 2017
'--------------------------------------------------------------
'  Mod Date    :    
'  Mod By      : 
'  Change Made : 
'**************************************************************
**/
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import consultationretinal.Consultationretinaltestpage;
import labregistration.Labpatientregpage;
import login.Initializer;
import login.Logintestpage;

public class Patientregispage extends Initializer{

private static String rbrowse;
public static String patientid;
public static String patsex;
public static String patmartial;
public static String masal="Mr";
public static String fesal="Ms";
public static String femsal="Mrs";
public static String babysal="Baby";
private static String patinage;
private static String patiidtype;
public static int patage;
public static String salution;
protected static String billforage;
protected static String billpatitype;
public static String visitpatientno;
private static int agelimitation;
private static String saveassign;

public static void regbrowse(String browe)
{
	rbrowse=browe;
	Logintestpage.browser(browe);
}
public static void clickpatreg() throws IOException
{
	f=new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"Alllocators"+File.separator+"Patientregislocators.properties"));
	locatorprob = new Properties();
	locatorprob.load(f);
	WebDriverWait wait = new WebDriverWait(driver, 45);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Registration"))).click();
}
public static void patipriority(String prior)//Priority
{
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(getlocators("Patient_Registration_Priority")));
	WebElement pri=getlocators("Patient_Registration_Priority");
	Labpatientregpage.selectby(pri, prior);
}
public static void patietid(String auto, String id) throws InterruptedException
{
	WebDriverWait wait = new WebDriverWait(driver, 45);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt_PatientId")));
	Thread.sleep(2000);
//wait.until(ExpectedConditions.visibilityOf(paiid));
	if("yes".equalsIgnoreCase(auto))
	{
		WebElement paiid=getlocators("Patient_Registration_PaientID");
		patientid=paiid.getAttribute("value");
	}else if ("no".equalsIgnoreCase(auto)) {
		getlocators("Patient_Registration_PaientID").sendKeys(id);
		patientid=id;
	}
}
public static void namefirst(String first)
{
	getlocators("Patient_Registration_First_Name").sendKeys(first);
}
public static void namemiddle(String middle)
{
	getlocators("Patient_Registration_Middle_Name").sendKeys(middle);
}
public static void namelast(String last)
{
	getlocators("Patient_Registration_Last_name").sendKeys(last);
}
public static void patientage(String age)//age code
{
WebElement paage=getlocators("Patient_Registration_Age");
Select s=new Select(paage);
s.selectByVisibleText(age);
billforage=s.getFirstSelectedOption().getText();
patinage=paage.getAttribute("value");
patage=Integer.parseInt(patinage);
/*WebElement paage=getlocators("Patient_Registration_Age");
Labpatientregpage.selectby(paage, age);
patinage=paage.getAttribute("value");
patage=Integer.parseInt(patinage);
billforage=paage.getText();
*/
//System.out.println(+patage);
}
public static void patientsex(String sex)//sex
{
	patsex=sex;
//System.out.println(patsex);
	WebElement pasex=getlocators("Patient_Registration_Sex");
	Labpatientregpage.selectby(pasex, sex);
}
public static void patientmartial(String martial)//martial status
{
	patmartial=martial;
	//System.out.println(patmartial);
	WebElement pamarti=getlocators("Patient_Registration_Marital_status");
	Labpatientregpage.selectby(pamarti, martial);
}
public static void pasalution(String salut)//salutation
{
WebElement pasau=getlocators("Patient_Registration_Salutation");
if(patage<=7 || patage<=-1){
	if(!salut.equalsIgnoreCase(pasau.getAttribute("value")))
	{
		Assert.fail("Salutation is not automatically select as Baby");
	}
}else if ("Male".equals(patsex)) {
	if(!salut.equalsIgnoreCase(pasau.getAttribute("value")))
	{
		Assert.fail("Salutation is not automatically select as Mr");
	}
}else if ("Female".equals(patsex) && "Single".equals(patmartial)) {
	if(!salut.equalsIgnoreCase(pasau.getAttribute("value")))
	{
		Assert.fail("Salutation is not automatically select as Ms");
	}
}else if ("Female".equals(patsex) && "Married".equals(patmartial)) {
		if(!salut.equalsIgnoreCase(pasau.getAttribute("value")))
		{
			Assert.fail("Salutation is not automatically select as Mrs");
		}
	}else {
		Labpatientregpage.selectby(pasau, salut);
	}
WebElement salu=getlocators("Patient_Registration_Salutation");
salution=salu.getAttribute("value");

	//getlocators("Patient_Registration_Salutation").sendKeys(salut);
}
public static void patimrno(String mrno)//MRNo
{
	getlocators("Patient_Registration_MR_number").sendKeys(mrno);
}
public static void patimobile(String mobleno)//Contact No
{
	Pattern p=Pattern.compile("[0-9]*");
	Matcher m=p.matcher(mobleno);
	if(m.matches() && 10==mobleno.length())
	{
		getlocators("Patient_Registration_Contact_no").sendKeys(mobleno);
	}else
	{
		Assert.fail("Check mobile no might be alphabet or length below 10 digits");
	}	
}
public static void patiemailid(String emailid)//Email id
{
getlocators("Patient_Registration_emailid").sendKeys(emailid);	
}
public static void patiidtype(String idtype)//Idtype
{
patiidtype=idtype;
WebElement type=getlocators("Patient_Registration_typeofidcard");
Labpatientregpage.selectby(type, idtype);
}
public static void patiidno(String idno)//Idno
{
	if(!"No Photo ID".equals(patiidtype))
	{
	getlocators("Patient_Registration_typeofidcard_no").sendKeys(idno);
	}
	else
	{
		
	}
	}
public static void patiethenic(String ethenic)//Ethenic
{
	WebElement ethi=getlocators("Patient_Registration_ethenic_group");
	Labpatientregpage.selectby(ethi, ethenic);
}
public static void patiinscom(String insurecom)
{
	Labpatientregpage.selectby(getlocators("Patient_Registration_Insurance_company"), insurecom);
}
public static void patiinsupolicyname(String policyname)
{
	Labpatientregpage.selectby(getlocators("Patient_Registration_Policy_name"), policyname);
}
public static void patiinsuno(String insurno)
{
	getlocators("Patient_Registration_Insurance_number").sendKeys(insurno);
}
public static void patiinsurname(String insurname)
{
	getlocators("Patient_Registration_Nameofinsurer").sendKeys(insurname);
}

//general tab in registration
public static void patinative(String nativ)
{
	getlocators("Patient_Registration_generaltab_link").click();
	WebDriverWait wait=new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOf(getlocators("Patient_Registration_generaltab_Bloodgroup")));
	getlocators("Patient_Registration_generaltab_Native").sendKeys(nativ);
}
public static void patioccupy(String occupy)
{
	getlocators("Patient_Registration_generaltab_Occupation").sendKeys(occupy);
}
public static void patibloodg(String bloodgb)
{
	WebElement bg=getlocators("Patient_Registration_generaltab_Bloodgroup");
	Labpatientregpage.selectby(bg, bloodgb);
}
public static void patiweight(String weigh)
{
	getlocators("Patient_Registration_generaltab_weight").sendKeys(weigh);
}
public static void patination(String nation)
{
	getlocators("Patient_Registration_generaltab_Nationality").sendKeys(nation);
}

//address tab in registration
public static void paticountry(String country)
{
	getlocators("Patient_Registration_addresstab_link").click();
	WebDriverWait wait=new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOf(getlocators("Patient_Registration_addresstab_Country")));
	Labpatientregpage.selectby(getlocators("Patient_Registration_addresstab_Country"), country);
}
public static void patistate(String state)
{
	Labpatientregpage.selectby(getlocators("Patient_Registration_addresstab_State"), state);	
}
public static void patiCity(String city)
{
	getlocators("Patient_Registration_addresstab_City").sendKeys(city);
}
public static void patistreet(String Street)
{
	getlocators("Patient_Registration_addresstab_Street").sendKeys(Street);
}
public static void patizipcode(String zipcode)
{
	getlocators("Patient_Registration_addresstab_Zipcode").sendKeys(zipcode);
}
public static void patiprivilegeno(String privilegeno)
{
	getlocators("Patient_Registration_addresstab_Privilege_cardno").sendKeys(privilegeno);
}
public static void patialtermno(String altermno)
{
	getlocators("Patient_Registration_addresstab_Altermobileno").sendKeys(altermno);
}



//others in registration
public static void patitype()//Patient Type
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);", getlocators("Patient_Registration_Save_button"));
	WebElement pattye=getlocators("Patient_Registration_Patient_type");
	Select s=new Select(pattye);
	//s.selectByVisibleText(patienttype);
	billpatitype=s.getFirstSelectedOption().getText();
	/*if(patage<=5 || patage<=-1)
	{
		WebElement pattye=getlocators("Patient_Registration_Patient_type");
		Select s=new Select(pattye);
		//s.selectByVisibleText(patienttype);
		String paty=s.getFirstSelectedOption().getText();
			if(paty.equalsIgnoreCase(type))//fail my test case "Below 5 Years" is not present based on age
			{
				billpatitype=type;//store value of given input & attribute selected value if same 
			}else{
				failreg();
			}
	}else
	{
	WebElement pattye=getlocators("Patient_Registration_Patient_type");
	Select s=new Select(pattye);
	s.selectByVisibleText(type);
	billpatitype=s.getFirstSelectedOption().getText();
	}*/
}
public static void patireferraltype(String refertype, String refername)
{
	if(refertype.equalsIgnoreCase("Hospital"))
	{
		getlocators("Patient_Registration_Referraltype_hospital").click();
		WebDriverWait wait=new WebDriverWait(driver, 8);
		wait.until(ExpectedConditions.visibilityOf(getlocators("Patient_Registration_Referraltype_name_dropdown_and_textbox")));
		Labpatientregpage.selectby(getlocators("Patient_Registration_Referraltype_name_dropdown_and_textbox"), refername);
	}else if (refertype.equalsIgnoreCase("Ref Physician")) {
		getlocators("Patient_Registration_Referraltype_refphysician").click();
		WebDriverWait wait=new WebDriverWait(driver, 8);
		wait.until(ExpectedConditions.visibilityOf(getlocators("Patient_Registration_Referraltype_name_dropdown_and_textbox")));
		Labpatientregpage.selectby(getlocators("Patient_Registration_Referraltype_name_dropdown_and_textbox"), refername);
	}else if (refertype.equalsIgnoreCase("Vision center")) {
		getlocators("Patient_Registration_Referraltype_visioncenter").click();
		WebDriverWait wait=new WebDriverWait(driver, 8);
		wait.until(ExpectedConditions.visibilityOf(getlocators("Patient_Registration_Referraltype_name_dropdown_and_textbox")));
		Labpatientregpage.selectby(getlocators("Patient_Registration_Referraltype_name_dropdown_and_textbox"), refername);
	}else if (refertype.equalsIgnoreCase("Others")) {
		getlocators("Patient_Registration_Referraltype_others").click();
		WebDriverWait wait=new WebDriverWait(driver, 8);
		wait.until(ExpectedConditions.visibilityOf(getlocators("Patient_Registration_Referraltype_name_dropdown_and_textbox")));
		getlocators("Patient_Registration_Referraltype_name_dropdown_and_textbox").sendKeys(refername);
	}else if (refertype.equalsIgnoreCase("family and friends")) {
		getlocators("Patient_Registration_Referraltype_familyandfriends").click();
	}else if (refertype.equalsIgnoreCase("Self")) {
		if (!getlocators("Patient_Registration_Referraltype_self").getAttribute("class").equalsIgnoreCase("checked")) {
			Assert.fail("Self referral type is not selected as default");
	}
	}
}
public static void patiimage() throws IOException, InterruptedException
{
getlocators("Patient_Registration_Patient_imageupload1").click();
WebDriverWait wait=new WebDriverWait(driver, 35);
wait.until(ExpectedConditions.visibilityOf(getlocators("Patient_Registration_Patient_imageupload2"))).click();
if(rbrowse.equalsIgnoreCase("Firefox"))
{
	Runtime.getRuntime().exec(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"registrationfeature"+File.separator+"patientautoit"+File.separator+"patreg.exe");
}else if (rbrowse.equalsIgnoreCase("Chrome")) {
	Runtime.getRuntime().exec(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"registrationfeature"+File.separator+"patientautoit"+File.separator+"Chromepatreg.exe");
	Thread.sleep(7000);
}
}
public static void patistanding(String stand)
{
	getlocators("Patient_Registration_Standing_order").sendKeys(stand);
}
public static void patiprocedure(String procedure) throws InterruptedException//Procedure
{
	//driver.findElement(By.cssSelector(".select2-arrow>b")).click();
	/*getlocators("Patient_Registration_Procedure_name").click();
	WebDriverWait wait =new WebDriverWait(driver, 15);
	wait.until(ExpectedConditions.visibilityOf(getlocators("Patient_Registration_Procedure_dropdown")));*/
	Select s=new Select(getlocators("Patient_Registration_Procedure_list_drop"));
	s.selectByVisibleText(procedure);
/*	List<WebElement> pr=s.getOptions();
	boolean r=false;
	for(int i=0;i<pr.size();i++)
	{
		System.out.println(pr.get(i).getText());
		if(procedure.equalsIgnoreCase(pr.get(i).getText()))
		{
			getlocators("Patient_Registration_Procedure_dropdown").sendKeys(procedure);
			getlocators("Patient_Registration_Procedure_dropdown").sendKeys(Keys.ENTER);
			r=true;
		}
	}
	if(r==false)
	{
		Assert.fail("Procedure names are mismatched with input");
	}
*/}
public static void patigeneralnotes(String generalnotes)
{
	getlocators("Patient_Registration_General_notes").sendKeys(generalnotes);
}
public static void patiregissave(Integer agelimit)
{
	if(patage<=agelimit)
	{
		getlocators("Patient_Registration_Save_button").click();
		WebDriverWait wait=new WebDriverWait(driver, 35);
		wait.until(ExpectedConditions.visibilityOf(getlocators("Patient_Registration_Save_agelimit_window")));
		String age=getlocators("Patient_Registration_Save_agelimit_window_age").getText();
		int restage=Integer.parseInt(age);
		if(restage==agelimit)
		{
			getlocators("Patient_Registration_Save_agelimit_window_confirm").click();
		}else
		{
			Assert.fail("Age limit is wrong");
		}
	}else
	{
		getlocators("Patient_Registration_Save_button").click();
	}
}
public static void patiregassign()
{
	WebDriverWait wait=new WebDriverWait(driver, 45);
	wait.until(ExpectedConditions.visibilityOf(getlocators("Patient_Registration_Save_assignbutton"))).click();
	
	//waitn.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div[3]/div[1]/ul/li[3]/a")));
//driver.findElement(By.xpath(".//span[@id='Loginas']")).click();
	/*By locator=By.xpath(".//i[contains(@class,'icon-angle-down')]");
retryingFindClick(locator);*/

//driver.findElement(By.xpath(".//*[@id='logoutli']/a")).click();
	/*clickmelocout(locator, driver, 15);*/
}
public static void patregmatchandsave() throws InterruptedException, IOException
{
	Thread.sleep(7000);
	WebDriverWait wait=new WebDriverWait(driver, 40);
	wait.until(ExpectedConditions.textToBePresentInElement(getlocators("Patient_Registration_Billing_patientid"), patientid));
	WebElement billid=getlocators("Patient_Registration_Billing_patientid");
	String bilid=billid.getText();
	WebElement billtype=getlocators("Patient_Registration_Billing_patienttype");
	String biltype=billtype.getText();
	WebElement billage=getlocators("Patient_Registration_Billing_patientage");
	String bilage=billage.getText();
	WebElement billsex=getlocators("Patient_Registration_Billing_patientsex");
	String bilsex=billsex.getText();
	if(bilid.equals(patientid) && biltype.equals(billpatitype) && bilage.equals(billforage) && bilsex.equals(patsex))
	{
		//driver.findElement(By.xpath("//*[@id='btnBiling_Tran_save_Continue']")).click();
		driver.findElement(By.xpath(".//*[@id='btn_Go_Back']")).click();
	}else {
		Assert.fail("Billing details are mismatched");
	}
	/*if(rbrowse.equalsIgnoreCase("Firefox"))
	{
		Runtime.getRuntime().exec(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"registrationfeature"+File.separator+"patientautoit"+File.separator+"Regprint.exe");
	}else if (rbrowse.equalsIgnoreCase("Chrome")) {
		Thread.sleep(8000);
		System.out.println(driver.getTitle());
		Set<String> print=driver.getWindowHandles();
		Iterator<String> ite=print.iterator();
		String homereg=ite.next();
		String recipreg=ite.next();
		String recipprint=ite.next();
        driver.switchTo().window(recipprint);
        System.out.println(driver.getTitle());
		WebDriverWait waitn=new WebDriverWait(driver, 15);
		waitn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//button[@class='Cancel']"))).click();
		driver.switchTo().window(homereg);
	}*/
	
}
public static void patreglogout() throws InterruptedException
{
	Thread.sleep(7000);//need to catch the multiple window handle program
	Logintestpage.logout();
	driver.quit();
}

/*public static void clickmelocout(By locator, WebDriver driver, int timeout)
{
	final WebDriverWait wait=new WebDriverWait(driver, timeout);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(locator)));
driver.findElement(locator).click();
}*/
/*public static boolean retryingFindClick(By locator)
{
	boolean result=false;
	int attempt=0;
	while(attempt<8)
	{
		try
		{
			driver.findElement(locator).click();
			result=true;
			break;
			}catch(StaleElementReferenceException e)
		{
				
		}
	attempt++;
	}
	return result;
	
}
*/




//**Patient next visit Registration details**//
public static void visitpatiidsearch(String patid)
{
	patientid=patid;
	WebDriverWait wait=new WebDriverWait(driver, 35);
	wait.until(ExpectedConditions.visibilityOf(getlocators("Patient_Visit_Registration_Searchlink"))).click();
WebDriverWait wait1=new WebDriverWait(driver, 35);
wait1.until(ExpectedConditions.visibilityOf(getlocators("Patient_Visit_Registration_Patientid_Searchbutton"))).sendKeys(patid);
getlocators("Patient_Visit_Registration_Searchbutton").click();
}
public static void visitclickpatientid()
{
	WebDriverWait wait=new WebDriverWait(driver, 35);
	wait.until(ExpectedConditions.visibilityOf(getlocators("Patient_Visit_Registration_Patientlist_popup")));
getlocators("Patient_Visit_Registration_Patientlist_patientidselect").click();
}
public static void visitpathistory(String visitno)
{
	visitpatientno=visitno;
	String visno=".//a[@class='visit-"+visitno+"']";
	WebDriverWait wait=new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='Column16']")));
driver.findElement(By.xpath(visno)).click();
}
public static void visitpriority(String vpriority)
{
	dropdownvalidationvisit("Patient_Registration_Priority", vpriority);
}
public static void visitvalipatid()
{
	WebDriverWait wait=new WebDriverWait(driver, 25);
	wait.until(ExpectedConditions.attributeToBe(getlocators("Patient_Registration_PaientID"), "id", "txt_PatientId"));
	fieldvalidationvisit("Patient_Registration_PaientID", patientid);
}
public static void visitfirstname(String vfirst)
{
	fieldvalidationvisit("Patient_Registration_First_Name", vfirst);
}
public static void visitmiddlename(String vmiddle)
{
	fieldvalidationvisit("Patient_Registration_Middle_Name", vmiddle);
}
public static void visitlastname(String vlast)
{
	fieldvalidationvisit("Patient_Registration_Last_name", vlast);
}
public static void visitage(String vage)
{
	billforage=vage;
	patinage=getlocators("Patient_Registration_Age").getAttribute("value");
	patage=Integer.parseInt(patinage);
	dropdownvalidationvisit("Patient_Registration_Age", vage);
}
public static void visitsex(String vsex)
{
	patsex=vsex;
	dropdownvalidationvisit("Patient_Registration_Sex", vsex);
}
public static void visitmarital(String vmarital)
{
	dropdownvalidationvisit("Patient_Registration_Marital_status", vmarital);
}
public static void visitsalutation(String vsalutation)
{
	fieldvalidationvisit("Patient_Registration_Salutation", vsalutation);
}
public static void visitmrno(String vmrno)
{
	fieldvalidationvisit("Patient_Registration_MR_number", vmrno);
}
public static void visitmobileno(String vmobileno)
{
	fieldvalidationvisit("Patient_Registration_Contact_no", vmobileno);
}
public static void visitemailid(String vemailid)
{
	fieldvalidationvisit("Patient_Registration_emailid", vemailid);
}
public static void visitidcard(String vidcard)
{
	patiidtype=vidcard;
	dropdownvalidationvisit("Patient_Registration_typeofidcard", vidcard);
}
public static void visitidcardno(String vidcardno)
{
	if(!"No Photo ID".equals(patiidtype))
	{
		fieldvalidationvisit("Patient_Registration_typeofidcard_no", vidcardno);
	}
}
public static void visitethnic(String vethnic)
{
	dropdownvalidationvisit("Patient_Registration_ethenic_group", vethnic);
}
public static void visitinsurcomp(String vinsurcomp)
{
	dropdownvalidationvisit("Patient_Registration_Insurance_company", vinsurcomp);
}
public static void visitinsurpolicyname(String vinsurpolicyname)
{
	dropdownvalidationvisit("Patient_Registration_Policy_name", vinsurpolicyname);
}
public static void visitinsurno(String vinsurno)
{
	fieldvalidationvisit("Patient_Registration_Insurance_number", vinsurno);
}
public static void visitinsurname(String vinsurname)
{
	fieldvalidationvisit("Patient_Registration_Nameofinsurer", vinsurname);
}
//general tab for visit
public static void genvisitbop(String vbop)
{
	getlocators("Patient_Registration_generaltab_link").click();
	WebDriverWait wait=new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOf(getlocators("Patient_Registration_generaltab_Bloodgroup")));
	fieldvalidationvisit("Patient_Registration_generaltab_Native", vbop);
}
public static void genvisitoccu(String voccu)
{
	fieldvalidationvisit("Patient_Registration_generaltab_Occupation", voccu);
}
public static void genvisitbg(String vbg)
{
	dropdownvalidationvisit("Patient_Registration_generaltab_Bloodgroup", vbg);
}
public static void genvisitweight(String vweight)
{
	fieldvalidationvisit("Patient_Registration_generaltab_weight", vweight);
}
public static void genvisitnation(String vnation)
{
	fieldvalidationvisit("Patient_Registration_generaltab_Nationality", vnation);
}
//address tab for visit
public static void addvisitcountry(String vcountry)
{
	getlocators("Patient_Registration_addresstab_link").click();
	WebDriverWait wait=new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOf(getlocators("Patient_Registration_addresstab_Country")));
	dropdownvalidationvisit("Patient_Registration_addresstab_Country", vcountry);
}
public static void addvisitstate(String vstate)
{
	dropdownvalidationvisit("Patient_Registration_addresstab_State", vstate);
}
public static void addvisitcity(String vcity)
{
	fieldvalidationvisit("Patient_Registration_addresstab_City", vcity);
}
public static void addvisitstreet(String vstreet)
{
	fieldvalidationvisit("Patient_Registration_addresstab_Street", vstreet);
}
public static void addvisitzipcode(String vzipcode)
{
	fieldvalidationvisit("Patient_Registration_addresstab_Zipcode", vzipcode);
}
public static void visitprivelegeno(String vprivelegeno)
{
	fieldvalidationvisit("Patient_Registration_addresstab_Privilege_cardno", vprivelegeno);
}
public static void addvisitaltermobil(String valtermobile)
{
	fieldvalidationvisit("Patient_Registration_addresstab_Altermobileno", valtermobile);
}
public static void visitcount()
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);", getlocators("Patient_Registration_Save_button"));
	patitype();//store the patient type for bill verification only
	int temp=getallloca("Patient_Visit_Registration_Previous_visit_history_totalcount").size();
	String visitno="Visit no-"+((temp-1)+2);
	dropdownvalidationvisit("Patient_Registration_Patient_visit", visitno);
}
public static void visitrefertype(String vrefertype, String vrefername)
{
	if("Hospital".equalsIgnoreCase(vrefertype))
	{
		if(getlocators("Patient_Visit_Registration_Refertype_hospital").isSelected())
		{
			dropdownvalidationvisit("Patient_Registration_Referraltype_name_dropdown_and_textbox", vrefername);
		}else {
			Assert.fail("Refertype is hospital radio button is not Checked");
		}
	}else if ("Ref Physician".equalsIgnoreCase(vrefertype)) {
		if(getlocators("Patient_Visit_Registration_Refertype_Refphysician").isSelected())
		{
			dropdownvalidationvisit("Patient_Registration_Referraltype_name_dropdown_and_textbox", vrefername);
		}else {
			Assert.fail("Refertype is Ref Physician radio button is not Checked");
		}
	}else if ("Vision center".equalsIgnoreCase(vrefertype)) {
		if(getlocators("Patient_Visit_Registration_Refertype_visioncenter").isSelected())
		{
			dropdownvalidationvisit("Patient_Registration_Referraltype_name_dropdown_and_textbox", vrefername);
		}else {
			Assert.fail("Refertype is Vision center radio button is not Checked");
		}
	}else if ("Others".equalsIgnoreCase(vrefertype)) {
		if(getlocators("Patient_Visit_Registration_Refertype_others").isSelected())
		{
			fieldvalidationvisit("Patient_Registration_Referraltype_name_dropdown_and_textbox", vrefername);
		}else {
			Assert.fail("Refertype is Others radio button is not Checked");
		}
	}else if ("Self".equalsIgnoreCase(vrefertype)) {
		if(!getlocators("Patient_Visit_Registration_Refertype_self").isSelected())
		{
			Assert.fail("Refertype is Self radio button is not Checked");
		}
	}
}
public static void visitstandorder(String vstandorder)
{
	fieldvalidationvisit("Patient_Registration_Standing_order", vstandorder);
	if(!vstandorder.equalsIgnoreCase(getlocators("Patient_Visit_Registration_Previous_visit_history_Standing_order").getText()))
	{
		Assert.fail("Standing order is mismatched with in previous visit history");
	}	
}
public static void visitprocedure(String vprocedure)
{
	dropdownvalidationvisit("Patient_Registration_Procedure_list_drop", vprocedure);
}
public static void visitgeneralnotes(String vgeneralnotes)
{
	//**fieldvalidationvisit("Patient_Registration_General_notes", vgeneralnotes);**//
	if(!vgeneralnotes.equalsIgnoreCase(getlocators("Patient_Visit_Registration_Previous_visit_history_general_notes").getText()))
	{
		Assert.fail("General notes is mismatched with in previous visit history");
	}
}
public static void Visit_agelimitsaveandassign(Integer vagelimit, String vsaveassign)
{
	agelimitation=vagelimit;
	saveassign=vsaveassign;
}
public static void Visit_savepatient()
{
	if("save".equalsIgnoreCase(saveassign))
	{
		patiregissave(agelimitation);
		patiregassign();
	}
}
public static void Visit_assigntoothers(String vDoctorLab, String vfirstlab, String vsecondlab, String vthirdlab, String vfourthlab) throws InterruptedException
{
	if("assign".equalsIgnoreCase(saveassign))
	{
		if(patage<=agelimitation)
		{
			getlocators("Patient_Visit_Registration_Assign_to_others_button").click();
			WebDriverWait wait=new WebDriverWait(driver, 35);
			wait.until(ExpectedConditions.visibilityOf(getlocators("Patient_Visit_Registration_Assign_to_others_Agelimit_window_age")));
			String age=getlocators("Patient_Visit_Registration_Assign_to_others_Agelimit_window_age").getText();
			int restage=Integer.parseInt(age);
			if(restage==agelimitation)
			{
				getlocators("Patient_Visit_Registration_Assign_to_others_Agelimit_window_confirm").click();
			}else
			{
				Assert.fail("Age limit is wrong");
			}
		}else
		{
			getlocators("Patient_Visit_Registration_Assign_to_others_button").click();
		}
		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(getlocators("Patient_Visit_Registration_Assign_to_lab_radio")));
		if("direct to doctor".equalsIgnoreCase(vDoctorLab))
		{
			getlocators("Patient_Visit_Registration_direct_to_doctor_radio").click();
		}else if ("Assign to lab".equalsIgnoreCase(vDoctorLab)) {
			getlocators("Patient_Visit_Registration_Assign_to_lab_radio").click();
			Thread.sleep(1000);
			Consultationretinaltestpage.assilab(vfirstlab, vsecondlab, vthirdlab, vfourthlab);
		}
		getlocators("Patient_Visit_Registration_Assign_to_others_go_button").click();
		WebDriverWait wait1=new WebDriverWait(driver, 15);
		wait1.until(ExpectedConditions.visibilityOf(getlocators("Patient_Visit_Registration_Assign_to_others_roomassign_go_button"))).click();
	}
}

//common validate for visit
public static void fieldvalidationvisit(String loca, String value)
{
	if(!getlocators(loca).getAttribute("value").equals(value))
	{
		failreg();
	}
}
public static void dropdownvalidationvisit(String loca, String value)
{
	Select s=new Select(getlocators(loca));
	String drop=s.getFirstSelectedOption().getText().trim();
if(!drop.equals(value))
{
	failreg();
}
}




//locators drive & common methods
public static WebElement getlocators(String xpath)
{
	return driver.findElement(By.xpath(locatorprob.getProperty(xpath)));	
}
public static List<WebElement> getallloca(String xpath)
{
	return driver.findElements(By.xpath(locatorprob.getProperty(xpath)));
}

public static void failreg()
{
	Assert.fail("datas are mismatched");
}
}
