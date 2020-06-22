package com.Vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesOrderOrganization {
	
	@FindBy(linkText="RKP pvt.ltd.")
	private WebElement organizationName;
	
	public WebElement getOrganizationName()
	{
		return organizationName;
	}

}
