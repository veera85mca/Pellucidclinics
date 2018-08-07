package consultationnoncatract;
/**
'**************************************************************
'  Name        : Non catract testcase for consultation
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Sep 21, 2017
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

import consultation.Consultationcommontestpage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Then;

public class Consultnoncataracttest extends Initializer{

static String failbrowser=null;
static String failurl=null;
static String failuser=null;
static String failpass=null;

//*non catract workflow*//
	@Given ("^select the browser for noncataract as (.*)$")
	public void noncatbrowser(String Browser)
	{
		failbrowser=Browser;
		Initializer.initialize(Browser);
	}
	@When ("^give the url for noncataract as (.*)$")
	public void noncaturl(String Url)
	{
		failurl=Url;
		Initializer.url(Url);
	}
	
	@And ("^enter the user name for noncataract as (.*)$")
	public void noncatuser(String User)
	{
		failuser=User;
		Logintestpage.getusername(User);
	}
	@But ("^enter the password for noncataract as (.*)$")
	public void noncatpass(String Pass)
	{
		failpass=Pass;
		Logintestpage.getpassword(Pass);
	}
	@Then ("^click to login button for noncataract$")
	public void noncatlogin() throws InterruptedException
	{
		Logintestpage.login();
	}
	@When ("^click to worklist colomn for noncataract$")
	public void noncatworklist()
	{
		Searchfilter.clickworklist();
	}
	@And ("^click to search filter for noncataract$")
	public void noncatsearchfilter() throws InterruptedException
	{
		Searchfilter.clicksearchlink();
	}
	@But ("^give the patientid as (.*) for search in noncataract$")
	public void noncatpatientid(String patientid) throws IOException, InterruptedException
	{
		Consultationcommontestpage.conspatid(patientid);
	}
	@When ("^select the application from date as (.*) for noncataract$")
	public void noncatappfrom(String appfrom) throws InterruptedException
	{
		Consultationcommontestpage.appfromdate(appfrom);
	}
	@And ("^select the application to date as (.*) for noncataract$")
	public void noncatappto(String appto) throws InterruptedException
	{
		Consultationcommontestpage.apptodate(appto);
	}
	@Then ("^click to search button for noncataract$")
	public void noncatsearch()
	{
		Consultationcommontestpage.consearchbutton();
	}
	@When ("^want to click the patient name respective of patient id for noncatconsult$")
	public void noncatpatientname() throws InterruptedException
	{
		Consultationcommontestpage.clickpatiname();
	}
	@And ("^validate the patientid, age as (.*), sex as (.*), contactno as (.*), procedure as (.*) and then click casesheet tab for noncataract$")
	public void noncatcasesheet(String Age, String Sex, String Contactno, String Procedure) throws InterruptedException
	{
		Consultationcommontestpage.casesheetclick(Age, Sex, Contactno, Procedure);
	}
	//case sheet validation of general fields
	@When ("^validate the general Chief compliants as (.*) for noncatconsult$")
	public void noncatgencheifcom(String Chiefcomp) throws InterruptedException
	{
	Consultationcommontestpage.gencheifcomcons(Chiefcomp);
	}
	@Given ("^validate the general Presenting complaint as (.*) for noncatconsult$")
	public void noncatgenprescomp(String Presentcomp)
	{
	Consultationcommontestpage.genprescompcons(Presentcomp);	
	}
	@When ("^validate the general History presenting complaint as (.*) for noncatconsult$")
	public void noncatgenhisprescomp(String Hisprescomp)
	{
		Consultationcommontestpage.genhisprescompcons(Hisprescomp);
	}
	@And ("^validate the general Previous ocular history as (.*) for noncatconsult$")
	public void noncatgenpreocuhis(String Preocuhis)
	{
		Consultationcommontestpage.genpreocuhiscons(Preocuhis);
	}
	@Then ("^validate the general Systemic Illness/History as (.*) for noncatconsult$")
	public void noncatgensysill(String Sysilln)
	{
		Consultationcommontestpage.gensysillcons(Sysilln);
	}
	@But ("^validate the general Clinical history as (.*) for noncatconsult$")
	public void noncatgenclinhis(String Clinhis)
	{
		Consultationcommontestpage.genclinhiscons(Clinhis);
	}
	@And ("^validate the general Treatment history as (.*) for noncatconsult$")
	public void noncatgentreahis(String Treathis)
	{
		Consultationcommontestpage.gentreahiscons(Treathis);
	}
	@But ("^validate the general Family history as (.*) for noncatconsult$")
	public void noncatgenfamihis(String Famihis)
	{
		Consultationcommontestpage.genfamihiscons(Famihis);
	}
	@Then ("^validate the general Allergies as (.*) for noncatconsult$")
	public void noncatgenaller(String Allerg)
	{
		Consultationcommontestpage.genallercons(Allerg);
	}
	//case sheet validation of VA fields
	@But ("^validate the VA Right eye Un-Aided Distance as (.*) for noncatconsult$")
	public void noncatrightuadistance(String RUAD) throws InterruptedException
	{
		Consultationcommontestpage.ruadistance(RUAD);
	}
	@And ("^validate the VA Right eye Un-Aided Near as (.*) for noncatconsult$")
	public void noncatrightuanear(String RUAN)
	{
		Consultationcommontestpage.ruanear(RUAN);
	}
	@When ("^validate the VA Left eye Un-Aided Distance as (.*) for noncatconsult$")
	public void noncatleftuadistance(String LUAD)
	{
		Consultationcommontestpage.luadistance(LUAD);
	}
	@And ("^validate the VA Left eye Un-Aided Near as (.*) for noncatconsult$")
	public void noncatleftuanear(String LUAN)
	{
		Consultationcommontestpage.luanear(LUAN);
	}
	@Then ("^validate the VA Right eye Aided Dist as (.*) for noncatconsult$")
	public void noncatrightadistance(String RAD)
	{
		Consultationcommontestpage.varightadistancecons(RAD);	
	}
	@But ("^validate the VA Right eye Aided Near as (.*) for noncatconsult$")
	public void noncatrightanear(String RAN)
	{
		Consultationcommontestpage.varightanearcons(RAN);
	}
	@When ("^validate the VA Left eye Aided Dist as (.*) for noncatconsult$")
	public void noncatleftadistance(String LAD)
	{
		Consultationcommontestpage.valeftadistancecons(LAD);
	}
	@And ("^validate the VA Left eye Aided Near as (.*) for noncatconsult$")
	public void noncatleftanear(String LAN)
	{
		Consultationcommontestpage.valeftanearcons(LAN);
	}
	@But ("^validate the VA Right eye Pinhole as (.*) for noncatconsult$")
	public void noncatrightapinhole(String Rpinhole)
	{
		Consultationcommontestpage.varightapinholecons(Rpinhole);
	}
	@Then ("^validate the VA Left eye Pinhole as (.*) for noncatconsult$")
	public void noncatleftapinhole(String Lpinhole)
	{
		Consultationcommontestpage.valeftapinholecons(Lpinhole);
	}
	
	//case sheet for subjective acceptance fields
	@When ("^validate the subjective acceptance of Right eyeDV Sphere as (.*) for noncatconsult$")
	public void noncatsarightdvsphere(String RightDVSPH)
	{
		Consultationcommontestpage.sarightdvspherecons(RightDVSPH);
	}
	@And ("^validate the subjective acceptance value of Right eyeDV Cylinder as (.*) for noncatconsult$")
	public void noncatsarightdvcylinder(String RightDVCYL)
	{
		Consultationcommontestpage.sarightdvcylindercons(RightDVCYL);
	}
	@But ("^validate the subjective acceptance value of Right eyeDV Axis as (.*) for noncatconsult$")
	public void noncatsarightdvaxis(String RightDVAxis)
	{
		Consultationcommontestpage.sarightdvaxiscons(RightDVAxis);
	}
	@Then ("^validate the subjective acceptance value of Right eyeDV Visual Acuity as (.*) for noncatconsult$")
	public void noncatsarightdvvisualacu(String RightDVVA)
	{
		Consultationcommontestpage.sarightdvvisualacucons(RightDVVA);
	}
	@When ("^validate the subjective acceptance value of Left eyeDV Sphere as (.*) for noncatconsult$")
	public void noncatsaleftdvsphere(String LeftDVSPH)
	{
		Consultationcommontestpage.saleftdvspherecons(LeftDVSPH);
	}
	@And ("^validate the subjective acceptance value of Left eyeDV Cylinder as (.*) for noncatconsult$")
	public void noncatsaleftdvcylinder(String LeftDVCYL)
	{
		Consultationcommontestpage.saleftdvcylindercons(LeftDVCYL);
	}
	@But ("^validate the subjective acceptance value of Left eyeDV Axis as (.*) for noncatconsult$")
	public void noncatsaleftdvaxis(String LeftDVAxis)
	{
		Consultationcommontestpage.saleftdvaxiscons(LeftDVAxis);
	}
	@Then ("^validate the subjective acceptance value of Left eyeDV Visual Acuity as (.*) for noncatconsult$")
	public void noncatsaleftdvvisualacu(String LeftDVVA)
	{
		Consultationcommontestpage.saleftdvvisualacucons(LeftDVVA);
	}
	@When ("^validate the subjective acceptance value of Right eyeNV Sphere as (.*) for noncatconsult$")
	public void noncatsarightnvsphere(String RightNVSPH)
	{
		Consultationcommontestpage.sarightnvspherecons(RightNVSPH);
	}
	@And ("^validate the subjective acceptance value of Right eyeNV Cylinder for noncatconsult$")
	public void noncatsarightnvcylinder()
	{
		Consultationcommontestpage.sarightnvcylindercons();
	}
	@But ("^validate the subjective acceptance value of Right eyeNV Axis for noncatconsult$")
	public void noncatsarightnvaxis()
	{
		Consultationcommontestpage.sarightnvaxiscons();
	}
	@Then ("^validate the subjective acceptance value of Right eyeNV Visual Acuity as (.*) for noncatconsult$")
	public void noncatsarightnvvisualacu(String RightNVVA)
	{
		Consultationcommontestpage.sarightnvvisualacucons(RightNVVA);
	}
	@When ("^validate the subjective acceptance value of Left eyeNV Sphere as (.*) for noncatconsult$")
	public void noncatsaleftnvsphere(String LeftNVSPH)
	{
		Consultationcommontestpage.saleftnvspherecons(LeftNVSPH);
	}
	@And ("^validate the subjective acceptance value of Left eyeNV Cylinder for noncatconsult$")
	public void noncatsaleftnvcylinder()
	{
		Consultationcommontestpage.saleftnvcylindercons();
	}
	@But ("^validate the subjective acceptance value of Left eyeNV Axis for noncatconsult$")
	public void noncatsaleftnvaxis()
	{
		Consultationcommontestpage.saleftnvaxiscons();
	}
	@And ("^validate the subjective acceptance value of Left eyeNV Visual Acuity as (.*) for noncatconsult$")
	public void noncatsaleftnvvisualacu(String LeftNVVA)
	{
		Consultationcommontestpage.saleftnvvisualacucons(LeftNVVA);
	}
	//case sheet Intraocular pressure validation
	@When ("^validate the value of Right eye Schiotz max, min as (.*), (.*) for noncatconsult$")
	public void noncaticrightschiotz(String RSMAX, String RSMIN)
	{
		Consultationcommontestpage.icrightschiotzcons(RSMAX, RSMIN);
	}
	@And ("^validate the value of Left eye Schiotz max, min as (.*), (.*) for noncatconsult$")
	public void noncaticleftschiotz(String LSMAX, String LSMIN)
	{
		Consultationcommontestpage.icleftschiotzcons(LSMAX, LSMIN);
	}
	@When ("^validate the value of Right eye Applanation max, min as (.*), (.*) for noncatconsult$")
	public void noncaticrightapplan(String RAMAX, String RAMIN)
	{
		Consultationcommontestpage.icrightapplancons(RAMAX, RAMIN);
	}
	@And ("^validate the value of Left eye Applanation max, min as (.*), (.*) for noncatconsult$")
	public void noncaticleftapplan(String LAMAX, String LAMIN)
	{
		Consultationcommontestpage.icleftapplancons(LAMAX, LAMIN);
	}
	@When ("^validate the value of Right eye Non-Contact max, min as (.*), (.*) for noncatconsult$")
	public void noncaticrightnoncat(String RNCMAX, String RNCMIN)
	{
		Consultationcommontestpage.icrightnoncatcons(RNCMAX, RNCMIN);
	}
	@And ("^validate the value of Left eye Non-Contact max, min as (.*), (.*) for noncatconsult$")
	public void noncaticleftnoncat(String LNCMAX, String LNCMIN)
	{
		Consultationcommontestpage.icleftnoncatcons(LNCMAX, LNCMIN);
	}
	
	//non catract fields
	@But ("^Check the right eye Diagnosis values as (.*) for noncatconsult$")
	public void noncatrightdiagnosis(String Righteyediagnosis) throws InterruptedException
	{
		Consultationcommontestpage.righteyediagreport(Righteyediagnosis);
	}
	@And ("^Check the left eye Diagnosis values as (.*) for noncatconsult$")
	public void noncatleftdiagnosis(String Lefteyediagnosis)
	{
		Consultationcommontestpage.lefteyediagreport(Lefteyediagnosis);
	}
	@When ("^Give the Advice to report as (.*) for noncatconsult$")
	public void noncatadvice(String Advice)
	{
		Consultationcommontestpage.advicereport(Advice);
	}
	@But ("^Whether do you to select the report title or diagnosis as (.*), then report title or diagnosis values are as (.*) for noncatconsult$")
	public void noncattitlediag(String titlediagnosis, String reporttemp)
	{
		Consultationcommontestpage.titlediagnosis(titlediagnosis, reporttemp);
	}	
	@Then ("^whether do you want to save as draft or finalize button as (.*) as noncatract$")
	public void noncatfinalize(String Finalize) throws InterruptedException, IOException
	{
		Consultnoncataracttestpage.nonfin(Finalize);
	}
	@When ("^select the value of Right eyeDV Sphere as (.*)$")
	public void rightdvsphere(String RDVSPH)
	{
		Consultnoncataracttestpage.righteyedvsphere(RDVSPH);
	}
	@And ("^select the value of Right eyeDV Cylinder as (.*)$")
	public void rightdvcylinder(String RDVCYL)
	{
		Consultnoncataracttestpage.righteyedvcylinder(RDVCYL);
	}
	@But ("^select the value of Right eyeDV Axis as (.*)$")
	public void rightdvaxis(String RDVAxis)
	{
		Consultnoncataracttestpage.righteyedvaxis(RDVAxis);
	}
	@Then ("^select the value of Right eyeDV Visual Acuity as (.*)$")
	public void rightdvvisualacuity(String RDVVA)
	{
		Consultnoncataracttestpage.righteyedvvisualacuity(RDVVA);
	}
	@When ("^select the value of Left eyeDV Sphere as (.*)$")
	public void leftdvsphere(String LDVSPH)
	{
		Consultnoncataracttestpage.lefteyedvsphere(LDVSPH);
	}
	@And ("^select the value of Left eyeDV Cylinder as (.*)$")
	public void leftdvcylinder(String LDVCYL)
	{
		Consultnoncataracttestpage.lefteyedvcylinder(LDVCYL);
	}
	@But ("^select the value of Left eyeDV Axis as (.*)$")
	public void leftdvaxis(String LDVAxis)
	{
		Consultnoncataracttestpage.lefteyedvaxis(LDVAxis);
	}
	@Then ("^select the value of Left eyeDV Visual Acuity as (.*)$")
	public void leftdvvisualacuity(String LDVVA)
	{
		Consultnoncataracttestpage.lefteyedvvisualacuity(LDVVA);
	}
	@When ("^select the value of Right eyeNV Sphere as (.*)$")
	public void rightnvsphere(String RNVSPH)
	{
		Consultnoncataracttestpage.righteyenvsphere(RNVSPH);
	}
	@Then ("^select the value of Right eyeNV Visual Acuity as (.*)$")
	public void rightnvvisualacuity(String RNVVA)
	{
		Consultnoncataracttestpage.righteyenvvisualacuity(RNVVA);
	}
	@When ("^select the value of Left eyeNV Sphere as (.*)$")
	public void leftnvsphere(String LNVSPH)
	{
		Consultnoncataracttestpage.lefteyenvsphere(LNVSPH);
	}
	@But ("^select the value of Left eyeNV Visual Acuity as (.*)$")
	public void leftnvvisualacuity(String LNVVA)
	{
		Consultnoncataracttestpage.lefteyenvvisualacuity(LNVVA);
	}
	@And ("^enter the Pupil distance value as (.*) mm$")
	public void pubildis(String pubil)
	{
		Consultnoncataracttestpage.pubildistance(pubil);
	}
	@Then ("^give the Remarks as (.*)$")
	public void glassremarks(String rem)
	{
		Consultnoncataracttestpage.glassremark(rem);
	}
	@Then ("^click to save the glass prescription$")
	public void saveglass()
	{
		Consultnoncataracttestpage.saveglass();
	}
	@But ("^select the template of medicine as (.*)$")
	public void meditemp(String medi) throws InterruptedException
	{
		Consultnoncataracttestpage.medicinetemp(medi);
	}
	@Then ("^click to save the medicine details$")
	public void savemedi() throws InterruptedException
	{
		Consultnoncataracttestpage.savemedi();
	}
	
	
	
	
	//*SAVE AS DRAFT CASES for noncatract scenario*//
	@Given ("^Select the save draft browser as (.*)$")
	public void Savedraft_bowser(String SBrowser)
	{
		failbrowser=SBrowser;
		Initializer.initialize(SBrowser);
	}
	@When ("^Enter the save draft url as (.*)$")
	public void Savedraft_url(String SUrl)
	{
		failurl=SUrl;
		Initializer.url(SUrl);
	}
	@And ("^enter the save draft user as (.*)$")
	public void Savedraft_user(String Susername)
	{
		failuser=Susername;
		Logintestpage.getusername(Susername);
	}
	@But ("^enter the save draft pass as (.*)$")
	public void Savedraft_pass(String Spass)
	{
		failpass=Spass;
		Logintestpage.getpassword(Spass);
	}
	@Then ("^click to save draft login$")
	public void Savedraft_login() throws InterruptedException
	{
		Logintestpage.login();
	}
	@When ("^click to worklist colomn for save draft$")
	public void Savedraft_worklist()
	{
		Searchfilter.clickworklist();
	}
	@And ("^click to search filter for save draft$")
	public void Savedraft_searchfilter() throws InterruptedException
	{
		Searchfilter.clicksearchlink();
	}
	@But ("^give the patientid as (.*) for search in save draft$")
	public void Savedraft_patientid(String SPatientid) throws IOException, InterruptedException
	{
		Consultationcommontestpage.conspatid(SPatientid);
	}
	@When ("^select the application from date as (.*) for save draft$")
	public void Savedraft_appfrom(String SAppfrom) throws InterruptedException
	{
		Consultationcommontestpage.appfromdate(SAppfrom);
	}
	@And ("^select the application to date as (.*) for save draft$")
	public void Savedraft_apptodate(String SAppto) throws InterruptedException
	{
		Consultationcommontestpage.apptodate(SAppto);
	}
	@Then ("^click to search button for save draft$")
	public void Savedraft_searchbutton()
	{
		Consultationcommontestpage.consearchbutton();
	}
	@When ("^want to click the patient name respective of patient id for save draft$")
	public void Savedraft_patientname() throws InterruptedException
	{
		Consultationcommontestpage.clickpatiname();
	}
	@But ("Validate the right eye Diagnosis values as (.*) for save draft$")
	public void Savedraft_righteyediagnosis(String SRightvalidiagnosis) throws IOException, InterruptedException
	{
		Consultnoncataracttestpage.rightdiasavedraft(SRightvalidiagnosis);
	}
	@And ("Validate the left eye Diagnosis values as (.*) for save draft$")
	public void Savedraft_lefteyediagnosis(String SLeftvalidiagnosis) throws InterruptedException
	{
	Consultnoncataracttestpage.leftdiasavedraft(SLeftvalidiagnosis);	
	}
	@Then ("Validate the Advice as (.*), and then Report title as (.*)$")
	public void Savedraft_AdviceRtitle(String SAdvice, String STitle) throws InterruptedException
	{
		Consultnoncataracttestpage.advicetitlesavedraft(SAdvice, STitle);
	}
	@Then ("do you want to finalize button or save draft as (.*) for save draft workflow in noncatract$")
	public void Savedraft_finalize(String SFinalize) throws InterruptedException, IOException
	{
		Consultnoncataracttestpage.nonfin(SFinalize);
	}
	@When ("select the value of Right eyeDV Sphere for save draft as (.*)$")
	public void Savedraft_rightdvspear(String SREDVSPH)
	{
		Consultnoncataracttestpage.righteyedvsphere(SREDVSPH);
	}
	@And ("select the value of Right eyeDV Cylinder for save draft as (.*)$")
	public void Savedraft_rightdvcylinder(String SREDVCYL)
	{
		Consultnoncataracttestpage.righteyedvcylinder(SREDVCYL);
	}
	@But ("select the value of Right eyeDV Axis for save draft as (.*)$")
	public void Savedraft_rightdvaxis(String SREDVAxis)
	{
		Consultnoncataracttestpage.righteyedvaxis(SREDVAxis);
	}
	@Then ("select the value of Right eyeDV Visual Acuity for save draft as (.*)$")
	public void Savedraft_rightdvva(String SREDVVA)
	{
		Consultnoncataracttestpage.righteyedvvisualacuity(SREDVVA);
	}
	@When ("select the value of Left eyeDV Sphere for save draft as (.*)$")
	public void Savedraft_leftdvsphere(String SLEDVSPH)
	{
		Consultnoncataracttestpage.lefteyedvsphere(SLEDVSPH);
	}
	@And ("select the value of Left eyeDV Cylinder for save draft as (.*)$")
	public void Savedraft_leftdvcylinder(String SLEDVCYL)
	{
		Consultnoncataracttestpage.lefteyedvcylinder(SLEDVCYL);
	}
	@But ("select the value of Left eyeDV Axis for save draft as (.*)$")
	public void Savedraft_leftdvaxis(String SLEDVAxis)
	{
		Consultnoncataracttestpage.lefteyedvaxis(SLEDVAxis);
	}
	@Then ("select the value of Left eyeDV Visual Acuity for save draft as (.*)$")
	public void Savedraft_leftdvva(String SLEDVVA)
	{
		Consultnoncataracttestpage.lefteyedvvisualacuity(SLEDVVA);
	}
	@When ("select the value of Right eyeNV Sphere for save draft as (.*)$")
	public void Savedraft_rightnvsphere(String SRENVSPH)
	{
		Consultnoncataracttestpage.righteyenvsphere(SRENVSPH);
	}
	@Then ("select the value of Right eyeNV Visual Acuity for save draft as (.*)$")
	public void Savedraft_rightnvva(String SRENVVA)
	{
		Consultnoncataracttestpage.righteyenvvisualacuity(SRENVVA);
	}
	@When ("select the value of Left eyeNV Sphere for save draft as (.*)$")
	public void Savedraft_leftnvsphere(String SLENVSPH)
	{
		Consultnoncataracttestpage.lefteyenvsphere(SLENVSPH);
	}
	@But ("select the value of Left eyeNV Visual Acuity for save draft as (.*)$")
	public void Savedraft_leftnvva(String SLENVVA)
	{
		Consultnoncataracttestpage.lefteyenvvisualacuity(SLENVVA);
	}
	@And ("enter the Pupil distance value for save draft as (.*) mm$")
	public void Savedraft_pupildistance(String Spupildistance)
	{
		Consultnoncataracttestpage.pubildistance(Spupildistance);
	}
	@Then ("give the Remarks for save draft as (.*)$")
	public void Savedraft_remarks(String Sremarks)
	{
		Consultnoncataracttestpage.glassremark(Sremarks);
	}
	@Then ("click to save the glass prescription for save draft$")
	public void Savedraft_saveglass()
	{
		Consultnoncataracttestpage.saveglass();
	}
	@But ("select the template of medicine for save draft as (.*)$")
	public void Savedraft_medicinetem(String Smedicine) throws InterruptedException
	{
		Consultnoncataracttestpage.medicinetemp(Smedicine);
	}
	@Then ("click to save the medicine details for save draft$")
	public void Savedraft_savemedicine() throws InterruptedException
	{
		Consultnoncataracttestpage.savemedi();
	}
	
	//*ADD ADDENDUM for noncatract scenario*//
	@Given ("Select the add addendum browser as (.*)$")
	public void addaddendum_browser(String ABrowser)
	{
		failbrowser=ABrowser;
		Initializer.initialize(ABrowser);
	}
	@When ("Enter the add addendum url as (.*)$")
	public void addaddendum_url(String AUrl)
	{
		failurl=AUrl;
		Initializer.url(AUrl);
	}
	@And ("enter the add addendum user as (.*)$")
	public void addaddendum_user(String Ausername)
	{
		failuser=Ausername;
		Logintestpage.getusername(Ausername);
	}
	@But ("enter the add addendum pass as (.*)$")
	public void addaddendum_pass(String Apass)
	{
		failpass=Apass;
		Logintestpage.getpassword(Apass);
	}
	@Then ("click to add addendum login$")
	public void addaddendum_login() throws InterruptedException
	{
		Logintestpage.login();
	}
	@When ("click to worklist colomn for add addendum$")
	public void addaddendum_worklist()
	{
		Searchfilter.clickworklist();
	}
	@And ("click the report tab in worklist for add addendum$")
	public void addaddendum_reporttab() throws IOException
	{
		Consultnoncataracttestpage.reporttabaddendum();
	}
	@And ("click to search filter for add addendum$")
	public void addaddendum_searchfilter() throws InterruptedException
	{
		Thread.sleep(3000);
		Searchfilter.clicksearchlink();
	}
	@But ("give the patientid as (.*) for search in add addendum$")
	public void addaddendum_patientid(String APatientid) throws InterruptedException
	{
		Thread.sleep(3000);
		Searchfilter.patientidseacrh(APatientid);
	}
	@When ("select the application from date as (.*) for add addendum$")
	public void addaddendum_appfromdate(String AAppfrom) throws InterruptedException
	{
		Searchfilter.appfromdate(AAppfrom);
	}
	@And ("select the application to date as (.*) for add addendum$")
	public void addaddendum_apptodate(String AAppto) throws InterruptedException
	{
		Searchfilter.apptodate(AAppto);
	}
	@Then ("click to search button for add addendum$")
	public void addaddendum_searchbutton()
	{
		Searchfilter.searchbutton();
	}
	@When ("want to click the patient name respective of patient id for add addendum$")
	public void addaddendum_patientname() throws InterruptedException, IOException
	{
		Consultationcommontestpage.consultcommonlocators();
		Consultationcommontestpage.clickpatiname();
	}
	@But ("Click to add addendum button in casesheet and addendum as (.*)$")
	public void addaddendum_details(String Aaddendum)
	{
		Consultnoncataracttestpage.addendumdetail(Aaddendum);
	}
	@Then ("Click to save button the add addendum$")
	public void addaddendumsave() throws InterruptedException
	{
		Thread.sleep(5000);
		Consultnoncataracttestpage.saveaddendum();
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
