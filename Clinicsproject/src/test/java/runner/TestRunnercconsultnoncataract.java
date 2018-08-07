package runner;
/**
'**************************************************************
'  Name        : Non Catract runner for consultation
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Sep 22, 2017
'--------------------------------------------------------------
'  Mod Date    :    
'  Mod By      : 
'  Change Made : 
'**************************************************************
**/
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//@CucumberOptions(tags={"@consultnoncataract, @Savedraftcase, @addaddendum"},format={"pretty","html:reports","json:noncatraconjson\\consultnoncat.json"},features={"C:\\Seleniumwork\\workspace\\Clinicsproject\\src\\test\\resources\\consultation"},glue={"consultation"})
@CucumberOptions(tags={"@consultnoncataract"},format={"pretty","html:reports","json:noncatraconjson\\consultnoncat.json"},features={"classpath:noncataractconsultation"},glue={"consultationnoncatract"})
@RunWith(Cucumber.class)
public class TestRunnercconsultnoncataract {

}
