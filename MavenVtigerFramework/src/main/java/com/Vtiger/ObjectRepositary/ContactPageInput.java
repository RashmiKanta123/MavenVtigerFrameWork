package com.Vtiger.ObjectRepositary;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPageInput {

	@FindBy(name="lastname")
	private WebElement inputLastname;
	
	@FindBy(css="input[value='  Save  ']")
	private WebElement save;

	public WebElement getInputLastname() {
		return inputLastname;
	}

	public WebElement getSave() {
		return save;
	}
	
	
}
