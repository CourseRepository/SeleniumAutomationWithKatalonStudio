package com.helper.excel

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.apache.poi.xssf.usermodel.XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class ExcelHelper {
	
	// Create Work book
	
	private XSSFWorkbook getWorkBook(){
		return new XSSFWorkbook();
	}
	
	//Create the Sheet
	
	private XSSFSheet getSheet(XSSFWorkbook workBook,String sheetName){
		return workBook.createSheet(sheetName);
	}
	
	//Keyword , which write the data to excel
	
	@Keyword
	public void writeTOExcelFile(String excelPath,String sheetName,String value,int rowNo,int colNo){
		XSSFWorkbook book = getWorkBook() // created the book
		XSSFSheet sheet = getSheet(book, sheetName) //created the sheet
		XSSFRow aRow = sheet.createRow(rowNo) // created the row-> index
		XSSFCell bCell = aRow.createCell(colNo) // created the col -> index
		bCell.setCellValue(value)
		writeToFileSystem(book,excelPath)
	}
	
	
	//Write the excel to the FS 
	
	private void writeToFileSystem(XSSFWorkbook book,String excelPath){
		try {
			FileOutputStream aOut = new FileOutputStream(excelPath)
			book.write(aOut)
			aOut.close()
		} catch (Exception e) {
			KeywordUtil.markError(e.toString())
		}
	}
	
}
