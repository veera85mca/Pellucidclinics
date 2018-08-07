package login;
/**
'**************************************************************
'  Name        : login for clinics
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Sep 5, 2017
'--------------------------------------------------------------
'  Mod Date    :    
'  Mod By      : 
'  Change Made : 
'**************************************************************
**/
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
public class Logintest {

	@Given ("^select the browser as (.*)$")
	public void browse(String Browser)
	{
	Logintestpage.browser(Browser);	
	}
	@When ("^enter the url as (.*)$")
	public void url(String Url)
	{
		Logintestpage.geturl(Url);
	}
	@And ("^enter the username as (.*)$")
	public void user(String User)
	{
		Logintestpage.getusername(User);
	}
	@But ("^enter the password as (.*)$")
	public void pass(String Password)
	{
		Logintestpage.getpassword(Password);
	}
	@And ("^check the radio button$")
	public void radio()
	{
		
	}
	@Then ("^click to login button$")
	public void signin()
	{
		Logintestpage.login();
	}
	@When ("^Click to logout$")
	public void signout() throws InterruptedException
	{
		Logintestpage.logout();
	}

}
