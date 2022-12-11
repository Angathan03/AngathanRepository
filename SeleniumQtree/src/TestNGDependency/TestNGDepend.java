package TestNGDependency;

import org.testng.annotations.Test;

public class TestNGDepend {
	
	@Test(priority=0)
	public void visiting(){
		
		  System.out.println("This is Visiting Method");	
			
		}
	
	@Test(priority=1, dependsOnMethods="visiting")
	public void login(){
		
		  System.out.println("login");	
			
		}

}
