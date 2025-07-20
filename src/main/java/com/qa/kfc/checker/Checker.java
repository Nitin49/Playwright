package com.qa.kfc.checker;

import java.security.PublicKey;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class Checker {
	static Page page;
	public static void main(String[] args) {
		Playwright playwright;
		Browser browser;
		BrowserContext browserContext;
		

		playwright=Playwright.create();
		browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		browserContext	=browser.newContext();
	    page=	browserContext.newPage();
	    page.navigate("https://online.kfc.co.in/");
	   System.out.println(page.title());
	   System.out.println(page.url());
	   Checker checker;
	   checker= new Checker();
	   checker.isKfcLogoVisible();
	   
		
		
	}
	
    	
	public boolean isKfcLogoVisible()
	{
		String kfcLogo = "//div[@class='header-logo-mobile ']//img[@alt='KFC LOGO']";
		Locator logoKfc= page.locator(kfcLogo);
		boolean nitin= logoKfc.isVisible();
		System.out.println(nitin);
		
		return false;
		
	}
		
	
}
