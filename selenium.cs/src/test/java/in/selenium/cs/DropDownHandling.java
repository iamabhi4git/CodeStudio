package in.selenium.cs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class DropDownHandling {

	public static void main(String[] args) {

		// Set path to ChromeDriver
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium-Practice\\Driver\\ChromeDriver\\chromedriver.exe");

		// Initialize Chrome driver
		WebDriver driver = new ChromeDriver();

		// Maximize browser window
		driver.manage().window().maximize();

		// Open correct practice page
		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");

		// Wait for dropdown element to be visible
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("country")));

		// Handle dropdown
		Select dropdown = new Select(element);
		
		// dropdown.selectByVisibleText("HONG KONG"); // By Visibility(checked)
		// dropdown.selectByValue("BHUTAN"); // By Value (checked) here value on site is
		// in string not number
		// dropdown.deselectByIndex(0); // by index not wokirng on this site
	
		//check if it supprt multiple dropdown or not
		if 
		(dropdown.isMultiple()){
			System.out.println("DropDown support Multiple value");
		}
		else {
			System.out.println("DropDown doesn't support Multiple Value");
			}
		List <WebElement> allOptions = dropdown.getOptions();     // get all options 
		System.out.println("Total Options : " + allOptions.size());   // to get Total Size(number) 
		for(WebElement el :allOptions) {
			System.out.println(el.getText());
		}
		
		
		
	}
}
