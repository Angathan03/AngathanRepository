package SeleniumLocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentLocatorCss2 {

	public static void main(String[] args) throws InterruptedException {
		
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32-unzip\\chromedriver.exe");
		 
		 //Creating an object for ChromeDriver
		 ChromeDriver c = new ChromeDriver();
		 
		 // Getting the website
		 c.get("http://www.gmail.com");
		 
		 
		 //tag#id
		 c.findElementByCssSelector("input#identifierId").sendKeys("angathan03@gmail.com 1");
		 c.navigate().refresh();
		 
		 //tag.class
		// c.findElementByCssSelector("input.whsOndzHQkBf").sendKeys("angathan03@gmail.com 2");
		// c.navigate().refresh();
		 
		 
		 //tag[text='value']
		 c.findElementByCssSelector("input[type='email']").sendKeys("angathan03@gmail.com 3");
		 c.navigate().refresh();
		 
		 
		c.findElementByCssSelector("input[type^='em']").sendKeys("angathan03@gmail.com 4");
		 
		 
		 c.findElementByXPath("	//*[@id=\"identifierNext\"]/div/button/span").click();
		 
		 Thread.sleep(300000); 
		 
		 c.quit();
		 
		 
	
	}

}
