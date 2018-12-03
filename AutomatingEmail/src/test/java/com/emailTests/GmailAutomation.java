package com.emailTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.emailPages.LoginPage;
import com.emailPages.SendEmail;
import com.emailPages.UrlPage;

public class GmailAutomation extends BaseTest{
	
	UrlPage upage;
	LoginPage lpage;
	SendEmail epage;
	
	@BeforeMethod
	public void setUp()  {
		
		upage = new UrlPage(driver);
		lpage = new LoginPage(driver);	
		epage = new SendEmail(driver);
	}
	
	@Test(priority = 1)
	public void clickOnSignInButton() throws InterruptedException {
		upage.clickOnSignInLink();
	}
	
	@Test(priority = 2)
	public void enterUserNameAndPassword() {
		lpage.setUserName("add your gmail address.");
		lpage.clickOnNextEmailButton();
		lpage.setPassWord("add your password.");
		lpage.clickOnNextPasswordButton();
	
	}
	
	@Test(priority = 3)
	public void sendingAnEmail() {
		epage.clickOnComposeButton();
		epage.selectRecepients("add the recipient email address or group");
		epage.enterSubject("Daily Reports");
		epage.enterBody("Hello Manager, Here are today's testing reports.");
		epage.clickOnSendButton();
	}

}
