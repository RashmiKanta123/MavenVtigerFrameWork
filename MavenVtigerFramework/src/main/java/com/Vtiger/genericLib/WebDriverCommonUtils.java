package com.Vtiger.genericLib;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Vtiger.genericLib.BaseClass;

public class WebDriverCommonUtils {
	
	String mainBroserSessionID=null;
	public void waitForElement(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(BaseClass.driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void selectItemFromList(WebElement element,String itemToBeSelect)
	{
		Select s=new Select(element);
		s.deselectByVisibleText(itemToBeSelect);
	}
	
	public boolean checkMultipleList(WebElement element)
	{
		Select s=new Select(element);
		return s.isMultiple();
	}
	
	public void keepmouseonElement(WebElement element)
	{
		Actions act=new Actions(BaseClass.driver);
		act.moveToElement(element).perform();
	}
	
	public void moveObjectAtRequiredPlace(WebElement source,WebElement target)
	{
		Actions act=new Actions(BaseClass.driver);
		act.dragAndDrop(source, target).perform();
	}
	
	public void acceptAlert()
	{
		Alert alt=BaseClass.driver.switchTo().alert();
		alt.accept();
	}
	
	public void validateAlertMessage(String ExpectedAlertText)
	{
		Alert alt=BaseClass.driver.switchTo().alert();
		String actualAlertText=alt.getText();
		Assert.assertEquals(actualAlertText,ExpectedAlertText);
		System.out.println("Alert validation pass");
	}
	
	public void rejectAlert()
	{
		Alert alt=BaseClass.driver.switchTo().alert();
		alt.dismiss();
	}
	
	public void switchtoNewWindow()
	{
		mainBroserSessionID=BaseClass.driver.getWindowHandle();
		Set<String> allID=BaseClass.driver.getWindowHandles();
		for(String ID : allID)
		{
			if(!ID.equals(mainBroserSessionID))
			{
				BaseClass.driver.switchTo().window(ID);
			}
		}
	}
	
	public void switchToMainWindow() 
	{
	//	String mainID=BaseClass.driver.getWindowHandle();
		BaseClass.driver.switchTo().window(mainBroserSessionID);
	}
	
	public void switchToRequiredFrame(WebElement element)
	{
		BaseClass.driver.switchTo().defaultContent();
	}
	
	public void FileUploadToApplication(String filepath) throws AWTException
	{
		filepath=filepath.replace("\\", "\\\\");
		StringSelection path=new StringSelection(filepath);
		Toolkit tool=Toolkit.getDefaultToolkit();
		Clipboard clip=tool.getSystemClipboard();
		clip.setContents(path, null);
		
		Robot r=new Robot();
		//paste path
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		//click on enter
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	

}
