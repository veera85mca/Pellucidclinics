package consultationretinal;
/**
'**************************************************************
'  Name        : Retinal non catract testcase for consultation
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Sep 22, 2017
'--------------------------------------------------------------
'  Mod Date    :    
'  Mod By      : 
'  Change Made : 
'**************************************************************
**/

import cucumber.api.java.en.Given;

import java.io.IOException;

import consultation.Consultationcommontestpage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import generationreport.Screenshots;
import generationreport.Searchfilter;
import login.Initializer;
import login.Logintestpage;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Then;

public class Consultationretinaltest extends Initializer {
	static String failbrowser=null;
	static String failurl=null;
	static String failuser=null;
	static String failpass=null;

	@Given ("^select the browser for retinalnoncat as (.*)$")
	public void retbrowser(String Browser)
	{
		failbrowser=Browser;
		Initializer.initialize(Browser);
	}
	@And ("^enter the url for retinalnoncat as (.*)$")
	public void returl(String Url)
	{
		failurl=Url;
		Initializer.url(Url);
	}
	@When ("^enter the username for retinalnoncat as (.*)$")
	public void retuser(String User)
	{
		failuser=User;
		Logintestpage.getusername(User);
	}
	@But ("^enter the password for retinalnoncat as (.*)$")
	public void retpass(String Pass)
	{
		failpass=Pass;
		Logintestpage.getpassword(Pass);
	}
	@Then ("^click the login for retinalnoncat$")
	public void retlogin() throws InterruptedException
	{
		Logintestpage.login();
	}
	@Given ("^click the retinal worklist coloumn$")
	public void retworklist()
	{
		Searchfilter.clickworklist();
	}
	@And ("^click the search filter for find patientid$")
	public void retsearchfilter() throws InterruptedException
	{
		Searchfilter.clicksearchlink();
	}
	@When ("^give the patient id as (.*) for retinal$")
	public void retpatientid(String Patiid) throws IOException, InterruptedException
	{
		Consultationcommontestpage.conspatid(Patiid);
	}
	@And ("^select the application from date as (.*) for retinalnoncat$")
	public void retappfrom(String Appfrom) throws InterruptedException
	{
		Consultationcommontestpage.appfromdate(Appfrom);
	}
	@But ("^select the application to date as (.*) for retinalnoncat$")
	public void retappto(String Appto) throws InterruptedException
	{
		Consultationcommontestpage.apptodate(Appto);
	}
	@Then ("^click to search for retinalnoncat$")
	public void retsearch()
	{
		Consultationcommontestpage.consearchbutton();
	}
	@When ("^click to patientname to corresponding patientid for retinalnoncat$")
	public void retpatiname() throws InterruptedException
	{
		Consultationcommontestpage.clickpatiname();
	}
	@Then ("^validate the patientid, age as (.*), sex as (.*), contactno as (.*), procedure as (.*) and then click case sheet tab for retinalnoncat$")
	public void retcasesheet(String Age, String Sex, String Contactno, String Procedure) throws InterruptedException
	{
		Consultationcommontestpage.casesheetclick(Age, Sex, Contactno, Procedure);
	}
//case sheet general field validation
	@When ("^validate the general Chief compliants as (.*) for retinalnoncat$")
	public void retinoncatgencheifcom(String Chiefcomp) throws InterruptedException
	{
		Consultationcommontestpage.gencheifcomcons(Chiefcomp);
	}
	@Given ("^validate the general Presenting complaint as (.*) for retinalnoncat$")
	public void retinoncatgenprescomp(String Presentcomp)
	{
		Consultationcommontestpage.genprescompcons(Presentcomp);
	}
	@When ("^validate the general History presenting complaint as (.*) for retinalnoncat$")
	public void retinoncatgenhisprescomp(String Hisprescomp)
	{
		Consultationcommontestpage.genhisprescompcons(Hisprescomp);
	}
	@And ("^validate the general Previous ocular history as (.*) for retinalnoncat$")
	public void retinoncatgenpreocuhis(String Preocuhis)
	{
		Consultationcommontestpage.genpreocuhiscons(Preocuhis);
	}
	@Then ("^validate the general Systemic Illness/History as (.*) for retinalnoncat$")
	public void retinoncatgensysill(String Sysilln)
	{
		Consultationcommontestpage.gensysillcons(Sysilln);
	}
	@But ("^validate the general Clinical history as (.*) for retinalnoncat$")
	public void retinoncatgenclinhis(String Clinhis)
	{
		Consultationcommontestpage.genclinhiscons(Clinhis);
	}
	@And ("^validate the general Treatment history as (.*) for retinalnoncat$")
	public void retinoncatgentreahis(String Treathis)
	{
		Consultationcommontestpage.gentreahiscons(Treathis);
	}
	@But ("^validate the general Family history as (.*) for retinalnoncat$")
	public void retinoncatgenfamihis(String Famihis)
	{
		Consultationcommontestpage.genfamihiscons(Famihis);
	}
	@Then ("^validate the general Allergies as (.*) for retinalnoncat$")
	public void retinoncatgenaller(String Allerg)
	{
		Consultationcommontestpage.genallercons(Allerg);
	}

//case sheet VA field validation
	@And ("^validate the VA Right eye Un-Aided Distance for retinalnoncat as (.*)$")
	public void retrightuadist(String RRUAD) throws InterruptedException
	{
		Consultationcommontestpage.ruadistance(RRUAD);
	}
	@But ("^validate the VA Right eye Un-Aided Near for retinalnoncat as (.*)$")
	public void retrightuanear(String RRUAN)
	{
		Consultationcommontestpage.ruanear(RRUAN);
	}
	@When ("^validate the VA Left eye Un-Aided Distance for retinalnoncat as (.*)$")
	public void retleftuadist(String RLUAD)
	{
		Consultationcommontestpage.luadistance(RLUAD);
	}
	@Given ("^validate the VA Left eye Un-Aided Near for retinalnoncat as (.*)$")
	public void retleftuanear(String RLUAN)
	{
		Consultationcommontestpage.luanear(RLUAN);
	}
	@Then ("^validate the VA Right eye Aided Dist as (.*) for retinalnoncat$")
	public void retinoncatrightadistance(String RAD)
	{
		Consultationcommontestpage.varightadistancecons(RAD);
	}
	@But ("^validate the VA Right eye Aided Near as (.*) for retinalnoncat$")
	public void retinoncatrightanear(String RAN)
	{
		Consultationcommontestpage.varightanearcons(RAN);
	}
	@When ("^validate the VA Left eye Aided Dist as (.*) for retinalnoncat$")
	public void retinoncatleftadistance(String LAD)
	{
		Consultationcommontestpage.valeftadistancecons(LAD);
	}
	@And ("^validate the VA Left eye Aided Near as (.*) for retinalnoncat$")
	public void retinoncatleftanear(String LAN)
	{
		Consultationcommontestpage.valeftanearcons(LAN);
	}
	@But ("^validate the VA Right eye Pinhole as (.*) for retinalnoncat$")
	public void retinoncatrightapinhole(String Rpinhole)
	{
		Consultationcommontestpage.varightapinholecons(Rpinhole);
	}
	@Then ("^validate the VA Left eye Pinhole as (.*) for retinalnoncat$")
	public void retinoncatleftapinhole(String Lpinhole)
	{
		Consultationcommontestpage.valeftapinholecons(Lpinhole);
	}
	
//subjective acceptance field validations
	@When ("^validate the subjective acceptance of Right eyeDV Sphere as (.*) for retinalnoncat$")
	public void retinoncatsarightdvsphere(String RightDVSPH)
	{
		Consultationcommontestpage.sarightdvspherecons(RightDVSPH);
	}
	@And ("^validate the subjective acceptance value of Right eyeDV Cylinder as (.*) for retinalnoncat$")
	public void retinoncatsarightdvcylinder(String RightDVCYL)
	{
		Consultationcommontestpage.sarightdvcylindercons(RightDVCYL);
	}
	@But ("^validate the subjective acceptance value of Right eyeDV Axis as (.*) for retinalnoncat$")
	public void retinoncatsarightdvaxis(String RightDVAxis)
	{
		Consultationcommontestpage.sarightdvaxiscons(RightDVAxis);
	}
	@Then ("^validate the subjective acceptance value of Right eyeDV Visual Acuity as (.*) for retinalnoncat$")
	public void retinoncatsarightdvvisualacu(String RightDVVA)
	{
		Consultationcommontestpage.sarightdvvisualacucons(RightDVVA);
	}
	@When ("^validate the subjective acceptance value of Left eyeDV Sphere as (.*) for retinalnoncat$")
	public void retinoncatsaleftdvsphere(String LeftDVSPH)
	{
		Consultationcommontestpage.saleftdvspherecons(LeftDVSPH);
	}
	@And ("^validate the subjective acceptance value of Left eyeDV Cylinder as (.*) for retinalnoncat$")
	public void retinoncatsaleftdvcylinder(String LeftDVCYL)
	{
		Consultationcommontestpage.saleftdvcylindercons(LeftDVCYL);
	}
	@But ("^validate the subjective acceptance value of Left eyeDV Axis as (.*) for retinalnoncat$")
	public void retinoncatsaleftdvaxis(String LeftDVAxis)
	{
		Consultationcommontestpage.saleftdvaxiscons(LeftDVAxis);
	}
	@Then ("^validate the subjective acceptance value of Left eyeDV Visual Acuity as (.*) for retinalnoncat$")
	public void retinoncatsaleftdvvisualacu(String LeftDVVA)
	{
		Consultationcommontestpage.saleftdvvisualacucons(LeftDVVA);
	}
	@When ("^validate the subjective acceptance value of Right eyeNV Sphere as (.*) for retinalnoncat$")
	public void retinoncatsarightnvsphere(String RightNVSPH)
	{
		Consultationcommontestpage.sarightnvspherecons(RightNVSPH);
	}
	@And ("^validate the subjective acceptance value of Right eyeNV Cylinder for retinalnoncat$")
	public void retinoncatsarightnvcylinder()
	{
		Consultationcommontestpage.sarightnvcylindercons();
	}
	@But ("^validate the subjective acceptance value of Right eyeNV Axis for retinalnoncat$")
	public void retinoncatsarightnvaxis()
	{
		Consultationcommontestpage.sarightnvaxiscons();
	}
	@Then ("^validate the subjective acceptance value of Right eyeNV Visual Acuity as (.*) for retinalnoncat$")
	public void retinoncatsarightnvvisualacu(String RightNVVA)
	{
		Consultationcommontestpage.sarightnvvisualacucons(RightNVVA);
	}
	@When ("^validate the subjective acceptance value of Left eyeNV Sphere as (.*) for retinalnoncat$")
	public void retinoncatsaleftnvsphere(String LeftNVSPH)
	{
		Consultationcommontestpage.saleftnvspherecons(LeftNVSPH);
	}
	@And ("^validate the subjective acceptance value of Left eyeNV Cylinder for retinalnoncat$")
	public void retinoncatsaleftnvcylinder()
	{
		Consultationcommontestpage.saleftnvcylindercons();
	}
	@But ("^validate the subjective acceptance value of Left eyeNV Axis for retinalnoncat$")
	public void retinoncatsaleftnvaxis()
	{
		Consultationcommontestpage.saleftnvaxiscons();
	}
	@And ("^validate the subjective acceptance value of Left eyeNV Visual Acuity as (.*) for retinalnoncat$")
	public void retinoncatsaleftnvvisualacu(String LeftNVVA)
	{
		Consultationcommontestpage.saleftnvvisualacucons(LeftNVVA);
	}
	
//Intraocluar pressure fields validation
	@When ("^validate the value of Right eye Schiotz max, min as (.*), (.*) for retinalnoncat$")
	public void retinoncaticrightschiotz(String RSMAX, String RSMIN)
	{
		Consultationcommontestpage.icrightschiotzcons(RSMAX, RSMIN);
	}
	@And ("^validate the value of Left eye Schiotz max, min as (.*), (.*) for retinalnoncat$")
	public void retinoncaticleftschiotz(String LSMAX, String LSMIN)
	{
		Consultationcommontestpage.icleftschiotzcons(LSMAX, LSMIN);
	}
	@When ("^validate the value of Right eye Applanation max, min as (.*), (.*) for retinalnoncat$")
	public void retinoncaticrightapplan(String RAMAX, String RAMIN)
	{
		Consultationcommontestpage.icrightapplancons(RAMAX, RAMIN);
	}
	@And ("^validate the value of Left eye Applanation max, min as (.*), (.*) for retinalnoncat$")
	public void retinoncaticleftapplan(String LAMAX, String LAMIN)
	{
		Consultationcommontestpage.icleftapplancons(LAMAX, LAMIN);
	}
	@When ("^validate the value of Right eye Non-Contact max, min as (.*), (.*) for retinalnoncat$")
	public void retinoncaticrightnoncat(String RNCMAX, String RNCMIN)
	{
		Consultationcommontestpage.icrightnoncatcons(RNCMAX, RNCMIN);
	}
	@And ("^validate the value of Left eye Non-Contact max, min as (.*), (.*) for retinalnoncat$")
	public void retinoncaticleftnoncat(String LNCMAX, String LNCMIN)
	{
		Consultationcommontestpage.icleftnoncatcons(LNCMAX, LNCMIN);
	}
	
	
	//retinal non cat fields
	@But ("^Check the right eye Diagnosis values as (.*) for retinalconsult$")
	public void retirightdiag(String Righteyediagnosis) throws InterruptedException
	{
		Consultationcommontestpage.righteyediagreport(Righteyediagnosis);
	}
	@And ("^Check the left eye Diagnosis values as (.*) for retinalconsult$")
	public void retileftdiag(String Lefteyediagnosis)
	{
		Consultationcommontestpage.lefteyediagreport(Lefteyediagnosis);
	}
	@When ("^Give the Advice feature in report as (.*) for retinalconsult$")
	public void retiadvice(String Advice)
	{
		Consultationcommontestpage.advicereport(Advice);
	}
	@When ("^Whether do you select report title or diagnosis as (.*), then report title or diagnosis values are as (.*) for retinalconsult$")
	public void retititlediagnosis(String titlediagnosis, String reporttemp)
	{
		Consultationcommontestpage.titlediagnosis(titlediagnosis, reporttemp);
	}
	@Then ("^click to others button$")
	public void retothers() throws IOException
	{
		Consultationretinaltestpage.clickothers();
	}
	@When ("^Would you like to refer the room as (.*)$")
	public void retreferroom(String other) throws InterruptedException
	{
		Consultationretinaltestpage.noncatretinalroom(other);
	}
	@And ("^if refer to room is department, then select the department as (.*)$")
	public void retrefdepart(String retirefer) throws InterruptedException
	{
		Consultationretinaltestpage.retireferdepartment(retirefer);
	}
	@But ("^if refer to room is Investigation, then select the scans as (.*), (.*), (.*), (.*)$")
	public void retrefinvest(String firstinv, String secondinv, String thirdinv, String fourthinv)
	{
		Consultationretinaltestpage.retireferinvestigation(firstinv, secondinv, thirdinv, fourthinv);
	}
	@Then ("^if refer to room is Lab, then select the scans as (.*), (.*), (.*), (.*)$")
	public void retreflab(String firstlab, String secondlab, String thirdlab, String fourthlab)
	{
		Consultationretinaltestpage.retireferlab(firstlab, secondlab, thirdlab, fourthlab);
	}
	@When ("^if refer to room is special procedure, then select procedure as (.*)$")
	public void retspecprocedure(String procedure)
	{
		Consultationretinaltestpage.retispecialprocedure(procedure);
	}
	@Then ("^Click to the next room for retinalnoncat$")
	public void retnext() throws InterruptedException
	{
		Consultationretinaltestpage.retinext();
	}

	@After
	public void teardown(Scenario s) throws IOException, InterruptedException
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
