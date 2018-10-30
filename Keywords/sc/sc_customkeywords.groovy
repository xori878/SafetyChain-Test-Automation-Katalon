package sc

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.Row
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.kms.katalon.core.annotation.Keyword

import internal.GlobalVariable

public class sc_customkeywords {

	@Keyword
	def UniqueName(String ModuleName) {
		Calendar currentDate = Calendar.getInstance();
		String year = (currentDate.getTimeInMillis());
		String n = ModuleName + year;
		println  ModuleName +" is "+ n
		FileInputStream file = new FileInputStream (new File("../SafetyChain-Test-Automation-Katalon/SCTestData/TestData.xlsx"))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		if(sheet.getRow(1)==null){
			sheet.createRow(1)
		}
		int cellNo = sheet.getRow(0).getLastCellNum();
		for(int i=0;i<cellNo;i++) {
			String s = sheet.getRow(0).getCell(i);
			if(s==ModuleName) {
				sheet.getRow(1).createCell(i).setCellValue(n);
			}
		}
		println  "Writing in Excel....."
		file.close();
		FileOutputStream outFile =new FileOutputStream(new File("../SafetyChain-Test-Automation-Katalon/SCTestData/TestData.xlsx"));
		workbook.write(outFile);
		outFile.close();
	}
}
