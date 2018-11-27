package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdmethods.SeMethods;


public class Tc002_CreateLead extends ProjectSpecificMethods{

	@Test(dataProvider="fetchData")
	public void createLead(String cname,String fname,String lname) {
		
		WebElement leadLink = locateElement("linktext", "Leads");
		click(leadLink);
		WebElement createLeadLink=locateElement("linktext","Create Lead");
		click(createLeadLink);
		WebElement companyName=locateElement("id","createLeadForm_companyName");
		type(companyName,"abc");
		WebElement firstName=locateElement("id","createLeadForm_firstName");
		type(firstName,"Aiswarya");
		WebElement lastName=locateElement("id","createLeadForm_lastName");
		type(lastName,"Rahul");
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
		WebElement text =locateElement("id","viewLead_firstName_sp");
		verifyExactText(text,"Aiswarya");
		WebElement company = locateElement("id","viewLead_companyName_sp");
		verifyPartialText(company,"abc");
		WebElement lastNameTxt =locateElement("id","viewLead_lastName_sp");
		verifyExactText(lastNameTxt,"Rahul");
		
		







	}

	/**** data Provider ***/

	@DataProvider(name="fetchData")
	public Object[][] dynamicData()
	{
		String[][] data=new String[2][3];
		data[0][0]="TCS";
		data[0][0]="Aiswarya";
		data[0][0]="Rahul";
		
		data[0][0]="ibm";
		data[0][0]="Rahul";
		data[0][0]="Mohan";
		return data;
		
	}


}
