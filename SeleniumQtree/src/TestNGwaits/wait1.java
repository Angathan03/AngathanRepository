package TestNGwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class wait1 {
	
	@Test
	public void implicitWait() {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32-unzip\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://www.google.com");
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 System.out.println("Title " + driver.getTitle()); // 5 seconds
		 
		 System.out.println("URL " + driver.getCurrentUrl()); // 5 seconds
		 
		 driver.findElementByLinkText("images"); // 5 seconds
		 
		 driver.navigate().refresh(); // 5 seconds
		 
		 driver.quit(); // 5 seconds
		 
		 
		 
	}
	
}
