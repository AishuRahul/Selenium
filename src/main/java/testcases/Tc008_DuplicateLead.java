package testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc008_DuplicateLead extends ProjectSpecificMethods {
	@Test
	public void duplicateLead() throws InterruptedException {
		WebElement leadLink = locateElement("linktext", "Leads");
		click(leadLink);
		WebElement findLink = locateElement("linktext", "Find Leads");
		click(findLink);
		WebElement email = locateElement("xpath", "//span[text()='Email']");
		click(email);
		WebElement emailaddr = locateElement("xpath", "//input[@name='emailAddress']");
		type(emailaddr, "xyz@yahoo.com");
		WebElement findLead = locateElement("xpath", "//button[text()='Find Leads']");
		click(findLead);

		Thread.sleep(3000);
		WebElement name = locateElement("xpath", "(//a[@class='linktext'])[6]");
		String nameOftheFirstEle = name.getText();
		System.out.println(nameOftheFirstEle);
		click(name);
		click(locateElement("linktext", "Duplicate Lead"));

		String page = "Duplicate Lead | opentaps CRM";
		verifyTitle(page);
		click(locateElement("class", "smallSubmit"));

		WebElement name1 = locateElement("id", "viewLead_firstName_sp");
		verifyExactText(name1, nameOftheFirstEle);

	}

}
