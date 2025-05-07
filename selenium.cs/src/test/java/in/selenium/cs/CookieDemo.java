package in.selenium.cs;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;


	public class CookieDemo {

	    public static void main(String[] args) {

        // Setup ChromeDriver
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.flipkart.com/"); // Replace with actual URL

	     // ➤ Add a cookie
	        Cookie cookie = new Cookie("username", "abhishek");
	        driver.manage().addCookie(cookie);
	        System.out.println("Cookie added.");

	     // ➤ Get all cookies
	        Set<Cookie> cookies = driver.manage().getCookies();
	        System.out.println("\nAll Cookies:");
	        for (Cookie ck : cookies) {
	            System.out.println(ck.getName() + " = " + ck.getValue());
	        }

	     // ➤ Print total number of cookies
	        System.out.println("\nTotal number of cookies: " + cookies.size());


       // ➤ Get a cookie by name
	        Cookie fetchedCookie = driver.manage().getCookieNamed("username");
	        System.out.println("Fetched Cookie: " + fetchedCookie);

	     // ➤ Delete a specific cookie by name
	        driver.manage().deleteCookieNamed("username");
	        System.out.println("Deleted cookie named 'username'.");

	      // ➤ Delete all cookies
	        driver.manage().deleteAllCookies();
	        System.out.println("All cookies deleted.");

	      // ➤ Close the browser
	        driver.quit();
	    }
	}
