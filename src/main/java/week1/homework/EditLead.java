package week1.homework;


import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Aiswarya");;
		//System.out.println(ele);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		String titlePage = driver.getTitle();
		String title="View Lead | opentaps CRM";
		if(title.equals(titlePage))
		{
			System.out.println("Title Verified");
		}
		else
		{
			System.out.println("Verification Failed");
		}
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("TCS");
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		String changedCompany=driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println(changedCompany);
		driver.close();
	}
}

