package runner;
/**
'**************************************************************
'  Name        : Ward runner
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Oct 5, 2017
'--------------------------------------------------------------
'  Mod Date    :    
'  Mod By      : 
'  Change Made : 
'**************************************************************
**/
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//@CucumberOptions(tags={"@ward, @wardpackage"},format={"pretty","html:reports","json:wardjson\\wardroom.json"},features={"classpath:ward"},glue={"ward"})
@CucumberOptions(tags={"@ward"},format={"pretty","html:reports","json:wardjson\\wardroom.json"},features={"classpath:ward"},glue={"ward"})
@RunWith(Cucumber.class)
public class TestRunnerfward {

}
