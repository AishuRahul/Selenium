package challenge;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Date {
	public static void main(String[] args) {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(op);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		/*driver.get("https://www.cleartrip.com/");
		driver.findElementByXPath("//div[@class='span span15 datePicker']/input")
		.sendKeys("Fri, 18 Sep, 2020", Keys.ENTER);*/

		/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		driver.navigate().to("https://www.redbus.in/");

		driver.executeScript("document.getElementById('onward_cal').removeAttribute('readonly');", "");
		driver.findElementById("onward_cal").sendKeys("27-Oct-2018");
		//driver.executeScript("");
	}

	
	
	
	
	
	
	
	
}
