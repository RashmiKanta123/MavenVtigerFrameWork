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

	public WebElement getLastNametb() {
		return lastNametb;
	}

	public void setLastNametb(WebElement lastNametb) {
		this.lastNametb = lastNametb;
	}

	public WebElement getCompanyNametb() {
		return companyNametb;
	}

	public void setCompanyNametb(WebElement companyNametb) {
		this.companyNametb = companyNametb;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public void setSaveBtn(WebElement saveBtn) {
		this.saveBtn = saveBtn;
	}
	
	

}
