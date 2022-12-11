package SeleniumCookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCookies {

	public static void main(String[] args) throws InterruptedException {
		
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32-unzip\\chromedriver.exe");
		 
		 //Creating an object for ChromeDriver
		 ChromeDriver c = new ChromeDriver();
		 
		 // Getting the website
		 c.get("http://www.google.com");
		 
		 //Collection framework
		 Set<Cookie> obj = c.manage().getCookies();
		 
		 System.out.println("NUmber of cookies are " + obj.size());
         
		 for (Cookie x : obj) {
			 
			 System.out.println("Name is " + x.getName());
			 System.out.println("Vakue is " + x.getValue());
			 System.out.println("Exiry is " + x.getExpiry());
			 System.out.println();
			 
		 }
		 
		 
		 
		 
		 Thread.sleep(3000);
		 
		 c.quit();
		 
		 

	}

}
