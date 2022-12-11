package TestNGwaits;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class wait2 {
	
	/* code is correct:  executes within the time limit, it will proceed further , it wont wait for the cmpletion of time limit
	 * code is wrong :  wait for the completion of time limit, then it will throw up error
	 *
	 * explicit wait:   time limit will be applicable for certain conditions
	 * 
	 * create an object for webdriver wait class
	 * pass driver instance and time limit as input
	 * call untill method
	 * call expected conditions 
	 *
	 * */
	

	@Test
	public void explicitWait() {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32-unzip\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://www.google.com");
		 
		 WebDriverWait w = new WebDriverWait(driver,5);
		 
		 //title
		 w.until(ExpectedConditions.titleIs("Google"));
		 
		//title
			//w.until(ExpectedConditions.titleIs("yhoo"));//5
			//w.until(ExpectedConditions.titleContains("oo")); //5
			
			//alert
			//w.until(ExpectedConditions.alertIsPresent()); //5
			
			//visibility of an element
			// finding the element and checking wther it is visible
			//w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail")));//5
			
			// check wther an element is clickable or not
			//finding the element and checking whther it is clickable
			//w.until(ExpectedConditions.elementToBeClickable(By.linkText("Gmail")));//5
			
			// visibility of all the elements
			// collect all the images, check whether thry are visible
			//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("img")));
			
			// number of elements
			//w.until(ExpectedConditions.numberOfElementsToBe(By.tagName("img"), 2));
			
			driver.quit();
		 
		 
	}
		 
}
