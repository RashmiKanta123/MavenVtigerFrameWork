package com.Vtiger.ObjectRepositary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesOrderCreate {

//25
	@FindBy(name="subject")
	private WebElement subject;
	
	@FindBy(xpath="//input[@name='account_name']/following-sibling::img")
	private WebElement organization;
		
	@FindBy(name="bill_street")
	private WebElement billingAdd;
	
	@FindBy(name="ship_street")
	private WebElement shippingAdd;
	
	@FindBy
	private WebElement copySalesOrder;

	@FindBy(xpath="//img[@title='Products']")
	private WebElement product;
	
	@FindBy(className="detailedViewTextBoxOn")
	private WebElement qty;
	
	@FindBy(xpath="//input[@name='button'][1]")
	private WebElement save;

	public WebElement getSubject() {
		return subject;
	}

	public WebElement getOrganization() {
		return organization;
	}

	public WebElement getBillingAdd() {
		return billingAdd;
	}

	public WebElement getShippingAdd() {
		return shippingAdd;
	}

	public WebElement getCopySalesOrder() {
		return copySalesOrder;
	}

	public WebElement getProduct() {
		return product;
	}

	public WebElement getQty() {
		return qty;
	}

	public WebElement getSave() {
		return save;
	}
	
}
