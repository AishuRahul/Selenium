package week2.day1;



import java.io.File;

import java.io.IOException;

import java.util.List;



import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;



public class LearnAlert {



	public static void main(String[] args) throws IOException, InterruptedException {

	//set driver path

	System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");

	//launch browser

	ChromeDriver driver = new ChromeDriver();

    //load URL

	driver.get("http://jqueryui.com/draggable/");

	//maximize

	driver.manage().window().maximize();

	WebElement frame = driver.findElementByClassName("demo-frame");

    driver.switchTo().frame(frame);

	String text = driver.findElementById("draggable").getText();

	System.out.println(text);

	driver.switchTo().defaultContent();

	driver.findElementByLinkText("Download").click();

	}

}