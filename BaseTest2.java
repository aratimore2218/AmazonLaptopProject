package testngprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest2 {
	WebDriver driver;
	@BeforeMethod
	public void launchBrowser()
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void quitBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
		System.out.println("quiting the browser");
	}
	
}


