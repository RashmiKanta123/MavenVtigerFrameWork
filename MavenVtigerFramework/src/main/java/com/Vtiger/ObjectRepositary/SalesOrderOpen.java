package com.Vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesOrderOpen {

	@FindBy(css="img[title='Create Sales Order...']")
	private WebElement salesOrder;
	
	public WebElement getCreateSO()
	{
		return salesOrder;
	}
	 
}
