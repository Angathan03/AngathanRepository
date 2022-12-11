package SeleniumLocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class locator5 {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32-unzip\\chromedriver.exe");
		 
		 //Creating an object for ChromeDriver
		 ChromeDriver c = new ChromeDriver();
		 
		 // Getting the website
		 c.get("http://www.mycontactform.com");


	}

}
