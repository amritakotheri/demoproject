	package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login extends Base {
	@Test
	public void verifyTheUserIsAbleToLoginUsingValidCredentials()
	{
		String username="admin";
		String password="admin";
		WebElement usernamefield=driver.findElement(By.xpath("//input[@name='username']"));
		usernamefield.sendKeys(username);
		WebElement passwordfield=driver.findElement(By.xpath("//input[@name='password']"));
		passwordfield.sendKeys(password);
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
	}
	@Test
	public void verifyTheUserIsAbleToLoginUsingValidUsernameInValidPassword()
	{
		String username="admin";
		String password="admino";
		WebElement usernamefield=driver.findElement(By.xpath("//input[@name='username']"));
		usernamefield.sendKeys(username);
		WebElement passwordfield=driver.findElement(By.xpath("//input[@name='password']"));
		passwordfield.sendKeys(password);
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
	}
	@Test
	public void verifyTheUserIsAbleToLoginUsingInValidUsernameValidPassword()
	{
		String username="123admin";
		String password="admin";
		WebElement usernamefield=driver.findElement(By.xpath("//input[@name='username']"));
		usernamefield.sendKeys(username);
		WebElement passwordfield=driver.findElement(By.xpath("//input[@name='password']"));
		passwordfield.sendKeys(password);
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();

}
}
