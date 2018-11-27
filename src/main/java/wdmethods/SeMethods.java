package wdmethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import reports.Report;

public class SeMethods extends Report implements WdMethods {

	public static  RemoteWebDriver driver = null;

	@Override
	public void startApp(String browser, String url) {

		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				setDriver(new ChromeDriver());
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				setDriver(new FirefoxDriver());
			}
			getDriver().get(url);
			getDriver().manage().window().maximize();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// System.out.println("The browser "+browser+" launched successfully");
			reportStep("Pass", "The browser " + browser + " launched successfully");

		}

		catch (WebDriverException e) {
			System.err.println("WebDriverException");
			reportStep("Fail", "Browser not launched");
			throw new RuntimeException();
		}
	}

	@Override
	public WebElement locateElement(String locator, String locValue) {

		try {
			switch (locator) {
			case "id":
				return getDriver().findElementById(locValue);
			case "name":
				return getDriver().findElementByName(locValue);
			case "class":
				return getDriver().findElementByClassName(locValue);
			case "tagname":
				return getDriver().findElementByTagName(locValue);
			case "linktext":
				return getDriver().findElementByLinkText(locValue);
			case "partialLinkText":
				return getDriver().findElementByPartialLinkText(locValue);
			case "xpath":
				return getDriver().findElementByXPath(locValue);
			}
		} catch (NoSuchElementException e) {

			System.err.println("Element not found");

			throw new RuntimeException();

		} catch (WebDriverException e) {

			System.err.println("WebDriverException " + e.getMessage());

			throw new RuntimeException();

		}
		return null;
	}

	@Override
	public WebElement locateElement(String locValue) {

		try {
			return getDriver().findElementById(locValue);
		} catch (NoSuchElementException e) {

			System.err.println("Element not found");
			throw new RuntimeException();
		} catch (WebDriverException e) {

			System.err.println("WebDriverException" + e.getMessage());
			throw new RuntimeException();
		}
	}

	@Override
	public void type(WebElement ele, String data) {
		try {

			ele.sendKeys(data);

			// System.out.println("The data "+data+" entered successfully");

			reportStep("Pass", "The data " + data + " entered successfully");

		} catch (WebDriverException e) {

			System.err.println("WebDriverException occured");

			reportStep("Fail", "The data " + data + " not entered");

			throw new RuntimeException();

		} /*
			 * finally {
			 * 
			 * takeSnap();
			 * 
			 * }
			 */
	}

	@Override
	public void click(WebElement ele) {
		try {

			ele.click();

			// System.out.println("The element "+ele+ "click successfully");

			reportStep("Pass", "The element " + ele + "click successfully");

		} catch (WebDriverException e) {
			System.err.println("Webdriver Exception occured");
			reportStep("Fail", "The element " + ele + "is not clicked");
			throw new RuntimeException();

		}
	}

	@Override
	public String getText(WebElement ele) {

		try {
			return ele.getText();
		} catch (WebDriverException e) {
			System.err.println("Webdriver Exception" + e.getMessage());
			throw new RuntimeException();
		}

	}

	@Override
	public void selectDropDownUsingText(WebElement ele, String value) {
		try {
			Select sel = new Select(ele);
			sel.selectByVisibleText(value);
			reportStep("Pass", "The value " + value + " entered successfully");
			// System.out.println("The value "+value+" entered successfully");
		} catch (WebDriverException e) {
			reportStep("Fail", "The value is" + value + " not entered");
			System.err.println("Webdriver Exception" + e.getMessage());
			throw new RuntimeException();
		}
	}

	@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		try {
			Select sel = new Select(ele);
			sel.selectByIndex(index);
			reportStep("Pass", "The data at " + index + " entered successfully");
			// System.out.println("The data at"+ index+" entered successfully");
		} catch (WebDriverException e) {
			reportStep("Fail", "The data at" + index + " not entered");
			System.err.println("Webdriver Exception" + e.getMessage());
			throw new RuntimeException();
		}

	}

	@Override
	public boolean verifyTitle(String expectedTitle) {
		try {

			String title = getDriver().getTitle();
			System.out.println("Page title is " + title);
			if (expectedTitle.equals(title)) {
				reportStep("Pass", "Title " + expectedTitle + "is verified");
				// System.out.println("Title "+expectedTitle+ "is verified");
				return true;
			} else {
				// System.out.println("Title is not verified");
				reportStep("Fail", "Title is not verified");
				return false;
			}
		} catch (WebDriverException e) {

			System.err.println("Webdriver Exception" + e.getMessage());
			throw new RuntimeException();
		}

	}

	@Override
	public void verifyExactText(WebElement ele, String expectedText) {
		try {

			String inputText = ele.getText();
			if (inputText.equalsIgnoreCase(expectedText)) {
				// System.out.println("Text " +inputText+ " verified successfully");
				reportStep("Pass", "Text " + inputText + " verified successfully");

			} else {
				// System.out.println("Text verified unsuccessfully");
				reportStep("Fail", "Text verified unsuccessfully");
			}
		} catch (WebDriverException e) {

			System.err.println("Webdriver Exception" + e.getMessage());
			throw new RuntimeException();
		}
	}

	@Override
	public void verifyPartialText(WebElement ele, String expectedText) {
		try {

			String inputText = ele.getText();
			if (inputText.contains(expectedText)) {
				// System.out.println("Text " +inputText+ " verified successfully");
				reportStep("Pass", "Text  " + inputText + " verified successfully");

			} else {
				// System.out.println("Text verified unsuccessfully");
				reportStep("Fail", "Text verified unsuccessfully");
			}
		} catch (WebDriverException e) {

			System.err.println("Webdriver Exception" + e.getMessage());
			throw new RuntimeException();
		}

	}

	@Override
	public void verifyExactAttribute(WebElement ele, String attribute, String value) {

		try {
			String txt = ele.getAttribute(attribute);
			if (txt.equals(value)) {
				// System.out.println("Attribute "+txt+ "is verified");
				reportStep("Pass", "Attribute " + txt + "is verified");

			} else {
				reportStep("Fail", "Attribute verified unsuccessfully");
				// System.out.println("Attribute verified unsuccessfully");
			}
		} catch (WebDriverException e) {

			System.err.println("Webdriver Exception" + e.getMessage());
			throw new RuntimeException();
		}
	}

	@Override
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {

		try {
			String txt = ele.getAttribute(attribute);
			if (txt.contains(value)) {
				// System.out.println("Attribute "+txt+ "is verified");
				reportStep("Pass", "Attribute " + txt + "is verified");
			} else {
				reportStep("Fail", "Attribute verified unsuccessfully");
				// System.out.println("Attribute verified unsuccessfully");
			}
		} catch (WebDriverException e) {

			System.err.println("Webdriver Exception" + e.getMessage());
			throw new RuntimeException();
		}
	}

	@Override
	public void verifySelected(WebElement ele) {

		try {
			if (ele.isSelected()) {
				// System.out.println("Already Selected");
				reportStep("Pass", "Element Already Selected");

			} else {
				// System.out.println("Element not selected");
				reportStep("Fail", "Element not selected");
			}
		} catch (WebDriverException e) {

			System.err.println("Webdriver Exception" + e.getMessage());
			throw new RuntimeException();
		}

	}

	@Override
	public void verifyDisplayed(WebElement ele) {
		try {
			if (ele.isDisplayed()) {
				// System.out.println("Already Displayed");
				reportStep("Pass", "Element already displayed");

			} else {
				// System.out.println("Element not displayed");
				reportStep("Fail", "Element not displayed");
			}
		} catch (WebDriverException e) {

			System.err.println("Webdriver Exception" + e.getMessage());
			throw new RuntimeException();
		}

	}

	@Override
	public void switchToWindow(int index) {
		try {
			Set<String> allHandles = getDriver().getWindowHandles();
			List<String> list = new ArrayList<String>();
			list.addAll(allHandles);

			getDriver().switchTo().window(list.get(index));
			reportStep("Pass", "Switched to window" + index + "succesfully");
		} catch (NoSuchWindowException e) {
			System.err.println("Window not present" + e.getMessage());
			reportStep("Fail", "Switching to window unsuccessful");

			throw new RuntimeException();

		} catch (WebDriverException e) {

			System.err.println("Webdriver Exception" + e.getMessage());
			reportStep("Fail", "Switching to window unsuccessful");
			throw new RuntimeException();
		}
	}

	@Override
	public void switchToFrame(WebElement ele) {

		try {
			getDriver().switchTo().frame(ele);
			reportStep("Pass", "Switched to frame" + ele + "succesfully");

		} catch (NoSuchFrameException e) {
			System.err.println("Frame not present" + e.getMessage());
			reportStep("Fail", "Switching to frame" + ele + " unsuccessful");

			throw new RuntimeException();

		} catch (WebDriverException e) {

			System.err.println("Webdriver Exception" + e.getMessage());
			reportStep("Fail", "Switching to window unsuccessful");
			throw new RuntimeException();
		}
	}

	@Override
	public void acceptAlert() {

		try {
			getDriver().switchTo().alert().accept();
			reportStep("Pass", "Accepting the alert successfully ");
		} catch (WebDriverException e) {

			System.err.println("Webdriver Exception" + e.getMessage());
			reportStep("Fail", "Accepting alert unsuccessful");
			throw new RuntimeException();
		}
	}

	@Override
	public void dismissAlert() {

		try {
			getDriver().switchTo().alert().dismiss();
			reportStep("Pass", "Dismissing the alert successfully ");
		} catch (WebDriverException e) {

			System.err.println("Webdriver Exception" + e.getMessage());
			reportStep("Fail", "Dismissing alert unsuccessful");
			throw new RuntimeException();
		}
	}

	@Override
	public String getAlertText() {

		try {
			String text = getDriver().switchTo().alert().getText();
			reportStep("Pass", "Text of alert returned successfully ");
			return text;

		} catch (WebDriverException e) {

			System.err.println("Webdriver Exception" + e.getMessage());
			reportStep("Fail", "Text of alert not returned");
			throw new RuntimeException();
		}
	}

	@Override
	public void takeSnap() {
		File src = getDriver().getScreenshotAs(OutputType.FILE);

		File dec = new File("./snaps/img1.png");

		try {
			FileUtils.copyFile(src, dec);
			reportStep("Pass", "Snapshot taken successfully");
		} catch (IOException e) {

			System.err.println("IOException occured" + e.getMessage());
			reportStep("Fail", "Snapshot not taken");
			throw new RuntimeException();
		}
	}

	@Override
	public void closeBrowser() {
		try {
			getDriver().close();
			reportStep("Pass", "Browser closed successfully");
		} catch (WebDriverException e) {

			System.err.println("Webdriver Exception" + e.getMessage());
			reportStep("Fail", "Browser closed unsuccessfully");
			throw new RuntimeException();
		}

	}

	@Override
	public void closeAllBrowsers() {

		try {
			getDriver().quit();
			reportStep("Pass", "All Browsers closed successfully");
		} catch (WebDriverException e) {

			System.err.println("Webdriver Exception" + e.getMessage());
			reportStep("Fail", "Browsers closed unsuccessfully");
			throw new RuntimeException();
		}
	}

	public RemoteWebDriver getDriver() {
		return driver;
	}

	public void setDriver(RemoteWebDriver driver) {
		this.driver = driver;
	}

}
