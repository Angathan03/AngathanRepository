package SeleniumLocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator3 {

	public static void main(String[] args) {
		
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32-unzip\\chromedriver.exe");
		 
		 //Creating an object for ChromeDriver
		 ChromeDriver c = new ChromeDriver();
		 
		 // Getting the website
		 c.get("http://www.facebook.com");
		 
		 
		List<WebElement> i = c.findElementsByTagName("img");
		System.out.println("Number of imager " + i.size());
		
		List<WebElement> i2 = c.findElementsByTagName("a");
		System.out.println("Number of links " + i2.size());
		
		List<WebElement> i3 = c.findElementsByTagName("div");
		System.out.println("Number of elements iwth div " + i3.size());

	}
	
	

}
