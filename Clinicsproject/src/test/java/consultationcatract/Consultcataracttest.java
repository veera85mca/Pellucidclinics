package consultationcatract;
/**
'**************************************************************
'  Name        : catract testcase for consultation
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Sep 19, 2017
'--------------------------------------------------------------
'  Mod Date    :    
'  Mod By      : 
'  Change Made : 
'**************************************************************
**/

import java.io.IOException;
import consultation.Consultationcommontestpage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import generationreport.Screenshots;
import generationreport.Searchfilter;
import login.Initializer;
import login.Logintestpage;
import cucumber.api.java.en.Then;

public class Consultcataracttest extends Initializer{

static String failbrowser=null;
static String failurl=null;
static String failuser=null;
static String failpass=null;

	@Given ("^select the browser for catconsult as (.*)$")
	public void catbrowser(String Browser)
	{
		failbrowser=Browser;
		Initializer.initialize(Browser);
	}
	@When ("^give the url link for catconsult as (.*)$")
	public void caturl(String Url)
	{
		failurl=Url;
		Initializer.url(Url);
	}
	@And ("^enter the username for catconsult as (.*)$")
	public void catuser(String User)
	{
		failuser=User;
		Logintestpage.getusername(User);
	}
	@But ("^enter the password for catconsult as (.*)$")
	public void catpass(String Pass)
	{
		failpass=Pass;
		Logintestpage.getpassword(Pass);
	}
	@Then ("^click the login button for catconsult$")
	public void catlogin() throws InterruptedException
	{
		Logintestpage.login();
	}
	@When ("^click the worklist coloumn for catconsult$")
	public void catworklist()
	{
		Searchfilter.clickworklist();
	}
	@Then ("^click the search filter link for catconsult$")
	public void catsearch() throws InterruptedException
	{
		Searchfilter.clicksearchlink();
	}
	@When ("^give the patient id as (.*) for search in catconsult$")
	public void catpatientid(String Patientid) throws IOException, InterruptedException
	{
		Consultationcommontestpage.conspatid(Patientid);
	}
	@And ("^select the application from date as (.*) for catconsult$")
	public void catappfrom(String appfrom) throws InterruptedException
	{
		
		Consultationcommontestpage.appfromdate(appfrom);
	}
	@But ("^select the application to date as (.*) for catconsult$")
	public void catappto(String appto) throws InterruptedException
	{
		Consultationcommontestpage.apptodate(appto);
	}
	@Then ("^click to search button for catconsult$")
	public void catsearchbutton()
	{
		Consultationcommontestpage.consearchbutton();
	}
	@When ("^want to click the patient name respective of patient id for catconsult$")
	public void catclickpatientname() throws InterruptedException
	{
		Consultationcommontestpage.clickpatiname();
	}
//case sheet validation
	@And ("^validate the patientid, age as (.*), sex as (.*), contactno as (.*), procedure as (.*) and then click case sheet tab for catconsult$")
	public void catclickcasesheet(String Age, String Sex, String Contactno, String Procedure) throws InterruptedException
	{
		Consultationcommontestpage.casesheetclick(Age, Sex, Contactno, Procedure);
	}
//general field validation
	@When ("validate the general Chief compliants as (.*) for catconsult$")
	public void catgencheifcom(String Chiefcomp) throws InterruptedException
	{
		Consultationcommontestpage.gencheifcomcons(Chiefcomp);
	}
	@Given ("validate the general Presenting complaint as (.*) for catconsult$")
	public void catgenprescomp(String Presentcomp)
	{
		Consultationcommontestpage.genprescompcons(Presentcomp);
	}
	@When ("validate the general History presenting complaint as (.*) for catconsult$")
	public void catgenhisprescomp(String Hisprescomp)
	{
		Consultationcommontestpage.genhisprescompcons(Hisprescomp);
	}
	@And ("validate the general Previous ocular history as (.*) for catconsult$")
	public void catgenpreocuhis(String Preocuhis)
	{
		Consultationcommontestpage.genpreocuhiscons(Preocuhis);
	}
	@Then ("validate the general Systemic Illness/History as (.*) for catconsult$")
	public void catgensysill(String Sysilln)
	{
		Consultationcommontestpage.gensysillcons(Sysilln);
	}
	@But ("validate the general Clinical history as (.*) for catconsult$")
	public void catgenclinhis(String Clinhis)
	{
		Consultationcommontestpage.genclinhiscons(Clinhis);
	}
	@And ("validate the general Treatment history as (.*) for catconsult$")
	public void catgentreahis(String Treathis)
	{
		Consultationcommontestpage.gentreahiscons(Treathis);
	}
	@But ("validate the general Family history as (.*) for catconsult$")
	public void catgenfamihis(String Famihis)
	{
		Consultationcommontestpage.genfamihiscons(Famihis);
	}
	@Then ("validate the general Allergies as (.*) for catconsult$")
	public void catgenaller(String Allerg)
	{
		Consultationcommontestpage.genallercons(Allerg);
	}
	//VA fields validation
	@But ("^validate the VA Right eye Un-Aided Distance as (.*) for catconsult$")
	public void catrightuadistance(String RUAD)
	{
		Consultationcommontestpage.ruadistance(RUAD);
	}
	@When ("^validate the VA Right eye Un-Aided Near as (.*) for catconsult$")
	public void catrightuanear(String RUAN)
	{
		Consultationcommontestpage.ruanear(RUAN);
	}	
	@But ("^validate the VA Left eye Un-Aided Distance as (.*) for catconsult$")
	public void catleftuadistance(String LUAD)
	{
		Consultationcommontestpage.luadistance(LUAD);
	}
	@And ("^validate the VA Left eye Un-Aided Near as (.*) for catconsult$")
	public void catleftuanear(String LUAN)
	{
		Consultationcommontestpage.luanear(LUAN);
	}
	@Then ("^validate the VA Right eye Aided Dist as (.*) for catconsult$")
	public void catrightadistance(String RAD)
	{
		Consultationcommontestpage.varightadistancecons(RAD);
	}
	@But ("^validate the VA Right eye Aided Near as (.*) for catconsult$")
	public void catrightanear(String RAN)
	{
		Consultationcommontestpage.varightanearcons(RAN);
	}
	@When ("^validate the VA Left eye Aided Dist as (.*) for catconsult$")
	public void catleftadistance(String LAD)
	{
		Consultationcommontestpage.valeftadistancecons(LAD);
	}
	@And ("^validate the VA Left eye Aided Near as (.*) for catconsult$")
	public void catleftanear(String LAN)
	{
		Consultationcommontestpage.valeftanearcons(LAN);
	}
	@But ("^validate the VA Right eye Pinhole as (.*) for catconsult$")
	public void catrightapinhole(String Rpinhole)
	{
		Consultationcommontestpage.varightapinholecons(Rpinhole);
	}
	@Then ("^validate the VA Left eye Pinhole as (.*) for catconsult$")
	public void catleftapinhole(String Lpinhole)
	{
		Consultationcommontestpage.valeftapinholecons(Lpinhole);
	}
	
	//Subjective acceptance validation
	@When ("^validate the subjective acceptance of Right eyeDV Sphere as (.*) for catconsult$")
	public void catsarightdvsphere(String RightDVSPH)
	{
		Consultationcommontestpage.sarightdvspherecons(RightDVSPH);
	}
	@And ("^validate the subjective acceptance value of Right eyeDV Cylinder as (.*) for catconsult$")
	public void catsarightdvcylinder(String RightDVCYL)
	{
		Consultationcommontestpage.sarightdvcylindercons(RightDVCYL);
	}
	@But ("^validate the subjective acceptance value of Right eyeDV Axis as (.*) for catconsult$")
	public void catsarightdvaxis(String RightDVAxis)
	{
		Consultationcommontestpage.sarightdvaxiscons(RightDVAxis);
	}
	@Then ("^validate the subjective acceptance value of Right eyeDV Visual Acuity as (.*) for catconsult$")
	public void catsarightdvvisualacu(String RightDVVA)
	{
		Consultationcommontestpage.sarightdvvisualacucons(RightDVVA);
	}
	@When ("^validate the subjective acceptance value of Left eyeDV Sphere as (.*) for catconsult$")
	public void catsaleftdvsphere(String LeftDVSPH)
	{
		Consultationcommontestpage.saleftdvspherecons(LeftDVSPH);
	}
	@And ("^validate the subjective acceptance value of Left eyeDV Cylinder as (.*) for catconsult$")
	public void catsaleftdvcylinder(String LeftDVCYL)
	{
		Consultationcommontestpage.saleftdvcylindercons(LeftDVCYL);
	}
	@But ("^validate the subjective acceptance value of Left eyeDV Axis as (.*) for catconsult$")
	public void catsaleftdvaxis(String LeftDVAxis)
	{
		Consultationcommontestpage.saleftdvaxiscons(LeftDVAxis);
	}
	@Then ("^validate the subjective acceptance value of Left eyeDV Visual Acuity as (.*) for catconsult$")
	public void catsaleftdvvisualacu(String LeftDVVA)
	{
		Consultationcommontestpage.saleftdvvisualacucons(LeftDVVA);
	}
	@When ("^validate the subjective acceptance value of Right eyeNV Sphere as (.*) for catconsult$")
	public void catsarightnvsphere(String RightNVSPH)
	{
		Consultationcommontestpage.sarightnvspherecons(RightNVSPH);
	}
	@And ("^validate the subjective acceptance value of Right eyeNV Cylinder for catconsult$")
	public void catsarightnvcylinder()
	{
		Consultationcommontestpage.sarightnvcylindercons();
	}
	@But ("^validate the subjective acceptance value of Right eyeNV Axis for catconsult$")
	public void catsarightnvaxis()
	{
		Consultationcommontestpage.sarightnvaxiscons();
	}
	@Then ("^validate the subjective acceptance value of Right eyeNV Visual Acuity as (.*) for catconsult$")
	public void catsarightnvvisualacu(String RightNVVA)
	{
		Consultationcommontestpage.sarightnvvisualacucons(RightNVVA);
	}
	@When ("^validate the subjective acceptance value of Left eyeNV Sphere as (.*) for catconsult$")
	public void catsaleftnvsphere(String LeftNVSPH)
	{
		Consultationcommontestpage.saleftnvspherecons(LeftNVSPH);
	}
	@And ("^validate the subjective acceptance value of Left eyeNV Cylinder for catconsult$")
	public void catsaleftnvcylinder()
	{
		Consultationcommontestpage.saleftnvcylindercons();
	}
	@But ("^validate the subjective acceptance value of Left eyeNV Axis for catconsult$")
	public void catsaleftnvaxis()
	{
		Consultationcommontestpage.saleftnvaxiscons();
	}
	@And ("^validate the subjective acceptance value of Left eyeNV Visual Acuity as (.*) for catconsult$")
	public void catsaleftnvvisualacu(String LeftNVVA)
	{
		Consultationcommontestpage.saleftnvvisualacucons(LeftNVVA);
	}
	//Intraocular pressure
	@When ("^validate the value of Right eye Schiotz max, min as (.*), (.*) for catconsult$")
	public void caticrightschiotz(String RSMAX, String RSMIN)
	{
		Consultationcommontestpage.icrightschiotzcons(RSMAX, RSMIN);
	}
	@And ("^validate the value of Left eye Schiotz max, min as (.*), (.*) for catconsult$")
	public void caticleftschiotz(String LSMAX, String LSMIN)
	{
		Consultationcommontestpage.icleftschiotzcons(LSMAX, LSMIN);
	}
	@When ("^validate the value of Right eye Applanation max, min as (.*), (.*) for catconsult$")
	public void caticrightapplan(String RAMAX, String RAMIN)
	{
		Consultationcommontestpage.icrightapplancons(RAMAX, RAMIN);
	}
	@And ("^validate the value of Left eye Applanation max, min as (.*), (.*) for catconsult$")
	public void caticleftapplan(String LAMAX, String LAMIN)
	{
		Consultationcommontestpage.icleftapplancons(LAMAX, LAMIN);
	}
	@When ("^validate the value of Right eye Non-Contact max, min as (.*), (.*) for catconsult$")
	public void caticrightnoncat(String RNCMAX, String RNCMIN)
	{
		Consultationcommontestpage.icrightnoncatcons(RNCMAX, RNCMIN);
	}
	@And ("^validate the value of Left eye Non-Contact max, min as (.*), (.*) for catconsult$")
	public void caticleftnoncat(String LNCMAX, String LNCMIN)
	{
		Consultationcommontestpage.icleftnoncatcons(LNCMAX, LNCMIN);
	}
	
	//Catract fields
	@But ("^Check the right eye Diagnosis values are as (.*) for catconsult$")
	public void catrightdiag(String Righteyediagnosis) throws InterruptedException
	{
		Consultationcommontestpage.righteyediagreport(Righteyediagnosis);
	}
	@And ("^Check the left eye Diagnosis values are as (.*) for catconsult$")
	public void catleftdiag(String Lefteyediagnosis)
	{
		Consultationcommontestpage.lefteyediagreport(Lefteyediagnosis);
	}
	@When ("^Give the Advice in report as (.*) for catconsult$")
	public void catadvice(String Advice)
	{
		Consultationcommontestpage.advicereport(Advice);
	}
	@When ("^Whether do you to select the report title or diagnosis as (.*), then report title or diagnosis values are as (.*) for catconsult$")
	public void cattitlediagnosis(String titlediagnosis, String reporttemp)
	{
		Consultationcommontestpage.titlediagnosis(titlediagnosis, reporttemp);
	}
	@Then ("^Click the surgery button$")
	public void catsurgery() throws IOException
	{
		Consultcataracttestpage.surgerybutton();
	}
	@When ("^select the operation type as (.*)$")
	public void catopetype(String type)
	{
		Consultcataracttestpage.opetype(type);
	}
	@And ("^select the operation name as (.*)$")
	public void catoptname(String optname) throws InterruptedException
	{
		Consultcataracttestpage.oprname(optname);
	}
	@But ("^which eye want to do the opearation for this patient as (.*)$")
	public void cateyeopt(String Eyes)
	{
		Consultcataracttestpage.eyeofope(Eyes);
	}
	@Given ("^Give the general notes for operation as (.*)$")
	public void catnotes(String Notes)
	{
		Consultcataracttestpage.gennotes(Notes);
	}
	@Then ("^click to save the surgery info and assign to next room$")
	public void catsave() throws InterruptedException
	{
		Consultcataracttestpage.savesurgery();
	}
	@After
	public void catteardown(Scenario s) throws IOException, InterruptedException
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
