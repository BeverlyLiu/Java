package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); //launch Chrome browser
		
		driver.get("https://www.ebay.com/n/error"); //enter url
		
		/*
		 * handle drop box
		 */
		Select select = new Select(driver.findElement(By.id("gh-cat")));
		select.selectByVisibleText("Books");
		
		driver.quit();
	}
}
