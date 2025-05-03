package in.selenium.cs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraMouseOverAction {

	public static void main(String[] args) throws InterruptedException {
		 // Setup ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        
        // Navigate to Myntra
        driver.get("https://www.myntra.com/");

        // Locate the "Women" menu item using xpath
     //   WebElement womenMenu = driver.findElement(By.xpath("//a[text()='Women']"));
        
      //  Locate the "Women" menu item using PartialLink Text
          WebElement womenMenu = driver.findElement(By.partialLinkText("W"));
        // Create Actions class instance
        Actions actions = new Actions(driver);

        // Perform mouse hover
        actions.moveToElement(womenMenu).perform();

        // Wait a few seconds to see the result
        Thread.sleep(3000); // Optional, just to view the hover effect

        // Close the browser
        //driver.quit();
    }
}
 

