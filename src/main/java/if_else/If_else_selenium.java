package if_else;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class If_else_selenium {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoCSR");
		driver.findElementById("password").sendKeys("crmsfa");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		String text = driver.findElementByLinkText("CRM/SFA").getText();
		
		if (text.equals("CRM/SFA")) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		
		if (text.contains("X")) {
			System.out.println("pass-1");
		}else {
			File src = driver.getScreenshotAs(OutputType.FILE);
			File dst = new File("./snap/img3.png");
			FileUtils.copyFile(src, dst);
		}
		driver.findElementByLinkText("CRM/SFA").click();
		
	

	}

}
