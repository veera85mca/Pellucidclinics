package login;


/**
'**************************************************************
'  Name        : Login pageobject for login
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Sep 2, 2017
'--------------------------------------------------------------
'  Mod Date    :    
'  Mod By      : 
'  Change Made : 
'**************************************************************
**/

/**
'**************************************************************
'  Name        : login for clinics
'  Framework   : Cucumber with Junit
'--------------------------------------------------------------
'  Created By:	Veerapathiran.P
'  Create Date: Sep 5, 2017
'--------------------------------------------------------------
'  Mod Date    :    
'  Mod By      : 
'  Change Made : 
'**************************************************************
**/
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logintestpage extends Initializer {

public static void browser(String browse)
{
	Initializer.initialize(browse);
}
public static void geturl(String url)
{
	Initializer.url(url);
}
public static void getusername(String username)
{
	driver.findElement(By.id("username")).sendKeys(username);
}
public static void getpassword(String password)
{
	driver.findElement(By.id("password")).sendKeys(password);
}
public static void radiobutton()
{
	
}
public static void login()
{
	driver.findElement(By.xpath(".//*[@id='sign_LoginBtn1']")).click();
}
public static void loginalert()
{
	driver.findElement(By.xpath(".//*[@id='sign_LoginBtn1']")).click();
	WebDriverWait wait=new WebDriverWait(driver, 25);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btnLoginConfirm']"))).click();
}
public static void logout() throws InterruptedException
{
	/*WebDriverWait wait = new WebDriverWait(driver, 8);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//i[@class='icon-angle-down'])[1]"))).click();*/
	//driver.findElement(By.xpath(".//i[contains(@class,'icon-angle-down')]")).click();
	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//i[contains(@class,'icon-angle-down')]")));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", driver.findElement(By.xpath(".//i[contains(@class,'icon-angle-down')]")));
	Thread.sleep(1500);
	WebDriverWait wait=new WebDriverWait(driver, 25);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='logoutli']/a"))).click();
	Thread.sleep(1500);
	//driver.findElement(By.xpath(".//*[@id='logoutli']/a")).click();
}

public static void logincon() throws InterruptedException
{
	driver.findElement(By.xpath(".//*[@id='sign_LoginBtn1']")).click();
	//boolean log=loginreturn(driver.findElement(By.xpath(".//*[@id='Alert_TitleID']")));
	boolean log=loginreturn(driver.findElement(By.xpath(".//*[@id='Mod_Already']/div/div")));
	if(log)
	{
		driver.findElement(By.xpath(".//*[@id='btnLoginConfirm']")).click();
	}else {
		//System.out.println("already login");
	}
}

public static boolean loginreturn(WebElement el) throws InterruptedException
{
	Thread.sleep(300);
	if(el.isDisplayed())
	{
		return true;
	}
	return false;
}
}
