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

import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.interactions.Actions

import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.Row
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.Calendar;
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.*;

class AdminTool_Location {
	WebDriver driver =  DriverFactory.getWebDriver();
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy-HH:mm");
	LocalDateTime now = LocalDateTime.now();
	public String location_name = "Location_"+dtf.format(now);
	public String location_name1 = "SubLocation_"+dtf.format(now);
	public String customer_name = "Customer_"+dtf.format(now);
	public String customer_name1 = "SubCustomer1_"+dtf.format(now);
	public String customer_name2 = "SubCustomer2_"+dtf.format(now);
	public String equipment_name = "Equipment_"+dtf.format(now);
	public String equipment_name1 = "SubEquipment1_"+dtf.format(now);
	public String equipment_name2 = "SubEquipment2_"+dtf.format(now);
	public String item_name = "Item_"+dtf.format(now);
	public String item_name1 = "SubItem1_"+dtf.format(now);
	public String item_name2 = "SubItem2_"+dtf.format(now);
	public String supplier_name = "Supplier_"+dtf.format(now);
	public String supplier_name1 = "SubSupplier1_"+dtf.format(now);
	public String supplier_name2 = "SubSupplier2_"+dtf.format(now);
	String resource_name_link;


	public void click(WebDriver driver, By by) {
		WebElement element = driver.findElement(by);
		Actions action = new Actions(driver);
		(new WebDriverWait(driver,120)).until(ExpectedConditions.elementToBeClickable(by));
		Thread.sleep(1000)
		action.moveToElement(element).click().build().perform()
	}

	@Keyword
	def selectLocation() {
		try {
			FileInputStream file = new FileInputStream (new File("../SafetyChain-Test-Automation-Katalon/SCTestData/location.xlsx"))
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			String locationName = sheet.getRow(1).getCell(0).toString();
			file.close();
			WebElement element = driver.findElement(By.xpath("//*[contains(text(),'"+locationName+"')]"))
			Actions action = new Actions(driver)
			action.doubleClick(element)
			Thread.sleep(4000)
			action.moveToElement(element).build().perform()

			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}
	@Keyword
	def selectCustomer() {
		try {
			FileInputStream file = new FileInputStream (new File("../SafetyChain-Test-Automation-Katalon/SCTestData/location.xlsx"))
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			String resourceName = sheet.getRow(1).getCell(2).toString();
			file.close();
			FileOutputStream outFile =new FileOutputStream(new File("../SafetyChain-Test-Automation-Katalon/SCTestData/location.xlsx"));
			sheet.getRow(1).createCell(15).setCellValue("Customers");
			workbook.write(outFile);
			outFile.close();
			WebElement element = driver.findElement(By.xpath("//*[contains(text(),'"+resourceName+"')]"))
			Actions action = new Actions(driver)
			action.doubleClick(element)
			Thread.sleep(4000)
			action.moveToElement(element).build().perform()

			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}
	@Keyword
	def hoverCustomer() {
		try {
			FileInputStream file = new FileInputStream (new File("../SafetyChain-Test-Automation-Katalon/SCTestData/location.xlsx"))
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			String resourceName = sheet.getRow(1).getCell(2).toString();
			file.close();
			WebElement element = driver.findElement(By.xpath("//*[contains(text(),'"+resourceName+"')]"))
			Actions action = new Actions(driver)
			Thread.sleep(4000)
			action.moveToElement(element).build().perform()

			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}
	@Keyword
	def selectEquipment() {
		try {
			FileInputStream file = new FileInputStream (new File("../SafetyChain-Test-Automation-Katalon/SCTestData/location.xlsx"))
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			String resourceName = sheet.getRow(1).getCell(3).toString();
			file.close();
			FileOutputStream outFile =new FileOutputStream(new File("../SafetyChain-Test-Automation-Katalon/SCTestData/location.xlsx"));
			sheet.getRow(1).createCell(15).setCellValue("Equipment");
			workbook.write(outFile);
			outFile.close();
			WebElement element = driver.findElement(By.xpath("//*[contains(text(),'"+resourceName+"')]"))
			Actions action = new Actions(driver)
			action.doubleClick(element)
			Thread.sleep(4000)
			action.moveToElement(element).build().perform()

			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}

	@Keyword
	def selectItem() {
		try {
			FileInputStream file = new FileInputStream (new File("../SafetyChain-Test-Automation-Katalon/SCTestData/location.xlsx"))
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			String resourceName = sheet.getRow(1).getCell(4).toString();
			file.close();
			FileOutputStream outFile =new FileOutputStream(new File("../SafetyChain-Test-Automation-Katalon/SCTestData/location.xlsx"));
			sheet.getRow(1).createCell(15).setCellValue("Items");
			workbook.write(outFile);
			outFile.close();
			WebElement element = driver.findElement(By.xpath("//*[contains(text(),'"+resourceName+"')]"))
			Actions action = new Actions(driver)
			action.doubleClick(element)
			Thread.sleep(4000)
			action.moveToElement(element).build().perform()

			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}
	@Keyword
	def selectSupplier() {
		try {
			FileInputStream file = new FileInputStream (new File("../SafetyChain-Test-Automation-Katalon/SCTestData/location.xlsx"))
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			String resourceName = sheet.getRow(1).getCell(5).toString();
			file.close();
			FileOutputStream outFile =new FileOutputStream(new File("../SafetyChain-Test-Automation-Katalon/SCTestData/location.xlsx"));
			sheet.getRow(1).createCell(15).setCellValue("Suppliers");
			workbook.write(outFile);
			outFile.close();
			WebElement element = driver.findElement(By.xpath("//*[contains(text(),'"+resourceName+"')]"))
			Actions action = new Actions(driver)
			action.doubleClick(element)
			Thread.sleep(4000)
			action.moveToElement(element).build().perform()

			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}
	@Keyword
	def resourceLinkName() {
		try {
			resource_name_link = driver.findElement(By.xpath("//*[@id='grid-Customers']//tr[2]/td[2]")).getText().toString();
			FileInputStream file = new FileInputStream (new File("../SafetyChain-Test-Automation-Katalon/SCTestData/location.xlsx"))
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			file.close();
			FileOutputStream outFile =new FileOutputStream(new File("../SafetyChain-Test-Automation-Katalon/SCTestData/location.xlsx"));
			sheet.getRow(1).createCell(14).setCellValue(resource_name_link);
			workbook.write(outFile);
			outFile.close();
			printName(resource_name_link)
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}
	public void printName(String s){
		println "Name : "+s;
	}
	@Keyword
	def sup() {
		try {
			//			FileInputStream file = new FileInputStream (new File("../SafetyChain-Test-Automation-Katalon/SCTestData/location.xlsx"))
			//			XSSFWorkbook workbook = new XSSFWorkbook(file);
			//			XSSFSheet sheet = workbook.getSheetAt(0);
			//			String resourceName = sheet.getRow(1).getCell(5).toString();
			//			file.close();
			//			WebElement element = driver.findElement(By.xpath("//*[contains(text(),'"+resourceName+"')]"))
			//			Actions action = new Actions(driver)
			//			action.doubleClick(element)
			//			Thread.sleep(4000)
			//			action.moveToElement(element).build().perform()

			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}

	@Keyword
	def dragDropRes() {
		try {
			FileInputStream file = new FileInputStream (new File("../SafetyChain-Test-Automation-Katalon/SCTestData/location.xlsx"))
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			String resName= sheet.getRow(1).getCell(16).toString();
			file.close();
			Actions action = new Actions(driver)
			WebElement element = driver.findElement(By.xpath("//*[@id='scs-left-panel-treeview']/ul/li/ul/li/div/span[contains(text(),'"+resName+"')]"))
			WebElement target = driver.findElement(By.xpath("//*[@id='scs-formdesigner-select-resource-grid']"))
			Thread.sleep(2000)
			action.moveToElement(element).build().perform()
			Thread.sleep(2000)
			action.dragAndDrop(element, target).build().perform()

			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}
	@Keyword
	def selectResType(){
		try{

			FileInputStream file = new FileInputStream (new File("../SafetyChain-Test-Automation-Katalon/SCTestData/location.xlsx"))
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			String resType = sheet.getRow(1).getCell(15).toString();
			file.close();
			String selectresource = "//*[@id='scs-product-dropdown_listbox']/li[contains(text(),'"+resType+"')]"
			click(driver,By.xpath("//*[@id='scs-form-designer-selectresource-container']/div/div/div[1]/span"))
			Thread.sleep(4000)
			click(driver,By.xpath(selectresource))
			Thread.sleep(4000)
		}catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}
	@Keyword
	def moveCursor(){
		try{
			Robot hal = new Robot();
			Random random = new Random();
			//	hal.delay(1000 * 60);
			int x = random.nextInt() % 640;
			int y = random.nextInt() % 480;
			hal.mouseMove(x,y);
		}catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}
	@Keyword
	def validate(){
		try{

			FileInputStream file = new FileInputStream (new File("../SafetyChain-Test-Automation-Katalon/SCTestData/location.xlsx"))
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			String resType = sheet.getRow(1).getCell(15).toString();
			String resName= resType+" > "+sheet.getRow(1).getCell(16).toString() + " > " +sheet.getRow(1).getCell(18).toString();
			file.close();
			String result = driver.findElement(By.xpath("//*[@id='scs-formdesigner-select-resource-grid']/div/div[1]")).getText()
			if(resName.equals(result)){
				println "Successfull"
			}else{
				println "Unsuccessfull"
			}
		}catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}
	@Keyword
	def setLocationName() {
		try {
			FileInputStream file = new FileInputStream (new File("../SafetyChain-Test-Automation-Katalon/SCTestData/location.xlsx"))
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			file.close();
			FileOutputStream outFile =new FileOutputStream(new File("../SafetyChain-Test-Automation-Katalon/SCTestData/location.xlsx"));
			sheet.getRow(1).createCell(0).setCellValue(location_name);
			workbook.write(outFile);
			outFile.close();
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}

	@Keyword
	def setLocationNameInLocation() {
		try {
			FileInputStream file = new FileInputStream (new File("../SafetyChain-Test-Automation-Katalon/SCTestData/location.xlsx"))
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			file.close();
			FileOutputStream outFile =new FileOutputStream(new File("../SafetyChain-Test-Automation-Katalon/SCTestData/location.xlsx"));
			sheet.getRow(1).createCell(1).setCellValue(location_name1);
			workbook.write(outFile);
			outFile.close();
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}
	@Keyword
	def setCustomerName() {
		try {
			FileInputStream file = new FileInputStream (new File("../SafetyChain-Test-Automation-Katalon/SCTestData/location.xlsx"))
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			file.close();
			FileOutputStream outFile =new FileOutputStream(new File("../SafetyChain-Test-Automation-Katalon/SCTestData/location.xlsx"));
			sheet.getRow(1).createCell(2).setCellValue(customer_name);
			sheet.getRow(1).createCell(6).setCellValue(customer_name1);
			sheet.getRow(1).createCell(7).setCellValue(customer_name2);
			sheet.getRow(1).createCell(16).setCellValue(customer_name);
			sheet.getRow(1).createCell(17).setCellValue(customer_name1);
			sheet.getRow(1).createCell(18).setCellValue(customer_name2);
			workbook.write(outFile);
			outFile.close();
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}
	@Keyword
	def setEquipmentName() {
		try {
			FileInputStream file = new FileInputStream (new File("../SafetyChain-Test-Automation-Katalon/SCTestData/location.xlsx"))
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			file.close();
			FileOutputStream outFile =new FileOutputStream(new File("../SafetyChain-Test-Automation-Katalon/SCTestData/location.xlsx"));
			sheet.getRow(1).createCell(3).setCellValue(equipment_name);
			sheet.getRow(1).createCell(8).setCellValue(equipment_name1);
			sheet.getRow(1).createCell(9).setCellValue(equipment_name2);
			sheet.getRow(1).createCell(16).setCellValue(equipment_name);
			sheet.getRow(1).createCell(17).setCellValue(equipment_name1);
			sheet.getRow(1).createCell(18).setCellValue(equipment_name2);
			workbook.write(outFile);
			outFile.close();
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}
	@Keyword
	def setItemName() {
		try {
			FileInputStream file = new FileInputStream (new File("../SafetyChain-Test-Automation-Katalon/SCTestData/location.xlsx"))
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			file.close();
			FileOutputStream outFile =new FileOutputStream(new File("../SafetyChain-Test-Automation-Katalon/SCTestData/location.xlsx"));
			sheet.getRow(1).createCell(4).setCellValue(item_name);
			sheet.getRow(1).createCell(10).setCellValue(item_name1);
			sheet.getRow(1).createCell(11).setCellValue(item_name2);
			sheet.getRow(1).createCell(16).setCellValue(item_name);
			sheet.getRow(1).createCell(17).setCellValue(item_name1);
			sheet.getRow(1).createCell(18).setCellValue(item_name2);
			workbook.write(outFile);
			outFile.close();
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}

	@Keyword
	def setSupplierName() {
		try {
			FileInputStream file = new FileInputStream (new File("../SafetyChain-Test-Automation-Katalon/SCTestData/location.xlsx"))
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			file.close();
			FileOutputStream outFile =new FileOutputStream(new File("../SafetyChain-Test-Automation-Katalon/SCTestData/location.xlsx"));
			sheet.getRow(1).createCell(5).setCellValue(supplier_name);
			sheet.getRow(1).createCell(12).setCellValue(supplier_name1);
			sheet.getRow(1).createCell(13).setCellValue(supplier_name2);
			sheet.getRow(1).createCell(16).setCellValue(supplier_name);
			sheet.getRow(1).createCell(17).setCellValue(supplier_name1);
			sheet.getRow(1).createCell(18).setCellValue(supplier_name2);
			workbook.write(outFile);
			outFile.close();
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}
	@Keyword
	def checkLocation() {
		try {
			FileInputStream file = new FileInputStream (new File("../SafetyChain-Test-Automation-Katalon/SCTestData/location.xlsx"))
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			String name = sheet.getRow(1).getCell(0).toString() + " > " +sheet.getRow(1).getCell(1).toString();
			String lcn = "//td[span[contains(text(),'Locations > "+name+"')]]/input"
			String lcnBlc = "//td[span[contains(text(),'Locations > "+name+"')]]"
			WebElement location = driver.findElement(By.xpath(lcn));
			WebElement locationBlock = driver.findElement(By.xpath(lcnBlc));

			file.close();
			println location
			Actions action = new Actions(driver)
			action.moveToElement(locationBlock).build().perform()
			Thread.sleep(2000)
			action.click(location).build().perform()
			//driver.findElement(By.xpath(location)).click()
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}
}