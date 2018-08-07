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
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import generationreport.Screenshots;
import generationreport.Searchfilter;
import login.Initializer;
import login.Logintestpage;
import java.io.IOException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Then;

public class Counsellingtest extends Initializer{

	static String failbrowser=null;
	static String failurl=null;
	static String failuser=null;
	static String failpass=null;
//SURGERY WORKFLOW IN COUNSELLING 
	@Given ("^select the browser for counsel as (.*)$")
	public void counbrowser(String Browser)
	{
		failbrowser=Browser;
		Initializer.initialize(Browser);
	}
	@When ("^give the counsel url as (.*)$")
	public void counurl(String Url)
	{
		failurl=Url;
		Initializer.url(Url);
	}
	@And ("^give the counsel username as (.*)$")
	public void counuser(String User)
	{
		failuser=User;
		Logintestpage.getusername(User);
	}
	@But ("^enter the counsel password as (.*)$")
	public void counpass(String Pass)
	{
		failpass=Pass;
		Logintestpage.getpassword(Pass);
	}
	@Then ("^click the login button$")
	public void counslogin() throws InterruptedException
	{
		Logintestpage.login();
	}
	@Given ("^click to counsel worklist$")
	public void counworklist()
	{
		Searchfilter.clickworklist();
	}
	@When ("^click the searchfilter for counsel$")
	public void counsear() throws InterruptedException
	{
		Searchfilter.clicksearchlink();
	}
	@And ("^give the patient id as (.*) for search in counsel$")
	public void counpatientit(String Patientid) throws InterruptedException
	{
		Counsellingtestpage.patientidcou(Patientid);
	}
	@But ("^select the application from date as (.*) for counsel$")
	public void counappfrom(String Appfrom) throws InterruptedException
	{
		Counsellingtestpage.patientappfrom(Appfrom);
	}
	@And ("^select the application to date as (.*) for counsel$")
	public void counappto(String Appto) throws InterruptedException
	{
		Counsellingtestpage.patientappto(Appto);
	}
	@Then ("^click to search button for counsel$")
	public void counsearchbutton() throws InterruptedException
	{
		Searchfilter.searchbutton();
		Thread.sleep(4000);
	}
	@But ("^get the patient age and agelimit as (.*) for fill surgery content form$")
	public void counagelimit(String Agelimit) throws IOException
	{
		Counsellingtestpage.agelimitcou(Agelimit);
	}
	@When ("^click to add the surgery consent icon and click the form, then you want to surgery, even patient age is below agelimit as (.*), then parent name as (.*)$")
	public void counsurgeryform(String Cont, String Parent) throws InterruptedException, IOException
	{
		Thread.sleep(2000);
		Counsellingtestpage.surgerycontentcou(Cont, Parent);
	}
	@And ("^click to add the surgery icon for counsel$")
	public void counpack() throws InterruptedException, IOException
	{
		Counsellingtestpage.packcou();
	}
	@Then ("^Validate the Surgerytype as (.*), surgeryname as (.*) and eye to operated as (.*)$")
	public void counvalidoctorinfo(String surgerytype, String surgeryname, String eye) throws InterruptedException
	{
		Counsellingtestpage.validatedoctorinfo(surgerytype, surgeryname, eye);
	}
	
	@When ("^Validate the surgery name from respective function for counsel and save$")
	public void counsurgeryn() throws InterruptedException
	{
		Counsellingtestpage.surgerynamecou();
	}
	@When ("^Click to add the IOL details for counsel$")
	public void counIOL() throws InterruptedException
	{
		Counsellingtestpage.IOLcou();
	}
	@And ("^Select the lense name for counsel as (.*)$")
	public void counlens(String Lensname) throws InterruptedException
	{
		Counsellingtestpage.lenscou(Lensname);
	}
	@But ("^give the remarks at iol lense for counsel as (.*)$")
	public void counlenremark(String Remarkslens)
	{
		Counsellingtestpage.remarklencou(Remarkslens);
	}
	@Then ("^Click to save the IOL details in counsel$")
	public void counIOLsave() throws InterruptedException
	{
		Counsellingtestpage.lenssavecou();
	}
	@When ("^Click to admission for surgery in counsel$")
	public void counadmsurgery() throws InterruptedException, IOException
	{
		Counsellingtestpage.admitlinkcou();
	}
	@Then ("^Would you like to select an unit as (.*) for counsel$")
	public void coununit(String Coununit) throws InterruptedException
	{
		Counsellingtestpage.unitcou(Coununit);
	}
	@And ("^Select the ward for counsel as (.*)$")
	public void counward(String Counward) throws InterruptedException
	{
		Counsellingtestpage.wardsecou(Counward);
	}
	@When ("^select the bed in particular ward for counsel$")
	public void counbed()
	{
		Counsellingtestpage.bedsecou();
	}
	@But ("^Eye to be operated if both as (.*) then mention as (.*) eye$")
	public void cousideeye(String both, String side) throws InterruptedException
	{
		Thread.sleep(1000);
		Counsellingtestpage.eyeoperateside(both, side);
	}
	@Then ("^Admit the case assign to operation, when the unit is empty, otherwise assign to ward in counsel$")
	public void counadmit() throws InterruptedException
	{
		Counsellingtestpage.admitandassign();
	}
	
	
//PACKAGE WORKFLOW IN COUNSELL
	@Given ("^Select the browser for package in counsel as (.*)$")
	public void package_browser(String PBrowser)
	{
		failbrowser=PBrowser;
		initialize(PBrowser);
	}
	@And ("^enter the url for package in counsel as (.*)$")
	public void package_url(String PUrl)
	{
		failurl=PUrl;
		url(PUrl);
	}
	@When ("^enter the username for package in counsel as (.*)$")
	public void package_user(String PUser)
	{
		failuser=PUser;
		Logintestpage.getusername(PUser);
	}
	@But ("^enter the password for package in counsel as (.*)$")
	public void package_pass(String PPass)
	{
		failpass=PPass;
		Logintestpage.getpassword(PPass);
	}
	@Then ("^click to login for package in counsel$")
	public void package_login() throws InterruptedException
	{
		Logintestpage.login();
	}
	@Given ("^click to counsel worklist for package$")
	public void package_worklist()
	{
		Searchfilter.clickworklist();
	}
	@When ("^click the searchfilter for package$")
	public void package_searchfilter() throws InterruptedException
	{
		Searchfilter.clicksearchlink();
	}
	@And ("^give the patient id as (.*) for search in counsel for package$")
	public void package_searchpatentid(String PPatientid) throws InterruptedException
	{
		Searchfilter.patientidseacrh(PPatientid);
	}
	@But ("^select the application from date as (.*) for counsel for package$")
	public void package_appfromdate(String PAppfrom) throws InterruptedException
	{
		Counsellingtestpage.patientappfrom(PAppfrom);
	}
	@And ("^select the application to date as (.*) for counsel for package$")
	public void package_apptodate(String PAppto) throws InterruptedException
	{
		Counsellingtestpage.patientappto(PAppto);
	}
	@Then ("^click to search button for package$")
	public void package_searchbutton() throws InterruptedException
	{
		Searchfilter.searchbutton();
		Thread.sleep(4000);
	}
	@But ("^get the patient age and agelimit for package as (.*) for fill surgery content form$")
	public void package_findage(String PAgelimit) throws IOException
	{
		Counsellingtestpage.agelimitcou(PAgelimit);
	}
	@When ("^click to add the surgery consent icon for package and click the form, then you want to surgery, even patient age is below agelimit as (.*), then parent name as (.*)$")
	public void package_surgeryform(String PCont, String PParent) throws InterruptedException, IOException
	{
		counsurgeryform(PCont, PParent);
	}
	@And ("^click to package or surgery icon in counsell$")
	public void package_packageicon() throws InterruptedException, IOException
	{
		Counsellingtestpage.packcou();
	}
	@When ("^Validate the Surgerytype, surgeryname and eye to operated as (.*), (.*), (.*) in doctor recommendation for package$")
	public void package_validatedocrecom(String PSurgerytype, String PSurgeryname, String PEye) throws InterruptedException
	{
		Counsellingtestpage.packagevalidate_docinfo(PSurgerytype, PSurgeryname, PEye);
	}
	@Then ("^Enter the package name as (.*) and save for package workflow in counsell$")
	public void package_packagename(String PPackage) throws InterruptedException
	{
		Counsellingtestpage.packagename_package(PPackage);
	}
	@And ("^Assign the patient to next room for package workflow in counsel$")
	public void package_assignpatient() throws InterruptedException
	{
		Counsellingtestpage.assign_package();
	}
	
//POST OPERATION SCENARIO IN REPORT TAB
	@Given ("^Select the browser for post operation in counsel as (.*)$")
	public void post_browser(String PostBrowser)
	{
		failbrowser=PostBrowser;
		initialize(PostBrowser);
	}
	@And ("^enter the url for post operation in counsel as (.*)$")
	public void post_url(String PostUrl)
	{
		failurl=PostUrl;
		url(PostUrl);
	}
	@When ("^enter the username for post operation in counsel as (.*)$")
	public void post_user(String PostUser)
	{
		failuser=PostUser;
		Logintestpage.getusername(PostUser);
	}
	@But ("^enter the password for post operation in counsel as (.*)$")
	public void post_pass(String PostPass)
	{
		failpass=PostPass;
		Logintestpage.getpassword(PostPass);
	}
	@Then ("^click to login for post operation in counsel$")
	public void post_login()
	{
		Logintestpage.login();
	}
	@Given ("^click to worklist for post operation$")
	public void post_worklist()
	{
		Searchfilter.clickworklist();
	}
	@When ("^click the searchfilter for post operation$")
	public void post_search() throws InterruptedException
	{
		Searchfilter.clicksearchlink();
	}
	@And ("^give the patient id for post operation as (.*) in search filter$")
	public void post_patientid(String PostPatientid) throws InterruptedException
	{
		Searchfilter.patientidseacrh(PostPatientid);
	}
	@But ("^select the application from date for post operation as (.*) in search filter$")
	public void post_appfrom(String PostAppfrom) throws InterruptedException
	{
		Searchfilter.appfromdate(PostAppfrom);
	}
	@And ("^select the application to date for post operation as (.*) in search filter$")
	public void post_appto(String PostAppto) throws InterruptedException
	{
		Searchfilter.apptodate(PostAppto);
	}
	@Then ("^click to search button for post operation$")
	public void post_searchbutton()
	{
		Searchfilter.searchbutton();
	}
	@And ("^Select the Reported tab for post operation$")
	public void post_reporttab() throws IOException, InterruptedException
	{
		Thread.sleep(4500);
		Counsellingtestpage.reporttab_post();
	}
	@When ("^click to post Visual Acuity icon in worklist$")
	public void post_VAicon() throws InterruptedException
	{
		Counsellingtestpage.VAicon_post();
	}
	@And ("^select the visual acuity unit type as (.*) for post operation$")
	public void post_VAunit(String PostUnit) throws InterruptedException
	{
		Counsellingtestpage.VAunit_post(PostUnit);
	}
	@But ("^select the value of post VA Right eye Un-Aided Dist as (.*)$")
	public void post_VArightUAD(String PostRUAD)
	{
		Counsellingtestpage.RightUAdistance_post(PostRUAD);
	}
	@And ("^Select the post VA Right eye Un-Aided Near as (.*)$")
	public void post_VArightUAN(String PostRUAN)
	{
		Counsellingtestpage.RightUAnear_post(PostRUAN);
	}
	@When ("^Select the post VA Left eye Un-Aided Dist as (.*)$")
	public void post_VAleftUAD(String PostLUAD)
	{
		Counsellingtestpage.LeftUAdistance_post(PostLUAD);
	}
	@And ("^Select the post VA Left eye Un-Aided Near as (.*)$")
	public void post_VAleftUAN(String PostLUAN)
	{
		Counsellingtestpage.LeftUAnear_post(PostLUAN);
	}
	@Given ("^select the post VA Right eye Aided Dist as (.*)$")
	public void post_VArightAD(String PostRAD)
	{
		Counsellingtestpage.RightAdistance_post(PostRAD);
	}
	@But ("^Select the post VA Right eye Aided Near as (.*)$")
	public void post_VArightAN(String PostRAN)
	{
		Counsellingtestpage.RightAnear_post(PostRAN);
	}
	@When ("^Select the post VA Left eye Aided Dist as (.*)$")
	public void post_VAleftAD(String PostLAD)
	{
		Counsellingtestpage.LeftAdistance_post(PostLAD);
	}
	@Then ("^Select the post VA Left eye Aided Near as (.*)$")
	public void post_VAleftAN(String PostLAN)
	{
		Counsellingtestpage.LeftAnear_post(PostLAN);
	}
	@And ("^Select the post VA Right eye Pinhole as (.*)$")
	public void post_VArightpinhole(String PostRpinhole)
	{
		Counsellingtestpage.Rightpinhole_post(PostRpinhole);
	}
	@But ("^Select the post VA Left eye Pinhole as (.*)$")
	public void post_VAleftpinhole(String PostLpinhole)
	{
		Counsellingtestpage.Leftpinhole_post(PostLpinhole);
	}
	@Then ("^Click to save the post VA values$")
	public void post_VAsave()
	{
		Counsellingtestpage.VAsave_post();
	}
	@And ("^Click to post VA add medicine content icon in worklist$")
	public void post_VAmedicineicon() throws InterruptedException
	{
		Counsellingtestpage.Medicineicon_post();
	}
	@When ("^Select the medicine template title as (.*) for post VA$")
	public void post_VAmedicinetitle(String PostMedicine)
	{
		Counsellingtestpage.Medicinetitle_post(PostMedicine);
	}
	@But ("^Click to save the medicine content for post VA$")
	public void post_VAsavemedicine() throws InterruptedException
	{
		Counsellingtestpage.Savemedicine_post();
	}

	
	

//TEARDOWN
	@After
	public void teardowncou(Scenario s) throws IOException, InterruptedException
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
