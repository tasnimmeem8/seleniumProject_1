package aui_mouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.findElementByPartialLinkText("Droppable").click();
		WebElement frm = driver.findElementByXPath("//iframe[@class='demo-frame']");
		driver.switchTo().frame(frm);
		WebElement src = driver.findElementById("draggable");
		WebElement dst = driver.findElementById("droppable");
		Actions action = new Actions(driver);
		action.dragAndDrop(src, dst).perform();
		Thread.sleep(3000);
		driver.close();

	}

}
