package week1.day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//load URL
		driver.get("http://leaftaps.com/opentaps");
		//getCurrentURL() validation
		String Currenturl=driver.getCurrentUrl();
		System.out.println(Currenturl);

		//getTitle() validation
		String title = driver.getTitle();
		System.out.println(title);


		//maximize
		driver.manage().window().maximize();
		//Enter usernmae
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//Enter Password
		driver.findElementById("password").sendKeys("crmsfa");

		driver.findElementByClassName("decorativeSubmit").click();

		// Thread.sleep(3000);
		//getText() validation
		String link=driver.findElementByLinkText("CRM/SFA").getText();
		System.out.println(link);
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByClassName("decorativeSubmit").click();
		
		

	}

}
