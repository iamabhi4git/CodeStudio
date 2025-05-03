package in.selenium.cs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartMouseOver {

	public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.flipkart.com/");

     // Locate the "Fashion" menu element
        WebElement fashionMenu = driver.findElement(By.xpath("//div[contains(text(), 'Fashion')]"));

        // Create an instance of the Actions class to perform the mouse hover
        Actions actions = new Actions(driver);
        actions.moveToElement(fashionMenu).perform(); // Perform mouse over on the "Fashion" menu

        Thread.sleep(3000); // Wait for 3 seconds to see the hover effect
      //  driver.quit(); // Close the browser
    }
}