package SeleniumButton;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32-unzip\\chromedriver.exe");
		  
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("https://courses.letskodeit.com/practice");
	    
	    driver.findElementById("bmwcheck").click();
	    Thread.sleep(2000);
	    
	    driver.findElementById("benzcheck").click();
	    Thread.sleep(2000);
	    
	    driver.findElementById("hondacheck").click();
	    Thread.sleep(2000);
		  
	    // OR another way to do this as well
	    
	    
	    List<WebElement> l = driver.findElementsByXPath("//*[@name='cars' and @type='checkbox']");
	    
	    for(WebElement x : l) {
	    	
	    	x.click();
	    	Thread.sleep(2000);
	    }
	  

	}

}
