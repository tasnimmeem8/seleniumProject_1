package interface_selenium_withExcel;

import org.testng.annotations.Test;

public class TestCase extends GenericWrapper {
	
	@Test(dataProvider="getData")
	public void creatlead(String cname, String fname, String lname) throws InterruptedException {
		login("http://leaftaps.com/opentaps/control/main");
		enterById("username", "DemoCSR");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLinkText("CRM/SFA");
		clickByLinkText("Create Lead");
		enterById("createLeadForm_companyName", cname);
		enterById("createLeadForm_firstName", fname);
		enterById("createLeadForm_lastName", lname);
		
	}

}
