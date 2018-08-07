package optical;
/**
'**************************************************************
'  Name        : Optical room
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Oct 24, 2017
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

public class Opticaltest extends Initializer{
	static String failbrowser=null;
	static String failurl=null;
	static String failuser=null;
	static String failpass=null;
	
	@Given ("^select the browser as (.*)$")
	public void optbrowser(String Browser)
	{
		failbrowser=Browser;
		initialize(Browser);
	}
	@And ("^enter the Url as (.*)$")
	public void opturl(String Url)
	{
		failurl=Url;
		url(Url);
	}
	@When ("^give the username as (.*)$")
	public void optuser(String User)
	{
		failuser=User;
		Logintestpage.getusername(User);
	}
	@But ("^give the password as (.*)$")
	public void optpass(String Pass)
	{
		failpass=Pass;
		Logintestpage.getpassword(Pass);
	}
	@Then ("^Click to login button for Optical$")
	public void optlogin()
	{
		Logintestpage.login();
	}
	@When ("^Click to worklist icon$")
	public void optworklist()
	{
		Searchfilter.clickworklist();
	}
	@And ("^Click to search filter link for optical$")
	public void optsearchfilter() throws InterruptedException
	{
		Searchfilter.clicksearchlink();
	}
	@But ("^enter the patientid as (.*) in search$")
	public void optpatientid(String Patientid) throws InterruptedException
	{
		Searchfilter.patientidseacrh(Patientid);
	}
	@When ("^give the appfrom date as (.*)$")
	public void optappfromdate(String Appfrom) throws InterruptedException
	{
		Searchfilter.appfromdate(Appfrom);
	}
	@And ("^give the appto date as (.*)$")
	public void optapptodate(String Appto) throws InterruptedException
	{
		Searchfilter.apptodate(Appto);
	}
	@Then ("^Click to search button for optical$")
	public void optsearch()
	{
		Searchfilter.searchbutton();
	}
	@But ("^click to icon of purchase spectacles$")
	public void optspecicon() throws InterruptedException, IOException
	{
		Thread.sleep(3000);
	Opticaltestpage.optiiconspec();
	}
	@And ("^enter the Spectacle name as (.*)$")
	public void optspec(String spectacle) throws InterruptedException
	{
		Thread.sleep(3000);
		Opticaltestpage.spectaclename(spectacle);
	}
	@When ("^enter the Frame name as (.*)$")
	public void optframe(String Frame)
	{
		Opticaltestpage.framename(Frame);
	}
	@Then ("^enter the Contact lens name as (.*)$")
	public void optsconlense(String Contactlens)
	{
		Opticaltestpage.contactlenseopt(Contactlens);
	}
	@And ("^enter the Sunglassess as (.*)$")
	public void optsunglass(String Sunglassess)
	{
		Opticaltestpage.sunglassessopt(Sunglassess);
	}
	@When ("^enter the other glass as (.*)$")
	public void optothers(String Others)
	{
		Opticaltestpage.othersopt(Others);
	}
	@But ("^enter the General notes as (.*)$")
	public void generalopt(String General)
	{
		Opticaltestpage.generalnotes(General);
	}
	@Then ("^click to save the information$")
	public void optsave() throws InterruptedException
	{
		Opticaltestpage.saveoptiinfo();
		Logintestpage.logout();
		driver.quit();
	
	}
	
	@After
    public void teardownoptical(Scenario s) throws IOException, InterruptedException
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
