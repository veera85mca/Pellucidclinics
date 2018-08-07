package runner;
/**
'**************************************************************
'  Name        : patient registration
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Sep 13, 2017
'--------------------------------------------------------------
'  Mod Date    :    
'  Mod By      : 
'  Change Made : 
'**************************************************************
**/
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(tags={"@evapatient"},format={"pretty","html:reports","json:evajson\\evapatient.json"},features={"classpath:evaluation"},glue={"evaluation"})
@RunWith(Cucumber.class)
public class TestRunneraevaluation {

}