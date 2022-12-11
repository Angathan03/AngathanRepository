package seleniumBrowserUtility;

import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInOut {

	public static void main(String[] args) throws InterruptedException {
		
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32-unzip\\chromedriver.exe");
		 
		 //Creating an object for ChromeDriver
		 ChromeDriver c = new ChromeDriver();
		 
		 // Getting the website
		 c.get("http://www.google.com");
		 
		 
		 
		 // Greater than 100: Zoom in
		 // less than 100: Zoom out
		 
		 c.executeScript("document.body.style.zoom = '200%'"); // Zoom in
		 
		 Thread.sleep(3000);
		 
		 c.executeScript("document.body.style.zoom = '100%'"); // Normal
		 
		 Thread.sleep(3000);
		 
		 c.executeScript("document.body.style.zoom = '20%'"); // Zoom out
		 
		 Thread.sleep(3000);
		 
		 
		 c.quit();
		 
		 

	}

}
