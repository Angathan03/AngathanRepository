package Seleniumexec;

import org.openqa.selenium.chrome.ChromeDriver;

public class e3 {

	public static void main(String[] args) {
		
		// Finding the driver 
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32-unzip\\chromedriver.exe");
				 
		//Creating an object for ChromeDriver
		ChromeDriver c = new ChromeDriver();
				 
		c.get("http://www.mycontactform.com");
		
		
		
		c.executeScript("document.getElementById('user').value='dhivyakarthi123'");

		c.executeScript("document.getElementById('pass').value='12345'");

		c.executeScript("document.getElementsByName('btnSubmit')[0].click()");

	}

}
