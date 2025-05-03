package in.selenium.cs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesIframes {

    public static void main(String[] args) {

        // 1. Set ChromeDriver path
 System.setProperty("webdriver.chrome.driver", "F:\\Selenium-Practice\\Driver\\ChromeDriver\\chromedriver.exe");

        // 2. Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // 3. Maximize browser window
        driver.manage().window().maximize();

        // =======================================
        // ✅ Load test URL with multiple frames
        driver.get("https://ui.vision/demo/webtest/frames/");
        // =======================================

        // --------- Frame 1 ----------
        // Locate Frame 1 using src attribute
        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1); 
        
     // Switch to Frame 1
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Hello Frame1");
        driver.switchTo().defaultContent(); // Switch back to main page

        // --------- Frame 2 ----------
        WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2); 
        
     // Switch to Frame 2
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");
        driver.switchTo().defaultContent(); // Switch back to main page

        // --------- Frame 3 ----------
        WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
     
        // Switch to Frame 3
        driver.switchTo().frame(frame3); 
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Automation Testing");

        // ✅ Test completed
        System.out.println("Frame inputs entered successfully.");

        // 4. Close browser
      //  driver.quit();
    }
}
