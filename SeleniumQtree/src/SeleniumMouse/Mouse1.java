package SeleniumMouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse1 {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32-unzip\\chromedriver.exe");
		  
	    ChromeDriver driver = new ChromeDriver();
	   
	    driver.get("http://www.mycontactform.com");
	    
	    
	    
	    WebElement ele = driver.findElementByName("btnSubmit");
	    Actions a = new Actions(driver);
	    
	     //a.click(ele).build().perform();
	    a.doubleClick(ele).build().perform();
	   // a.contextClick(ele).build().perform();
	   // a.moveToElement(ele).click().build().perform();
	   // a.clickAndHold(ele).build().perform();
	    Thread.sleep(3000);
	   // a.release(ele).build().perform();
	      
	}

}
