package SeleniumMouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32-unzip\\chromedriver.exe");
		  
	    ChromeDriver driver = new ChromeDriver();
	   
	    driver.get("https://jqueryui.com/droppable");
	    
	    Thread.sleep(3000);
	    
	    driver.switchTo().frame(0);
	    Actions ac = new Actions(driver);
	    
	    WebElement e1 = driver.findElementById("draggable");
	    WebElement e2 = driver.findElementById("droppable");
	    
	    ac.dragAndDrop(e1, e2).build().perform();

	}

}
