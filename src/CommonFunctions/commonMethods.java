package CommonFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.WebDriver;

public class commonMethods {
	
	public static void main(String[] args) {
       // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

       // Open Google
       driver.get("https://www.google.com");

        // Print the page title
       System.out.println("Title: " + driver.getTitle());

       // Close the browser
       driver.quit();
		System.out.println("Hello teja");
    }
}


