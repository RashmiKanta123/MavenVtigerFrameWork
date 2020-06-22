package com.Vtiger.genericLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Vtiger.genericLib.BaseClass;


public class ListenerFunctionality implements ITestListener{

	public void onFinish(ITestContext context) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailure(ITestResult result)	
	{
			String tcName=result.getMethod().getMethodName();
	EventFiringWebDriver efwd=new EventFiringWebDriver(BaseClass.driver);
	//for CopyPaste
	File sourceFile=efwd.getScreenshotAs(OutputType.FILE);
	File destinationFile=new File("./screenshot/"+tcName+".png");
	
	try {
	FileUtils.copyFile(sourceFile, destinationFile);
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	
	
		
}
	

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestStart(ITestResult result) {
	}

	public void onTestSuccess(ITestResult result) {	}
	


}
