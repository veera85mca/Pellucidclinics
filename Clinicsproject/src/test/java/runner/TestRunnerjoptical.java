package runner;
/**
'**************************************************************
'  Name        : Optical room
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Oct 25, 2017
'--------------------------------------------------------------
'  Mod Date    :    
'  Mod By      : 
'  Change Made : 
'**************************************************************
**/
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(tags={"@optical"},format={"pretty","html:reports","json:opticaljson\\optical.json"},features={"classpath:optical"},glue={"optical"})
@RunWith(Cucumber.class)
public class TestRunnerjoptical {

}
