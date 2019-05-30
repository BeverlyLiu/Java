package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); //launch Chrome browser
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); //enter url
		
		driver.findElement(By.name("proceed")).click(); //click on Go button
		
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		String msg = alert.getText();
		if(msg.equals("Please enter a valid user name"))
			System.out.println("Correct alert message");
		else
			System.out.println("Incorrect alert message");
		
		alert.accept(); //click on OK button
		//alert.dismiss(); //click on Cancel button
		
		
		driver.quit();
	}

}
