package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("//a[@class='black']")).click();
		
		Thread.sleep(2000);
		
		Set<String> handler = driver.getWindowHandles();
		
		Iterator<String> it = handler.iterator();
		
		String parentWindowId = it.next();
		System.out.println("Parent window id: " + parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("Child window id: " + childWindowId);
		
		driver.switchTo().window(childWindowId);
		
		Thread.sleep(2000);
		
		System.out.println("Child window popup title: " + driver.getTitle());
		
		driver.close();
		
		//once the child window close, we lost the control and need to switch to the parent window
		driver.switchTo().window(parentWindowId);
		
		Thread.sleep(2000);
		
		System.out.println("Parent window popup title: " + driver.getTitle());
		
		driver.quit();
		
	}

}
