package SeleniumLocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2 {

	public static void main(String[] args) {
		
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32-unzip\\chromedriver.exe");
		 
		 //Creating an object for ChromeDriver
		 ChromeDriver c = new ChromeDriver();
		 
		 // Getting the website
		 c.get("http://www.facebook.com");
		 
		 
		 c.findElementByLinkText("Forgot password?").click();
		 
		 c.navigate().back();
		 
		 c.findElementByPartialLinkText("got passwo").click();

	}

}
