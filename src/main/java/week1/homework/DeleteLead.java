package week1.homework;

import org.openqa.selenium.chrome.ChromeDriver;


public class DeleteLead {

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
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("044");
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("2796586");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		String idOftheFirstEle=driver.findElementByXPath("(//a[@class='linktext'])[4]").getText();
		System.out.println(idOftheFirstEle);
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		driver.findElementByClassName("subMenuButtonDangerous").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(idOftheFirstEle);
		//driver.findElementByXPath("//input[@name='id']").sendKeys("10060");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
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
