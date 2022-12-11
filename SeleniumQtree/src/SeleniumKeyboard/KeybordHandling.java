package SeleniumKeyboard;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeybordHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32-unzip\\chromedriver.exe");
		  
	    ChromeDriver driver = new ChromeDriver();
	   
	    driver.get("https://www.google.com/");
	    
	    WebElement e = driver.findElementByName("q");
	    
	    Actions ac = new Actions(driver);
	    
	    ac.click(e).sendKeys("selenium").sendKeys(Keys.ENTER).build().perform(); // enter from keybord
	    
	    driver.navigate().back();
	    //Hold on shift and type selenium
	    
	    ac.click(e).keyDown(Keys.SHIFT).sendKeys("selenium").keyUp(Keys.SHIFT).build().perform();
	    
	    

	}

}
