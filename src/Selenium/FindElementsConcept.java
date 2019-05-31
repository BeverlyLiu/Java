package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); //launch Chrome browser
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/"); //enter url
		
		/* for link -- all the links are represented by <a> html tag name
		 * get the total of links on the page
		 * get the text of each link on the page
		 */
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		
		//size of linkList
		System.out.println(linkList.size());
		
		for(int i=0; i<linkList.size(); i++) {
			System.out.println(linkList.get(i).getText());
		}
		
		driver.quit();
	}
}
