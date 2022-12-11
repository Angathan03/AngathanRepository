package TestNGAtributes;

import org.testng.annotations.Test;

public class TestNG2 {
	
	@Test(timeOut=3000)
	public void setOwnTiming() throws InterruptedException {
		
		Thread.sleep(1000);
		System.out.println("Setting the time");
		
	}

}
