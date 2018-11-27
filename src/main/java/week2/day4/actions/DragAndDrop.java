

package week2.day4.actions;



import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.remote.RemoteWebDriver;



public class DragAndDrop {



	public static void main(String[] args) {

		RemoteWebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/droppable/");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.switchTo().frame(0);

		WebElement drag = driver.findElementById("draggable");

		WebElement drop = driver.findElementById("droppable");



		Actions builder = new Actions(driver);

		builder.dragAndDrop(drag, drop).perform();

	}



}
