package runner;
/**
'**************************************************************
'  Name        : Investigation room
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Oct 21, 2017
'--------------------------------------------------------------
'  Mod Date    :    
'  Mod By      : 
'  Change Made : 
'**************************************************************
**/

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(tags={"@invest"},format={"pretty","html:reports","json:investjson\\investreport.json"},features={"classpath:investigation"},glue={"investigation"})
@RunWith(Cucumber.class)
public class TestRunnerhinvestigation {

}
