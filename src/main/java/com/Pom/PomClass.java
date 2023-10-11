package com.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testNG.gitProject.BaseClass;

public class PomClass extends BaseClass {
	
	public PomClass()
	{
		PageFactory.initElements(driver,this);
	}


	@FindBy(name = "email")
	private WebElement login;
	
	public WebElement getLogin() {
		return login;
	}

	@FindBy(name ="pass")
	private WebElement Password;
	
	public WebElement getPassword() {
		return Password;
	}

	@FindBy(name = "login")
	private WebElement clickLogin;

	public WebElement getClickLogin() {
		return clickLogin;
	}
	
	
}
