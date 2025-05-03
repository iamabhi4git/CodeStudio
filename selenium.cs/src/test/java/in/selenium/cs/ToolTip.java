package in.selenium.cs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		
		// Set the path to the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium-Practice\\Driver\\ChromeDriver\\chromedriver.exe");

		// Initialize the WebDriver
		WebDriver driver = new ChromeDriver();

		// Maximize the browser window
		driver.manage().window().maximize();

		// open url
		driver.get("https://www.facebook.com/");
		
		
		// Locate Actual tool tip
		String actualtoolTip = driver.findElement(By.xpath("//a[@title='Sign up for Facebook']")).getAttribute("title");
		
		// Locate Expected tool tip
		String expectedtoolTip = "Sign up for Facebook";
		if (actualtoolTip.equals(expectedtoolTip)) {
			System.out.println("Test Passed.. ");
		}else {
			System.out.println("Test Failed.. ");
		}

	}

}
