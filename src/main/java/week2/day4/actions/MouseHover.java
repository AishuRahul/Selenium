package week2.day4.actions;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.RemoteWebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;



public class MouseHover {



	public static void main(String[] args) throws InterruptedException {

		RemoteWebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElementByXPath("//button[text()='x']").click();

		// after cliking on find lead button

		WebElement ele = driver.findElementByXPath("(//a[@class='linktext'])[4]");

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.elementToBeClickable(ele));

		ele.click();



		/*

		 * Thread.sleep(3000); WebElement electronics =

		 * driver.findElementByXPath("//span[text()='Electronics']"); Actions builder =

		 * new Actions(driver); WebElement apple =

		 * driver.findElementByLinkText("Apple");

		 * builder.moveToElement(electronics).perform(); apple.click();

		 */

	}



}