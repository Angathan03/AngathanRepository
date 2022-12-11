package seleniumBrowserUtility;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Repositioning {

	public static void main(String[] args) throws InterruptedException {
		
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32-unzip\\chromedriver.exe");
		 
		 //Creating an object for ChromeDriver
		 ChromeDriver c = new ChromeDriver();
		 
		 // Getting the website
		 c.get("http://www.google.com");
		 
		 
		 //Create an object for point class and pass the possition
		 Point p = new Point(500,100);
		 
		 c.manage().window().setPosition(p);
		 
		 Thread.sleep(3000);
		 
		// c.quit();
		 

	}

}
