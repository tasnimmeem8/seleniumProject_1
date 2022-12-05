package alart;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2);
        System.out.println(alert2.getText());
        alert2.accept();
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
        driver.close();
	}

}
