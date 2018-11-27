/*package steps;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead {
	public ChromeDriver driver;

	@Given("Launch the browser for Create")
	public void launchBrowser() {
		driver = new ChromeDriver();
	}

	@And("Load the URL for Create")
	public void loadURL() {
		driver.get("http://leaftaps.com/opentaps");
	}

	@When("Maximize the browser for Create")
	public void maximize() {
		driver.manage().window().maximize();

	}

	@And("Set timeout for Create")
	public void timeout() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("Enter the username for Create")
	public void typeUsername() {
		driver.findElementById("username").sendKeys("DemoSalesManager");
	}

	@And("Enter the password for Create")
	public void typePasswordforCreate() {
		driver.findElementById("password").sendKeys("crmsfa");
	}

	@When("Click on login button for Create")
	public void clickLoginforCreateLead() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("Verify login is success for Create")
	public void verifyLogin() {
		System.out.println("Login verified");
	}

	@When("Click on CRMS\\/SFA")
	public void clickonCRMS() {

		driver.findElementByLinkText("CRM/SFA").click();

	}

	@When("Click on Leads")
	public void clickLeads() {
		driver.findElementByLinkText("Leads").click();

	}

	@And("Click on Create Lead")
	public void clickCreateLead() {

		driver.findElementByLinkText("Create Lead").click();
	}

	@When("Enter the company name as (.*)")
	public void typeCompanyName(String cname) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);

	}
	

	@And("Enter the First Name as (.*)")
	public void typeFirstNameAsXYZ(String fname) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
	}
	

	@And("Enter the Last Name as (.*)")
	public void typeLastName(String lname) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
	}
	

	@And("Select source As Cold Call")
	public void selectSource() {
		WebElement eleSource = driver.findElementById("createLeadForm_dataSourceId");
		Select sc = new Select(eleSource);
		sc.selectByVisibleText("Cold Call");
	}

	@And("Select marketing from Index 3")
	public void selectMarketing() {
		WebElement element = driver.findElementById("createLeadForm_marketingCampaignId");
		Select marketing = new Select(element);
		marketing.selectByIndex(3);
	}

	@Then("Take a Screenshot")
	public void takeSnapshot() {
		File src = driver.getScreenshotAs(OutputType.FILE);

		File dec = new File("./snaps/img.png");

		try {
			FileUtils.copyFile(src, dec);
		} catch (IOException e) {
			System.err.println("I/O Exception occured" + e.getMessage());
		}
	}

	@When("click on Create button")
	public void clickCreate() {
		driver.findElementByClassName("smallSubmit").click();

	}

	@Then("verify First Name matches")
	public void verifyFirstName() {
		String text = driver.findElementById("viewLead_firstName_sp").getText();
		if (text.equalsIgnoreCase("Aiswarya")) {
			System.out.println("First Name Validated");

		} else {
			System.out.println("Text Mismatch");

		}
	}

	@Then("verify Last Name Matches")
	public void verifyLastName() {
		String lastName = driver.findElementById("viewLead_lastName_sp").getText();
		if (lastName.equalsIgnoreCase("Rahul")) {
			System.out.println("LastName Validated");

		} else {
			System.out.println("Text Mismatch");

		}
	}

	@Then("Verify Company name matches")
	public void verifyComapanyName() {
		String company = driver.findElementById("viewLead_companyName_sp").getText();
		if (company.contains("abc")) {
			System.out.println("Company Validated");

		} else {
			System.out.println("Text Mismatch");

		}
	}

	@Then("Browser is closed")
	public void closeBrowser() {
		driver.close();
	}

}
*/