package com.emailPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SendEmail {
	WebDriver driver;
	
	@FindBy(how =How.XPATH , using = "//*[@id=\":ky\"]/div/div")
	WebElement ComposeElement;
	
	@FindBy(how =How.XPATH , using = "//*[@id=\":qt\"]")
	WebElement ToElement;
	

	@FindBy(how =How.XPATH , using = "//*[@id=\":qb\"]")
	WebElement SubjectElement;
	
	@FindBy(how =How.XPATH , using = "//*[@id=\":rg\"]")
	WebElement BodyElement;
	
	
	public SendEmail(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnComposeButton()
	{
		ComposeElement.click();

	}
	
	public void selectRecepients(String Recipients)
	{
		ToElement.click();
		ToElement.sendKeys(Recipients);
		Actions action = new Actions(driver); 
		action.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void enterSubject(String Subject) {
		SubjectElement.click();
		SubjectElement.sendKeys(Subject);
	}
	
	public void enterBody(String Body)
	{
		BodyElement.click();
		BodyElement.sendKeys(Body);
	}
	
	public void clickOnSendButton()
	{
		Actions action = new Actions(driver); 
		action.sendKeys(Keys.CONTROL, Keys.ENTER).build().perform();
		
	}

	
}
