package TestNGAnnotation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation1 {
	
	/*
	 * before test  : run only once before all the test cases started its execution
	 * after test   : run only once after all the test cases finished its execution
	 * 
	 * 
	 * before class:  run once after before test
	 * after class :  run once before after test
	 * 
	 * before method: run before each tst case 
	 * after method:  run after each test case 
	 * 
	 * 
	 *  
	 *  before test:   visiting
	 *    before class: maximising
	 *        before method:refresh   tc1 : click  aftermethod   : cookies deletion
	 *        before method: refresh  tc2 : title  aftermethod   : cookies deletion
	 *    after class: getting url
	 *  after test : quitting
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
ChromeDriver driver;

@BeforeTest
public void beforeTest() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32-unzip\\chromedriver.exe");
	 driver = new ChromeDriver();
	 
	 driver.get("http://mycontactform.com");
	 
	 System.out.println("Befoe Test");
	
}


@BeforeClass
public void beforeClass() {
	 System.out.println("Befoe Class");
	 driver.manage().window().maximize();
	
}


@BeforeMethod
public void beforeMethod() {
	System.out.println("Before each test case");
	
	driver.navigate().refresh();
}


@Test(priority=0)
public void test1() {
	System.out.println("TEST CASE 1");
	
	driver.findElementByLinkText("Help").click();
	
}

@Test(priority=1)
public void test2() {
	System.out.println("TEST CASE 2");
	
	System.out.println("The title is " + driver.getTitle());
	
}

@AfterMethod
public void afterMethod() {
	
	System.out.println("After each test case");
	
	driver.manage().deleteAllCookies();
	
}

@AfterClass
public void afterClass() {
	 System.out.println("After Class");
	 
	 System.out.println("Current URL is " + driver.getCurrentUrl());
	
}
	
@AfterTest
public void afterTest() throws InterruptedException {
	
	 System.out.println("After Test");
	 
	 Thread.sleep(3000);
	 
	 driver.quit();
}



}
