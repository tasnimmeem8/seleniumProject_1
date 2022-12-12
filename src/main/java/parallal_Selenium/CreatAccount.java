package parallal_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreatAccount extends ProjectSpecificWrapper {
	
	@Test
	public void creatAccount() {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.findElementByLinkText("Create Account").click();
		driver.findElementById("accountName").sendKeys("Checking Account");
		driver.findElementById("groupNameLocal").sendKeys("Checking");
		driver.findElementById("annualRevenue").sendKeys("32000");

		WebElement cur2 = driver.findElementById("currencyUomId");
		Select dd6 = new Select(cur2);
		dd6.selectByVisibleText("USD - United States Dollar");

		WebElement ind2 = driver.findElementByXPath("//select[@name='industryEnumId']");
		Select dd7 = new Select(ind2);
		dd7.selectByVisibleText("Computer Software");

		WebElement own = driver.findElementByName("ownershipEnumId");
		Select dd8 = new Select(own);
		dd8.selectByVisibleText("S-Corporation");

}
}