package assertion;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertEquals_title {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title = driver.getTitle();
		System.out.println(title);
		
        Assert.assertEquals(title, "Leaftaps - TestLeaf Automation Platform");
        
        if (title.equals("Leaftaps - TestLeaf Automation Platform")) {
        	System.out.println("pass");
        }else {
        	System.out.println("fail");
        }
        
        driver.quit();

	}

}
