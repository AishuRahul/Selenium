package challenge;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

public class UploadFile {
	@Test
	public void upload() throws MalformedURLException{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		WebElement ele =
				driver.findElementByXPath("//input[@type='file']");
//		uploadbutton.sendKeys("K:\\Koushik\\workspace\\whatsApp\\Resume.pdf");
		
		LocalFileDetector detector = new LocalFileDetector();
		((RemoteWebElement)ele).setFileDetector(detector);
		ele.sendKeys(detector.getLocalFile("./Resume.pdf")
				.getAbsolutePath());
	}
}

























