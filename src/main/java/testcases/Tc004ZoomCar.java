package testcases;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tc004ZoomCar {

	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zoomcar.com/chennai");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByLinkText("Start your wonderful journey").click();
		driver.findElementByXPath("//div[contains(text(),'Thuraipakkam')] ").click();
		driver.findElementByXPath("//button[text()='Next']").click();
		// Get the current date
		Date date = new Date();
		// Get only the date (and not month, year, time etc)
		DateFormat sdf = new SimpleDateFormat("dd");
		// Get today's date
		String today = sdf.format(date);
		// Convert to integer and add 1 to it
		int tomorrow = Integer.parseInt(today) + 1;
		// Print tomorrow's date
		System.out.println(tomorrow);
		driver.findElementByXPath("//div[contains(text(),'" + tomorrow + "')]");
		//System.out.println(pickupdate);
		driver.findElementByXPath("//div[contains(text(),'" + tomorrow + "')]").click();
		driver.findElementByXPath("//button[text()='Next']").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// WebDriverWait wait = new WebDriverWait(driver, 30);
		// wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(pickupdate)));
		// Thread.sleep(5000);

		WebElement pickupdate1 = driver.findElementByXPath("//div[@class='days']/child::div[1]");
		//System.out.println(pickupdate1.getText());
		String txt = pickupdate1.getAttribute("class");
		//System.out.println(txt);
		if (txt.contains("day picked")) {
			driver.findElementByXPath("//button[text()='Done']").click();
			System.out.println("Attribute " + txt + "is verified");
		} else {
			System.out.println("Attribute verified unsuccessfully");
		}
		List<WebElement> allCarLinks = driver.findElementsByXPath("//div[@class='price']");
		int numberOfResults = allCarLinks.size();
		System.out.println("Number of Results: " + numberOfResults);
		List<Integer> list = new ArrayList<Integer>();
		for (WebElement carLink : allCarLinks) {
			String car = carLink.getText();
			String replaceCar = car.replaceAll("\\D", "");
			// System.out.println(replaceCar);
			int value = Integer.parseInt(replaceCar);
			list.add(value);

		}
		Integer max = Collections.max(list);
		System.out.println(max);
		String carName = driver.findElementByXPath("//div[contains(text(),'" + max + "')]/preceding::h3[1]").getText();
		System.out.println("Brand Name with the maximun price is " + carName);
		driver.findElementByXPath("//div[contains(text(),'" + max + "')]/following::button[1]").click();
		driver.close();

	}
}
