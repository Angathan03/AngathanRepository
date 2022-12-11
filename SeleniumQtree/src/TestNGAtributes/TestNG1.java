package TestNGAtributes;

import org.testng.annotations.Test;

/* 
 * Priority --> Setting the execution priority
 * description --> Giving name
 * invocationCount --> Setting how many times we need that test to run
 * enabled=false ---> it means to ignore the test case 
 * 
 * 
 * 
 */
public class TestNG1 {
	
	@Test(priority=0, description = "ONE", invocationCount=4, enabled=false)
	public void test1(){
		
	  System.out.println("Test case 1");	
		
	}
		
	
	@Test(priority=1,description = "TWO", groups="o")
	public void test2(){
		
	  System.out.println("Test case 2");	
	}
	
	
	@Test(priority=2,description = "THREE",groups="p")
	public void ab(){
		
		System.out.println("Test case 3");	
	}
	
	
	
	@Test(priority=3,description = "FOUR",groups="p",invocationCount=4)
	public void Test4(){
		
		System.out.println("Test case 4");	
		
	}
	
	
	

}
