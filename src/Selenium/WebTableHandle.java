package Selenium;

import java.io.FileNotFoundException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {

	public static void main(String[] args) throws FileNotFoundException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		                              
		String beforeXpath_company = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[";
		String afterXpath_company = "]/td[1]";
		
		String beforeXpath_contact = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[";
		String afterXpath_contact = "]/td[2]";
		
		List<WebElement> rows = driver.findElements(By.xpath("//div[@id='main']//div[3]//tr"));
		System.out.println("Total rows = " + rows.size());
		
		for(int i=2; i<=7; i++) {
			String actualXpath_company = beforeXpath_company + i + afterXpath_company;
			String companyName = driver.findElement(By.xpath(actualXpath_company)).getText();
			System.out.println("Company: " + companyName);
		}
		
		System.out.println("----------");
		
		for(int i=2; i<=rows.size(); i++) {
			String actualXpath_contact = beforeXpath_contact + i + afterXpath_contact;
			String contactName = driver.findElement(By.xpath(actualXpath_contact)).getText();
			System.out.println("Contact: " + contactName);
		}
		
		driver.quit();
	}
}
