package setup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase {
ChromeDriver driver ;	

	@Given("Launch browser and load URL")
	public void launch_browser_and_load_URL() {
	    WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver();
	    driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@Given("Enter UserName as (.*)")
	public void enter_UserName_as_D(String uname) {
	    driver.findElementById("username").sendKeys(uname);
	}

	@Given("Enter PassWord as (.*)")
	public void enter_PassWord_as_p(String pword) {
	    driver.findElementById("password").sendKeys(pword);
	}

	@When("Click login button")
	public void click_login_button() {
	    driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("Click CRMSFA link")
	public void click_CRMSFA_link() {
	    driver.findElementByLinkText("CRM/SFA").click();
	}

	@Then("Close browser")
	public void close_browser() {
	    driver.quit();
	}

	@Then("Click CreatLead link button")
	public void click_CreatLead_link_button() {
	    driver.findElementByLinkText("Create Lead").click();
	}

	@Then("Navigate to Creat Lead page")
	public void navigate_to_Creat_Lead_page() {
	    System.out.println(driver.getTitle());
	}

	@Then("Enter Company name as (.*)")
	public void enter_Company_name_as_C(String cname) {
	    driver.findElementById("createLeadForm_companyName").sendKeys(cname);
	}

	@Then("Enter first name as (.*)")
	public void enter_first_name_as_H(String fname) {
	    driver.findElementById("createLeadForm_firstName").sendKeys(fname);
	}

	@Then("Enter last name as (.*)")
	public void enter_last_name_as_M(String lname) {
	    driver.findElementById("createLeadForm_lastName").sendKeys(lname);
	}

	@Then("Choose Cold call as Source")
	public void choose_Cold_call_as_Source() {
	    WebElement ele = driver.findElementById("createLeadForm_dataSourceId");
	    Select dd = new Select(ele);
	    dd.selectByVisibleText("Cold Call");
	}

	@Then("Enter Annual Revenue as int {int}")
	public void enter_Annual_Revenue_as_int(Integer int1) {
	    driver.findElementById("createLeadForm_annualRevenue").sendKeys("2000");
	}

	@Then("Enter email address as tas@gmail.com")
	public void enter_email_address_as_tas_gmail_com() {
	    driver.findElementById("createLeadForm_primaryEmail").sendKeys("tas@gmail.com");
	}

	@Then("Click Create Account link button")
	public void click_Create_Account_link_button() {
	    driver.findElementByLinkText("Create Account").click();
	}

	@Then("Enter Account name as A")
	public void enter_Account_name_as_A() {
	    driver.findElementById("accountName").sendKeys("A");
	}

	@Then("Enter local name as N")
	public void enter_local_name_as_N() {
	    driver.findElementById("groupNameLocal").sendKeys("N");
	}

	@Then("Choose Heath care as Industry")
	public void choose_Heath_care_as_Industry() {
	    WebElement ele1 = driver.findElementByName("industryEnumId");
	    Select dd1 = new Select (ele1);
	    dd1.selectByVisibleText("Health Care");
	}


}
