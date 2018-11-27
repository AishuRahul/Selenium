package testcases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc007_MergeLead extends ProjectSpecificMethods {
	@Test
	public void mergeLead() throws InterruptedException {
	
		WebElement leadLink = locateElement("linktext", "Leads");
		click(leadLink);
	WebElement mergeLeads=locateElement("linktext","Merge Leads");
	click(mergeLeads);
	click(locateElement("xpath","(//img[@alt='Lookup'])[1]"));//clicking on the icon
	switchToWindow(1);
	//driver.switchTo().window(list.get(1));//switching to second window
	//String currentUrl = driver.getCurrentUrl();
	//System.out.println(currentUrl);
	type(locateElement("xpath","//input[@name='firstName']"),"Aiswarya");
	WebElement findLead = locateElement("xpath", "//button[text()='Find Leads']");
	click(findLead);
	Thread.sleep(3000);
	WebElement firstID=locateElement("xpath","(//a[@class='linktext'])[1]");
	String idOfFirstEle=getText(firstID);
	click(firstID);
	//driver.close();
	//Thread.sleep(3000);
	switchToWindow(0);
	//driver.switchTo().window(list.get(0));//returns to primary window
	//String currentUrl2 = driver.getCurrentUrl();
	//System.out.println(currentUrl2);
	
	
	click(locateElement("xpath","(//img[@alt='Lookup'])[2]"));//clicking the second icon
	switchToWindow(1);
	/*allwindowHandles = driver.getWindowHandles();
	List<String> newWindow= new ArrayList<String>();
	newWindow.addAll(allwindowHandles);
	//Thread.sleep(2000);
	driver.switchTo().window(newWindow.get(1));*///switching to second window
	//String currentUrl1 = driver.getCurrentUrl();
	//System.out.println(currentUrl1);
	type(locateElement("xpath","//input[@name='firstName']"),"R44");
	WebElement findLeadbutton = locateElement("xpath", "//button[text()='Find Leads']");
	click(findLeadbutton);
	
	Thread.sleep(2000);
	click(locateElement("xpath","(//a[@class='linktext'])[1]"));
	switchToWindow(0);
	//driver.switchTo().window(newWindow.get(0));//returns to primary window
	click(locateElement("linktext","Merge"));
	acceptAlert();
	//driver.switchTo().alert().accept();//accepts the alert
	Thread.sleep(2000);
	click(locateElement("linktext","Find Leads"));
	type(locateElement("xpath","//input[@name='id']"),idOfFirstEle);
	WebElement findLeadbutton1 = locateElement("xpath", "//button[text()='Find Leads']");
	click(findLeadbutton1);
	
	Thread.sleep(3000);
	WebElement msg=locateElement("xpath","//div[text()='No records to display']");
	String displayError="No records to display";
	verifyExactText(msg, displayError);
	
	
	
}
	
	
	
}
