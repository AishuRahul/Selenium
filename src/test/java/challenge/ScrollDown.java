package challenge;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException, AWTException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		WebElement browseAlljobs = driver.findElementByLinkText("Browse All Jobs");
		int y = browseAlljobs.getLocation().getY();
		driver.executeScript("scroll(0,"+y+")");
	}
}
