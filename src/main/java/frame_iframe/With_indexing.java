package frame_iframe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class With_indexing {
	
	public ChromeDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.findElementByLinkText("Droppable").click();
		driver.switchTo().frame(0);
		WebElement from = driver.findElementByXPath("//p[text()='Drag me to my target']");
		WebElement to = driver.findElementByXPath("//p[text()='Drop here']");
		Actions action = new Actions(driver);
		action.dragAndDrop(from, to).perform();
		driver.switchTo().parentFrame();
		driver.findElementByLinkText("Resizable").click();
		
		

	}

}
