package aui_mouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	    //Actions action = new Actions (driver);
	    //action.contextClick(driver.findElementByXPath("//span[text()='right click me']")).perform();
		
		WebElement rclick = driver.findElementByXPath("//span[text()='right click me']");
		Actions action = new Actions(driver);
		action.contextClick(rclick).perform();
		
		driver.quit();

	}

}
