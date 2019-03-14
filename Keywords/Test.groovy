import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.Row
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class Test {


	/**
	 * Refresh browser
	 */
	@Keyword
	def refreshBrowser() {
		KeywordUtil.logInfo("Refreshing")
		WebDriver webDriver = DriverFactory.getWebDriver()
		webDriver.navigate().refresh()
		KeywordUtil.markPassed("Refresh successfully")
	}

	/**
	 * Click element
	 * @param to Katalon test object
	 */
	static String path = PathUtil.relativeToAbsolutePath("../SafetyChain-Test-Automation-Katalon/SCTestData", RunConfiguration.getProjectDir())
	public void freeText(int cellNo,String fileName,int c){
		FileInputStream file = new FileInputStream (new File(fileName))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		file.close();
		Thread.sleep(2000)
		FileOutputStream outFile =new FileOutputStream(new File(fileName));
		for(int i=0;i<c-1;i++){
			sheet.getRow(12+i).getCell(cellNo+3).setCellValue("MyTest")
		}

		workbook.write(outFile);
		outFile.close();
	}
	public void selectOne(int cellNo,String fileName,int c){
		FileInputStream file = new FileInputStream (new File(fileName))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String target = sheet.getRow(9).getCell(cellNo)
		file.close();
		Thread.sleep(2000)
		List<String> options = Arrays.asList(target.split(","));
		FileOutputStream outFile =new FileOutputStream(new File(fileName));
		for(int i=0;i<c-1;i++){
			sheet.getRow(12+i).getCell(cellNo+3).setCellValue(options.get(0).toString())
		}
		workbook.write(outFile);
		outFile.close();
	}
	public void selectMultiple(int cellNo,String fileName,int c){
		FileInputStream file = new FileInputStream (new File(fileName))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String target = sheet.getRow(9).getCell(cellNo)
		file.close();
		Thread.sleep(2000)
		List<String> options = Arrays.asList(target.split(","));
		FileOutputStream outFile =new FileOutputStream(new File(fileName));
		for(int i=0;i<c-1;i++){
			sheet.getRow(12+i).getCell(cellNo+3).setCellValue(options.get(0).toString())
		}

		workbook.write(outFile);
		outFile.close();
	}
	public void numeric(int cellNo,String fileLocation,int c){
		//	println "Fine"
		FileInputStream file = new FileInputStream (new File(fileLocation))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		file.close();
		Thread.sleep(2000)
		FileOutputStream outFile =new FileOutputStream(new File(fileLocation));

		for(int i=0;i<c-1;i++){
			sheet.getRow(12+i).getCell(cellNo+2).setCellValue(1)
			sheet.getRow(12+i).getCell(cellNo+3).setCellValue(6)
			sheet.getRow(12+i).getCell(cellNo+4).setCellValue(12)
			sheet.getRow(12+i).getCell(cellNo+5).setCellValue("CM")
		}

		workbook.write(outFile);
		outFile.close();
	}

	@Keyword
	def setText() {
		try {
			//while(true)
			int totalEntries = 0;
			int target = 0
			String fieldType = null;
			FileInputStream fileIn = new FileInputStream (new File(path+"/data.xlsx"))
			XSSFWorkbook wb = new XSSFWorkbook(fileIn);
			XSSFSheet s1 = wb.getSheetAt(0);
			String fileName =  s1.getRow(1).getCell(9).toString()
			fileIn.close()
			Thread.sleep(2000)
			println fileName
			String downloadLocation ="C:\\Users\\pashine_a\\Downloads\\"
			String fileLocation = downloadLocation+fileName
			FileInputStream file = new FileInputStream (new File(fileLocation))
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			int totalColumns = sheet.getRow(8).getLastCellNum()
			int totalRows = sheet.getLastRowNum()

			for(int i=0;i<totalColumns;i++){
				fieldType = sheet.getRow(11+i).getCell(0)
				if(fieldType==null || fieldType==""){
					break
				}
				totalEntries++;
			}
			file.close()
			Thread.sleep(2000)

			//	for(int c=0;c<totalEntries;c++){
			//		println c+1
			for(int i=1;i<totalColumns;i++){
				FileInputStream file1 = new FileInputStream (new File(fileLocation))
				XSSFWorkbook workbook1 = new XSSFWorkbook(file1);
				XSSFSheet sheet1 = workbook1.getSheetAt(0);
				fieldType =  sheet1.getRow(8).getCell(i)
				file1.close()
				if(fieldType!=null || fieldType!="" || fieldType!=" "){
					if(fieldType=="FreeText"){
						println fieldType
						freeText(i,fileLocation,totalEntries)
					}
					if(fieldType=="Numeric"){
						println fieldType
						numeric(i,fileLocation,totalEntries)
					}
					if(fieldType=="SelectOne"){
						println fieldType
						selectOne(i,fileLocation,totalEntries)
					}
					if(fieldType=="SelectMultiple"){
						println fieldType
						selectMultiple(i,fileLocation,totalEntries)
					}
				}

			}

			//}

			//file.close();
			//println "T - "+s1
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element"+e)
		}
	}


	/**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */
	@Keyword
	def List<WebElement> getHtmlTableRows(TestObject table, String outerTagName) {
		WebElement mailList = WebUiBuiltInKeywords.findWebElement(table)
		List<WebElement> selectedRows = mailList.findElements(By.xpath("./" + outerTagName + "/tr"))
		return selectedRows
	}
}