package com.Vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesOrderSuccessMsg {
	
	@FindBy(xpath="//span[contains(text(),'Sales Order Information')]")
	private WebElement successMsg;

	public WebElement getSuccessMsg() {
		return successMsg;
	}

/*	public WebElement getSuccessMsg() {
		return successMsg;
	}

	public void setSuccessMsg(WebElement successMsg) {
		this.successMsg = successMsg;
	}
*/	
	

}
