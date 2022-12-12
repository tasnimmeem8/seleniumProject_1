package framework_Constructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {
	
	WebDriver driver;
	
	By crmsfaLink = By.linkText("CRM/SFA");
	//By logout = By.className("decorativeSubmit");
	
	public WelcomePage (WebDriver driver) {
		this.driver=driver;
	}
	
	public void verifyWelcomePage() {
		driver.findElement(crmsfaLink).click();
		//driver.findElement(logout).click();
	}

}
