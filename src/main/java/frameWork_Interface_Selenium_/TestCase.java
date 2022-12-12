package frameWork_Interface_Selenium_;

import org.testng.annotations.Test;

public class TestCase extends GenericWrapper {
	
@Test
public void testcase() {
	login("http://leaftaps.com/opentaps/control/main");
	enterById("username", "DemoCSR");
	enterById("password","crmsfa");
	clickByClassName("decorativeSubmit");
	clickByXpath("//div[@id='label']/a");
}

}
