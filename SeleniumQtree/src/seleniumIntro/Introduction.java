package seleniumIntro;

import org.openqa.selenium.chrome.ChromeDriver;

public class Introduction {

	public static void main(String[] args) throws InterruptedException {
	 
	 // Finding the driver 
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32-unzip\\chromedriver.exe");
	 
	 //Creating an object for ChromeDriver
	 ChromeDriver c = new ChromeDriver();
	 
	 // Getting the website
	 c.get("http://www.facebook.com");
	 
	 //Maximize
	 c.manage().window().maximize();
	 
	 c.manage().window().fullscreen();
	 
	 c.navigate().refresh();
	 
	 Thread.sleep(10000);
	 
	 c.quit();

	}

}
