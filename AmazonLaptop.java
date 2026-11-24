package testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AmazonLaptop extends BaseTest2 {
	
		@Test
		public void SearchLaptop() throws InterruptedException{
			
		driver.get("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		Thread.sleep(2000);
		WebElement a1 =driver.findElement(By.id("ap_email_login"));
		a1.sendKeys("8855913018");
		Thread.sleep(2000);
			
		WebElement a2 =driver.findElement(By.id("continue"));
		a2.click();
		Thread.sleep(2000);
			
		WebElement a3 =driver.findElement(By.id("ap_password"));
		a3.sendKeys("Arati@1234");
		Thread.sleep(2000);
			
		WebElement a4 =driver.findElement(By.id("signInSubmit"));
		a4.click();		
		
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		 
		WebElement e1= driver.findElement(By.xpath("//span[text()='HP']/parent::*/child::div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']/child::*/child::i[@class='a-icon a-icon-checkbox']"));
        e1.click();
        Thread.sleep(3000);
        
        WebElement e2= driver.findElement(By.xpath("//i[@class='a-icon a-icon-star-medium a-star-medium-4']"));
        e2.click();
	}
	}
	


