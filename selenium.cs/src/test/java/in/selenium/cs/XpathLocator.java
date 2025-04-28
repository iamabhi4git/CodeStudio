package in.selenium.cs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {

public static void main(String[] args) {
			// Launch Chrome browser
			System.setProperty("webdriver.chrome.driver", "F:\\Selenium-Practice\\Driver\\ChromeDriver\\chromedriver.exe");
			
			// Initialize Chrome browser creating object of chrome Driver
			 WebDriver driver = new ChromeDriver();

			 //Launch webpage
			 driver.navigate().to("https://www.saucedemo.com");
			
			 // locate usename by id
			 driver.findElement(By.id("user-name")).sendKeys("standard_user");
			 // locate password by 
			 driver.findElement(By.name("password")).sendKeys("secret_sauce");
			 // locate by class name
			 driver.findElement(By.id("login-button")).click();
			 // close driver
			 driver.close();
	}

}
