package com.qa.kfc.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class Header {
	
	Page page;
	

	
	/*
	This is Header Class which cover below Element/Test Cases
	1. Verift that, KFC Logo is Visible on the Header --Done
	3. Verify that, Click action on Logo --Done
	4. Verify that, Header Behavoiur when scroll down the Page.
	5. Verify the click Action on "Menu" Link --Done
	6. Verify the click Action on "Deal" Link ---Done
	7. Verify the click Action on "Sign In " Link ----Done
	8. Verify the click Action on "Cart" Link ---Done
	9. Verify the visibily of  "Menu" Link ----Done
	10. Verify the visibily of  "Deal" Link ---Done
	11. Verify the visibily of "Sign In " Link ---Done
	12. Verify the visibily of  "Cart" Link --Done 
	13. Verify the Header BackGroud Color 

	*/
	
	public Header(Page page)
	{
		this.page=page;
	}
	
	//1. Locator
	
	private String kfcLogo = "//div[@class='header-logo-mobile ']//img[@alt='KFC LOGO']";
	private String menuBtn = "//div[contains(text(),'Menu')]";
	private String dealBtn = "//div[contains(text(),'Deals')]";
	private String signBtn = "//div[@class='account-container']";
	private String cartIocn= "//button[normalize-space()='0']";
	
	
	// Action 
	
	public boolean isKfcLogoVisible()
	{
		Locator logoKfcloLocator= page.locator(kfcLogo);
		logoKfcloLocator.waitFor();
		return logoKfcloLocator.isVisible();
		
	}
	
	public boolean ismenuBtnVisible()
	{
		Locator menuBtnLocator= page.locator(menuBtn);
		menuBtnLocator.waitFor();
		return menuBtnLocator.isVisible();
		
	}
	
	public boolean isdealBtnVisible()
	{
		Locator dealBtnLocator= page.locator(dealBtn);
	  dealBtnLocator.waitFor();
		return dealBtnLocator.isVisible();
		
	}
	
	public boolean issignBtnVisible()
	{
		Locator signBtnLocator= page.locator(signBtn);
		signBtnLocator.waitFor();
		return signBtnLocator.isVisible();
		
	}
	
	public boolean iscartIconVisible()
	{
		Locator cartIconLocator= page.locator(cartIocn);
		cartIconLocator.waitFor();
		return cartIconLocator.isVisible();
		
	}
	
	
	public String clickOnKfcLogo() {
		page.locator(kfcLogo).click();
		String aferLogoClickPageTitle = page.title();
		return aferLogoClickPageTitle;
		
		
	}
	public String clickOnMenuBtn() {
		page.locator(menuBtn).click();
		String aferMenuClickPageTitle = page.title();
		return aferMenuClickPageTitle;
		
		
	}
	public String clickOnDealBtn() {
		page.locator(dealBtn).click();
		String aferDealClickPageTitle = page.title();
		return aferDealClickPageTitle;
		
		
	}
	public String clickOnSignBtn() {
		page.locator(signBtn).click();
		String aferSignClickPageTitle = page.title();
		return aferSignClickPageTitle;
		
		
	}
	public String clickOnCartIocn() {
		page.navigate("https://online.kfc.co.in/");
		page.locator(cartIocn).click();
		String aferCartClickPageTitle = page.title();
		return aferCartClickPageTitle;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		}
			
		
	


