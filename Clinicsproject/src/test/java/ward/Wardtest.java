package ward;
/**
'**************************************************************
'  Name        : Ward test case
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Oct 6, 2017
'--------------------------------------------------------------
'  Mod Date    :    
'  Mod By      : 
'  Change Made : 
'**************************************************************
**/
import java.io.IOException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import generationreport.Screenshots;
import generationreport.Searchfilter;
import login.Initializer;
import login.Logintestpage;

public class Wardtest extends Initializer {
	static String failbrowser=null;
	static String failurl=null;
	static String failuser=null;
	static String failpass=null;

	@Given ("^select the browser for ward as (.*)$")
	public void browserwar(String Browser)
	{
		failbrowser=Browser;
		initialize(Browser);
	}
	@When ("^give the url for ward as (.*)$")
	public void urlwar(String Url)
	{
		failurl=Url;
		url(Url);
	}
	@And ("^enter the user name for ward as (.*)$")
	public void userwar(String User)
	{
		failuser=User;
		Logintestpage.getusername(User);
	}
	@But ("^enter the password for ward as (.*)$")
	public void passwar(String Pass)
	{
		failpass=Pass;
		Logintestpage.getpassword(Pass);
	}
	@Then ("^click to login button for ward$")
	public void loginwar() throws InterruptedException
	{
		Logintestpage.login();
	}
	@When ("^click to worklist in wardroom$")
	public void worklistwar()
	{
		Searchfilter.clickworklist();
	}
	@Given ("^want to select the tab of ward as (.*)$")
	public void ward(String ward) throws IOException, InterruptedException
	{
		Thread.sleep(3500);
		Wardtestpage.selectward(ward);
	}
	@And ("^click to search filter for ward$")
	public void searchfilward() throws InterruptedException
	{
		Thread.sleep(2000);
		Searchfilter.clicksearchlink();
	}
	@When ("^enter the patientid as (.*) in search for ward$")
	public void patientid(String Patientid) throws InterruptedException
	{
		Wardtestpage.patientidward(Patientid);
	
	}
	@But ("^select the application start dates for ward as (.*)$")
	public void appfromdate(String Appfrom) throws InterruptedException
	{
		Searchfilter.appfromdate(Appfrom);
	}
	@And ("^select the application till date for ward as (.*) and then search$")
	public void apptodate(String Appto) throws InterruptedException
	{
		Searchfilter.apptodate(Appto);
		Searchfilter.searchbutton();
		Thread.sleep(5000);
	}
	@But ("^click to add the Anesthesia Consent for ward$")
	public void waranecon() throws IOException
	{
		Wardtestpage.anessecondform();
	}
	@When ("^click the event of Fill Anesthesia Form and give Name of Physician as (.*) in ward$")
	public void clickuploadanes(String Physician) throws InterruptedException
	{
		Wardtestpage.fillanesthesiaward(Physician);
		Thread.sleep(4000);
	}
	@And ("^click to add pre operation info and validate the patientid in ward$")
	public void addpreope() throws InterruptedException
	{
		Wardtestpage.preoperativeicon();
	}
	@Then ("^select the Blood report BSL maximum as (.*) and minimum as (.*)$")
	public void BSLmaxmin(Integer BSLMax, Integer BSLMin)
	{
		Wardtestpage.bslblood(BSLMax, BSLMin);
	}
	@But ("^select the Blood report HB (.*) (.*) with percentage$")
	public void HBmaxmin(Integer HBmax, String HBmin)
	{
		Wardtestpage.hbblood(HBmax, HBmin);
	}
	@When ("^give the Rs value as (.*) in examination$")
	public void RSvalue(String RSmmHg)
	{
		Wardtestpage.rsexam(RSmmHg);
	}
	@And ("^give the CVC values as (.*) in examination$")
	public void CVCvalue(String CVCmmHg)
	{
		Wardtestpage.cvcexam(CVCmmHg);
	}
	@But ("^give the CNS values as (.*) in examination$")
	public void CNSvalue(String CNSmmHg)
	{
		Wardtestpage.cnsexam(CNSmmHg);
	}
	@When ("^give the P/A values as (.*) in examination$")
	public void PAvalue(String PAmmHg)
	{
		Wardtestpage.paexam(PAmmHg);
	}
	@Then ("^give the Temperature value as (.*) (.*) in examination$")
	public void Tempvalue(Integer Temp, String celsius)
	{
		Wardtestpage.tempexam(Temp, celsius);
	}
	@And ("^give the Pulse value as (.*) in examination$")
	public void Pulsevalue(String pulse)
	{
		Wardtestpage.pulseexam(pulse);
	}
	@But ("^enter the Bp maximum as (.*) and minimum as (.*)$")
	public void Bpmaxmin(Integer Bpmax, Integer Bpmin)
	{
		Wardtestpage.bpexam(Bpmax, Bpmin);
	}
	@When ("^enter the RR maximum as (.*) and minimum as (.*)$")
	public void RRmaxmin(Integer RRmax, Integer RRmin)
	{
		Wardtestpage.rrexam(RRmax, RRmin);
	}
	@And ("^give the ECG Finding as (.*) in examination$")
	public void ECGvalue(String ECG)
	{
		Wardtestpage.ecgexam(ECG);
	}
	@When ("^Is this patient Fit for surgery as (.*)$")
	public void surgeryfit(String Fitsurgery)
	{
		Wardtestpage.sugeryadv(Fitsurgery);
	}
	
	@And ("^Is this patient need Physician opinion as (.*)$")
	public void physiopinion(String Phyopi)
	{
		Wardtestpage.phyopadv(Phyopi);
	}
	@But ("^Is this patient need Treatment as (.*), then give advice as (.*)$")
	public void treatadvice(String Treat, String Advice)
	{
		Wardtestpage.treatadv(Treat, Advice);
	}
	@Then ("^Click to save the preoperative examination details$")
	public void savepreope()
	{
		Wardtestpage.savepreopr();
	}
	@And ("^Would you like to do the postpone operation as (.*), then date (.*), time (.*) and reason (.*) to this patient in ward$")
	public void postponeoperation(String Postpone, String Postdate, String Posttime, String Reason) throws InterruptedException, IOException
	{
		Wardtestpage.postponeopeward(Postpone, Postdate, Posttime, Reason);
	}
	@When ("^Are you assign to operation room as (.*)$")
	public void wardassign(String Assign) throws InterruptedException
	{
		Wardtestpage.assignward(Assign);	
	}

	
	
//**PACKAGE Details and Postponed in ward**//
	@Given ("^Select the browser package for ward as (.*)$")
	public void packageward_browser(String WBrowser)
	{
		failbrowser=WBrowser;
		initialize(WBrowser);
	}
	@And ("^Enter the url package for ward as (.*)$")
	public void packageward_url(String WUrl)
	{
		failurl=WUrl;
		url(WUrl);
	}
	@But ("^Enter the user package for ward as (.*)$")
	public void packageward_user(String WUser)
	{
		failuser=WUser;
		Logintestpage.getusername(WUser);
	}
	@When ("^Enter the password package for ward as (.*)$")
	public void packageward_pass(String WPass)
	{
		failpass=WPass;
		Logintestpage.getpassword(WPass);
	}
	@Then ("^Click to login package for ward$")
	public void packageward_login() throws InterruptedException
	{
		Logintestpage.login();
	}
	@When ("^click to worklist for package in wardroom$")
	public void packageward_worklist()
	{
		Searchfilter.clickworklist();
	}
	@Given ("^want to select the tab of ward for package as (.*)$")
	public void packageward_wardtype(String Wward) throws IOException
	{
		Wardtestpage.selectward(Wward);
	}
	@And ("^click to search filter for packgae ward$")
	public void packageward_searchfilter() throws InterruptedException
	{
		Thread.sleep(2000);
		Searchfilter.clicksearchlink();
	}
	@When ("^enter the patientid for package as (.*) in search for ward$")
	public void packageward_patientid(String WPatientid) throws InterruptedException
	{
		patientid(WPatientid);
	}
	@But ("^select the application start dates for packgae ward as (.*)$")
	public void packageward_appfrom(String WAppfrom) throws InterruptedException
	{
		Searchfilter.appfromdate(WAppfrom);
	}
	@And ("^select the application till date for packgae ward as (.*) and then search$")
	public void packageward_appto(String WAppto) throws InterruptedException
	{
		apptodate(WAppto);
	}
	@But ("^click to add the Anesthesia Consent for package ward$")
	public void packageward_anesthesia() throws IOException
	{
		waranecon();
	}
	@When ("^click the event of Fill Anesthesia Form for package and give Name of Physician as (.*) in ward$")
	public void packageward_physican(String WPhysician) throws InterruptedException
	{
		clickuploadanes(WPhysician);
	}
	@And ("^click to add pre operation info and validate the patientid for package in ward$")
	public void packageward_preoperation() throws InterruptedException
	{
		addpreope();
	}
	@Then ("^select the Blood report for package BSL maximum as (.*) and minimum as (.*) in ward$")
	public void packageward_WBSLMaxandmin(Integer WBSLMax, Integer WBSLMin)
	{
		BSLmaxmin(WBSLMax, WBSLMin);
	}
	@But ("^select the Blood report HB (.*) (.*) with percentage for package in ward$")
	public void packageward_WHBmaxandmin(Integer WHBmax, String WHBmin)
	{
		HBmaxmin(WHBmax, WHBmin);
	}
	@When ("^give the Rs value as (.*) in examination for package in ward$")
	public void packageward_WRSmmHg(String WRSmmHg)
	{
		RSvalue(WRSmmHg);
	}
	@And ("^give the CVC values as (.*) in examination for package in ward$")
	public void packageward_WCVCmmHg(String WCVCmmHg)
	{
		CVCvalue(WCVCmmHg);
	}
	@But ("^give the CNS values as (.*) in examination for package in ward$")
	public void packageward_WCNSmmHg(String WCNSmmHg)
	{
		CNSvalue(WCNSmmHg);
	}
	@When ("^give the P/A values as (.*) in examination for package in ward$")
	public void packageward_WPAmmHg(String WPAmmHg)
	{
		PAvalue(WPAmmHg);
	}
	@Then ("^give the Temperature value as (.*) (.*) in examination for package in ward$")
	public void packageward_WTemp(Integer WTemp, String Wcelsius)
	{
		Tempvalue(WTemp, Wcelsius);
	}
	@And ("^give the Pulse value as (.*) in examination for package in ward$")
	public void packageward_WPulse(String WPulse)
	{
		Pulsevalue(WPulse);
	}
	@But ("^enter the Bp maximum for package as (.*) and minimum as (.*) in ward$")
	public void packageward_WBpMaxandmin(Integer WBpMax, Integer WBpMin)
	{
		Bpmaxmin(WBpMax, WBpMin);
	}
	@When ("^enter the RR maximum for package as (.*) and minimum as (.*) in ward$")
	public void packageward_WRRMaxandmin(Integer WRRMax, Integer WRRMin)
	{
		RRmaxmin(WRRMax, WRRMin);
	}
	@And ("^give the ECG Finding as (.*) in examination for package in ward$")
	public void packageward_WECG(String WECG)
	{
		ECGvalue(WECG);
	}
	@When ("^Is this patient Fit for surgery for package as (.*) in ward$")
	public void packageward_Wfitsurgery(String Wfitsurgery)
	{
		surgeryfit(Wfitsurgery);
	}
	@And ("^Is this patient need Physician opinion for package as (.*) in ward$")
	public void packageward_Wphyopinion(String Wphyopinion)
	{
		physiopinion(Wphyopinion);
	}
	@But ("^Is this patient need Treatment for package as (.*), then give advice as (.*) in ward$")
	public void packageward_WTreatadvice(String WTreat, String Wadvice)
	{
		treatadvice(WTreat, Wadvice);
	}
	@Then ("^Click to save the preoperative examination details for package in ward$")
	public void packageward_savepreope()
	{
		savepreope();
	}
	@When ("^Would you like to select the bed for this patient in package ward$")
	public void packageward_selectbed() throws IOException, InterruptedException
	{
		Wardtestpage.selectbedward();
	}
	@Then ("^Validate if both eyes to operated as (.*) and then validate or select the Eye to be operated as (.*) for package ward$")
	public void packageward_eyetooperate(String WBoth, String WEye) throws IOException
	{
		Wardtestpage.eyetooperateward(WBoth, WEye);
	}
	@But ("^Select the operation date as (.*) for package ward$")
	public void packageward_operationdate(String Woperationdate) throws InterruptedException, IOException
	{
		Wardtestpage.datepick(Woperationdate);
	}
	@Given ("^Select the Operation Time as (.*) for package ward$")
	public void packageward_operationtime(String Woperationtime)
	{
		Wardtestpage.operationtimeward(Woperationtime);
	}
	@And ("^Click to admit button and assign for package ward$")
	public void packageward_admitassign() throws IOException, InterruptedException
	{
		Wardtestpage.admitandassignward();
	}
	
	
	
	
@After
public void teardownward(Scenario s) throws IOException, InterruptedException
{
	if(s.isFailed())
	{
		Screenshots.getscreenshot(s);
		driver.close();
		initialize(failbrowser);
		url(failurl);
		Logintestpage.getusername(failuser);
		Logintestpage.getpassword(failpass);
		Logintestpage.loginalert();
		Thread.sleep(7000);
		Logintestpage.logout();
		driver.close();
	}
}

}
