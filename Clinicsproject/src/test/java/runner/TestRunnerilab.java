package runner;
/**
'**************************************************************
'  Name        : Lab room
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: OCt 27, 2017
'--------------------------------------------------------------
'  Mod Date    :    
'  Mod By      : 
'  Change Made : 
'**************************************************************
**/

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(tags={"@lab"},format={"pretty","html:reports","json:labjson\\lab.json"},features={"classpath:lab"},glue={"lab"})
@RunWith(Cucumber.class)
public class TestRunnerilab {

}
