package Seleniumexec;

import org.openqa.selenium.chrome.ChromeDriver;

public class e1 {

	public static void main(String[] args) {
		
		 // Finding the driver 
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32-unzip\\chromedriver.exe");
		 
		 //Creating an object for ChromeDriver
		 ChromeDriver c = new ChromeDriver();
		 
		 c.get("http://www.google.com");
		 
		 System.out.println(c.executeScript("return document.title"));
		 System.out.println(c.executeScript("return document.URL"));
	}

}
