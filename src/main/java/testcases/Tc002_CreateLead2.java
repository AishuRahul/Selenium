package testcases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdmethods.ProjectSpecificMethods;;


public class Tc002_CreateLead2 extends ProjectSpecificMethods{
	
	
	@BeforeTest
	public void setData() {
		testcaseName="Tc002_CreateLead2";

		testdesp="Create a new Lead";

		author="Aiswarya";

		category="Smoke";
		

	}

	@Test(dataProvider="fetchData")
	public void createLead(String cname,String fname,String lname) {
		
		WebElement leadLink = locateElement("linktext", "Leads");
		click(leadLink);
		WebElement createLeadLink=locateElement("linktext","Create Lead");
		click(createLeadLink);
		WebElement companyName=locateElement("id","createLeadForm_companyName");
		type(companyName,cname);
		WebElement firstName=locateElement("id","createLeadForm_firstName");
		type(firstName,fname);
		WebElement lastName=locateElement("id","createLeadForm_lastName");
		type(lastName,lname);
		WebElement eleSource = locateElement("id","createLeadForm_dataSourceId");
		selectDropDownUsingText(eleSource, "Cold Call");
		WebElement eleMarketing = locateElement("id","createLeadForm_marketingCampaignId");
		selectDropDownUsingIndex(eleMarketing,3);

		WebElement firstNameLocal=locateElement("id","createLeadForm_firstNameLocal");
		type(firstNameLocal,"ais");
		WebElement lastNameLocal=locateElement("id","createLeadForm_lastNameLocal");
		type(lastNameLocal,"rah");
		WebElement personalTitle=locateElement("id","createLeadForm_personalTitle");
		type(personalTitle,"mrs");
		WebElement profileTitle=locateElement("id","createLeadForm_generalProfTitle");
		type(profileTitle,"MRS");
		WebElement departmentName=locateElement("id","createLeadForm_departmentName");
		type(departmentName,"IT");
		WebElement revenue=locateElement("id","createLeadForm_annualRevenue");
		type(revenue, "1000000");
		WebElement currency=locateElement("id","createLeadForm_currencyUomId");
		type(currency, "INR");
		WebElement eleIndustry = locateElement("id","createLeadForm_industryEnumId");
		selectDropDownUsingText(eleIndustry, "Aerospace");

		takeSnap();

		WebElement createLead=locateElement("class","smallSubmit");
		click(createLead);
		/*WebElement text =locateElement("id","viewLead_firstName_sp");
		verifyExactText(text,"Aiswarya");
		WebElement company = locateElement("id","viewLead_companyName_sp");
		verifyPartialText(company,"abc");
		WebElement lastNameTxt =locateElement("id","viewLead_lastName_sp");
		verifyExactText(lastNameTxt,"Rahul");
		*/
		







	}

	/**** data Provider 
	 * @throws IOException ***/

	@DataProvider(name="fetchData")
	public Object[][] dynamicData() throws IOException
	{
		/*String[][] data=new String[2][3];
		data[0][0]="TCS";
		data[0][1]="Aiswarya";
		data[0][2]="Rahul";
		
		data[1][0]="ibm";
		data[1][1]="Rahul";
		data[1][2]="Mohan";
		return data;*/
		
		String[][] data = ReadExcel.readExcel("CreateLead");

		   return data;
	}


}
