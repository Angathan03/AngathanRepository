package seleniumBrowserUtility;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resizing {

	public static void main(String[] args) throws InterruptedException {
		 // Finding the driver 
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32-unzip\\chromedriver.exe");
		 
		 //Creating an object for ChromeDriver
		 ChromeDriver c = new ChromeDriver();
		 
		 // Getting the website
		 c.get("http://www.google.com");
		 
		 //Setting the size in the Dimension class parameter
		 Dimension d = new Dimension(200,200);
		 
		 //passing the object to set the page size
		 c.manage().window().setSize(d);
		 
		 Thread.sleep(3000);

	}

}
