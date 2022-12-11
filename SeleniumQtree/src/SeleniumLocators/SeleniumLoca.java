package SeleniumLocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLoca {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32-unzip\\chromedriver.exe");
		 
		 //Creating an object for ChromeDriver
		 ChromeDriver c = new ChromeDriver();
		 
		 // Getting the website
		 c.get("http://www.mycontactform.com");
		 
		 // Login
		 
		 //user_name
		 c.findElementById("user").sendKeys("Dhivyakarthi123");
		 
		 //password
		 c.findElementByName("pass").sendKeys("12345");
		 
		 //login
		 c.findElementByClassName("btn_log").click();
		 
		 c.navigate().back();
		 
		 // Facebook page
		 
		 c.get("http://www.facebook.com");
		 
		 c.findElementById("email").sendKeys("angathan03@gmail.com");
		 
		 c.findElementById("pass").sendKeys("12345");
		 
		 c.findElementByName("login").click();
		 
		 
         Thread.sleep(3000);
         
         c.quit();
		 

	}

}
