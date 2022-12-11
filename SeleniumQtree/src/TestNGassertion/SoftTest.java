package TestNGassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(TestNGListner.TestNGListener.class)
public class SoftTest {
	
	@Test
	public void SimpleSoftTest() {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32-unzip\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://www.google.com");
		 
		 SoftAssert s = new SoftAssert();
		 
		 s.assertEquals(driver.getTitle(),"Google");  // fail
		 s.assertNotEquals(driver.getTitle(), "Yahoo"); // pass
		 
		 WebElement obj = driver.findElementByLinkText("Images");
		 
		 s.assertTrue(obj.isDisplayed()); // pass
		 s.assertFalse(obj.isSelected()); // pass
		 
		 driver.quit();
		 
		 s.assertAll();
		 
		
	}

}
