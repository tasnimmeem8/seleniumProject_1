package assertion;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertTrue {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		boolean logo = driver.findElementByXPath("//div[@id='logo']/img").isDisplayed();
		Assert.assertTrue(logo);
		
	
		if (logo==true) {
			System.out.println("logo visible");
		}else {
			System.out.println("logo is not visible");
		}
		
		driver.quit();

	}

}
