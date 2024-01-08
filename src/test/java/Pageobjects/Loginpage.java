package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	public static WebDriver driver;
	
	//create constractor
	
	public Loginpage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="username")
	WebElement txtusername;
	
	@FindBy(id="password")
	WebElement txtpassword;
	
	@FindBy(id="login")
	WebElement btnlogin;
	
	//create corresponding methods
	
	public void setUsername() {
		txtusername.sendKeys("mahesh23456");
		
	}
	
	public void setPassword() {
		txtpassword.sendKeys("India@123");
	}
	
	public void ClickloginBtn() {
		btnlogin.click();
		
	}
	
	
}
