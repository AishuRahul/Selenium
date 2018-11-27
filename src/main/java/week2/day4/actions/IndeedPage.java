package week2.day4.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class IndeedPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.indeed.co.in/fresher-jobs");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions builder = new Actions(driver);
		List<WebElement> ele = driver.findElementsByXPath("(//td[@id='resultsCol'])//a[@data-tn-element='jobTitle']");
		String parentwindow = driver.getWindowHandle();
		Set<String> allHandles = driver.getWindowHandles();
		for (WebElement webElement : ele) {
			builder.moveToElement(webElement).sendKeys(webElement, Keys.CONTROL).click(webElement).keyUp(Keys.CONTROL)
					.perform();
			allHandles = driver.getWindowHandles();
			List<String> list = new ArrayList<String>();
			list.addAll(allHandles);
			for (String handle : list) {
				if (!parentwindow.equals(handle)) {
					driver.switchTo().window(handle);

				}

			}
			System.out.println("Page Title is " + driver.getTitle());
			driver.close();
			driver.switchTo().window(parentwindow);

		}
		driver.quit();
	}

}
