package practice_Maven02;

import org.testng.annotations.Test;

public class Demo1 {

	@Test
	public void test1()
	{
		String URL=System.getProperty("url");
		String USERENAME=System.getProperty("username");
		String BROWSER=System.getProperty("browser");
		System.out.println(URL);
		System.out.println(USERENAME);
		System.out.println(BROWSER);
	}
}
