package com.Vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesOrderProduct {

	@FindBy(linkText="rkp")
	private WebElement products;

	public WebElement getProducts() {
		return products;
	}
	
	
}
