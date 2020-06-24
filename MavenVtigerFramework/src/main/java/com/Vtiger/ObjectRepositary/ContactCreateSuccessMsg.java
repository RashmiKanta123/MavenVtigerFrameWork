package com.Vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactCreateSuccessMsg {
	
	@FindBy(xpath="//span[contains(text(),'Contact Information')]")
	private WebElement successMsg;

	public WebElement getSuccessMsg() {
		return successMsg;
	}
	
	

}
