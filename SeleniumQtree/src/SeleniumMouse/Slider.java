package SeleniumMouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32-unzip\\chromedriver.exe");
		  
	    ChromeDriver driver = new ChromeDriver();
	   
	    driver.get("https://jqueryui.com/slider/");
	    
	    driver.switchTo().frame(0);
	    
	    WebElement x = driver.findElementById("slider");
	    
	    Actions ac = new Actions(driver);
	    
	   // ac.dragAndDropBy(x, 20, 0).build().perform(); // horizontal
	    Thread.sleep(3000);
	    
	    ac.dragAndDropBy(x, 0, 30).build().perform(); // vertical
	    
	    Thread.sleep(3000);
	    
	    driver.quit();

	}

}
