package frame_iframe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class With_locator {
	
public ChromeDriver driver;
@Test
public void frame() {
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/");
	driver.findElementByLinkText("Droppable").click();
	driver.switchTo().frame(driver.findElementByXPath("//iframe[@class='demo-frame']"));
	WebElement from = driver.findElementByXPath("//p[text()='Drag me to my target']");
	WebElement to = driver.findElementByXPath("//p[text()='Drop here']");
	Actions action = new Actions(driver);
	action.dragAndDrop(from, to).perform();
	driver.switchTo().parentFrame();
	driver.findElementByLinkText("Resizable").click();
	
	
	
}

}
