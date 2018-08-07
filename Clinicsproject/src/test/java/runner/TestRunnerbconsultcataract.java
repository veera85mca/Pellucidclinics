package runner;
/**
'**************************************************************
'  Name        : Catract runner for consultation
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Sep 19, 2017
'--------------------------------------------------------------
'  Mod Date    :    
'  Mod By      : 
'  Change Made : 
'**************************************************************
**/
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(tags={"@consultcataract"},format={"pretty","html:reports","json:catractconjson\\consultcat.json"},features={"classpath:cataractconsultation"},glue={"consultationcatract"})
@RunWith(Cucumber.class)

public class TestRunnerbconsultcataract {

}
