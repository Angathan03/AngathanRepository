package SeleniumGetMethods;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
		
		 // Finding the driver 
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32-unzip\\chromedriver.exe");
		 
		 //Creating an object for ChromeDriver
		 ChromeDriver c = new ChromeDriver();
		 
		 // Getting the website
		 c.get("http://www.google.com");
		 
		 //get title
		 System.out.println("The page title is " + c.getTitle());
		 
		 // Get current URL
		 System.out.println("The page URL is " + c.getCurrentUrl());
		 
		 //Get the page size
		 System.err.println("The page size is " + c.manage().window().getSize());
		 
		 Thread.sleep(3000);
		 
		 //point
		 System.out.println(c.manage().window().getPosition());
		 
		 
		 // I M P O R T A N T 
		 //Getting browser details
		 //Capabilities --> Buildin interface
		 
		 Capabilities d = c.getCapabilities();
		 
		 System.out.println("Name of the browser is " + d.getBrowserName());

		 System.out.println("browser version " + d.getVersion());
		 
		 System.out.println("Operating System " + d.getPlatform());
		 
		 c.quit();
		 
		 
	}

}
