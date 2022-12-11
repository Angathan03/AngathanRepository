package TestNGDependency;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RealTime {
    
	ChromeDriver driver;
	
	@Test(priority=0, description="website visiting", groups="CLICK")
	public void visiting(){
		
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32-unzip\\chromedriver.exe");
			 
			//Creating an object for ChromeDriver
		    driver = new ChromeDriver();
					 
			driver.get("http://www.mycontactform.com");
			
		}
	
	@Test(priority=1, description="maximising visiting", groups="CLICK")
	public void max(){
		
		 driver.manage().window().maximize();
			
		}
	
	@Test(priority=2, description="refreshing visiting",invocationCount=2, groups="CLICK")
	public void refresh(){
		
		 driver.navigate().refresh();
			
		}
	
	@Test(priority=3, description="clicking", groups="CLICK")
	public void clicking(){
		
		driver.findElementByLinkText("Help").click();
			
		}
	
	@Test(priority=4, description="closing", dependsOnGroups = "CLICK", timeOut=4000)
	public void closing() throws InterruptedException{
		
		 Thread.sleep(3000);
		 driver.quit();
		}
	
}
