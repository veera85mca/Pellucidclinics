package temporary;
/**
'**************************************************************
'  Name        : Payment room
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Nov 2, 2017
'--------------------------------------------------------------
'  Mod Date    :    
'  Mod By      : 
'  Change Made : 
'**************************************************************
**/

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(tags={"@payment"},format={"pretty","html:reports","json:paymentjson\\paymentjson.json"},features={"classpath:payment"},glue={"payment"})
@RunWith(Cucumber.class)
public class payment {

}
