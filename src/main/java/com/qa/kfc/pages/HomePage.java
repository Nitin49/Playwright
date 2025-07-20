package com.qa.kfc.pages;

import com.microsoft.playwright.Page;

public class HomePage {
	
	Page page;

	
	//1. Locator 
	
	private String menu= "//div[contains(text(),'Menu')]";
	private String deals= "//div[contains(text(),'Deals')]";
	private String signup= "//div[@class='account-container']";
	private String guestuser= "//button[@id='skipBtn']";
	
	//2. Make constructor 
	
	public  HomePage(Page page) {
		this.page=page;
		
	}
	
	//3. Action/ page function 
	
	public String getHomePageTitle() {
		String homePageTitle=page.title();
		
		return homePageTitle;
	}
	
	public String getHomePageUrl() {
		String homePageUrl=page.url();
		return homePageUrl;
	}
	
	public String clickMenuCta() {
		page.click(menu);
		String menuPageTitle = page.title();
		return menuPageTitle;
		
	}
	public String clickDealsCta() {
		page.click(deals);
		String dealsPageTitle = page.title();
		return dealsPageTitle;
		
	}
	
	public void signUp() {
		page.click(signup);
		page.click(guestuser);
		page.navigate("https://online.kfc.co.in/");
	page.click("//span[normalize-space()='VALUE LUNCH SPECIALS']");
	page.click("//button[@aria-label='Add to cart2 Chicken Rolls Lunch Combo']");
	page.click("//button[3]");
	page.fill("//input[@placeholder='Search by State, City or Zip']", "Greater Noida");
	page.keyboard().press("Enter");
	page.click("//div[@class='modal-body']//div[2]//div[2]//div[5]//button[1]");
		page.click("//div[@class='wrapper-base-component']//button[2]");
	
		
	}
	
	

}
