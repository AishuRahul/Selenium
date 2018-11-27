
package week1.day2;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
//load URL
		driver.get("http://leaftaps.com/opentaps");
//maximize
		driver.manage().window().maximize();
//Enter usernmae
		driver.findElementById("username").sendKeys("DemoSalesManager");
//Enter Password
		driver.findElementById("password").sendKeys("crmsfa");

		driver.findElementByClassName("decorativeSubmit").click();
		// Thread.sleep(3000);
		// click logout
		// driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("abc");
		driver.findElementById("createLeadForm_firstName").sendKeys("Aiswarya");
		driver.findElementById("createLeadForm_lastName").sendKeys("Rahul");
		
		WebElement eleSource = driver.findElementById("createLeadForm_dataSourceId");
		Select sc = new Select(eleSource);
		sc.selectByVisibleText("Cold Call");
		//driver.findElementById("createLeadForm_dataSourceId").sendKeys("Cold Call");
		 WebElement element = driver.findElementById("createLeadForm_marketingCampaignId");
		Select marketing=new Select(element);
		 marketing.selectByValue("CATRQ_CARNDRIVER");
		//driver.findElementById("createLeadForm_marketingCampaignId").sendKeys("Affiliate Sites");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Ais");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("rah");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Mrs");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Ms.");
		driver.findElementById("createLeadForm_departmentName").sendKeys("IT");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("10000");
		driver.findElementById("createLeadForm_currencyUomId").sendKeys("INR - Indian Rupee");
		
		//driver.findElementById("createLeadForm_industryEnumId").sendKeys("Aerospace");
		WebElement industryElem= driver.findElementById("createLeadForm_industryEnumId");
		Select industry = new Select(industryElem);
		List<WebElement> allOptions=industry.getOptions();
		int count=allOptions.size();
		WebElement eachOption=allOptions.get(count-1);
		System.out.println(eachOption.getText());
		industry.selectByIndex(count-1);
		
		//take screenshot 

		File src = driver.getScreenshotAs(OutputType.FILE);

		File dec = new File("./snaps/img.png");

		FileUtils.copyFile(src, dec);

		
		
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("50");
		driver.findElementById("createLeadForm_ownershipEnumId").sendKeys("Sole Proprietorship");
		driver.findElementById("createLeadForm_sicCode").sendKeys("xyz");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("abc");
		driver.findElementById("createLeadForm_description").sendKeys("Testing the application using selenium");
		driver.findElementById("createLeadForm_importantNote").sendKeys("Testing Software");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("044");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("2796586");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("46956");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Aiswarya");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("xyz@yahoo.com");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.yahoo.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("Aish");
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("Vidhu");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("xyz,1,abc apts");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("mount");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
		driver.findElementById("createLeadForm_generalStateProvinceGeoId").sendKeys("84057");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600016");
		driver.findElementById("createLeadForm_generalCountryGeoId").sendKeys("India");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("000");

		driver.findElementByClassName("smallSubmit").click();
		
		//clear() to clear a text field
		String text = driver.findElementById("viewLead_firstName_sp").getText();
		String company = driver.findElementById("viewLead_companyName_sp").getText();
		String lastName = driver.findElementById("viewLead_lastName_sp").getText();

		// System.out.println(text);
		if (text.equalsIgnoreCase("Aiswarya")) {
			System.out.println("First Name Validated");

		} else {
			System.out.println("Text Mismatch");

		}
		if (lastName.equalsIgnoreCase("Rahul")) {
			System.out.println("LastName Validated");

		} else {
			System.out.println("Text Mismatch");

		}
		if (company.contains("TCS")) {
			System.out.println("Company Validated");

		} else {
			System.out.println("Text Mismatch");

		}
     driver.close();
	}

}
