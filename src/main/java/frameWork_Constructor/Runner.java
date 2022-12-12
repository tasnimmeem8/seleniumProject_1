package frameWork_Constructor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Runner {
	ChromeDriver driver;
	
	@Test
	public void leafTapsTestCase() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		LoginPage lp= new LoginPage(driver);
		lp.verifyLoginFunctionality("DemoCSR", "crmsfa");
		
		WelcomePage wp = new WelcomePage(driver);
		wp.verifyWelcomePage();
		
		MyHomePage mh = new MyHomePage(driver);
		mh.verifyMyHomePage();
		
		CreatLeadPage cl = new CreatLeadPage(driver);
		cl.verifyCreatLeadPage("ABC", "Hema", "Mali", "Direct Mail", "CATRQ_CAMPAIGNS", "Mrs.");
		
		
		
		
	}

}
