package runner;
/**
'**************************************************************
'  Name        : Operation runner
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Oct 12, 2017
'--------------------------------------------------------------
'  Mod Date    :    
'  Mod By      : 
'  Change Made : 
'**************************************************************
**/
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//@CucumberOptions(tags={"@operation, @directoperation"},format={"pretty","html:reports","json:operationjson\\operation.json"},features={"classpath:operation"},glue={"operation"})
@CucumberOptions(tags={"@operation"},format={"pretty","html:reports","json:operationjson\\operation.json"},features={"classpath:operation"},glue={"operation"})
@RunWith(Cucumber.class)
public class TestRunnergoperation {

}
