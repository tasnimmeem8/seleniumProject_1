package aui_keyboard;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeysDown {
	
public ChromeDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.findElementByLinkText("Selectable").click();
		driver.switchTo().frame(0);
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item2 = driver.findElementByXPath("//li[text()='Item 2']");
		WebElement item3 = driver.findElementByXPath("//li[text()='Item 3']");
		WebElement item4 = driver.findElementByXPath("//li[text()='Item 4']");
		WebElement item5 = driver.findElementByXPath("//li[text()='Item 5']");
		WebElement item6 = driver.findElementByXPath("//li[text()='Item 6']");
		WebElement item7 = driver.findElementByXPath("//li[text()='Item 7']");
		
		Actions action = new Actions (driver);
		action.keyDown(Keys.COMMAND).click(item1).click(item2).click(item3).click(item4).click(item5).click(item6).click(item7).perform();        
	
		driver.close();

	}

}
