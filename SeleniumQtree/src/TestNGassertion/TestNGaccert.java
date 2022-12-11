package TestNGassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGaccert {
	
	
	@Test
	public void HardTest() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32-unzip\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("http://www.google.com");
		 
		 Assert.assertEquals(driver.getTitle(),"Google");  // pass
		 Assert.assertNotEquals(driver.getTitle(), "Yahoo"); // pass
		 
		 WebElement obj = driver.findElementByLinkText("Images");
		 
		 Assert.assertTrue(obj.isDisplayed()); // pass
		 Assert.assertFalse(obj.isSelected()); // pass
		 
		 driver.quit();
		 
		
	}

}
