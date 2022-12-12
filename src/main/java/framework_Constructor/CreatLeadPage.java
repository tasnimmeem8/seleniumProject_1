package framework_Constructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreatLeadPage {
	
	WebDriver driver;
	
	By companyName = By.id("createLeadForm_companyName");
	By firstName = By.id("createLeadForm_firstName");
	By lastName = By.id("createLeadForm_lastName");
	By source = By.id("createLeadForm_dataSourceId");
	By marketingCam = By.id("createLeadForm_marketingCampaignId");
	By title =By.id("createLeadForm_generalProfTitle");
	By industry = By.id("createLeadForm_industryEnumId");
	
	public CreatLeadPage(WebDriver driver) {
		this.driver=driver;
	}

	public void verifyCreatLeadPage(String cname, String fname, String lname,
			String src, String mrk, String ttl) throws InterruptedException {
		
		driver.findElement(companyName).sendKeys(cname);
		driver.findElement(firstName).sendKeys(fname);
		driver.findElement(lastName).sendKeys(lname);
		
		WebElement ele = driver.findElement(source);
		Select dd = new Select (ele);
		dd.selectByVisibleText(src);
		
		WebElement ele1 = driver.findElement(marketingCam);
		Select dd1 = new Select(ele1);
		dd1.selectByValue(mrk);
		
		driver.findElement(title).sendKeys(ttl);
		
		WebElement ele2 = driver.findElement(industry);
		Select dd2 = new Select (ele2);
		dd2.selectByIndex(2);
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
	}
}
