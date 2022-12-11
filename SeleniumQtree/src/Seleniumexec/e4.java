package Seleniumexec;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class e4 {

	public static void main(String[] args) throws InterruptedException {
		
		// Finding the driver 
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32-unzip\\chromedriver.exe");
				 
		//Creating an object for ChromeDriver
		ChromeDriver driver = new ChromeDriver();
				 
		driver.get("http://www.mycontactform.com");
		
		
		driver.executeScript("alert('WARNING!!!!!!!!!!!!!! :) :) :)')");
		
		Thread.sleep(3000);
		
		Alert a = driver.switchTo().alert();
		a.accept();
		
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		

	}

}
