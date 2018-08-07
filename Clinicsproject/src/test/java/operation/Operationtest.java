package operation;
/**
'**************************************************************
'  Name        : Operation Test case
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Oct 16, 2017
'--------------------------------------------------------------
'  Mod Date    :    
'  Mod By      : 
'  Change Made : 
'**************************************************************
**/

import java.io.IOException;

import counselling.Counsellingtestpage;
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
import ward.Wardtestpage;

public class Operationtest extends Initializer {

static String failbrowser=null;
static String failurl=null;
static String failuser=null;
static String failpass=null;

	@Given ("^select the browser as (.*)$")
	public void opebrowser(String Browser)
	{
		failbrowser=Browser;
		initialize(Browser);
	}
	@When ("^give the url as (.*)$")
	public void opeurl(String Url)
	{
		failurl=Url;
		url(Url);
	}
	@And ("^enter the username as (.*)$")
	public void opeuser(String User)
	{
		failuser=User;
		Logintestpage.getusername(User);
	}
	@But ("^enter the password as (.*)$")
	public void opepass(String Pass)
	{
		failpass=Pass;
		Logintestpage.getpassword(Pass);
	}
	@Then ("^click to login button$")
	public void opelogin()
	{
		Logintestpage.login();
	}
	@When ("^click to worklist coloumn$")
	public void opeworklist()
	{
		Searchfilter.clickworklist();
	}
	@And ("^select the search filter icon for search$")
	public void opesearchfilter() throws InterruptedException
	{
		Searchfilter.clicksearchlink();
	}
	@Then ("^give the patientid as (.*) in search field$")
	public void opepatientid(String patientid) throws IOException, InterruptedException
	{
		Operationtestpage.patientidsearch(patientid);
	}
	@But ("^select the app from date as (.*)$")
	public void opeappfrom(String Appfrom) throws InterruptedException
	{
		Searchfilter.appfromdate(Appfrom);
	}
	@And ("^select the app to date as (.*)$")
	public void opeappto(String Appto) throws InterruptedException
	{
		Searchfilter.apptodate(Appto);
	}
	@Then ("^click to search button$")
	public void opesearchbutton() throws InterruptedException
	{
		Searchfilter.searchbutton();
		Thread.sleep(4000);
	}
	@And ("^Click to pre operation info icon for validate all values$")
	public void preoperaicon_opea()
	{
		Operationtestpage.preopericon();
	}
	@When ("^Validate patientid in pre operative examination for opearation$")
	public void valipatientid_opera() throws IOException, InterruptedException
	{
		Thread.sleep(2000);
		Operationtestpage.patientid_valiopera();
	}
	@But ("^Validate BSL maximum and minimum as (.*), (.*) in pre operative examination for opearation$")
	public void valiBSLvalues_opera(String BSLMax, String BSLMin) throws IOException
	{
		Operationtestpage.BSL_valioper(BSLMax, BSLMin);
	}
	@Then ("^Validate HB maximum and minimum as (.*), (.*) in pre operative examination for opearation$")
	public void valiHBvalues_opera(String HBMax, String HBMin) throws IOException
	{
		Operationtestpage.HB_valioper(HBMax, HBMin);
	}
	@And ("^Validate Rs value as (.*) in pre operative examination for opearation$")
	public void valiRsvalue_opera(String RSmmHg) throws IOException
	{
		Operationtestpage.rs_valiopera(RSmmHg);
	}
	@When ("^Validate CVC values as (.*) in pre operative examination for opearation$")
	public void valiCVCvalue_opera(String CVCmmHg) throws IOException
	{
		Operationtestpage.CVC_valiopera(CVCmmHg);
	}
	@But ("^Validate CNS values as (.*) in pre operative examination for opearation$")
	public void valiCNSvalue_opera(String CNSmmHg) throws IOException
	{
		Operationtestpage.CNS_valiopera(CNSmmHg);
	}
	@Then ("^Validate P/A values as (.*) in pre operative examination for opearation$")
	public void valiPAvalue_opera(String PAmmHg) throws IOException
	{
		Operationtestpage.PA_valiopera(PAmmHg);
	}
	@And ("^Validate Temperature value as (.*) (.*) in pre operative examination for opearation$")
	public void valiTempvalues_opera(String Temp, String celsius) throws IOException
	{
		Operationtestpage.Temp_valioper(Temp, celsius);
	}
	@When ("^Validate Pulse value as (.*) in pre operative examination for opearation$")
	public void valiPulsevalue_opera(String Pulse) throws IOException
	{
		Operationtestpage.Pulse_valioper(Pulse);
	}
	@But ("^Validate Bp maximum and minimum as (.*), (.*) in pre operative examination for opearation$")
	public void valiBPvalues_opera(String BpMax, String BpMin) throws IOException
	{
		Operationtestpage.BP_valioper(BpMax, BpMin);
	}
	@Then ("^Validate RR maximum and minimum as (.*), (.*) in pre operative examination for opearation$")
	public void valiRRvalues_opera(String RRMax, String RRMin) throws IOException
	{
		Operationtestpage.RR_valioper(RRMax, RRMin);
	}
	@And ("^Validate ECG Finding as (.*) in pre operative examination for opearation$")
	public void valiECGvalue_opera(String ECG) throws IOException
	{
		Operationtestpage.ECG_valiopera(ECG);
	}
	@When ("^Validate patient Fit for surgery as (.*) in pre operative examination for opearation$")
	public void valifitsurgeryvalue_opera(String fitsurgery)
	{
		Operationtestpage.fit_valiopera(fitsurgery);
	}
	@But ("^Validate patient need Physician opinion as (.*) in pre operative examination for opearation$")
	public void valiopinionvalue_opera(String phyopinion)
	{
		Operationtestpage.physopinion_valiopera(phyopinion);
	}
	@And ("^Validate patient need Treatment as (.*), then give advice as (.*) in pre operative examination for opearation$")
	public void valitreatmentvalue_opera(String Treat, String advice) throws IOException
	{
		Operationtestpage.treatment_valiopera(Treat, advice);
	}
	@When ("^click to save the operated information icon in worklist$")
	public void opeinfoicon() throws IOException, InterruptedException
	{
		Thread.sleep(2000);
		Operationtestpage.iconopeinfo();
	}
	/*@But ("^would like to change Postpone operation as (.*) then date as (.*)$")
	public void postope(String Post, String Date) throws InterruptedException
	{
		if("yes".equalsIgnoreCase(Post))
		{
			Operationtestpage.postponeddate(Date);
		}
	}*/
	
	@And ("^select the Operated surgeon name in operation room as (.*)$")
	public void surgeonname(String Surgeon)
	{
		Operationtestpage.surgeonope(Surgeon);
	}
	@But ("^enter the Co-surgeon in operation room as (.*)$")
	public void cosurgeonname(String Cosurgeon)
	{
		Operationtestpage.cosurgeonope(Cosurgeon);
	}
	@When ("^give the Anesthesia Doctor name in operation room as (.*)$")
	public void aneshesianame(String Anesthesianame)
	{
		Operationtestpage.anesthesiadr(Anesthesianame);
	}
	@But ("^add the name of Helpers as (.*)$")
	public void helpersname(String Helpers)
	{
		Operationtestpage.helpersope(Helpers);
	}
	@And ("^add the General notes of operation as (.*)$")
	public void generalnotes(String General)
	{
		Operationtestpage.generalope(General);
	}
	@Then ("^click to save Post operation information$")
	public void savepostope() throws InterruptedException
	{
		Operationtestpage.saveope();
		Thread.sleep(4000);
		Logintestpage.logout();
		driver.close();
	}
	
	
//DIRECT OPERATION FROM COUNSELLING ROOM
	@Given ("^select the browser for direct operation as (.*)$")
	public void direct_browser(String DBrowser)
	{
		failbrowser=DBrowser;
		initialize(DBrowser);
	}
	@When ("^enter the url for direct operation as (.*)$")
	public void direct_url(String DUrl)
	{
		failurl=DUrl;
		url(DUrl);
	}
	@And ("^enter the user name for direct operation as (.*)$")
	public void direct_user(String DUser)
	{
		failuser=DUser;
		Logintestpage.getusername(DUser);
	}
	@But ("^enter the password for direct operation as (.*)$")
	public void direct_pass(String DPass)
	{
		failpass=DPass;
		Logintestpage.getpassword(DPass);
	}
	@Then ("^click to login button for direct operation$")
	public void direct_login()
	{
		Logintestpage.login();
	}
	@When ("^click to worklist coloumn for direct operation$")
	public void direct_worklist()
	{
		Searchfilter.clickworklist();
	}
	@And ("^select the search filter icon for direct operation$")
	public void direct_searchfilter() throws InterruptedException
	{
		Searchfilter.clicksearchlink();
	}
	@Then ("^give the patientid for direct operation as (.*) in search field$")
	public void direct_patientid(String DPatientid) throws InterruptedException
	{
		Wardtestpage.patientidward(DPatientid);
	}
	@But ("^select the app from date for direct operation as (.*)$")
	public void direct_appfrom(String dAppfrom) throws InterruptedException
	{
		Searchfilter.appfromdate(dAppfrom);
	}
	@And ("^select the app to date for direct operation as (.*)$")
	public void direct_appto(String DAppto) throws InterruptedException
	{
		Searchfilter.apptodate(DAppto);
	}
	@Then ("^click to search button for direct operation$")
	public void direct_searchbutton()
	{
		Searchfilter.searchbutton();
	}
	@But ("^click to add the Anesthesia Consent in worklist for direct operation$")
	public void direct_anesthesiaicon() throws IOException, InterruptedException
	{
		Thread.sleep(4000);
		Wardtestpage.anessecondform();
	}
	@When ("^click the event of Fill Anesthesia Form for direct operation and give Name of Physician as (.*) in operation$")
	public void direct_anesthesiaphysician(String DPhysician)
	{
		Wardtestpage.fillanesthesiaward(DPhysician);
	}
	@And ("^click to pre operation info and validate the patientid for direct operation$")
	public void direct_preoperativeicon() throws InterruptedException
	{
		Thread.sleep(4000);
		Wardtestpage.preoperativeicon();
	}
	@Then ("^select the Blood report for direct operation BSL maximum as (.*) and minimum as (.*) in Operation$")
	public void direct_BSL(Integer DBSLMax, Integer DBSLMin)
	{
		Wardtestpage.bslblood(DBSLMax, DBSLMin);
	}
	@But ("^select Blood report HB (.*) (.*) with percentage for direct operation$")
	public void direct_HB(Integer DHBmax, String DHBmin)
	{
		Wardtestpage.hbblood(DHBmax, DHBmin);
	}
	@When ("^give Rs value as (.*) in examination for direct operation$")
	public void direct_RS(String DRSmmHg)
	{
		Wardtestpage.rsexam(DRSmmHg);
	}
	@And ("^give CVC values as (.*) in examination for direct operation$")
	public void direct_CVC(String DCVCmmHg)
	{
		Wardtestpage.cvcexam(DCVCmmHg);
	}
	@But ("^give CNS values as (.*) in examination for direct operation$")
	public void direct_CNS(String DCNSmmHg)
	{
		Wardtestpage.cnsexam(DCNSmmHg);
	}
	@When ("^give P/A values as (.*) in examination for direct operation$")
	public void direct_PA(String DPAmmHg)
	{
		Wardtestpage.paexam(DPAmmHg);
	}
	@Then ("^give Temperature value as (.*) (.*) in examination for direct operation$")
	public void direct_temperature(Integer DTemp, String Dcelsius)
	{
		Wardtestpage.tempexam(DTemp, Dcelsius);
	}
	@And ("^give Pulse value as (.*) in examination for direct operation$")
	public void direct_Pulse(String DPulse)
	{
		Wardtestpage.pulseexam(DPulse);
	}
	@But ("^enter Bp maximum for direct operation as (.*) and minimum as (.*) in operation$")
	public void direct_BP(Integer DBpMax, Integer DBpMin)
	{
		Wardtestpage.bpexam(DBpMax, DBpMin);
	}
	@When ("^enter RR maximum for direct operation as (.*) and minimum as (.*) in operation$")
	public void direct_RR(Integer DRRMax, Integer DRRMin)
	{
		Wardtestpage.rrexam(DRRMax, DRRMin);
	}
	@And ("^give ECG Finding as (.*) in examination for direct operation$")
	public void direct_ECG(String DECG)
	{
		Wardtestpage.ecgexam(DECG);
	}
	@When ("^Is this patient Fit for surgery for direct operation as (.*)$")
	public void direct_Fitsurgery(String Dfitsurgery)
	{
		Wardtestpage.sugeryadv(Dfitsurgery);
	}
	@And ("^Is this patient need Physician opinion for direct operation as (.*)$")
	public void direct_Physicianopinion(String Dphyopinion)
	{
		Wardtestpage.phyopadv(Dphyopinion);
	}
	@But ("^Is this patient need Treatment for direct operation as (.*), then give advice as (.*) in operation$")
	public void direct_Treatmentandadvice(String DTreat, String Dadvice)
	{
		Wardtestpage.treatadv(DTreat, Dadvice);
	}
	@Then ("^Click to save the preoperative examination details for direct operation$")
	public void direct_savepreoperation()
	{
		Wardtestpage.savepreopr();
	}
	@When ("^click to save the operated information icon in worklist for direct operation$")
	public void direct_postoperationicon() throws IOException, InterruptedException
	{
		Thread.sleep(2000);
		Operationtestpage.iconopeinfo();
	}
	@And ("^select the Operated surgeon name in operation room for direct operation as (.*)$")
	public void direct_surgeonname(String DSurgeon)
	{
		Operationtestpage.surgeonope(DSurgeon);
	}
	@But ("^enter the Co-surgeon in operation room for direct operation as (.*)$")
	public void direct_cosurgeonname(String DCosurgeon)
	{
		Operationtestpage.cosurgeonope(DCosurgeon);
	}
	@When ("^give the Anesthesia Doctor name in operation room for direct operation as (.*)$")
	public void direct_anesthesianame(String DAnesthesianame)
	{
		Operationtestpage.anesthesiadr(DAnesthesianame);
	}
	@But ("^add the name of Helpers for direct operation as (.*)$")
	public void direct_helpers(String DHelpers)
	{
		Operationtestpage.helpersope(DHelpers);
	}
	@And ("^add the General notes of operation for direct operation as (.*)$")
	public void direct_general(String DGeneral)
	{
		Operationtestpage.generalope(DGeneral);
	}
	@Then ("^click to save Post operation information for direct operation$")
	public void direct_savepostoperinfo() throws InterruptedException
	{
		Operationtestpage.saveope();
		Thread.sleep(4000);
		Logintestpage.logout();
		driver.close();
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
