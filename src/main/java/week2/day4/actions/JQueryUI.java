package week2.day4.actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JQueryUI {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.indeed.co.in/fresher-jobs");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		List<WebElement> links = driver.findElementsByXPath("((//td[@id='resultsCol'])//a[@data-tn-element='jobTitle'])");
		 
		System.out.println(links.size());
		/*driver.switchTo().frame(0);
		WebElement drag= driver.findElementById("draggable");
		Actions builder=new Actions(driver);
		int x=((drag.getLocation().getX())+30);
		int y=((drag.getLocation().getY())+30);
		builder.dragAndDropBy(drag,x,y).perform();
		*/
	}

}
