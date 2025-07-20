package com.qa.kfc.test;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.qa.kfc.factory.PlaywrightFactory;
import com.qa.kfc.pages.Header;



public class HeaderTest {
	
	PlaywrightFactory playwrightFactory;
    Page page;
    Header header;
	Browser browser;
	
	@BeforeTest
	public void setUp()
	{
		playwrightFactory = new PlaywrightFactory();
        page=playwrightFactory.initBrowser("Chromium");
        header=new Header(page);
        browser = playwrightFactory.browser;      
	}
	
	@Test (priority = 0)
	public void verifyKfcLogoIsVisible()
	{
	boolean isVisibleLogo=header.isKfcLogoVisible();
	Assert.assertTrue(isVisibleLogo, "KFC logo is NOT visible on the header.");
	System.out.println("✅ KFC logo is visible on the header.");
	}
	
	@Test(priority = 1)
	public void verifyMenuBtnIsVisible()
	{
	boolean isVisibleMenuBtn=header.ismenuBtnVisible();
	Assert.assertTrue(isVisibleMenuBtn, " Menu CTA is NOT visible on the header.");
	System.out.println("✅ Menu CTA is visible on the header.");
	}
	
	@Test (priority = 2)
	public void verifydealBtnIsVisible()
	{
	boolean isVisibleDealBtn=header.isdealBtnVisible();
	Assert.assertTrue(isVisibleDealBtn, "Deal CTA is NOT visible on the header.");
	System.out.println("✅ Deal CTA is visible on the header.");
	}
	
	@Test (priority = 3)
	public void verifySignBtnIsVisible()
	{
	boolean isVisibleSignBtn=header.issignBtnVisible();
	Assert.assertTrue(isVisibleSignBtn, "Sign Up CTA is NOT visible on the header.");
	System.out.println("✅ Sign Up CTA is visible on the header.");
	}
	
	@Test (priority = 4)
	public void verifyCartIocnIsVisible()
	{
	boolean isVisibleCartIocn=header.iscartIconVisible();
	Assert.assertTrue(isVisibleCartIocn, " Cart Iocn is NOT visible on the header.");
	System.out.println("✅ Cart Icon is visible on the header.");
	}
	
	
	@Test (priority = 5)
	public void verifyClickActionOnKfcLogo()
	{
      String afterLogoClickActualTitle = header.clickOnKfcLogo();
      Assert.assertEquals(afterLogoClickActualTitle,"KFC | Order KFC Chicken Online and Find Restaurants");
     
	}
	
	@Test (priority = 6)
	public void verifyClickActionOnMenuBtn()
	{
      String afterMenuClickActualTitle = header.clickOnMenuBtn();
      Assert.assertEquals(afterMenuClickActualTitle,"KFC Menu Prices | KFC Menu Deals, Offers and Exclusives");
     
	}
	@Test (priority = 7)
	public void verifyClickActionOnDealBtn()
	{
      String afterDealClickActualTitle = header.clickOnDealBtn();
      Assert.assertEquals(afterDealClickActualTitle,"KFC Deals and Offers");
     
	}
	@Test (priority = 8)
	public void verifyClickActionOnSigBtn()
	{
      String afterSignClickActualTitle = header.clickOnSignBtn();
      Assert.assertEquals(afterSignClickActualTitle,"KFC");
     
	}
	@Test (priority = 9)
	public void verifyClickActionOnCartIocn()
	{
      String afterCartClickActualTitle = header.clickOnCartIocn();
      Assert.assertEquals(afterCartClickActualTitle,"KFC Cart");
     
	}
	@AfterTest
	public void teardown()
	{
		page.close();
		browser.close();
		
	}

}
