package in.selenium.cs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadDownloadFiles {

    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "F:\\Selenium-Practice\\Driver\\ChromeDriver\\chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to the file upload/download page
        driver.get("https://demoqa.com/upload-download");


        // Upload a file by sending the file path to the input element
        driver.findElement(By.id("uploadFile"))
              .sendKeys("C:\\Users\\Abhishek\\Desktop\\pom dependencies.txt");

        // Optional: Add a sleep or wait to observe the upload before closing (for demo purposes)
      
        Thread.sleep(3000); // 3 seconds pause
        // Close the browser
     //   driver.quit();
    }
}
