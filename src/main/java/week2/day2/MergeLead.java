package week2.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//load URL
		driver.get("http://leaftaps.com/opentaps");
		//maximize
		driver.manage().window().maximize();
		//Enter usernmae
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//Enter Password
		driver.findElementById("password").sendKeys("crmsfa");

		driver.findElementByClassName("decorativeSubmit").click();

		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();//clicking on the icon
		Set<String> allwindowHandles = driver.getWindowHandles();
		List<String> list= new ArrayList<String>();
		list.addAll(allwindowHandles);
		driver.switchTo().window(list.get(1));//switching to second window
		//String currentUrl = driver.getCurrentUrl();
		//System.out.println(currentUrl);
		driver.findElementByXPath("//input[@name='firstName']").sendKeys("Aiswarya");
		driver.findElementByXPath("//button[text()='Find Leads']").click();;
		Thread.sleep(3000);
		String idOfFirstEle=driver.findElementByXPath("(//a[@class='linktext'])[1]").getText();
		driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		//driver.close();
		//Thread.sleep(3000);
		
		driver.switchTo().window(list.get(0));//returns to primary window
		//String currentUrl2 = driver.getCurrentUrl();
		//System.out.println(currentUrl2);
		
		
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();//clicking the second icon
		
		allwindowHandles = driver.getWindowHandles();
		List<String> newWindow= new ArrayList<String>();
		newWindow.addAll(allwindowHandles);
		//Thread.sleep(2000);
		driver.switchTo().window(newWindow.get(1));//switching to second window
		//String currentUrl1 = driver.getCurrentUrl();
		//System.out.println(currentUrl1);
		driver.findElementByXPath("//input[@name='firstName']").sendKeys("R44");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		
		driver.switchTo().window(newWindow.get(0));//returns to primary window
		driver.findElementByLinkText("Merge").click();
		driver.switchTo().alert().accept();//accepts the alert
		Thread.sleep(2000);
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(idOfFirstEle);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		String msg=driver.findElementByXPath("//div[text()='No records to display']").getText();
		String displayError="No records to display";
		if (displayError.equals(msg))
		{
			System.out.println("Error Message displayed matches");
		}else
		{
			System.out.println("Verification Failed");
		}
		
		
		driver.close();
	}

}
