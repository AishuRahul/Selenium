package testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import cucumber.api.java.Before;
import wdmethods.SeMethods;

public class ProjectSpecificMethods extends SeMethods{

	public ChromeDriver driver;
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	@Parameters({"browser","url","username","password"})
	@BeforeMethod(groups="common")
	public void login(String browser,String url,String uname,String pwd ) {
		System.out.println("Before Method: Login");
		//startApp("chrome", "http://leaftaps.com/opentaps");
		startApp(browser,url);
		WebElement eleUsername = locateElement("id", "username");
		type(eleUsername,uname);
		WebElement elePassword = locateElement("id", "password");
		type(elePassword, pwd);
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		WebElement crmLink=locateElement("linktext","CRM/SFA");
		click(crmLink);
		

	}
	
	@AfterMethod(groups="common")
	public void close()
	{
		System.out.println("After Method: Close the browser");
		closeBrowser();
	}
}
