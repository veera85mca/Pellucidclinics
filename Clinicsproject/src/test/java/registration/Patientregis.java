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
import java.io.IOException;

import org.junit.Assert;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import generationreport.Screenshots;
import login.Initializer;
import login.Logintestpage;

public class Patientregis extends Initializer {

public static String failbrowser=null;
public static String failurl=null;
public static String failuser=null;
public static String failpass=null;

	@Given ("^select the browsers as (.*)$")
	public void browses(String Browser)
	{
		failbrowser=Browser;
	Patientregispage.regbrowse(Browser);
	}
	@When ("^enter the urls as (.*)$")
	public void urlrs(String Url)
	{
		failurl=Url;
		Logintestpage.geturl(Url);
	}
	@And ("^enter the usernames as (.*)$")
	public void users(String User)
	{
		failuser=User;
		Logintestpage.getusername(User);
	}
	@But ("^enter the passwords as (.*)$")
	public void passs(String Password)
	{
		failpass=Password;
		Logintestpage.getpassword(Password);
	}
	@And ("^check the radios button$")
	public void radios()
	{
		
	}
	@Then ("^click to logins button$")
	public void signins() throws InterruptedException
	{
		Logintestpage.login();
	}
	@When ("^click to Registration button$")
	public void pareg() throws IOException
	{
		Patientregispage.clickpatreg();
	}
	
	//Home Tab in registration
	@Given ("^select the priority of patient as (.*)$")
	public void papriority(String Priority) throws InterruptedException
	{
		Thread.sleep(5000);
		Patientregispage.patipriority(Priority);
	}
	@And ("^Is the patient id auto as (.*) enter the patient id as (.*)$")
	public void pait(String Auto, String Id) throws InterruptedException
	{
	Patientregispage.patietid(Auto, Id);
	}
	@Then ("^enter the firstname as (.*)$")
	public void pafirst(String First)
	{
		Patientregispage.namefirst(First);
	}
	@When ("^enter the middlename as (.*)$")
	public void pamiddle(String Middle)
	{
		Patientregispage.namemiddle(Middle);
	}
	@But ("^enter the lastname as (.*)$")
	public void palast(String Last)
	{
		Patientregispage.namelast(Last);
	}
	@Then ("^select the patientage as (.*)$")
	public void paage(String Age)
	{
		Patientregispage.patientage(Age);
	}
	@When ("^select the patientsex as (.*)$")
	public void pasex(String Sex)
	{
		Patientregispage.patientsex(Sex);
	}
	@And ("^select the marital status as (.*)$")
	public void pamarital(String Marital)
	{
		Patientregispage.patientmartial(Marital);
	}
	@But ("^need to select salutation except Mr,Ms,Mrs,Baby that already automated so give as (.*)$")
	public void pasal(String Salu) throws InterruptedException
	{
		Thread.sleep(1500);
		Patientregispage.pasalution(Salu);
	}
	@But ("^enter the mr number as (.*)$")
	public void pamrno(String Mrno)
	{
		Patientregispage.patimrno(Mrno);
	}
	@When ("^enter the contact no as (.*)$")
	public void patmobileno(String Mobilen)
	{
		Patientregispage.patimobile(Mobilen);
	}
	@And ("^enter the patient emailid as (.*)$")
	public void patemail(String Email)
	{
		Patientregispage.patiemailid(Email);
	}
	@When ("^select the patient type of id as (.*)$")
	public void pattypeid(String Typeid)
	{
		Patientregispage.patiidtype(Typeid);
	}
	@But ("^enter the patient id card number as (.*)$")
	public void patidcardno(String Idcardno)
	{
		Patientregispage.patiidno(Idcardno);
	}
	@And ("^select the patient Ethnic group as (.*)$")
	public void patethnic(String Ethnic)
	{
		Patientregispage.patiethenic(Ethnic);
	}
	@When ("^Select the Insurance company as (.*)$")
	public void patinsurecompany(String Insurcompany)
	{
		Patientregispage.patiinscom(Insurcompany);
	}
	@And ("^Select the insure Policy name as (.*)$")
	public void patinsurepolicyname(String Policyname)
	{
		Patientregispage.patiinsupolicyname(Policyname);
	}
	@Given ("^Enter the Insurance no as (.*)$")
	public void patinsureno(String Insureno)
	{
		Patientregispage.patiinsuno(Insureno);
	}
	@But ("^Enter the Name of the insurer as (.*)$")
	public void patinsurename(String Insurename)
	{
		Patientregispage.patiinsurname(Insurename);
	}
	
	//General Tab in registration
	@But ("enter the patient Place of birth as (.*)$")
	public void nativeplace(String Native)
	{
		Patientregispage.patinative(Native);
	}
	@And ("Enter the patient Occupation as (.*)$")
	public void occupation(String Occupation)
	{
		Patientregispage.patioccupy(Occupation);
	}
	@Then ("Select the patient Blood group as (.*)$")
	public void bloodgroup(String Bloodgroup)
	{
		Patientregispage.patibloodg(Bloodgroup);
	}
	@When ("Enter the patient Weight as (.*)$")
	public void weight(String Weight)
	{
		Patientregispage.patiweight(Weight);
	}
	@But ("Enter the patient nationality as (.*)$")
	public void nationality(String Nationality)
	{
		Patientregispage.patination(Nationality);
	}
	
	//Address tab in registration
	@Then ("Select the patient address country as (.*)$")
	public void country(String Country)
	{
		Patientregispage.paticountry(Country);
	}
	@And ("Select the patient state as (.*)$")
	public void state(String State) throws InterruptedException
	{
		Thread.sleep(1000);
		Patientregispage.patistate(State);
	}
	@When ("Enter the patient City as (.*)$")
	public void city(String City) throws InterruptedException
	{
		Thread.sleep(1000);
		Patientregispage.patiCity(City);
	}
	@Given ("Enter the patient street or area as (.*)$")
	public void streetarea(String Street)
	{
		Patientregispage.patistreet(Street);
	}
	@But ("Enter the patient state zipcode as (.*)$")
	public void zipcode(String Zipcode)
	{
		Patientregispage.patizipcode(Zipcode);
	}
	@When ("give the Privilege card no as (.*)$")
	public void privilegeno(String Privilegeno)
	{
		Patientregispage.patiprivilegeno(Privilegeno);
	}
	@And ("Enter the patient alternate mobile no as (.*)$")
	public void altermobileno(String Altermobile)
	{
		Patientregispage.patialtermno(Altermobile);
	}

	//Others in patient registration
	@Then ("^get the selected patient type as automated$")
	public void patype() throws InterruptedException
	{
		Thread.sleep(2000);
		Patientregispage.patitype();
	}
	@When ("^select the referral type as (.*), and give the name of referral as (.*)$")
	public void patreferraltype(String Referraltype, String Referralname)
	{
		Patientregispage.patireferraltype(Referraltype, Referralname);
	}
	@But ("^select to upload the patient image$")
	public void patientimage() throws IOException, InterruptedException
	{
		//Patientregispage.patiimage();
	}
	@And ("^enter the standing order as (.*)$")
	public void standing(String Standingorder) throws InterruptedException
	{
		Thread.sleep(2000);
		Patientregispage.patistanding(Standingorder);
	}
	@Then ("^select the patient Procedure name as (.*)$")
	public void patprocedure(String Procedure) throws InterruptedException
	{
		Patientregispage.patiprocedure(Procedure);
	}
	@Then ("^enter the general notes as (.*)$")
	public void patgeneralnotes(String Generalnotes)
	{
		Patientregispage.patigeneralnotes(Generalnotes);
	}
	@When ("^If age is below (.*), click to notification and then save button$")
	public void patregissave(Integer Agelimit) throws InterruptedException
	{
		Thread.sleep(2000);
		Patientregispage.patiregissave(Agelimit);
	}
	@But ("^register and assign to next room$")
	public void patassignto()
	{
		Patientregispage.patiregassign();
	}
	@Then ("^match the patient id, type, age and sex on Billing transaction then only save the button$")
	public void pairegmatch() throws InterruptedException, IOException
	{
		Patientregispage.patregmatchandsave();
	}
	@Given ("^Click to logout patient registration$")
	public void logoutpatregis() throws InterruptedException
	{
		Patientregispage.patreglogout();
	}
	
	
	
	
	
	
	
	
	//*REGISTRATION PATIENT VISIT DETAILS scenario*//
	@Given ("^Select the regis visit browser as (.*)$")
	public void visitbrowser(String vbrowse)
	{
		failbrowser=vbrowse;
		browses(vbrowse);
	}
	@When ("^enter the regis visit Url as (.*)$")
	public void visiturl(String vurl)
	{
		failurl=vurl;
		url(vurl);
	}
	@And ("^enter the regis visit user as (.*)$")
	public void visituser(String vusername)
	{
		failuser=vusername;
		Logintestpage.getusername(vusername);
	}
	@But ("^enter the regis visit pass as (.*)$")
	public void visitpass(String vpass)
	{
		failpass=vpass;
		Logintestpage.getpassword(vpass);
	}
	@Then ("^click to regis visit login$")
	public void visitlogin() throws InterruptedException
	{
		Logintestpage.login();
	}
	@When ("^click to Registration button for next visit$")
	public void visitregis() throws IOException
	{
		Patientregispage.clickpatreg();
	}
	@Then ("^click to search button and patientid as (.*) for the visit$")
    public void patiidsearch(String Patiid)
    {
		Patientregispage.visitpatiidsearch(Patiid);
    }
	@And ("^click to respectiive patientid for next visit registration$")
	public void clickrespatient()
	{
		Patientregispage.visitclickpatientid();
	}
	@When ("^Select the Previous visit history as (.*)$")
	public void patienthistory(String Visitno)
	{
		Patientregispage.visitpathistory(Visitno);
	}
	//Home tab features
	@And ("^Validate the priority details for visit as (.*)$")
	public void valipriority(String Vpriority) throws InterruptedException
	{
		Thread.sleep(3000);
		Patientregispage.visitpriority(Vpriority);
	}
	@But ("^Validate patientid for visit in registration$")
	public void valipatiid() throws InterruptedException
	{
		Thread.sleep(3000);
		Patientregispage.visitvalipatid();
	}
	@And ("^Validate firstname for visit in registration as (.*)$")
	public void valifname(String Vfirst)
	{
		Patientregispage.visitfirstname(Vfirst);
	}
	@But ("^Validate middlename for visit in registration as (.*)$")
	public void valimiddle(String Vmiddle)
	{
		Patientregispage.visitmiddlename(Vmiddle);
	}
	@When ("^Validate lastname for visit in registration as (.*)$")
	public void valilname(String Vlast)
	{
		Patientregispage.visitlastname(Vlast);
	}
	@Then ("^Validate age for visit in registration as (.*)$")
	public void valiage(String Vage)
	{
		Patientregispage.visitage(Vage);
	}
	@Given ("^Validate sex for visit in registration as (.*)$")
	public void valisex(String Vsex)
	{
		Patientregispage.visitsex(Vsex);
	}
	@And ("^Validate marital for visit in registration as (.*)$")
	public void valimarital(String Vmarital)
	{
		Patientregispage.visitmarital(Vmarital);
	}
	@Then ("^Validate the salutation for visit in registration as (.*)$")
	public void valisalutation(String Vsalutation)
	{
		Patientregispage.visitsalutation(Vsalutation);
	}
	@But ("^Validate mrno for visit in registration as (.*)$")
	public void valimrno(String Vmrno)
	{
		Patientregispage.visitmrno(Vmrno);
	}
	@Then ("^Validate mobileno for visit in registration as (.*)$")
	public void valimobileno(String Vmobileno)
	{
		Patientregispage.visitmobileno(Vmobileno);
	}
	@Given ("^Validate emailid for visit in registration as (.*)$")
	public void valiemailid(String Vemailid)
	{
		Patientregispage.visitemailid(Vemailid);
	}
	@But ("^Validate idcard for visit in registration as (.*)$")
	public void valiidcard(String Vidcard)
	{
		Patientregispage.visitidcard(Vidcard);
	}
	@And ("^Validate idcardno for visit in registration as (.*)$")
	public void valiidcardnio(String Vidcardno)
	{
		Patientregispage.visitidcardno(Vidcardno);
	}
	@Then ("^Validate ethnic for visit in registration as (.*)$")
	public void valiethnic(String Vethnic)
	{
		Patientregispage.visitethnic(Vethnic);
	}
	@When ("^Validate Insurance company for visit in registration as (.*)$")
	public void valiinsurcom(String VInsurcompany)
	{
		Patientregispage.visitinsurcomp(VInsurcompany);
	}
	@And ("^Validate insure Policy name for visit in registration as (.*)$")
	public void valiinsurpolicyname(String VPolicyname)
	{
		Patientregispage.visitinsurpolicyname(VPolicyname);
	}
	@Given ("^Validate Insurance no for visit in registration as (.*)$")
	public void valiinsurno(String VInsureno)
	{
		Patientregispage.visitinsurno(VInsureno);
	}
	@But ("^Validate Name of the insurer for visit in registration as (.*)$")
	public void valiinsurname(String VInsurename)
	{
		Patientregispage.visitinsurname(VInsurename);
	}
	//General Tab features
	@Given ("^Validate the Place of birth for visit in registration as (.*)$")
	public void valipob(String VPOB) throws InterruptedException
	{
		Patientregispage.genvisitbop(VPOB);
	}
	@But ("^Validate the Occupation for visit in registration as (.*)$")
	public void valioccupa(String VOccupa)
	{
		Patientregispage.genvisitoccu(VOccupa);
	}
	@Given ("^Validate the Blood group for visit in registration as (.*)$")
	public void valibg(String VBG)
	{
		Patientregispage.genvisitbg(VBG);
	}
	@And ("^Validate the Weight for visit in registration as (.*)$")
	public void valiweight(String VWeight)
	{
		Patientregispage.genvisitweight(VWeight);
	}
	@Then ("^Validate the Nationality for visit in registration as (.*)$")
	public void valination(String VNation)
	{
		Patientregispage.genvisitnation(VNation);
	}
	//Address Tab features
	@But ("^Validate the Country for visit in registration as (.*)$")
	public void valicountry(String VCountry)
	{
		Patientregispage.addvisitcountry(VCountry);
	}
	@Given ("^Validate the State for visit in registration as (.*)$")
	public void valiState(String VState) throws InterruptedException
	{
		Thread.sleep(2000);
		Patientregispage.addvisitstate(VState);
	}
	@When ("^Validate the City for visit in registration as (.*)$")
	public void valicity(String VCity)
	{
		Patientregispage.addvisitcity(VCity);
	}
	@And ("^Validate the Street for visit in registration as (.*)$")
	public void valistreet(String VStreet) throws InterruptedException
	{
		Patientregispage.addvisitstreet(VStreet);
	}
	@Then ("^Validate the Zip code for visit in registration as (.*)$")
	public void valizipcode(String VZipcode)
	{
		Patientregispage.addvisitzipcode(VZipcode);
	}
	@When ("^Validate the Privilege card no for visit in registration as (.*)$")
	public void valiprivilegeno(String VPrivilegeno)
	{
		Patientregispage.visitprivelegeno(VPrivilegeno);
	}
	@Then ("^Validate the Mobile no others for visit in registration as (.*)$")
	public void valialtermobile(String Valtermobile)
	{
		Patientregispage.addvisitaltermobil(Valtermobile);
	}
	
	//Other for visit details
	@When ("^Validate the patient visit count in registration$")
	public void valivisitcount()
	{
		Patientregispage.visitcount();
	}
	@When ("^Validate the referral type for visit as (.*), and respective name of referral for visit as (.*)$")
	public void valirefertype(String VReferraltype, String VReferralname)
	{
		Patientregispage.visitrefertype(VReferraltype, VReferralname);
	}
	@But ("^Validate the Standing order for visit in registration as (.*)$")
	public void valistandorder(String Vstandorder)
	{
		Patientregispage.visitstandorder(Vstandorder);
	}
	@And ("^Validate the Procedure name for visit in registration as (.*)$")
	public void valiprocedurename(String Vprocedure)
	{
		Patientregispage.visitprocedure(Vprocedure);
	}
	@Then ("^Validate the general notes for visit in registration as (.*)$")
	public void valigeneralnotes(String VGeneralnotes)
	{
		Patientregispage.visitgeneralnotes(VGeneralnotes);
	}
	@Then ("^Validate the agelimit as (.*) and would like to click save or assign to others as (.*) for visit registration$")
	public void visitagelimit(Integer Vagelimit, String VSaveAssign)
	{
		Patientregispage.Visit_agelimitsaveandassign(Vagelimit, VSaveAssign);
	}
	@And ("^Is this patient save means, then save and assign$")
	public void visitsaveandassign() throws InterruptedException
	{
		Thread.sleep(2000);
		Patientregispage.Visit_savepatient();
	}
	@And ("^Is this patient assign to others, Would you click to direct doctor or assign lab as (.*), if lab then departments are as (.*), (.*), (.*), (.*)$")
	public void visitassigntoothers(String VDoctorLab, String Vfirstlab, String Vsecondlab, String Vthirdlab, String Vfourthlab) throws InterruptedException
	{
		Patientregispage.Visit_assigntoothers(VDoctorLab, Vfirstlab, Vsecondlab, Vthirdlab, Vfourthlab);
	}
	@When ("^Validate the patient id, type, age and sex on Billing transaction for visit patient then only save the button$")
	public void visitvalidatebilling() throws InterruptedException, IOException
	{
		Patientregispage.patregmatchandsave();
	}
	@Then ("^click to logout after successfull visit registration$")
	public void visitlogout() throws InterruptedException
	{
		Patientregispage.patreglogout();
	}

	
	
	//if test cases failed then take screenshot and logout
	@After
	public void teardownpatientregis(Scenario s) throws IOException, InterruptedException
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
			Thread.sleep(5000);
			Logintestpage.logout();
			driver.quit();
			}
	}
	
}
