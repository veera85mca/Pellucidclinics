package payment;
/**
'**************************************************************
'  Name        : Payment room
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Oct 31, 2017
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

public class Paymenttest extends Initializer {

static String failbrowser=null;
static String failurl=null;
static String failuser=null;
static String failpass=null;

	@Given ("^select the browser as (.*)$")
	public void paybrowser(String Browser)
	{
		failbrowser=Browser;
		initialize(Browser);
	}
	@And ("^enter the url as (.*)$")
	public void payurl(String Url)
	{
		failurl=Url;
		url(Url);
	}
	@But ("^give the user name as (.*)$")
	public void payuser(String User)
	{
		failuser=User;
		Logintestpage.getusername(User);
	}
	@When ("^give the password as (.*)$")
	public void paypass(String Pass)
	{
		failpass=Pass;
		Logintestpage.getpassword(Pass);
	}
	@Then ("^click to login button$")
	public void paylogin() throws InterruptedException
	{
		Logintestpage.login();
	}
	@And ("^click to payment tab in registration$")
	public void paymenttab() throws InterruptedException
	{
		Thread.sleep(1000);
		Paymenttestpage.paymenttablink();
	}
	@But ("^click to pending payment link in payment$")
	public void penpayment() throws InterruptedException
	{
		Paymenttestpage.penpaymentlink();
	}
	@When ("^enter the Patient ID or Contact NO as (.*) in search filter$")
	public void searpaypatient(String Patid)
	{
		Paymenttestpage.patientidsearch(Patid);
	}
	@And ("^which payment would like to pay as (.*)$")
	public void allpayment(String payment) throws InterruptedException
	{
		Thread.sleep(5000);
		Paymenttestpage.payallpayment(payment);
	}
	@Then ("^click to save button$")
	public void savepay() throws InterruptedException
	{
		Thread.sleep(5000);
		Paymenttestpage.saveregpayment();
	}
	@After
	public void teardownpay(Scenario s) throws IOException, InterruptedException
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
