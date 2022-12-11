import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_22102022 {

	public static void main(String[] args) throws InterruptedException {
		 
		 // Finding the driver 
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32-unzip\\chromedriver.exe");
		 
		 //Creating an object for ChromeDriver
		 ChromeDriver c = new ChromeDriver();
		 
		 String baseUrl = "https://www.seleniumeasy.com/";
		 
         Point p = new Point(700,700); // Re-sizing
		 
		 c.manage().window().setPosition(p);
		 
		 
		 Thread.sleep(7000);
		 
		 c.executeScript("document.body.style.zoom = '200%'"); // ZOOM in
		 
         Dimension d = new Dimension(500,500);
		 
		 //passing the object to set the page size
		 c.manage().window().setSize(d);
		 
		 
		 // Getting the website
		 c.get(baseUrl);
		 
         Set<Cookie> obj = c.manage().getCookies();
		 
		 System.out.println("NUmber of cookies present before deleting " + obj.size());
		 
		 c.manage().deleteAllCookies();
		 
         Set<Cookie> obj1 = c.manage().getCookies();
		 
		 System.out.println("NUmber of cookies present after deleting " + obj1.size());
		 
		 
		 
		 c.navigate().back();
		 
		 
		 String baseUrl2 = "https://www.mycontactform.com/";
		 
		 // Getting the website
		 c.get(baseUrl2);
		 
		 c.findElementByCssSelector("#user").sendKeys("Dhivyakarthi123");
		 
		 c.findElementByCssSelector("#pass").sendKeys("12345");
		 
		 c.findElementByCssSelector("input[value='Login']").click();
		 
		 c.navigate().back();
		 
		 Thread.sleep(4000);
		 
		 c.findElementByLinkText("Help").click();
		 
		 Thread.sleep(4000);
		 
		 c.navigate().back();
		 

		 
		 
		 
		 
		 
	}

}
