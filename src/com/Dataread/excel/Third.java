package com.Dataread.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Third 
{
	public static void main(String[] args) throws Exception
	{ 
		
	  String[][] s =null;	
	
	 FileInputStream fis = new FileInputStream("‪E:\\Demo2.xlsx");
	 Workbook wb = new WorkbookFactory().create(fis);
	  
	 Sheet sh = wb.getSheet("Sheet1");

	 s = new String[sh.getPhysicalNumberOfRows()-1][sh.getRow(0).getLastCellNum()];
	 for(int i =1; i<sh.getPhysicalNumberOfRows();i++)
	 {
	
		 for(int j=0;j<sh.getRow(0).getLastCellNum();j++)
		 {
			String val =sh.getRow(i).getCell(j).toString();
			System.out.println(s[i][j]);
		 }
	 
	 }
}
}
