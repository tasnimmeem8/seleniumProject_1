package interface_selenium_withExcel;

public interface WrapperMethod {
	
	public void login(String url) throws InterruptedException;
	public void enterById(String locator, String data);
	public void enterByClassName(String locator, String data);
	public void enterByXpath(String locator, String data);
	public void clickById(String locator);
	public void clickByXpath(String locator);
	public void clickByClassName(String locator);
	public void clickByLinkText(String locator);
	public void chooseById(String locator, String Value);

}
