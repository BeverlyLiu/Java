package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver(); //launch Chrome browser
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
				
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com/"); //enter url
		
//		driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("Java");
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Java");
		driver.findElement(By.xpath("//input[contains(@id, 'gh-ac')]")).sendKeys("Java");
		
		/*absolute xpath -- not recommended -- /html[1]/body[1]/header[1]/div[1]/ul[2]/li[2]/div[1]/a[1]
		 * it has performance issue -- not reliable -- can be changed any time in the future
		 * 
		 * dynamic id: input type
		 * id = test_123
		 * By.id("test_123")
		 * 
		 * starts-with
		 * id = test_456
		 * id = test_789
		 * 
		 * ends-with
		 * id = 1234_test_t
		 * id = 45678_test_t
		 * id = 7890_test_t
		 */
//		driver.findElement(By.xpath("//input[contains(@id, 'test_')]")).sendKeys("Test");
//		driver.findElement(By.xpath("//input[starts-with(@id, 'test_')]")).sendKeys("Test");
//		driver.findElement(By.xpath("//input[ends-with(@id, '_test_t')]")).sendKeys("Test");
		
		/*
		 * for link -- all the links are represented by <a> html tag
		 * 
		 */
		driver.findElement(By.xpath("//a[contains(text(), 'My eBay')]")).click();
	}
}
