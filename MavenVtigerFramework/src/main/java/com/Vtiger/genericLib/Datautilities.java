package com.Vtiger.genericLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Datautilities {
	public String getDataFormProperty(String key) throws IOException
	{
		String propertyFilepath="./src/test/resources/vtigerlogin.properties";
		FileInputStream fis=new FileInputStream(propertyFilepath);
		Properties p=new Properties();
		p.load(fis);
		String value=p.getProperty(key);
		return value;
	}
		
	public String getDataFromExcel(String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException
	{
		
		String excelpath="./src/test/resources/VtigerLead.xlsx";
		FileInputStream fis1=new FileInputStream(excelpath);
		Workbook book=WorkbookFactory.create(fis1);
		Sheet sh=book.getSheet(sheetname);
		String value=sh.getRow(rownum).getCell(cellnum).getStringCellValue();
		return value;
	
		
	}

}
