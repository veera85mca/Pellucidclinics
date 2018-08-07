package evaluation;
/**
'**************************************************************
'  Name        : Evaluation room
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


public class Evaluationtest extends Initializer{
	static String failbrowser=null;
	static String failurl=null;
	static String failuser=null;
	static String failpass=null;
	@Given ("^select the browser for evaluation as (.*)$")
	public void evabrowser(String Browser)
	{
		failbrowser=Browser;
		initialize(Browser);	
	}
	@When ("^Give the url for clinics automation as (.*)$")
	public void evaurl(String Url)
	{
		failurl=Url;
		Logintestpage.geturl(Url);
	}
	@And ("^enter the username for evaluation as (.*)$")
	public void evauser(String User)
	{
		failuser=User;
		Logintestpage.getusername(User);
	}
	@But ("^enter the password for evaluation as (.*)$")
	public void evapass(String pass)
	{
		failpass=pass;
		Logintestpage.getpassword(pass);
	}
	@And ("^select the radio for evaluation$")
	public void evaradio()
	{
		
	}
	@Then ("^click to the login for evaluation$")
	public void evalogin() throws InterruptedException
	{
		Logintestpage.login();
	}
	@And ("^click to worklist column link$")
	public void evaworklist()
	{
		Searchfilter.clickworklist();
	}
	@But ("^click the searchlink button$")
	public void searchlink() throws InterruptedException
	{
		Searchfilter.clicksearchlink();
	}
	@When ("^enter the patientid in evaluation worklist as (.*)$")
	public void evapatid(String Patientid) throws IOException, InterruptedException
	{
		Evaluationtestpage.evapatientid(Patientid);
	}
	@And ("^select the evaluation Appoinment from date as (.*)$")
	public void evaappfromdate(String Fromdate) throws InterruptedException
	{
		Evaluationtestpage.evafromdate(Fromdate);
	}
	@But ("^select the evaluation Appoinment to date as (.*)$")
	public void evaapptodate(String Todate) throws InterruptedException
	{
		Evaluationtestpage.evatodate(Todate);
	}
	
	@Then ("^click the search button$")
	public void evasearch() throws InterruptedException
	{
		Evaluationtestpage.clicksearchbutton();
	}
	@When ("^just select the Add case sheet for selected patient$")
	public void evacasesheet() throws InterruptedException
	{
		Evaluationtestpage.evaaddcasesheet();
	}
	@But ("^Validate the patientid, Age, Sex, Contactno and Priviledgeno as (.*), (.*), (.*), (.*) in casesheet for evaluation$")
	public void evavalidatecasesheet(String Age, String Sex, String Mobileno, String Priviledgeno) throws InterruptedException
	{
		Evaluationtestpage.casesheetpatientvali(Age, Sex, Mobileno, Priviledgeno);
	}
	
	//General link feilds
	@And ("^click general info and enter the Chief compliants as (.*)$")
	public void evachiefcomplan(String Chiefcomp) throws InterruptedException
	{
		Evaluationtestpage.chiefcomgn(Chiefcomp);
	}
	@When ("^Enter the Presenting complaint as (.*) in geninfo$")
	public void evapresentcomplan(String Presentcomp)
	{
		Evaluationtestpage.presentcomgn(Presentcomp);
	}
	@But ("^Enter the History presenting complaint as (.*) in geninfo$")
	public void evahistpresentcomplan(String Hisprescomp)
	{
		Evaluationtestpage.histpresentcomplangn(Hisprescomp);
	}
	@Then ("^Enter the Previous ocular history Injury as (.*) in geninfo$")
	public void evaprevocularhis(String Preocuhis)
	{
		Evaluationtestpage.prevocularhisgn(Preocuhis);
	}
	@Given ("^Enter the Systemic Illness/History as (.*) in geninfo$")
	public void evasysteillnes(String Sysilln)
	{
		Evaluationtestpage.systeillnesgn(Sysilln);
	}
	@When ("^Enter the Clinical history as (.*) in geninfo$")
	public void evaclininchistory(String Clinhis)
	{
		Evaluationtestpage.clininchistorygn(Clinhis);
	}
	@And ("^Enter the Treatment history as (.*) in geninfo$")
	public void evatreatehistory(String Treathis)
	{
		Evaluationtestpage.treatehistorygn(Treathis);
	}
	@Then ("^Enter the Family history as (.*) in geninfo$")
	public void evafamilyhistory(String Famihis)
	{
		Evaluationtestpage.familyhistorygn(Famihis);
	}
	@But ("^Enter the Allergies as (.*) in geninfo$")
	public void evaallergiery(String Allerg)
	{
		Evaluationtestpage.allergierygn(Allerg);
	}
	
	//VA value in case sheet
	@And ("^whether check the patientid same or not then only click to Visual Acuity$")
	public void evavisualacuity() throws InterruptedException
	{
		Evaluationtestpage.evavisualacu();
	}
	@Then ("^Select the visual acuity as unit type as (.*)$")
	public void evavaunittype(String VAunit) throws InterruptedException
	{
		Evaluationtestpage.evavaunit(VAunit);
	}
	@But ("^select the value of Right eye Un-Aided Dist as (.*)$")
	public void evarightUAdist(String RUAD) throws InterruptedException
	{
		Evaluationtestpage.rightunaideddist(RUAD);
	}
	@And ("^Select the Right eye Un-Aided Near as (.*)$")
	public void evarightUAnear(String RUAN)
	{
		Evaluationtestpage.rightunaidednear(RUAN);
	}
	@When ("^Select the Left eye Un-Aided Dist as (.*)$")
	public void evaleftUAdist(String LUAD)
	{
		Evaluationtestpage.leftunaideddist(LUAD);
	}
	@And ("^Select the Left eye Un-Aided Near as (.*)$")
	public void evaleftUAnear(String LUAN)
	{
		Evaluationtestpage.leftunaidednear(LUAN);
	}

	@Given ("^select the Right eye Aided Dist as (.*)$")
	public void evarightAdist(String RAD)
	{
		Evaluationtestpage.rightaideddist(RAD);
	}
	@But ("^Select the Right eye Aided Near as (.*)$")
	public void evarightAnear(String RAN)
	{
		Evaluationtestpage.rightaidednear(RAN);
	}
	@When ("^Select the Left eye Aided Dist as (.*)$")
	public void evaleftAdist(String LAD)
	{
		Evaluationtestpage.leftaideddist(LAD);
	}
	@Then ("^Select the Left eye Aided Near as (.*)$")
	public void evaleftAnear(String LAN)
	{
		Evaluationtestpage.leftaidednear(LAN);
	}
	@And ("^Select the Right eye Pinhole as (.*)$")
	public void evarightpin(String Rpinhole)
	{
		Evaluationtestpage.rightpinhole(Rpinhole);
	}
	@But ("^Select the Left eye Pinhole as (.*)$")
	public void evaleftpin(String Lpinhole)
	{
		Evaluationtestpage.leftpinhole(Lpinhole);
	}

	//subjective acceptance in case sheet
	@And ("^click to subjective acceptance link$")
	public void evasubacceptlink()
	{
		Evaluationtestpage.sblink();
	}
	@When ("^select the subjective acceptance of Right eyeDV Sphere as (.*)$")
	public void evarightdvsph(String RightDVSPH)
	{
		Evaluationtestpage.Rightsbdvsphear(RightDVSPH);
	}
	@And ("^select the subjective acceptance value of Right eyeDV Cylinder as (.*)$")
	public void evarightdvcyl(String RightDVCYL)
	{
		Evaluationtestpage.Rightsbdvcylinder(RightDVCYL);
	}
	@But ("^select the subjective acceptance value of Right eyeDV Axis as (.*)$")
	public void evarightdvaxis(String RightDVAxis)
	{
		Evaluationtestpage.Rightsbdvaxis(RightDVAxis);
	}
	@Then ("^select the subjective acceptance value of Right eyeDV Visual Acuity as (.*)$")
	public void evarightdvva(String RightDVVA)
	{
		Evaluationtestpage.Rightsbdvva(RightDVVA);
	}
	@When ("^select the subjective acceptance value of Left eyeDV Sphere as (.*)$")
	public void evaleftdvsph(String LeftDVSPH)
	{
		Evaluationtestpage.Leftsbdvsphear(LeftDVSPH);
	}
	@And ("^select the subjective acceptance value of Left eyeDV Cylinder as (.*)$")
	public void evaleftdvcyl(String LeftDVCYL)
	{
		Evaluationtestpage.Leftsbdvcylinder(LeftDVCYL);
	}
	@But ("^select the subjective acceptance value of Left eyeDV Axis as (.*)$")
	public void evaleftdvaxis(String LeftDVAxis)
	{
		Evaluationtestpage.Leftsbdvaxis(LeftDVAxis);
	}
	@Then ("^select the subjective acceptance value of Left eyeDV Visual Acuity as (.*)$")
	public void evaleftdvva(String LeftDVVA)
	{
		Evaluationtestpage.Leftsbdvva(LeftDVVA);
	}
	@When ("^select the subjective acceptance value of Right eyeNV Sphere as (.*)$")
	public void evarightnvsph(String RightNVSPH)
	{
		Evaluationtestpage.Rightsbnvsphear(RightNVSPH);
	}
	@And ("^validate the subjective acceptance value of Right eyeNV Cylinder$")
	public void evarightnvcyl()
	{
		Evaluationtestpage.Rightsbnvcylinder();
	}
	@But ("^validate the subjective acceptance value of Right eyeNV Axis$")
	public void evarightnvaxis()
	{
		Evaluationtestpage.Rightsbnvaxis();
	}
	@Then ("^select the subjective acceptance value of Right eyeNV Visual Acuity as (.*)$")
	public void evarightnvva(String RightNVVA)
	{
		Evaluationtestpage.Rightsbnvva(RightNVVA);
	}
	@When ("^select the subjective acceptance value of Left eyeNV Sphere as (.*)$")
	public void evaleftnvsph(String LeftNVSPH)
	{
		Evaluationtestpage.Leftsbnvsphear(LeftNVSPH);
	}
	@And ("^validate the subjective acceptance value of Left eyeNV Cylinder$")
	public void evaleftnvcyl()
	{
		Evaluationtestpage.Leftsbnvcylinder();
	}
	@But ("^validate the subjective acceptance value of Left eyeNV Axis$")
	public void evaleftnvaxis()
	{
		Evaluationtestpage.Leftsbnvaxis();
	}
	@But ("^select the subjective acceptance value of Left eyeNV Visual Acuity as (.*)$")
	public void evaleftnvva(String LeftNVVA)
	{
		Evaluationtestpage.Leftsbnvva(LeftNVVA);
	}

	//Intraocular pressure
	@And ("^click to intracular pressure link$")
	public void evaintracularpresslink()
	{
		Evaluationtestpage.intraocularpressurelink();
	}
	@When ("^Select the value of Right eye Schiotz max as (.*)$")
	public void evarightschmax(String RSMAX)
	{
		Evaluationtestpage.RightSchmax(RSMAX);
	}
	@But ("^Select the value of Right eye Schiotz min as (.*)$")
	public void evarightschmin(String RSMIN)
	{
		Evaluationtestpage.RightSchmin(RSMIN);
	}
	@Then ("^enter Right eye Schiotz remarks as (.*)$")
	public void evarightschremarks(String RSR)
	{
		Evaluationtestpage.RightSchremarks(RSR);
	}
	@And ("^Select the value of Left eye Schiotz max as (.*)$")
	public void evaleftschmax(String LSMAX)
	{
		Evaluationtestpage.LeftSchmax(LSMAX);
	}
	@But ("^Select the value of Left eye Schiotz min as (.*)$")
	public void evaleftschmin(String LSMIN)
	{
		Evaluationtestpage.LeftSchmin(LSMIN);
	}
	@Then ("^enter Left eye Schiotz remarks as (.*)$")
	public void evaleftschremarks(String LSR)
	{
		Evaluationtestpage.LeftSchremarks(LSR);
	}
	@When ("^Select the value of Right eye Applanation max as (.*)$")
	public void evarightappmax(String RAMAX)
	{
		Evaluationtestpage.RightAppmax(RAMAX);
	}
	@But ("^Select the value of Right eye Applanation min as (.*)$")
	public void evarightappmin(String RAMIN)
	{
		Evaluationtestpage.Rightappmin(RAMIN);
	}
	@Then ("^enter Right eye Applanation remarks as (.*)$")
	public void evarightappremarks(String RAR)
	{
		Evaluationtestpage.Rightappremarks(RAR);
	}
	@And ("^Select the value of Left eye Applanation max as (.*)$")
	public void evaleftappmax(String LAMAX)
	{
		Evaluationtestpage.Leftappmax(LAMAX);
	}
	@But ("^Select the value of Left eye Applanation min as (.*)$")
	public void evaleftappmin(String LAMIN)
	{
		Evaluationtestpage.Leftappmin(LAMIN);
	}
	@Then ("^enter Left eye Applanation remarks as (.*)$")
	public void evaleftappremarks(String LAR)
	{
		Evaluationtestpage.Leftappremarks(LAR);
	}
	@When ("^Select the value of Right eye Non-Contact max as (.*)$")
	public void evarightnoncatmax(String RNCMAX)
	{
		Evaluationtestpage.Rightnoncatmax(RNCMAX);
	}
	@But ("^Select the value of Right eye Non-Contact min as (.*)$")
	public void evarightnoncatmin(String RNCMIN)
	{
		Evaluationtestpage.Rightnoncatmin(RNCMIN);
	}
	@Then ("^enter Right eye Non-Contact remarks as (.*)$")
	public void evarightnoncatremarks(String RNCR)
	{
		Evaluationtestpage.Rightnoncatremarks(RNCR);
	}
	@And ("^Select the value of Left eye Non-Contact max as (.*)$")
	public void evaleftnoncatmax(String LNCMAX)
	{
		Evaluationtestpage.Leftnoncatmax(LNCMAX);
	}
	@But ("^Select the value of Left eye Non-Contact min as (.*)$")
	public void evaleftnoncatmin(String LNCMIN)
	{
		Evaluationtestpage.Leftnoncatmin(LNCMIN);
	}
	@Then ("^enter Left eye Non-Contact remarks as (.*)$")
	public void evaleftnoncatremarks(String LNCR)
	{
		Evaluationtestpage.Leftnoncatremarks(LNCR);
	}


	@Then ("^save the button$")
	public void evavasave() throws InterruptedException
	{
		Evaluationtestpage.vasave();
	}
	@Then ("^click to assign the next room$")
	public void evaassign() throws InterruptedException
	{
		Evaluationtestpage.assigncons();
	}
	@After
	public void teardowm(Scenario s) throws IOException, InterruptedException
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
