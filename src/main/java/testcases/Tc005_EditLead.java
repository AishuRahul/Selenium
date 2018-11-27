package testcases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdmethods.SeMethods;

public class Tc005_EditLead extends ProjectSpecificMethods {

	@Test(dataProvider="editData")
	public void editLead(String fname,String cname) throws InterruptedException {

		
		WebElement leadLink = locateElement("linktext", "Leads");
		click(leadLink);
		WebElement findLink = locateElement("linktext", "Find Leads");
		click(findLink);
		WebElement firstName = locateElement("xpath", "(//input[@name='firstName'])[3]");
		type(firstName, fname);
		WebElement findLead = locateElement("xpath", "//button[text()='Find Leads']");
		click(findLead);
		Thread.sleep(3000);
		WebElement firstElement = locateElement("xpath", "(//a[@class='linktext'])[4]");
		click(firstElement);
		String expectedTitle = "View Lead | opentaps CRM";
		verifyTitle(expectedTitle);
		WebElement edit = locateElement("linktext", "Edit");
		click(edit);
		WebElement company = locateElement("id", "updateLeadForm_companyName");
		company.clear();
		type(company, cname);
		WebElement update = locateElement("xpath", "//input[@class='smallSubmit']");
		click(update);
		WebElement leadCompany = locateElement("id", "viewLead_companyName_sp");
		getText(leadCompany);
		

	}
	@DataProvider(name="editData")
	public Object[][] dynamicData() throws IOException
	{
		
		
		String[][] data = ReadExcel.readExcel("EditLead");

		   return data;
	}
}
