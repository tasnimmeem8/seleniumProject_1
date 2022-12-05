package collection_Selenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider_hashmap {
	public ChromeDriver driver;	
	
	@Parameters({ "url", "un", "pw" })

	@BeforeMethod
	public void login(String url, String un, String pw) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys(un);
		driver.findElementById("password").sendKeys(pw);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@AfterMethod
	public void logout() {
		driver.quit();

	}
//Hash map- dataprovider is an example of hash map
	@DataProvider
	public String[][] getdata() {

		String[][] data = new String[3][3];

		data[0][0] = "ABC";
		data[0][1] = "Shahla";
		data[0][2] = "Meem";

		data[1][0] = "XYZ";
		data[1][1] = "Shahnawaz";
		data[1][2] = "Khan";

		data[2][0] = "QRS";
		data[2][1] = "Dawood";
		data[2][2] = "Khan";

		return data;
	}

}


