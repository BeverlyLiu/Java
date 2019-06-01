package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropFile {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\beile\\eclipse-workspace\\JavaBase\\src\\Selenium\\config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		System.out.println(prop.getProperty("Name"));
		
		String url = prop.getProperty("URL");
		System.out.println(url);
		
		String bs = prop.getProperty("browser");
		System.out.println(bs);
		
		if(bs.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(bs.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "D:\\webdrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(bs.equals("IE")) {
			System.setProperty("webdriver.internetexplorer.driver", "D:\\webdrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.get(url);
		driver.quit();
	}
}
