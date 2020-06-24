package com.Vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPageOpen {
	
	@FindBy(css="img[title='Create Contact...']")
	private WebElement createContact;

	public WebElement getCreateContact() {
		return createContact;
	}

	
   
}
