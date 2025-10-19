package Lib;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * With method overloading, you can write the full logic once in the main method
 * In overloaded method just calls it main method with a default value
 * Accept java Multiple methods with the same name in the same class but with different parameters (count or type diff)
 */

public class uihelper {
	
	static WebDriver  driver = new ChromeDriver();
	
	//************* Luaunching the Browser (Url) ************************
	public static void launchUrl(String url, String expectedBrowserTitle) {
		try{
			
			driver.get(url);
			reporter.info("Browser launched successfully");
			String ActualTitle =driver.getTitle();
			reporter.info("Launched Browser Title - " +ActualTitle);
			
			if(expectedBrowserTitle !=null && !expectedBrowserTitle.isEmpty() ) {
				if (ActualTitle.equalsIgnoreCase(expectedBrowserTitle)) {
					reporter.pass("Browser Title Validation passed : Actual Title is '" + ActualTitle + "' and Expected Title is '"+expectedBrowserTitle+"'");
				}else {
					reporter.fail("Browser Title Validation failed : Actual Title is '" + ActualTitle +"' and Expected Title is '"+expectedBrowserTitle+"'");
				}
			}
			
		}catch (Exception e){
			System.out.println(e);
		}
		
	}
	
	public static void launchUrl(String url) {
		launchUrl(url,null);
	}
	
	//********************* Closing the Browser ******************

	public static void closer() {
		try {
			driver.close();
			reporter.info("Browser closed successfully");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
}
