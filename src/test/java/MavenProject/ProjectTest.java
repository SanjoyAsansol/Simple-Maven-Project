package MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProjectTest {

	@Test
	public void createTest()
	{
		String BROWSER= System.getProperty("browser");
		String URL= System.getProperty("url");
		String USERNAME= System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.findElement(By.id("username")).sendKeys(USERNAME);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);
		driver.findElement(By.id("login")).click();
		driver.close();
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
		
				
	}
}
