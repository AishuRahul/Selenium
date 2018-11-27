package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnReport {

	public static void main(String[] args) {
		// path of report
		//Before Suite
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/report.html");
		html.setAppendExisting(true);
		ExtentReports extent = new ExtentReports();
		// attach report
		extent.attachReporter(html);
		
		//Before Class
		ExtentTest test = extent.createTest("TC001_Login", "Login to the class");
		
		//Syso statement
		test.assignAuthor("Aiswarya");
		test.assignCategory("Smoke");
		test.pass("Enter username successfully");
		test.pass("Enter password successfully");
		test.fail("Click login not success");
		
		//After Suite
		extent.flush();//generate report

	}

}
