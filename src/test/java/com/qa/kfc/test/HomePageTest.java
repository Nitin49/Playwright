package com.qa.kfc.test;

import java.awt.print.Pageable;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.qa.kfc.factory.PlaywrightFactory;
import com.qa.kfc.pages.HomePage;

public class HomePageTest {
	PlaywrightFactory pFactory;
	HomePage homepage;
	Page page;
	
	
	@BeforeTest
	public void setUp() {
		pFactory= new PlaywrightFactory();
		page=	pFactory.initBrowser("chromium");
		homepage=new HomePage(page);
		
		
	}
	
	@Test (priority = 0)
	
	public void homePageTitleTest()
	{
		String actualTitle=	homepage.getHomePageTitle();
		Assert.assertEquals(actualTitle,"KFC");
	}
	
	@Test(priority = 1)
	public void homePageUrlTest()
	{
		String actulUrl = homepage.getHomePageUrl();
		Assert.assertEquals(actulUrl,"https://online.kfc.co.in/");
	}
	
	@Test (priority = 2)
	public void menuCtaTest()
	{
		
		String actualMenuPageTitle=	homepage.clickMenuCta();
		Assert.assertEquals(actualMenuPageTitle, "KFC Menu Prices | KFC Menu Deals, Offers and Exclusives");
	}
	
	@Test (priority = 3)
	public void dealsCtaTest()
	{
		
		String actualdealsPageTitle=	homepage.clickDealsCta();
		Assert.assertEquals(actualdealsPageTitle, "KFC Deals and Offers");
	}
	
	@Test (priority = 4)
	public void signUP()
	{
		homepage.signUp();
	}
	
	
}
