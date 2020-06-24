package com.Vtiger.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Vtiger.ObjectRepositary.HomePageElementCreate;

import com.Vtiger.ObjectRepositary.LeadsInfoPageElement;
import com.Vtiger.ObjectRepositary.LeadsPageCreateElement;
import com.Vtiger.ObjectRepositary.LeadsPageOpenElement;
import com.Vtiger.genericLib.BaseClass;

public class LeadCreateTest extends BaseClass {
	
	@Test
	public void createLeads() throws EncryptedDocumentException, IOException
	{
		HomePageElementCreate hpec= PageFactory.initElements(driver, HomePageElementCreate.class );
		LeadsPageOpenElement lpoe = PageFactory.initElements(driver,LeadsPageOpenElement.class );
		LeadsPageCreateElement lpce=PageFactory.initElements(driver,LeadsPageCreateElement.class);
		LeadsInfoPageElement lipe = PageFactory.initElements(driver, LeadsInfoPageElement.class);
		
		hpec.getLeads().click();
		lpoe.getCreateLead().click();
		lpce.getCompanyNametb().sendKeys(data.getDataFromExcel("Lead", 2,1));
		lpce.getCompanyNametb().sendKeys(data.getDataFromExcel("Lead", 2,2));
		lpce.getSaveBtn().click();
		String actualMsg = lipe.getSucessMsg().getText();
		Assert.assertTrue(actualMsg.contains(data.getDataFromExcel("Lead", 2,3)));
	}

}
