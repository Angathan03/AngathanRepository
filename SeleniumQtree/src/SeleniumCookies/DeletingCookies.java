package SeleniumCookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeletingCookies {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32-unzip\\chromedriver.exe");
		 
		 //Creating an object for ChromeDriver
		 ChromeDriver c = new ChromeDriver();
		 
		 // Getting the website
		 c.get("http://www.google.com");
		 
		 
		 //Collection framework
		 Set<Cookie> obj = c.manage().getCookies();
		 
		 System.out.println("NUmber of cookies present before deleting " + obj.size());
		 
		 // Deleting the cooking for the current session 
		 c.manage().deleteAllCookies();
		 
		 
		 //Collection framework
		 Set<Cookie> obj1 = c.manage().getCookies();
		 
		 System.out.println("NUmber of cookies present after deleting " + obj1.size());
		 
		 
		 Thread.sleep(3000);
		 
		 c.quit();
		 

	}

}
