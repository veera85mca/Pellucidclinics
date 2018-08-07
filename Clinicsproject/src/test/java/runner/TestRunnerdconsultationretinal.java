package runner;
/**
'**************************************************************
'  Name        : Retinal Non Catract runner for consultation
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Sep 23, 2017
'--------------------------------------------------------------
'  Mod Date    :    
'  Mod By      : 
'  Change Made : 
'**************************************************************
**/
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(tags={"@retinalnoncat"},format={"pretty","html:reports","json:retinalcatconjson\\consultretinalnoncat.json"},features={"classpath:retinalcataractconsultation"},glue={"consultationretinal"})
@RunWith(Cucumber.class)
public class TestRunnerdconsultationretinal {

}
