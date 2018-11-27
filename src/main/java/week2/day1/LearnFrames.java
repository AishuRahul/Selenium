package week2.day1;



import java.io.File;

import java.io.IOException;

import java.util.List;



import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;



public class LearnFrames {



	public static void main(String[] args) throws IOException, InterruptedException {

	//set driver path

	System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");

	//launch browser

	ChromeDriver driver = new ChromeDriver();

    //load URL

	driver.get("http://www.leafground.com/pages/Alert.html");

	//maximize

	driver.manage().window().maximize();

	driver.findElementByXPath("//button[text()='Alert Box']").click();

	String text = driver.switchTo().alert().getText();

	System.out.println(text);

	Thread.sleep(2000);

	driver.switchTo().alert().accept();

	}

}

