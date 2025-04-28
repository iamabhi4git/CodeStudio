package in.selenium.cs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator2 {

	public static void main(String[] args) {
		
		//Automate Using Customize Locators--CSS Locators	
		
	// Launch Chrome browser
	System.setProperty("webdriver.chrome.driver", "F:\\Selenium-Practice\\Driver\\ChromeDriver\\chromedriver.exe");
					
	// Initialize Chrome browser creating object of Chrome Driver
	WebDriver driver = new ChromeDriver();

	//Launch webpage
	driver.navigate().to("https://www.saucedemo.com");
		
	//locate username using tag#id  (tag and id)
	driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
	
	//locate password using tag[attribute= value
	driver.findElement(By.cssSelector("input[name=password")).sendKeys("secret_sauce");
		
	//locate login button using class name
	driver.findElement(By.cssSelector("input.submit-button")).click();
	
	//switch to product page
	
	String str= driver.getWindowHandle();
	driver.switchTo().window(str);
	driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack]")).click();
	
	// close driver
	driver.close();

	}

}
