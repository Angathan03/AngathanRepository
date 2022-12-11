package SeleniumLocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentCSSlocator {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32-unzip\\chromedriver.exe");
		 
		 //Creating an object for ChromeDriver
		 ChromeDriver c = new ChromeDriver();
		 
		 // Getting the website
		 c.get("http://www.facebook.com");
		 
		 //tag#id
		 c.findElementByCssSelector("input#email").sendKeys("Ang"); 
		 c.navigate().refresh();
		 
		 //tag.class
		// c.findElementByCssSelector("input.inputtext").sendKeys("Ang");  -- Check with her tomorrow
		 c.navigate().refresh();
		 
		 //tag[attribute='value']
		 c.findElementByCssSelector("input[type='text']").sendKeys("Ang");
		 c.navigate().refresh();
		 
		 
		 //tagname.classname[attribute='value']
		 
		 
		 //tagname[attribute^='prefix value']
		 c.findElementByCssSelector("input[type^='te']").sendKeys("hi");
		 c.navigate().refresh();
		 
		 
		 //tagname[attribute$='suffix value'
		 c.findElementByCssSelector("input[type$='xt']").sendKeys("hello");
		 c.navigate().refresh();
		 
		 
		 //tagname[attribute*='substring value'
		 c.findElementByCssSelector("input[type*='ex']").sendKeys("how are you");
		 c.navigate().refresh();
	}

}
