package testcases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdmethods.SeMethods;

public class Tc006_DeleteLead extends ProjectSpecificMethods {

	@Test(dataProvider="deleteData")
	public void deleteLead(String phareacode,String phnumber) throws InterruptedException {

		
		WebElement leadLink = locateElement("linktext", "Leads");
		click(leadLink);
		WebElement findLink = locateElement("linktext", "Find Leads");
		click(findLink);
		WebElement phone = locateElement("xpath", "//span[text()='Phone']");
		click(phone);
		WebElement phoneAreaCode = locateElement("xpath", "//input[@name='phoneAreaCode']");
		type(phoneAreaCode, "044");
		WebElement phoneNumber = locateElement("xpath", "//input[@name='phoneNumber']");
		type(phoneNumber, "2796586");
		WebElement findLead = locateElement("xpath", "//button[text()='Find Leads']");
		click(findLead);
		Thread.sleep(3000);
		WebElement firstElem = locateElement("xpath", "(//a[@class='linktext'])[4]");
		String idOffirstEle = firstElem.getText();
		click(firstElem);
		WebElement submit = locateElement("class", "subMenuButtonDangerous");
		click(submit);
		WebElement findLink1 = locateElement("linktext", "Find Leads");
		click(findLink1);
		WebElement id = locateElement("xpath", "//input[@name='id']");
		type(id, idOffirstEle);
		WebElement findLead1 = locateElement("xpath", "//button[text()='Find Leads']");
		click(findLead1);
		Thread.sleep(2000);
		WebElement errMsg = locateElement("xpath", "//div[text()='No records to display']");
		String expectedText = "No records to display";
		verifyExactText(errMsg, expectedText);
		

	}
	@DataProvider(name="deleteData")
	public Object[][] dynamicData() throws IOException
	{
		
		
		String[][] data = ReadExcel.readExcel("DeleteLead");

		   return data;
	}
}
