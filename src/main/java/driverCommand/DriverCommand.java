package driverCommand;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverCommand {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
	
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle().contains("Leaf"));
		System.out.println(driver.getTitle().contains("leaf"));
		System.out.println(driver.getTitle().toLowerCase());
		System.out.println(driver.getTitle().toUpperCase());
		System.out.println(driver.getTitle().hashCode());
		System.out.println(driver.getTitle().toUpperCase().hashCode());
		System.out.println(driver.getTitle().toLowerCase().hashCode());
		System.out.println(driver.getTitle().equals("Leaftaps - TestLeaf Automation Platform"));
		System.out.println(driver.getTitle().length());
		System.out.println(driver.getTitle().concat("-....."));
		
		driver.close();
		
		

	}

}
