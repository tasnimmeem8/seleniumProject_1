package collection_Selenium;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle_Set {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();	
	    driver.get("https://www.w3schools.com/jsref/met_win_open.asp");
	    String fstw = driver.getWindowHandle();
	    System.out.println(fstw);
	    driver.findElementByXPath("//a[text()='Try it Yourself »']").click();
	    Set<String> allwindow = driver.getWindowHandles();
	    for(String eachWindow:allwindow) {
	    	System.out.println(eachWindow);
	    }

	}

}
