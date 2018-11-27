package week2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JQueryFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//launch browser

		ChromeDriver driver = new ChromeDriver();

		//load URL

		driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");

		//maximize

		driver.manage().window().maximize();
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + iframeElements.size());
 
		//driver.switchTo().defaultContent();
		//Thread.sleep(1000);
		driver.switchTo().frame("childIframe");
		//Thread.sleep(2000);
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		String currentFrame =(String) jsExecutor.executeScript("return self.name");
		System.out.println(currentFrame);
		String frame1=driver.findElementByXPath("(//button[text()='Close Me'])[1]").getText();
		System.out.println(frame1);
		driver.findElementByXPath("(//button[text()='Close Me'])[1]").click();
		System.out.println("Iframe westclose me clicked");
		//Inside Iframe East
		Thread.sleep(2000);
		driver.findElementByXPath("(//button[text()='Close Me'])[2]").click();
		System.out.println("Iframe East close me clicked");

	}

}