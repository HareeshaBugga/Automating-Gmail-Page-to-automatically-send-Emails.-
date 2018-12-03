package com.emailPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(how =How.ID , using = "identifierId")
	WebElement userEmailElement;
		
	@FindBy(how =How.XPATH , using = "//*[@id=\"password\"]/div[1]/div/div[1]/input")
	WebElement passWordElement;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	

	public void setUserName(String userName)
	{
		userEmailElement.sendKeys(userName);
	}
	
	public void clickOnNextEmailButton()
	{
		 Actions action = new Actions(driver); 
		 action.sendKeys(Keys.ENTER).build().perform();
	}
	

	public void setPassWord(String password)
	{
		passWordElement.sendKeys(password);
	}
	
	public void clickOnNextPasswordButton()
	{
		 Actions action = new Actions(driver); 
		 action.sendKeys(Keys.ENTER).build().perform();
	}
	
}
