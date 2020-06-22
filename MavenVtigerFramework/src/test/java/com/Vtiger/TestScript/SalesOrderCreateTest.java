package com.Vtiger.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Vtiger.ObjectRepositary.HomePageElementCreate;
import com.Vtiger.ObjectRepositary.SalesOrderCreate;
import com.Vtiger.ObjectRepositary.SalesOrderOpen;
import com.Vtiger.ObjectRepositary.SalesOrderOrganization;
import com.Vtiger.ObjectRepositary.SalesOrderProduct;
import com.Vtiger.ObjectRepositary.SalesOrderSuccessMsg;
import com.Vtiger.genericLib.BaseClass;
import com.Vtiger.genericLib.WebDriverCommonUtils;

public class SalesOrderCreateTest extends BaseClass{
	
	@Test
	public void salesOrderCreate() throws EncryptedDocumentException, IOException
	{
		HomePageElementCreate hpec= PageFactory.initElements(driver, HomePageElementCreate.class );
		SalesOrderOpen soo=PageFactory.initElements(driver, SalesOrderOpen.class);
		WebDriverCommonUtils wdcu=PageFactory.initElements(driver,WebDriverCommonUtils.class);
		SalesOrderCreate soc=PageFactory.initElements(driver, SalesOrderCreate.class);
		SalesOrderOrganization soOrg=PageFactory.initElements(driver, SalesOrderOrganization.class);
		SalesOrderProduct sop =PageFactory.initElements(driver,SalesOrderProduct.class);
		SalesOrderSuccessMsg sos =PageFactory.initElements(driver,SalesOrderSuccessMsg.class);
		
		wdcu.keepmouseonElement(hpec.getMore());	
		hpec.getSalesOrder().click();
		soo.getCreateSO().click();
	
		soc.getSubject().sendKeys(data.getDataFromExcel("Sales_Order", 2,1));
	
		soc.getOrganization().click();
		wdu.switchtoNewWindow();		
		soOrg.getOrganizationName().click();
		wdu.acceptAlert();
		wdu.switchToMainWindow();
		
		soc.getBillingAddress().sendKeys(data.getDataFromExcel("Sales_Order", 2,3));
		soc.getShippingAddress().sendKeys(data.getDataFromExcel("Sales_Order", 2,4));
		
		soc.getProduct().click();
		wdu.switchtoNewWindow();
		sop.getProductName().click();
		wdu.switchToMainWindow();
		
		soc.getQty().sendKeys(data.getDataFromExcel("Sales_Order", 2,6));
		
		soc.getSave().click();
		
		String actualMsg=sos.getSOSuccessMsg().getText();
		
		Assert.assertTrue(actualMsg.contains(data.getDataFromExcel("Sales_Order", 2,7)));
		
		
	}

}
