package week1.homework;

import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("xyz@yahoo.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		String nameOftheFirstEle=driver.findElementByXPath("(//a[@class='linktext'])[6]").getText();
		System.out.println(nameOftheFirstEle);
		driver.findElementByXPath("(//a[@class='linktext'])[6]").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		String titleOfPage = driver.getTitle();
		String page="Duplicate Lead";
		if(page.equals(titleOfPage)) {
			System.out.println("Title is verified");
		}else
		{
			System.out.println("verificaton failed");
		}
		driver.findElementByClassName("smallSubmit").click();
		String displayedName=driver.findElementById("viewLead_firstName_sp").getText();
		if(nameOftheFirstEle.equals(displayedName))
		{
			System.out.println("Name is Matched");
		}
		else {
			System.out.println("Verification failed");
		}
		driver.close();
	}
}


