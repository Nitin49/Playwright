package com.qa.kfc.factory;

import java.awt.print.Pageable;
import java.lang.classfile.instruction.ReturnInstruction;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightFactory {
	Playwright playwright;
	public Browser browser;
	BrowserContext browserContext;
	Page page;

	
	public Page initBrowser(String browserName) {
		System.out.println("Browser Name is" + " " + browserName);
		playwright=Playwright.create();
		switch (browserName.toLowerCase()) {
		case "chromium":
			browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(2000));
			break;
		case "firefox":
			browser=playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
			break;
		case "safari":
			browser=playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
			break;
		case "chrome":
			browser=playwright.chromium().launch(new LaunchOptions().setChannel("chrome").setHeadless(false));
			break;

		default:
			System.out.println("Please enter right browser Name");
			break;
		}
		
	browserContext	=browser.newContext();
    page=	browserContext.newPage();
    page.navigate("https://online.kfc.co.in/");
    System.out.println(page.url());
    System.out.println(page.title());
    System.out.println(page.url());
    return page;		
		
		
	}
}
