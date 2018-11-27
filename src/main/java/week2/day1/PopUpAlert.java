package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpAlert {

	public static void main(String[] args) throws InterruptedException {
	
		//set driver path

		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launch browser

		ChromeDriver driver = new ChromeDriver();

	    //load URL

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

		//maximize

		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		driver.switchTo().alert().sendKeys("Aiswarya");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		String text=driver.findElementById("demo").getText();
		System.out.println(text);
		driver.switchTo().defaultContent();

	}

}
