package temporary;
/**
'**************************************************************
'  Name        : patient registration
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Sep 8, 2017
'--------------------------------------------------------------
'  Mod Date    :    
'  Mod By      : 
'  Change Made : 
'**************************************************************
**/
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//@CucumberOptions(tags={"@regpatient, @regpatientvisit"},format={"html:reports","json:patregjson\\patientregis.json"},features={"classpath:registrationfeature"},glue={"registration"})
@CucumberOptions(tags={"@regpatient"},format={"html:reports","json:patregjson\\patientregis.json"},features={"classpath:registrationfeature"},glue={"registration"})
@RunWith(Cucumber.class)
public class patientregis {

}