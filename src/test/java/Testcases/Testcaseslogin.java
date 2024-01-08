package Testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pageobjects.Loginpage;



public class Testcaseslogin extends Baseclass{


	@Test
	public void logintest() {
		
		Loginpage lp=new Loginpage(driver);
		
		lp.setUsername();
		System.out.println("username is entered");
		lp.setPassword();
		System.out.println("password is entered");
		lp.ClickloginBtn();
		System.out.println("clicked");
		
	}
}
