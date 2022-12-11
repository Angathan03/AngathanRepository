package SeleniumButton;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32-unzip\\chromedriver.exe");
		  
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("https://courses.letskodeit.com/practice");
	    
        WebElement ele = driver.findElementById("multiple-select-example");
	    
	    Select s = new Select(ele);
	    s.selectByIndex(0);
	    //s.selectByValue("orange");
	    //s.selectByVisibleText("Peach");
	    
	    Thread.sleep(3000);
	    
	    s.deselectByIndex(2);

	}

}
