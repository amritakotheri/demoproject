package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageInfoPage {
	public WebDriver driver;
//	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']")WebElement managenewsmoreinfo;
	@FindBy(xpath="//a[contains(@class,'btn-danger') and @onclick='click_button(1)']")WebElement newbutton;
	@FindBy(xpath="//textarea[@id='news']")WebElement news;
	@FindBy(xpath="//button[text()='Save']")WebElement save;
	@FindBy(xpath="//button[@class='close']")WebElement alert;

	public ManageInfoPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
/*public void managenewsmoreinfo()
{
	managenewsmoreinfo.click();
}*/
public ManageInfoPage newbutton()
{
	newbutton.click();
	return this;
}
public ManageInfoPage enterTheNews()
{
	news.sendKeys("flat 50% on juice bottles");
	return this;
}
public ManageInfoPage clickSave()
{
	save.click();
	return this;
}
public boolean isalertdisplayed()
{
	return alert.isDisplayed();
}
}