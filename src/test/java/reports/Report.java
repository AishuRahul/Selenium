package reports;



import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Report {

	public static ExtentReports extent;

	public static ExtentHtmlReporter html;

	public static ExtentTest test;

	public String testcaseName, testdesp, author, category;

	@BeforeClass

	public void beforeClass() {

		test = extent.createTest(testcaseName, testdesp);

		test.assignAuthor(author);

		test.assignCategory(category);

	}

	@BeforeSuite

	public void beforeSuite() {

		html = new ExtentHtmlReporter("./reports/result.html");

		html.setAppendExisting(true);

		extent = new ExtentReports();

		// attach report
		extent.attachReporter(html);

	}

	@AfterSuite

	public void afterSuite() {

		extent.flush();

	}

	// report step

	public void reportStep(String status, String data) {

		if (status.equalsIgnoreCase("Pass")) {

			test.pass(data);

		} else if (status.equalsIgnoreCase("Fail")) {

			test.fail(data);

		} else if (status.equalsIgnoreCase("Warning")) {

			test.warning(data);

		}

	}

}
