package testcases;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import wdmethods.SeMethods;

public class Tc003_IndeedPage extends SeMethods {

	@Test
	public void jobSearch() {
		
		startApp("chrome", "https://www.indeed.co.in/fresher-jobs");
		
		/*WebElement jobTitle=locateElement("xpath","((//td[@id='resultsCol'])//a[@data-tn-element='jobTitle'])[1]");
		RemoteWebDriver driver=getDriver();
		Actions builder=new Actions(driver);
		//builder.sendKeys(Keys.CONTROL,Keys.SHIFT).click(jobTitle).perform();
		//builder.contextClick(jobTitle).perform();
		//builder.sendKeys(Keys.CONTROL,Keys.ENTER).perform();
		builder.moveToElement(jobTitle)
        .sendKeys(jobTitle, Keys.CONTROL)
        .click(jobTitle)
        .keyUp(Keys.CONTROL)
        .perform();
		//int index=0;
		switchToWindow(1);
		System.out.println("Page Title is " +driver.getTitle());
		switchToWindow(0);
		//System.out.println("Page Title is " +driver.getTitle());
	    
		WebElement jobTitle2=locateElement("xpath","((//td[@id='resultsCol'])//a[@data-tn-element='jobTitle'])[2]");
		builder.moveToElement(jobTitle2).sendKeys(jobTitle2, Keys.CONTROL).click(jobTitle2).keyUp(Keys.CONTROL).perform();
		switchToWindow(2);
		System.out.println("Page Title is " +driver.getTitle());
		switchToWindow(0);
		WebElement jobTitle3=locateElement("xpath","((//td[@id='resultsCol'])//a[@data-tn-element='jobTitle'])[3]");
		builder.moveToElement(jobTitle2).sendKeys(jobTitle3, Keys.CONTROL).click(jobTitle3).keyUp(Keys.CONTROL).perform();
		switchToWindow(3);
		System.out.println("Page Title is " +driver.getTitle());
		switchToWindow(0);
		
		WebElement jobTitle4=locateElement("xpath","((//td[@id='resultsCol'])//a[@data-tn-element='jobTitle'])[4]");
		builder.moveToElement(jobTitle4).sendKeys(jobTitle4, Keys.CONTROL).click(jobTitle4).keyUp(Keys.CONTROL).perform();
		switchToWindow(4);
		System.out.println("Page Title is " +driver.getTitle());
		switchToWindow(0);
		WebElement jobTitle5=locateElement("xpath","((//td[@id='resultsCol'])//a[@data-tn-element='jobTitle'])[5]");
		builder.moveToElement(jobTitle5).sendKeys(jobTitle5, Keys.CONTROL).click(jobTitle5).keyUp(Keys.CONTROL).perform();
		switchToWindow(5);
		System.out.println("Page Title is " +driver.getTitle());
		switchToWindow(0);
		
		WebElement jobTitle6=locateElement("xpath","((//td[@id='resultsCol'])//a[@data-tn-element='jobTitle'])[6]");
		builder.moveToElement(jobTitle6).sendKeys(jobTitle6, Keys.CONTROL).click(jobTitle6).keyUp(Keys.CONTROL).perform();
		switchToWindow(6);
		System.out.println("Page Title is " +driver.getTitle());
		switchToWindow(0);
		
		WebElement jobTitle7=locateElement("xpath","((//td[@id='resultsCol'])//a[@data-tn-element='jobTitle'])[7]");
		builder.moveToElement(jobTitle7).sendKeys(jobTitle7, Keys.CONTROL).click(jobTitle7).keyUp(Keys.CONTROL).perform();
		switchToWindow(7);
		System.out.println("Page Title is " +driver.getTitle());
		switchToWindow(0);
		
		WebElement jobTitle8=locateElement("xpath","((//td[@id='resultsCol'])//a[@data-tn-element='jobTitle'])[8]");
		builder.moveToElement(jobTitle8).sendKeys(jobTitle8, Keys.CONTROL).click(jobTitle8).keyUp(Keys.CONTROL).perform();
		switchToWindow(8);
		System.out.println("Page Title is " +driver.getTitle());
		switchToWindow(0);
		
		WebElement jobTitle9=locateElement("xpath","((//td[@id='resultsCol'])//a[@data-tn-element='jobTitle'])[9]");
		builder.moveToElement(jobTitle9).sendKeys(jobTitle9, Keys.CONTROL).click(jobTitle9).keyUp(Keys.CONTROL).perform();
		switchToWindow(9);
		System.out.println("Page Title is " +driver.getTitle());
		switchToWindow(0);
		
		WebElement jobTitle10=locateElement("xpath","((//td[@id='resultsCol'])//a[@data-tn-element='jobTitle'])[10]");
		builder.moveToElement(jobTitle10).sendKeys(jobTitle10, Keys.CONTROL).click(jobTitle10).keyUp(Keys.CONTROL).perform();
		switchToWindow(10);
		System.out.println("Page Title is " +driver.getTitle());
		switchToWindow(0);
		
		WebElement jobTitle11=locateElement("xpath","((//td[@id='resultsCol'])//a[@data-tn-element='jobTitle'])[11]");
		builder.moveToElement(jobTitle11).sendKeys(jobTitle11, Keys.CONTROL).click(jobTitle11).keyUp(Keys.CONTROL).perform();
		switchToWindow(11);
		System.out.println("Page Title is " +driver.getTitle());
		switchToWindow(0);
		
		WebElement jobTitle12=locateElement("xpath","((//td[@id='resultsCol'])//a[@data-tn-element='jobTitle'])[12]");
		builder.moveToElement(jobTitle12).sendKeys(jobTitle12, Keys.CONTROL).click(jobTitle12).keyUp(Keys.CONTROL).perform();
		switchToWindow(12);
		System.out.println("Page Title is " +driver.getTitle());
		switchToWindow(0);
		
		WebElement jobTitle13=locateElement("xpath","((//td[@id='resultsCol'])//a[@data-tn-element='jobTitle'])[13]");
		builder.moveToElement(jobTitle13).sendKeys(jobTitle13, Keys.CONTROL).click(jobTitle13).keyUp(Keys.CONTROL).perform();
		switchToWindow(13);
		System.out.println("Page Title is " +driver.getTitle());
		switchToWindow(0);
		
		WebElement jobTitle14=locateElement("xpath","((//td[@id='resultsCol'])//a[@data-tn-element='jobTitle'])[14]");
		builder.moveToElement(jobTitle14).sendKeys(jobTitle14, Keys.CONTROL).click(jobTitle14).keyUp(Keys.CONTROL).perform();
		switchToWindow(14);
		System.out.println("Page Title is " +driver.getTitle());
		switchToWindow(0);
		
		WebElement jobTitle15=locateElement("xpath","((//td[@id='resultsCol'])//a[@data-tn-element='jobTitle'])[15]");
		builder.moveToElement(jobTitle15).sendKeys(jobTitle15, Keys.CONTROL).click(jobTitle15).keyUp(Keys.CONTROL).perform();
		switchToWindow(15);
		System.out.println("Page Title is " +driver.getTitle());
		switchToWindow(0);*/
		
		closeAllBrowsers();
		
	}
	
	
	
	
}
