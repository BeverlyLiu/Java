package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		
		//type = "file" should be present -- for Browse/attachedFile/uploadFile button
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("D:\\sysmon\\config.xml");

	}

}
