package parallal_Selenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificWrapper {
	
ChromeDriver driver;	
	@BeforeMethod
	public void login() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoCSR");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();

	}

	@AfterMethod
	public void logout() {

		driver.close();

}
}