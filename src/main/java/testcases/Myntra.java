package testcases;

import java.util.ArrayList;

import java.util.List;

import java.util.Set;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.remote.RemoteWebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Myntra {

	static RemoteWebDriver driver;

	static WebDriverWait wait;

	static Actions builder;

	public static void main(String[] args) throws InterruptedException {

		// To disable the browser notification

		ChromeOptions opt = new ChromeOptions();

		opt.addArguments("--disable-notifications");

		driver = new ChromeDriver(opt);

		wait = new WebDriverWait(driver, 20);

		builder = new Actions(driver);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.myntra.com/");

		driver.findElementByClassName("desktop-searchBar").sendKeys("sunglasses", Keys.ENTER);

		List<WebElement> allSunglasses = driver.findElementsByClassName("product-brand");
		System.out.println(allSunglasses.size());

		System.out.println("Available Sunglasses Brand Name: ");

		for (WebElement sunglassName : allSunglasses) {
			for(int i=1;i<=(allSunglasses.size());i++)
			{
			System.out.println(i+""+sunglassName.getText());
			}
		}

		// 40% discount is not available so I have taken 70%

		System.out.println("Sunglasses Brand Name only with 70% discount and their price: ");

		// finding unisex glasses

		List<WebElement> unisexGlasses = driver.findElementsByXPath(

				"//span[text()='(70% OFF)']/preceding::h4[1][contains(text(),'Unisex')]/preceding-sibling::div");

		// finding unisex glass prices

		List<WebElement> prices = driver.findElementsByXPath(

				"(//span[text()='(70% OFF)']/preceding::h4[1][contains(text(),'Unisex')]/preceding-sibling::div)/following::span[2]");

		// printing both brand name and price

		for (int i = 0; i < unisexGlasses.size(); i++) {

			System.out

					.println("Brand Name: " + unisexGlasses.get(i).getText() + "-> Price: " + prices.get(i).getText());

		}

		// clicking on face shape

		driver.findElementByXPath("//h4[text()='Face Shape']").click();

		WebElement round = driver.findElementByXPath("//input[@type='checkbox' and @value='round']");

		System.out.println(round.isSelected());

		wait.until(ExpectedConditions.elementSelectionStateToBe(round, false));

		// clicking on round checkbox

		builder.moveToElement(round).click().perform();

		WebElement spinner = driver.findElementByClassName("loader-spinner");

		wait.until(ExpectedConditions.invisibilityOf(spinner));

		// clicking on type

		driver.findElementByXPath("//h4[text()='Type']").click();

		WebElement oval = driver.findElementByXPath("//input[@type='checkbox' and @value='oval sunglasses']");

		// clicking on oval checkbox

		builder.moveToElement(oval).click().perform();

		WebElement firstProduct = driver.findElementByXPath("(//div[@class='product-thumbShim']/following::a)[1]//img");

		wait.until(ExpectedConditions.elementToBeClickable(firstProduct));

		// clicking on first product

		builder.moveToElement(firstProduct).pause(1000).click().perform();

		Set<String> windowHandles = driver.getWindowHandles();

		List<String> ls = new ArrayList<>();

		ls.addAll(windowHandles);

		// switching to new window

		driver.switchTo().window(ls.get(1));

		// finding product name

		String productName = driver.findElementByTagName("h1").getText();

		System.out.println("Product Name: " + productName);

		// clicking on add to bag

		driver.findElementByXPath("//div[contains(text(),'ADD TO BAG')]").click();

		Thread.sleep(3000);
		// waiting for the notification

		//WebElement notification = driver.findElementByClassName("notify-info-message");

		//wait.until(ExpectedConditions.visibilityOf(notification));

		// cliking on the cart icon

		driver.findElementByXPath("//a[@href='/checkout/cart']").click();

		// getting text of the product name to do verification

		String proName = driver.findElementByXPath("//div[@class='prod-name']/a").getText();

		System.out.println(proName);

		// verification

		if (proName.contains(productName)) {

			System.out.println("Verify success");

		} else {

			System.out.println("Verification Failed");

		}

		// Closing browser

		driver.quit();

	}

}