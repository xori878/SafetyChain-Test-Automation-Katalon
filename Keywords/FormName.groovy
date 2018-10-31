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

import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.Row
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import internal.GlobalVariable

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
import org.openqa.selenium.interactions.Actions
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import java.util.Calendar;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class FormName {
	WebDriver driver =  DriverFactory.getWebDriver();
	//public String form_name = "AUTO_TOOL_KATALON_"+(int)(Math.random()*100)+"_FORM";
	//public String form_name = "AUTOQUESTIONAIREFORMTEST7";
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy-HH:mm:ss");
	LocalDateTime now = LocalDateTime.now();
	public String form_name = "AUTO_TOOL_KAT_"+dtf.format(now);
	@Keyword
	def setData() {
		try {
			println "Hi"
			FileInputStream file = new FileInputStream (new File("../SafetyChain-Test-Automation-Katalon/SCTestData/data.xlsx"))
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			sheet.getRow(1).createCell(0).setCellValue(form_name);
			println "Hi"
			print form_name
			file.close();
			FileOutputStream outFile =new FileOutputStream(new File("../SafetyChain-Test-Automation-Katalon/SCTestData/data.xlsx"));
			workbook.write(outFile);
			outFile.close();
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}

	@Keyword
	def createForm(TestObject to) {
		String s = findTestData('FormData').getValue('FormName',1)
		try {
			WebUiBuiltInKeywords.findWebElement(to).sendKeys(s);
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}
	@Keyword
	def fillFormName() {
		try {
			String s = findTestData('FormData').getValue('FormName',1)
			driver.findElement(By.xpath("//*[@id='scs-forms-grid']/div[2]/table/tbody/tr/td[contains(text(),'"+s+"')]")).click()
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}

	@Keyword
	def recordFormName() {
		try {
			String s = findTestData('FormData').getValue('FormName',1)
			Actions action = new Actions(driver);
			WebElement element = driver.findElement(By.xpath("//*[@id='scs-record-grid']/div[2]/table/tbody/tr/td[contains(text(),'"+s+"')]"))
			action.doubleClick(element).perform();
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}
	@Keyword
	def documentFormName() {
		try {
			String s = findTestData('FormData').getValue('FormName',1)
			Actions action = new Actions(driver);
			WebElement element = 	driver.findElement(By.xpath("//*[@id='scs-resources-document-grid']/div[2]/div[1]/table/tbody/tr/td[3 and contains(text(),'"+s+"')]"))
			action.doubleClick(element).perform();
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}
	@Keyword
	def filterFormName() {
		try {
			String s = findTestData('FormData').getValue('FormName',1)
			driver.findElement(By.xpath("/html/body/div/div/ul/li[6]/div/ul/li/div/form/div/input")).sendKeys(s);
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}
	@Keyword
	def findinDMS() {
		try {
			String s = findTestData('FormData').getValue('FormName',1)
			Actions action = new Actions(driver);
			WebElement element = driver.findElement(By.xpath("//*[@id='scs-left-panel-treeview']/ul/li/div/span/span/span[contains(text(),'"+s+"')]"));
			action.doubleClick(element).perform();
			//element = driver.findElement(By.xpath("//*[@id='scs-documents-grid']/div[2]/table/tbody/tr/td[3 and contains(text(),'"+form_name+"')]"));
			//action.doubleClick(driver.findElement(By.xpath("//*[@id='scs-documents-grid']/div[2]/table/tbody/tr/td[3]"))).perform();
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}
}