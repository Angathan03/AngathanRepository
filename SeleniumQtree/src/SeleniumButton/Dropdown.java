package SeleniumButton;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32-unzip\\chromedriver.exe");
		  
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("https://courses.letskodeit.com/practice");
	    
	    WebElement ele = driver.findElementById("carselect");
	    
	    Select s = new Select(ele);
	    
	   //s.deselectByVisibleText("Benz");
	    
	    s.selectByVisibleText("Benz");

	}

}
