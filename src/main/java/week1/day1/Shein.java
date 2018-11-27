package week1.day1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Shein {

public static void main(String args[]) throws InterruptedException{

	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	
	FirefoxDriver driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.get("https://us.shein.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver.findElementByPartialLinkText("Register/Sign In").click();
    driver.findElementByCssSelector("a.j-header-username").click();
    Thread.sleep(1000);
    WebElement username=driver.findElementByCssSelector(".j-sign-in > form:nth-child(3) > div:nth-child(1) > input:nth-child(2)");
    username.sendKeys("aishugopu@gmail.com");
    WebElement password=driver.findElementByCssSelector(".j-sign-in > form:nth-child(3) > div:nth-child(2) > input:nth-child(2)");
    password.sendKeys("Rahul@25");
    //WebDriverWait wait = new WebDriverWait(driver, 20);
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.she-btn-black:nth-child(6))")));
    WebElement SignInButton = driver.findElement(By.cssSelector("button.she-btn-black:nth-child(6)"));
	SignInButton.click();
	
	//Logout
	/*** using movetoelement **/
	WebElement element=driver.findElementByCssSelector("a.j-header-username");
	WebElement signout=driver.findElementByCssSelector("li.j-header-menu-signout > a");
	Actions action = new Actions(driver);	 
    action.moveToElement(element).moveToElement(signout).click().build().perform();
	/*** using Javascript **/
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("arguments[0].scrollIntoView(true);", signout);
	//driver.findElementByLinkText("Sign Out").click();
    Thread.sleep(1000);
	
}


	
	
}
