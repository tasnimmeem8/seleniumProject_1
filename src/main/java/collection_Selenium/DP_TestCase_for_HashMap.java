package collection_Selenium;

import org.testng.annotations.Test;

public class DP_TestCase_for_HashMap extends DataProvider_hashmap {
	
	@Test(dataProvider="getdata")
	public void CreatLead(String cname, String fname, String lname) {
		
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
		
	}

}
