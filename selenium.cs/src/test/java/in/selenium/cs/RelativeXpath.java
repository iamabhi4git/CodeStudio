package in.selenium.cs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) {

		// Relative- XPath using Single Attribute
		// Launch Chrome browser
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium-Practice\\Driver\\ChromeDriver\\chromedriver.exe");

		// Initialize Chrome browser creating object of chrome Driver
		WebDriver driver = new ChromeDriver();

		// Launch webpage
		driver.navigate().to("https://www.saucedemo.com");

		//locate user name using Single Attribute
	//	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user"); [it works,but we also have to check CONTAINS keyword so commented]
		
		//--------CONTAINS Method--------
		driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("standard_user");
		
		//locate Password using Multiple Attribute
		driver.findElement(By.xpath("//*[@id='password'][@name='password']")).sendKeys("secret_sauce");
		
		// locate login button
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		//switch to product page  
		
		// Using AND / OR condition
		String str = driver.getWindowHandle();
		driver.switchTo().window(str);
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack' and @name='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light'or @name='add-to-cart-sauce-labs-bike-light']")).click();			
		
	}

}
