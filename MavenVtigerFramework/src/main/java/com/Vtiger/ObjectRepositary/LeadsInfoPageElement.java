package com.Vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadsInfoPageElement {
	
	@FindBy(xpath="//span[contains(text(),'Lead Information')]")
	private WebElement sucessMsg;

	public WebElement getSucessMsg() {
		return sucessMsg;
	}
	
	
}
