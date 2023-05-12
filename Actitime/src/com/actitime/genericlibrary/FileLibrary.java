package com.actitime.genericlibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * this is generic Library which contain all the
 * @author Dell
 *
 */
public class FileLibrary {
	/**
	 * this is the generic method which is used to read the data from property file.
	 * @param key
	 * @return 
	 * @throws IOException
	 */
	
	public String ReadDataFromPropertyFile(String key) throws IOException
	{
		FileInputStream fis =new FileInputStream("./TestData/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
		
	}
	/**
	 * this is the generic method which is used to data from excel file.
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public String ReadDatafromExcelFile( String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{FileInputStream fis1 =new FileInputStream("./TestData/Testsdata.xlsx");
	Workbook wb =WorkbookFactory.create(fis1);
String	value=wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	return value;
		
	}

}

