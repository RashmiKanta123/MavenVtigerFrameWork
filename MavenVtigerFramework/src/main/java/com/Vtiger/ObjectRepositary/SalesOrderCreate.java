package com.Vtiger.ObjectRepositary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesOrderCreate {

//25
	@FindBy(name="subject")
	private WebElement subject;
	
	public WebElement getSubject() {
		return subject;
	}
	
	@FindBy(xpath="//input[@name='account_name']/following-sibling::img")
	private WebElement organization;
	
	public WebElement getOrganization()
	{
		return organization;
	}
	
	@FindBy(name="bill_street")
	private WebElement billingAdd;
	
	public WebElement getBillingAddress()
	{
		return billingAdd;
	}

	@FindBy(name="ship_street")
	private WebElement shippingAdd;
	
	public WebElement getShippingAddress()
	{
		return shippingAdd;
	}
	
	@FindBy(xpath="//img[@title='Products']")
	private WebElement product;
	
	public WebElement getProduct()
	{
		return product;
	}
	
	@FindBy(className="detailedViewTextBoxOn")
	private WebElement qty;
	
	public WebElement getQty()
	{
		return qty;
	}
	
	@FindBy(xpath="//input[@name='button'][1]")
	private WebElement save;
	
	public WebElement getSave()
	{
		return save;
	}
}
