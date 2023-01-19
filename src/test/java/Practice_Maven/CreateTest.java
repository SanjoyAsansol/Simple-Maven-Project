package Practice_Maven;

import org.testng.annotations.Test;

public class CreateTest {
	
	@Test(groups= "regression")
	public void create()
	{
		System.out.println("Regrassion Successfully1");
	}
	
	@Test(groups= "regression")
	public void edit()
	{
		System.out.println("Regrassion successfully2");
	}

}
