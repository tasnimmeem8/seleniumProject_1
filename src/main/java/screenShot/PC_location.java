package screenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PC_location {

	public static void main(String[] args) throws IOException {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoCSR");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dst= new File("C:\\Users\\tasni\\eclipse-workspace1\\seleniumProject_1\\snap\\img2.png");
		FileUtils.copyFile(src, dst);
		
		driver.close();
		
		//to see snap , have to refresh

	}

}
