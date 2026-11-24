package testngprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonLaptop{
	
		@Test
		public void SearchLaptop() throws InterruptedException{
			
		EdgeDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
			
		driver.get("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		Thread.sleep(2000);
		WebElement a1 =driver.findElement(By.id("ap_email_login"));
		a1.sendKeys("8855913018");
		Thread.sleep(3000);
			
		WebElement a2 =driver.findElement(By.id("continue"));
		a2.click();
		Thread.sleep(3000);
			
		WebElement a3 =driver.findElement(By.id("ap_password"));
		a3.sendKeys("Arati@1234");
		Thread.sleep(3000);
			
		WebElement a4 =driver.findElement(By.id("signInSubmit"));
		a4.click();		
		
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
		Thread.sleep(3000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		 
		WebElement e1= driver.findElement(By.xpath("//span[text()='HP']/parent::*/child::div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']/child::*/child::i[@class='a-icon a-icon-checkbox']"));
        e1.click();
        Thread.sleep(3000);
        
        WebElement e2= driver.findElement(By.xpath("//i[@class='a-icon a-icon-star-medium a-star-medium-4']"));
        e2.click();
        Thread.sleep(3000);
        //Assert.assertEquals(driver.getTitle(), "Amazon.in: Laptop - 308445 / 4 Stars & Up");
        
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("Amazon.in: Laptop - 308445 / 4 Stars & Up"));
        
        Thread.sleep(3000);
		driver.quit();
		System.out.println("quiting the browser");
	}
	}
	


