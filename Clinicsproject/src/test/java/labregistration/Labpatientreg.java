package labregistration;
/**
'**************************************************************
'  Name        : lab patient registration
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Sep 6, 2017
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
import login.Initializer;
import login.Logintestpage;

public class Labpatientreg extends Initializer {
	static String failbrowserla=null;
	static String failurlla=null;
	static String failuserla=null;
	static String failpassla=null;
	
	@Given ("^select the browser as (.*)$")
	public void labbrowse(String Browser)
	{
		failbrowserla=Browser;
		Logintestpage.browser(Browser);	
	}
	@When ("^enter the url as (.*)$")
	public void laburlr(String Url)
	{
		failurlla=Url;
		Logintestpage.geturl(Url);
	}
	@And ("^enter the username as (.*)$")
	public void labuser(String User)
	{
		failuserla=User;
		Logintestpage.getusername(User);
	}
	@But ("^enter the password as (.*)$")
	public void labpass(String Password)
	{
		failpassla=Password;
		Logintestpage.getpassword(Password);
	}
	@And ("^check the radio button$")
	public void labradio()
	{
		
	}
	@Then ("^click to login button$")
	public void labsignin()
	{
		Logintestpage.login();
	}
	@When ("^Click the lab registration button$")
	public void labpatreg()
	{
Labpatientregpage.labregpat();
	}
	@And ("^enter lab patient first name as (.*)$")
	public void labpatfirstname(String First)
	{
		Labpatientregpage.labregfirstname(First);
	}
	@When ("^enter the lab patient contact no as (.*)$")
	public void labpatcontactno(String Mobileno)
	{
Labpatientregpage.labregcontactno(Mobileno);
	}
	@But ("^enter lab patient last name as (.*)$")
	public void labpatlastname(String Last)
	{
		Labpatientregpage.labreglast(Last);
	}
	@And ("^select the age as (.*)$")
	public void labpatage(String Age)
	{
		Labpatientregpage.labregage(Age);
	}
	@When ("^select the sex as (.*)$")
	public void labpatsex(String Sex)
	{
		Labpatientregpage.labregsex(Sex);
	}
	@But ("^enter the referred by as (.*)$")
	public void labpatrefer(String Refer)
	{
		Labpatientregpage.labregrefer(Refer);
	}
	@Then ("^click the registration button and save the changes$")
	public void labpatregbutton() throws InterruptedException
	{
		Labpatientregpage.labregclickreg();
	
	}
	@When ("^do you want check the Haemoglobin report as (.*)$")
	public void labhaemo(String Haemo)
	{
		Labpatientregpage.labheamoreport(Haemo);
	}
	@But ("^do you want to check the TC report as (.*)$")
	public void labtc(String Tc)
	{
		Labpatientregpage.labtcreport(Tc);
	}
	@And ("^do you want to check the DC report as (.*)$")
	public void labdc(String Dc)
	{
		Labpatientregpage.labdcreport(Dc);
	}
	@Then ("^do you want check the RBC Count as (.*)$")
	public void labrbc(String Rbc)
	{
		Labpatientregpage.labrbcreport(Rbc);
	}
	@Then ("^need to save these changes$")
	public void savelab() throws InterruptedException
	{
	Labpatientregpage.labsavereport();	

	}

	
	
	
	@After
	public void teardownlabpatient(Scenario s) throws IOException, InterruptedException
	{
		if(s.isFailed())
		{
			Screenshots.getscreenshot(s);
			driver.close();
			initialize(failbrowserla);
			url(failurlla);
			Logintestpage.getusername(failuserla);
			Logintestpage.getpassword(failpassla);
			Logintestpage.loginalert();
			Thread.sleep(7000);
			Logintestpage.logout();
			driver.close();
		}
	}
	

}
