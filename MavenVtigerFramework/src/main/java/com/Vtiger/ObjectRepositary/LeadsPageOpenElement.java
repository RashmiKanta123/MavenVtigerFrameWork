package com.Vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadsPageOpenElement {
	
	@FindBy(css="img[title='Create Lead...']")
	private WebElement createLead;

	public WebElement getCreateLead() {
		return createLead;
	}
	
}