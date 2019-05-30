package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); //launch Chrome browser
		
		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2Fn%2Ferror"); //enter url
		
		/*xPath
		 * absolute xpath should not be used -- /html[1]/body[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[2]/div[1]/div[1]/div[1]/div[1]/input[1]
		 * only relative xpath should be used -- //input[@id='firstname']
		 */
		//driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Tom");
		//driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Lin");
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("tom.lin@test.com");
		
		//id
		//driver.findElement(By.id("firstname")).sendKeys("Tom");
		//driver.findElement(By.id("lastname")).sendKeys("Lin");
		//driver.findElement(By.id("email")).sendKeys("tom.lin@test.com");
		
		//name
		//driver.findElement(By.name("firstname")).sendKeys("Tom");
		//driver.findElement(By.name("lastname")).sendKeys("Lin");
		//driver.findElement(By.name("email")).sendKeys("tom.lin@test.com");
		
		//linkText
		//driver.findElement(By.linkText("Sign in")).click();
		
		//partiallinkText (not useful)
		//driver.findElement(By.partialLinkText("Sign")).click();
		
		//CSSSelector -- if id is there -- #{id} -- if class is there -- .{class}
		//driver.findElement(By.cssSelector("#bsRg")).click();
		
		//class (not useful -- same class name should be different element)
		driver.findElement(By.className("hdLogoCls")).click();
		
		driver.quit();

	}
}
