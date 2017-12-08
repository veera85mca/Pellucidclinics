package login;
/**
'**************************************************************
'  Name        : login runner
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Sep 6, 2017
'--------------------------------------------------------------
'  Mod Date    :    
'  Mod By      : 
'  Change Made : 
'**************************************************************
**/
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(tags={"@home"},format={"pretty","html:reports","json:C:\\Users\\Veerapathiran\\workspace\\Clinicsproject\\json\\login.json"},features={"C:\\Users\\Veerapathiran\\workspace\\Clinicsproject\\src\\test\\resources\\loginfeature"},glue={"login"})
@RunWith(Cucumber.class)
public class Loginrun {

}
