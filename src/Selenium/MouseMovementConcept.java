package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); //launch Chrome browser
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.spicejet.com/"); //enter url
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[@class='burger-bread']"))).build().perform();;
		driver.findElement(By.xpath("//li[@class='hide-mobile']//a[contains(text(),'Travel Info')]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@id='menu-list-login']//a[contains(text(),'FAQ')]")).click();
		
		driver.quit();
	}
}
