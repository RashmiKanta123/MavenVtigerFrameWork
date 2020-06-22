package com.Vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadsPageCreateElement {
	@FindBy(name="lastname")
	private WebElement lastNametb;
	
	@FindBy(name="company")
	private WebElement companyNametb;
	
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement saveBtn;
	
	public WebElement getLastNameTb()
	{
		return lastNametb;
	}
	
	public WebElement getCompanyNameTb()
	{
		return companyNametb;
	}
	
	public WebElement getSaveBtn()
	{
		return saveBtn;
	}

}
