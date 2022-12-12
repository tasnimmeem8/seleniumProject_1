package frameWork_Constructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyHomePage {
	
	WebDriver driver ;
	
	By creatLeadLinkBtn= By.linkText("Create Lead");
	
	public MyHomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void verifyMyHomePage() {
		driver.findElement(creatLeadLinkBtn).click();
	}

}
