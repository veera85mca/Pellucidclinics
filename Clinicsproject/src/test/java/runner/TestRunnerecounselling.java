package runner;
/**
'**************************************************************
'  Name        : Catract runner for consultation
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Sep 27, 2017
'--------------------------------------------------------------
'  Mod Date    :    
'  Mod By      : 
'  Change Made : 
'**************************************************************
**/
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//@CucumberOptions(tags={"@surgerycounsel, @packagecounsel, @reporttedcounsel"},format={"pretty","html:reports","json:counselljson\\counsell.json"},features={"classpath:counselling"},glue={"counselling"})
@CucumberOptions(tags={"@reporttedcounsel"},format={"pretty","html:reports","json:counselljson\\counsell.json"},features={"classpath:counselling"},glue={"counselling"})
@RunWith(Cucumber.class)
public class TestRunnerecounselling {

}