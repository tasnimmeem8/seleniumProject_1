package aui_mouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HooverOn {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://mrbool.com/");
		WebElement ele = driver.findElementByXPath("//a[@class='menulink']");
		Actions action = new Actions (driver);
		action.moveToElement(ele).perform();
		driver.close();
		Thread.sleep(3000);

	}

}
