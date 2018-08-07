package temporary;
/**
'**************************************************************
'  Name        : lab patient runner
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Sep 7, 2017
'--------------------------------------------------------------
'  Mod Date    :    
'  Mod By      : 
'  Change Made : 
'**************************************************************
**/
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(tags={"@labpatient"},format={"pretty","html:reports","json:C:\\Seleniumwork\\workspace\\Clinicsproject\\labpatjson\\labpatientreg.json"},features={"userpath:registrationfeature"},glue={"labregistration"})
@RunWith(Cucumber.class)

public class labpatient {

}
