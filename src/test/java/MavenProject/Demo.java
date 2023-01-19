package MavenProject;

import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public void demoTest() {
	String URL=System.getProperty("url");
	String USERNAME=System.getProperty("username");
	String PASSWORD= System.getProperty("password");
	System.out.println(URL);
	System.out.println(USERNAME);
	System.out.println(PASSWORD);
	}
}
