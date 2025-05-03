package in.selenium.cs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// Set the path to the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium-Practice\\Driver\\ChromeDriver\\chromedriver.exe");

		// Initialize the WebDriver
		WebDriver driver = new ChromeDriver();

		// Maximize the browser window
		driver.manage().window().maximize();

		// open url
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		// locate Simple alert and click alert button
		// driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

		// locate Confirm Alert

		// driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		
		// Find Prompt button and click on it
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();

		// Enter text in inputbox
		driver.switchTo().alert().sendKeys("Welcome..");
		// Accept the text
		driver.switchTo().alert().accept();

		Thread.sleep(4000);
		// Switch to alert and accept
		// driver.switchTo().alert().accept(); // OK button is clicked.

		// Switch to Confirm Alert
		// driver.switchTo().alert().accept(); // to Accept i.e OK
		// driver.switchTo().alert().dismiss(); // to Cancel i.e Dismiss

	}

}
