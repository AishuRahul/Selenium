package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
    public ChromeDriver driver;
    @Given("Launch the browser")
	public void launchBrowser() {
	driver = new ChromeDriver();
	}
    @And("Load the URL")
	public void loadURL() {
	driver.get("http://leaftaps.com/opentaps");
	}
	@When("Maximize the browser")
	public void maximize() {
	Options manage = driver.manage();/*window().maximize();*/
	Window window = manage.window();
	window.maximize();
	}
	@And("Set timeout")
	public void timeout() {
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@When("Enter the username")
	public void typeUsername() {
		driver.findElementById("username").sendKeys("DemoSalesManager");
	}
	@And("Enter the password")
	public void typePassword() {
		driver.findElementById("password").sendKeys("crmsfa");
	}
	@When("Click on login button")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@Then("Verify login is success")
	public void verify() {
		System.out.println("Login verified");
	}
}
