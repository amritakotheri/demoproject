package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageInfoPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {
	public HomePage homepage;
	public ManageInfoPage manageinfopage;
	@BeforeMethod
	public void verifyTheuserIsAbleToAddNews() throws IOException
	{
		String username=ExcelUtility .getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterTheUserName(username).enterThePassword(password);
		//loginpage.enterThePassword(password);
		homepage=loginpage.clickOnTheSignInButton();
	//	ManageInfoPage manageinfopage=new ManageInfoPage(driver);
	manageinfopage=	homepage.managenewsmoreinfo();
		manageinfopage.newbutton().enterTheNews().clickSave();
		//manageinfopage.enterTheNews();
		//manageinfopage.clickSave();
	boolean alertshow=manageinfopage.isalertdisplayed();
			Assert.assertTrue(alertshow);
	}
	
	
	
}
