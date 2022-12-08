package interface_selenium;

public interface WrapperMethod {
	
	public void login(String url);
	public void enterById(String locator, String data);
	public void enterByClassName(String locator , String data);
	public void enterByXpath(String locator , String data);
	public void clickById(String locator);
	public void clickByXpath(String locator);
	public void clickByClassName(String locator);
	public void chooseVisibleTextById(String locator, String value);

}
