package alart;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	    Alert alert = driver.switchTo().alert();
	    System.out.println(alert);
	    System.out.println(alert.getText());
	    alert.sendKeys("HI MY NAME IS MEEM");
	    alert.accept();
	    System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
	    Thread.sleep(3000);
		driver.quit();
	       

	}

}
