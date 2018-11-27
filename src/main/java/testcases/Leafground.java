package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafground {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//load URL
		driver.get("http://www.leafground.com/pages/table.html");
		//maximize
		driver.manage().window().maximize();
		WebElement tab=driver.findElementByTagName("table");
		List<WebElement> trs=tab.findElements(By.tagName("tr"));
		/*for (WebElement rows: trs) {
			List<WebElement> cols=rows.findElements(By.tagName("td"));
			System.out.println(cols.get(1).getText());

			
		}
		*/
		WebElement row;
		
		for(int i=1;i<trs.size();i++) {
			row=trs.get(i);
			List<WebElement> cols=row.findElements(By.tagName("td"));	 
			// int size=cols.size();
			 System.out.println(cols.get(1).getText());
			 if(cols.get(1).getText().equals("80%"))
			 {
			 
			 WebElement ele=cols.get(2);
			 ele.click();
			 if(ele.isSelected())
			 {
				 System.out.println("Clicked Successfully");
			 }else {
				 System.out.println("not clicked");
			 }
			 break;
			 }
			
			 }
			
		
		//driver.close();
		
		
		
		
		
	}

}
