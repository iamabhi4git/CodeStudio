package in.selenium.cs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerClassSetup {

    public static void main(String[] args) {

        // << ------ Without WebDriverManager -------- >>

  /*
        // Set the path to the ChromeDriver executable manually
        System.setProperty("webdriver.chrome.driver", "F:\\Selenium-Practice\\Driver\\ChromeDriver\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Open a website
        driver.get("https://www.google.com/");
  */


        // << --------- With WebDriverManager --------- >>

        // Setup ChromeDriver automatically using WebDriverManager
 //       WebDriverManager.chromedriver().setup();

    	// edge driver
    	WebDriverManager.edgedriver().setup();
    	WebDriver driver = new EdgeDriver();
        // Initialize WebDriver
   //     WebDriver driver = new ChromeDriver();

        // Maximize browser window
        driver.manage().window().maximize();

        // Open a website
        driver.get("https://www.google.com/");
    }
}
