package SeleniumButton;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
	
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32-unzip\\chromedriver.exe");
		  
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("https://courses.letskodeit.com/practice");
		    
		  
		 List<WebElement> l = driver.findElementsByXPath("//*[@name='cars' and @type='radio']");
		    
		    for(WebElement x : l) {
		    	
		    	x.click();
		    	
		    	Thread.sleep(2000);
		    }
		  
		  

	}

}
