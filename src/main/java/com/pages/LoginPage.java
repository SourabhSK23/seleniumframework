package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage extends TestBase {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="txtUsername") WebElement username;
	@FindBy(name="txtPassword") WebElement password;
	@FindBy(name="Submit") WebElement login;

	public String validateTitle() {

		return driver.getTitle();
	}

	public DashBoardPage validateLogin(String a,String b) {
		//Capture the username and password
		//Perform the operation
		//Do not return anything
		
		username.sendKeys(a);
		password.sendKeys(b);
		login.click();
		return new DashBoardPage();
	}

	
}
