package com.Vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.Vtiger.genericLib.BaseClass;

public class HomePageElementCreate {
	@FindBy(linkText="Leads")
	private WebElement Leads;
	
	@FindBy(linkText="Organizations")
	private WebElement organization;
	
	@FindBy(linkText="Products")
	private WebElement product;
	
	@FindBy(xpath="//span[text()=' Administrator']/../following-sibling::td[1]/img")
	private WebElement signoutDD;
	
	@FindBy(linkText="Sign Out")
	private WebElement signoutLink;
	
	@FindBy(linkText="Contacts")
	private WebElement contact;
	
	@FindBy(linkText="More")
	private WebElement more;

	@FindBy(linkText="Sales Order")
	private WebElement salesOrder;
	
	public WebElement getLeads()
	{
		return Leads;
	}
	
	public WebElement getorganization()
	{
		return organization;
	}
	
	public WebElement getproduct()
	{
		return product;
	}
	
	public WebElement getysignoutDD()
	{
		return signoutDD;
	}
	public WebElement getsignoutLink()
	{
		return signoutLink;
	}
	public WebElement getContact()
	{
		return contact;
	}
	
	public WebElement getMore()
	{
		return more;
	}
	public WebElement getSalesOrder()
	{
		return salesOrder;
	}
	
	public void logoutFromApp()
	{
		Actions act = new Actions(BaseClass.driver);
		act.moveToElement(signoutDD).perform();
		signoutLink.click();
	}
	

}
