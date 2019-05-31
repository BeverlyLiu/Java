package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenshotConcept {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver(); //launch Chrome browser
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/"); //enter url
		
		//take a screenshot and store as a file format
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		//copy the screenshot to the location using copyFile method
		Files.copy(f, new File("D:\\temp\\google.png"));

	}

}
