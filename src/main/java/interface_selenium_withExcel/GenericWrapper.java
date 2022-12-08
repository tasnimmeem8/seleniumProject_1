package interface_selenium_withExcel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericWrapper implements WrapperMethod {
ChromeDriver driver;

	public void login(String url) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(3000);
		
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

	public void chooseById(String locator, String Value) {
		WebElement ele = driver.findElementById(locator);
		Select dd = new Select(ele);
		dd.selectByVisibleText(Value);
		
	}

	public void clickByLinkText(String locator) {
		driver.findElementByLinkText(locator).click();
		
	}
	
	@DataProvider
	public String[][]getData() throws IOException{
		ReadExcel re =new ReadExcel();
		return re.readExcel();
	}


}
