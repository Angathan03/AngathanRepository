package TestNGDependency;

import org.testng.annotations.Test;

public class DependOnGroups {

	@Test(priority=0, groups="LG")
	public void enterUserName(){
		
		  System.out.println("Username");	
			
		}
	
	@Test(priority=1,groups="LG")
	public void enterPassword(){
		
		  System.out.println("Password");	
			
		}
	
	@Test(priority=2,groups="LG")
	public void login(){
		
		  System.out.println("Login");
			
		}
	
	@Test(priority=3,dependsOnGroups="LG")
	public void homePage(){
		
		  System.out.println("Homepage");	
			
		}
}
