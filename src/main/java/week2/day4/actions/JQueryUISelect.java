package week2.day4.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JQueryUISelect {
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	RemoteWebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://jqueryui.com/selectable/");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.switchTo().frame(0);
	WebElement item1=driver.findElementByXPath("//li[text()='Item 1']");
	WebElement item4=driver.findElementByXPath("//li[text()='Item 4']");
	WebElement item7=driver.findElementByXPath("//li[text()='Item 7']");
	Actions builder=new Actions(driver);
	builder.sendKeys(Keys.CONTROL).click(item1).click(item4).click(item7).perform();
	//using keydown
	//builder.clickAndHold().keyDown(item4, Keys.CONTROL).keyDown(item7, Keys.CONTROL).perform();
	

		
	
	}

}
