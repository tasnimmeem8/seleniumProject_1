package parallal_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificWrapper{

	@Test
	public void creatLead () {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		driver.findElementByCssSelector("a[href*='createLeadForm']").click();
		driver.findElementByCssSelector("#createLeadForm_companyName").sendKeys("TCS");
		driver.findElementByCssSelector("#createLeadForm_firstName").sendKeys("Hema");
		driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys("Ma");
		
		WebElement Sou = driver.findElementByCssSelector("Select[name='dataSourceId']");
		Select dd = new Select (Sou);
		dd.selectByValue("LEAD_OTHER");
		
		driver.findElementByCssSelector("#createLeadForm_generalProfTitle").sendKeys("Ms.");
		
		WebElement ind = driver.findElementByCssSelector("select[name='industryEnumId']");
		Select dd1= new Select(ind);
		dd1.selectByIndex(5);
		
		WebElement own = driver.findElementByCssSelector("select[name='ownershipEnumId']");
		Select dd2 = new Select(own);
		dd2.selectByValue("OWN_PARTNERSHIP");
		
		driver.findElementByCssSelector(".label+td>textarea").sendKeys("TCS");
		driver.findElementByCssSelector("input[size='6']").sendKeys("1");
		driver.findElementByCssSelector("#createLeadForm_primaryPhoneAreaCode").sendKeys("123");
		driver.findElementByCssSelector("input[name='primaryPhoneExtension']").sendKeys("12");
		driver.findElementByCssSelector("input[name='departmentName']").sendKeys("MKT");
		driver.findElementByCssSelector("input[name='numberEmployees']").sendKeys("100");
	
		WebElement url = driver.findElementByCssSelector("#createLeadForm_primaryWebUrl");
		url.sendKeys("google.com");
		System.out.println("Tag name for current element= "+url.getTagName());
		System.out.println("location for current element= "+url.getLocation());
		System.out.println("   ");
		driver.findElementByCssSelector("input[name='generalCity']").sendKeys("Detroit");
		
		WebElement st = driver.findElementByCssSelector("select[name='generalStateProvinceGeoId']");
		Select dd3 = new Select (st);
		dd3.selectByVisibleText("Indiana");
		
		WebElement cou = driver.findElementByCssSelector("select[onchange^='o']");
		Select dd4 = new Select (cou);
		dd4.selectByValue("AUS");
		
		driver.findElementByCssSelector("input[name='generalPostalCode']").sendKeys("75061");
		
		WebElement mar = driver.findElementByCssSelector("#createLeadForm_marketingCampaignId");
		Select dd5 = new Select (mar);
		dd5.selectByVisibleText("Pay Per Click Advertising");
		
		driver.findElementByCssSelector("#createLeadForm_primaryPhoneNumber").sendKeys("123456");
		driver.findElementByCssSelector("#createLeadForm_primaryEmail").sendKeys("abc@gmail.com");
		driver.findElementByCssSelector(".smallSubmit").click();
		
		String tl = driver.getTitle();
		System.out.println("View Lead Page Title= "+tl);
		if (tl.contains("View")) {
			System.out.println("Verification successful ");
		}else {System.out.println("Verification failed");
		}
		
		System.out.println("   ");
		
		WebElement fname = driver.findElementByCssSelector("#viewLead_firstName_sp");
		System.out.println(fname.getText());
	     if ((fname.getText().equals("Hema"))){
			System.out.println("Verification result pass");
		}else {
			System.out.println("Verification failed");
		}
	     
		System.out.println("    ");
		
		WebElement lname = driver.findElementByCssSelector("#viewLead_lastName_sp");
		System.out.println("Verify entry match with Last name= "+ lname.getText());
		System.out.println("Last name and first name are same = "+lname.equals(fname));
	    System.out.println("Last name and first name are same = "+(lname==fname));
	    
		System.out.println("   ");
		System.out.println("Current page title= "+driver.getTitle());
		System.out.println("Window handle= "+ driver.getWindowHandles());
		System.out.println("Page title Hash code= "+ System.identityHashCode(driver.getTitle()));
		
		driver.findElementByCssSelector(".subMenuButtonDangerous").click();
		
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys("55555");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
}
}