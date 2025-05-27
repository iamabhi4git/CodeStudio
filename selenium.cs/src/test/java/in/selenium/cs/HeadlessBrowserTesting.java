package in.selenium.cs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowserTesting {

	public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new"); // modern headless mode

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.flipkart.com");
        System.out.println("Page title is: " + driver.getTitle());

        driver.quit();
    }
}