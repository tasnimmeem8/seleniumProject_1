package frameWork_Interface_Selenium_;

public interface WrapperMethod_100prsnt_Abstraction {
	
	public void login(String url);
	public void enterById(String locator, String data);
	public void enterByClassName(String locator , String data);
	public void enterByXpath(String locator , String data);
	public void clickById(String locator);
	public void clickByXpath(String locator);
	public void clickByClassName(String locator);
	public void chooseVisibleTextById(String locator, String value);

}
