package in.selenium.cs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
		// Launch Chrome browser
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium-Practice\\Driver\\ChromeDriver\\chromedriver.exe");
		
		// Initialize Chrome browser creating object of chrome Driver
		 WebDriver driver = new ChromeDriver();

		 //Launch webpage
		 driver.navigate().to("https://www.google.com");
		 
		 // Fetch Title of webpage
		 String title =driver.getTitle();		 
		 System.out.println("Title of Web Page is : " + title);
		 
		 // Capture Url
		 System.out.println("Current Url : " +driver.getCurrentUrl());
		 		 
		 // Close the browser
		 driver.close();
	}

}
