package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); //launch Chrome browser
		
		driver.get("https://html.com/input-type-file/"); //enter url
		driver.findElement(By.id("fileupload")).sendKeys("D:\\sysmon\\config.xml");

		driver.quit();
	}
}
