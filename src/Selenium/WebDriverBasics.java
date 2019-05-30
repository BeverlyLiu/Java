package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		/*FF
		 * geckodriver
		 */
		System.setProperty("webdriver.gecko.driver", "D:\\webdrivers\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver(); //launch FF browser
		
		driver1.get("https://www.apple.com/"); //enter url
		driver1.quit();
		
		/*
		 * Chrome browser
		 * ChromeDriver
		 */
		System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch Chrome browser
		
		driver.get("https://www.google.com/"); //enter url
		
		String title = driver.getTitle(); //get title
		
		System.out.println("Google title: " + title);
		
		//validation point
		if(title.equals("Google")) {
			System.out.println("Correct title");
		}
		else
			System.out.println("Incorrect title");
		
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		driver.quit();
		
		}
}
