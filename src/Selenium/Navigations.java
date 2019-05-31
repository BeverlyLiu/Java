package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); //launch Chrome browser
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
				
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//get() vs navigate().to
		
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.amazon.com/");
		
		//back and forward simulation
		driver.navigate().back(); //google
		Thread.sleep(2000);
		driver.navigate().forward(); //amazon
		Thread.sleep(2000);
		driver.navigate().back(); //google
		
		//refresh web page
		driver.navigate().refresh();
		
		driver.quit();

	}

}
