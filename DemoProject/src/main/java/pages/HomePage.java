package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	@FindBy(xpath="//a[@data-toggle='dropdown']")WebElement admin;
	@FindBy(xpath="//i[@class='ace-icon fa fa-power-off']")WebElement logout;
	@FindBy(xpath="//button[@type='submit']")WebElement signin;

	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']")WebElement managenewsmoreinfo;
	
	
	
	public HomePage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public ManageInfoPage managenewsmoreinfo()
	{
		managenewsmoreinfo.click();
		return new ManageInfoPage(driver);
	}
	
	
	
	
	public void clickOnAdmin()
	{
		admin.click();
	}
	public void clickOnNewLogout()
	{
		logout.click();
	}
	public boolean isSignInDisplayed()
	{
		return logout.isDisplayed();
		
	}
}

