package SeleniumButton;

import org.openqa.selenium.chrome.ChromeDriver;

public class Scroller {

	public static void main(String[] args) throws InterruptedException {
		
		// Finding the driver 
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32-unzip\\chromedriver.exe");
				 
		//Creating an object for ChromeDriver
		ChromeDriver c = new ChromeDriver();
				 
		c.get("http://www.seleniumeasy.com");
		
		/*
		c.executeScript("window.scrollBy(0,document.body.scrollHeight)"); // page down
		Thread.sleep(3000);
		c.executeScript("window.scrollBy(0,-document.body.scrollHeight)"); // page up
		Thread.sleep(3000);
        */
		
		// another way 
		
		
		c.executeScript("window.scrollBy(0,700)"); // page down
		Thread.sleep(3000);
		c.executeScript("window.scrollBy(0,-700)"); // page up
		Thread.sleep(3000);

		
		
	}

}
