package investigation;
/**
'**************************************************************
'  Name        : Investigation room
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Oct 20, 2017
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

public class Investigationtest extends Initializer{
	static String failbrowser=null;
	static String failurl=null;
	static String failuser=null;
	static String failpass=null;
	@Given ("^select the browser as (.*)$")
	public void invbrowser(String Browser) throws IOException
	{
		failbrowser=Browser;
		Investigationtestpage.invibrowser(Browser);
	}
	@When ("^give the url as (.*)$")
	public void invurl(String Url)
	{
		failurl=Url;
		url(Url);
	}
	@And ("^enter the username as (.*)$")
	public void invusername(String User)
	{
		failuser=User;
		Logintestpage.getusername(User);
	}
	@But ("^enter the password as (.*)$")
	public void invpassword(String Pass)
	{
		failpass=Pass;
		Logintestpage.getpassword(Pass);
	}
	@Then ("^click to login button$")
    public void invlogin()
    {
		Logintestpage.login();
    }
	@When ("click to worklist column$")
	public void invworklist()
	{
		Searchfilter.clickworklist();
	}
	@And ("click to search filter link$")
	public void invsearchfilter() throws InterruptedException
	{
		Searchfilter.clicksearchlink();
	}
	@But ("^enter the patientid as (.*) for investigation$")
	public void invpatientid(String Patientid) throws InterruptedException
	{
		Searchfilter.patientidseacrh(Patientid);
	}
	@Then ("^give the appfromdate as (.*) in investigation room$")
	public void invappfrom(String Appfrom) throws InterruptedException
	{
		Searchfilter.appfromdate(Appfrom);
	}
	@And ("^give the apptodate as (.*) in investigation room$")
	public void invappto(String Appto) throws InterruptedException
	{
		Searchfilter.apptodate(Appto);
	}
	@Then ("^click to search button for investigation$")
	public void invsearch()
	{
		Searchfilter.searchbutton();
	}
	@And ("^click image upload icon for respective patient$")
	public void imguploadicon() throws InterruptedException
	{
		Thread.sleep(3000);
		Investigationtestpage.iconimageinvi();
	}
	@But ("^select the Machine type as (.*)$")
	public void machineinv(String Machine)
	{
		Investigationtestpage.invimachine(Machine);
	}
	@And ("^upload Left eye images for investigation$")
	public void lefteyeimage() throws IOException, InterruptedException
	{
		Investigationtestpage.lefteyeinvi();
	}
	@When ("^upload Right eye images for investigation$")
	public void righteyeimage() throws IOException, InterruptedException
	{
		Investigationtestpage.righteyeinvi();
	}
	
	@Then ("^upload other image for investigation$")
	public void otherimage() throws InterruptedException, IOException
	{
		Investigationtestpage.otherinvi();
	}
	@But ("^upload report for investigation$")
	public void reportimage() throws InterruptedException, IOException
	{
		Investigationtestpage.reportinvi();
	}
	@Then ("click to upload button$")
	public void uploadinfo() throws InterruptedException
	{
		Investigationtestpage.uploadinvi();
		Logintestpage.logout();
		driver.close();
	}
@After
public void teardowninv(Scenario s) throws IOException, InterruptedException
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
