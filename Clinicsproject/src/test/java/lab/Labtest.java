package lab;
/**
'**************************************************************
'  Name        : Lab room
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: OCt 26, 2017
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

public class Labtest extends Initializer {

static String failbrowser=null;
static String failurl=null;
static String failuser=null;
static String failpass=null;
	@Given ("^select the browser as (.*)$")
	public void labrowser(String Browser)
	{
		failbrowser=Browser;
		initialize(Browser);
	}
	@And ("^enter the url as (.*)$")
	public void laurl(String Url)
	{
		failurl=Url;
		url(Url);
	}
	@Then ("^give the user name as (.*)$")
	public void lauser(String User)
	{
		failuser=User;
		Logintestpage.getusername(User);
	}
	@But ("^give the password as (.*)$")
	public void lapass(String Pass)
	{
		failpass=Pass;
		Logintestpage.getpassword(Pass);
	}
	@Then ("^click to login button$")
	public void lalogin()
	{
		Logintestpage.login();
	}
	@And ("^click to worklist column for lab$")
	public void laworklist()
	{
		Searchfilter.clickworklist();
	}
	@But ("^click to search filter link$")
	public void lasearchfil() throws InterruptedException
	{
		Searchfilter.clicksearchlink();
	}
	@When ("^enter the patientid as (.*) for lab search$")
	public void lapatientid(String Patientid) throws InterruptedException
	{
		Searchfilter.patientidseacrh(Patientid);
	}
	@Then ("^enter the app from date as (.*)$")
	public void laappfromdate(String Appfrom) throws InterruptedException
	{
		Searchfilter.appfromdate(Appfrom);
	}
	@When ("^enter the app to date as (.*)$")
	public void laapptodate(String Appto) throws InterruptedException
	{
		Searchfilter.apptodate(Appto);
	}
	@Then ("^Click to search button$")
	public void lasearchbutton() throws InterruptedException
	{
		Searchfilter.searchbutton();
		Thread.sleep(3000);
	}
	@And ("^Click to add lab report in respective patient$")
	public void labreporticon() throws IOException
	{
		Labtestpage.labiconclick();
	}
	@But ("^enter the Haemoglobin value as (.*)$")
	public void labhaem(String Haemoglobin)
	{
		if(!"none".equalsIgnoreCase(Haemoglobin))
		{
		Labtestpage.heamoglobinlab(Haemoglobin);
		}
		}
	@And ("^enter the TC value as (.*)$")
	public void labtc(String TC)
	{
		if(!"none".equalsIgnoreCase(TC))
		{
			Labtestpage.tclab(TC);
		}
	}
	@When ("^enter the DC value as (.*)$")
	public void labdc(String DC)
	{
		if(!"none".equalsIgnoreCase(DC))
		{
			Labtestpage.dclab(DC);
		}
	}
	@But ("^enter the RBC count as (.*)$")
	public void labrbc(String RBC)
	{
		if(!"none".equalsIgnoreCase(RBC))
		{
			Labtestpage.rbccountlab(RBC);
		}
	}
	@Then ("^Whether would like to click direct to doctor or save the patient as (.*), then assign$")
	public void labsaveass(String Directsave) throws InterruptedException
	{
		Labtestpage.saveassignlab(Directsave);
	Thread.sleep(6000);
Logintestpage.logout();
	driver.close();
	}
	
	
	@After
	public void teardownlab(Scenario s) throws IOException, InterruptedException
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
