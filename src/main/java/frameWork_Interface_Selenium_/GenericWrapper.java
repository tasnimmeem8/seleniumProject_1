package frameWork_Interface_Selenium_;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericWrapper implements WrapperMethod{

public	ChromeDriver driver;

	public void login(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		
	}

	public void enterById(String locator, String data) {
		driver.findElementById(locator).sendKeys(data);
		
	}

	public void enterByClassName(String locator, String data) {
		driver.findElementByClassName(locator).sendKeys(data);
		
	}

	public void enterByXpath(String locator, String data) {
		driver.findElementByXPath(locator).sendKeys(data);
		
	}

	public void clickById(String locator) {
		driver.findElementById(locator).click();
		
	}

	public void clickByXpath(String locator) {
		driver.findElementByXPath(locator).click();
		
	}

	public void clickByClassName(String locator) {
		driver.findElementByClassName(locator).click();
		
	}

	public void chooseVisibleTextById(String locator, String value) {
		WebElement ele = driver.findElementById(locator);
		Select dd = new Select(ele);
		dd.selectByVisibleText(value);
		
	}

}
