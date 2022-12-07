package assertion;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertEquals_text {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String text = driver.findElementByXPath("//label[text()='Username']").getText();
		System.out.println(text);
		Assert.assertEquals(text, "Username");
		
		if(text.equals("Username")) {
		    System.out.println("pass");	
		}else {
			System.out.println("fail");
		}
		
	
		driver.close();
	
	
	
	}

}
