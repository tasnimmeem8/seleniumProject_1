package frame_iframe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class With_webElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.findElementByLinkText("Droppable").click();
		WebElement frm = driver.findElementByXPath("//iframe[@class='demo-frame']");
		driver.switchTo().frame(frm);
		WebElement from = driver.findElementByXPath("//p[text()='Drag me to my target']");
		WebElement to = driver.findElementByXPath("//p[text()='Drop here']");
		Actions action = new Actions(driver);
		action.dragAndDrop(from, to).perform();
		driver.switchTo().defaultContent();
		driver.findElementByLinkText("Resizable").click();

	}

}
