package com.Vtiger.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Vtiger.ObjectRepositary.ContactCreateSuccessMsg;
import com.Vtiger.ObjectRepositary.ContactPageInput;
import com.Vtiger.ObjectRepositary.ContactPageOpen;
import com.Vtiger.ObjectRepositary.HomePageElementCreate;
import com.Vtiger.genericLib.BaseClass;

public class ContactCreateTest extends BaseClass{
	@Test
  public void createContact() throws EncryptedDocumentException, IOException {
	 
		HomePageElementCreate hpec= PageFactory.initElements(driver, HomePageElementCreate.class );
		ContactPageInput cpi = PageFactory.initElements(driver, ContactPageInput.class);
		ContactPageOpen cpo = PageFactory.initElements(driver,ContactPageOpen.class);
		ContactCreateSuccessMsg ccsm=PageFactory.initElements(driver,ContactCreateSuccessMsg.class);
		
		hpec.getContact().click();
		cpo.getCreateContact().click();
		cpi.getLatname().sendKeys(data.getDataFromExcel("Contact",2,1));
		cpi.getSave().click();
		String actualSuccessMsg=ccsm.getSuccessMsg().getText();
		Assert.assertTrue(actualSuccessMsg.contains(data.getDataFromExcel("Contact",2,2)));
   }
}
