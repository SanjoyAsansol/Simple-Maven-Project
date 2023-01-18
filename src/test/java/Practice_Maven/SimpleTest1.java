package Practice_Maven;

import org.testng.annotations.Test;

public class SimpleTest1 {
	@Test(groups= "smoke")
	public void test1()
	{
		System.out.println("Smoke TestScript 1");
		
	}
	@Test(groups= "smoke")
	public void test2()
	{
		System.out.println("Smoke TestScript 2");
		
	}
	

}
