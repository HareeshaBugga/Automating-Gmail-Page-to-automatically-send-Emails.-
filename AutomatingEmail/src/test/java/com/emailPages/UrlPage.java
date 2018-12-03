package com.emailPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UrlPage {
	WebDriver driver;
	
	@FindBy(how = How.XPATH , using = "//a[@class = 'gmail-nav__nav-link gmail-nav__nav-link__sign-in']")
	WebElement SignInButton;
	
	public UrlPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSignInLink() throws InterruptedException
	{
		Thread.sleep(2000);
		SignInButton.click();
	}

}
