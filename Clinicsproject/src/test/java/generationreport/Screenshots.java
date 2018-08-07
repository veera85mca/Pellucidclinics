package generationreport;
/**
'**************************************************************
'  Name        : take screenshot for common
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
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import login.Initializer;

public class Screenshots extends Initializer{

	public static void getscreenshot(Scenario s) throws IOException
	{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileInputStream f = new FileInputStream(src);
	s.embed(IOUtils.toByteArray(f), "image/jpeg");
	}
}
