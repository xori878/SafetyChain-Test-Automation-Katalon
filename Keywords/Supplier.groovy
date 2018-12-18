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

import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait


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

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.*;
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import java.util.concurrent.TimeUnit ;
import org.openqa.selenium.JavascriptExecutor;
import java.util.List;

class Supplier {

	WebDriver driver =  DriverFactory.getWebDriver();
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy-HH:mm");
	LocalDateTime now = LocalDateTime.now();
	public String supplier_name = "Req_Supplier_On_"+dtf.format(now);
	public String user_name = "Supplier_On_"+dtf.format(now);
	public String password = "password"
	public String newPassword = "password@123#"
	public String wgName = "WorkGroup_On_"+dtf.format(now);
	@Keyword
	def refreshBrowser() {
		KeywordUtil.logInfo("Refreshing")
		WebDriver webDriver = DriverFactory.getWebDriver()
		webDriver.navigate().refresh()
		KeywordUtil.markPassed("Refresh successfully")
	}

	@Keyword
	def getSupplierName(){
		//driver.findElement(By.xpath("//*[@id='scs-popup']//div[div[contains(text(),'User Name')]]//div[2]/input"))
		FileInputStream file = new FileInputStream (new File("../SafetyChain-Test-Automation-Katalon/SCTestData/location.xlsx"))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String suppName = sheet.getRow(1).getCell(13).toString();
		println suppName;
		String path = "//*[@id='scs-add-new-user-supplier-dropdown_listbox']/li/span[contains(text(),'"+suppName+"')]"
		driver.findElement(By.xpath(path)).click();
		file.close();

	}
	@Keyword
	def selectForm(){
		//driver.findElement(By.xpath("//*[@id='scs-popup']//div[div[contains(text(),'User Name')]]//div[2]/input"))
		FileInputStream file = new FileInputStream (new File("../SafetyChain-Test-Automation-Katalon/SCTestData/data.xlsx"))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String s = sheet.getRow(1).getCell(0).toString()
		println s
		Actions action = new Actions(driver);
		String path = "//*[@id='scs-pp-acknowledgement-step-1-grid-container']/div/table/tbody/tr[td[contains(text(),'"+s+"')]]/td[1]/input/following-sibling::label"
		WebElement element = driver.findElement(By.xpath(path))
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
		/*	String path = "//*[@id='scs-pp-acknowledgement-step-1-grid-container']/div/table/tbody/tr[td[contains(text(),'"+s+"')]]/td[1]/input/following-sibling::label"
		 String path1 = "//*[@id='scs-pp-acknowledgement-step-1-grid-container']/div/table/tbody/tr[td[contains(text(),'"+s+"')]]/td[1]"
		 file.close();
		 Actions action = new Actions(driver);
		 WebElement element = 	driver.findElement(By.xpath(path))
		 WebElement element1 = 	driver.findElement(By.xpath(path1))
		 Thread.sleep(3000)
		 action.moveToElement(element1).perform();
		 Thread.sleep(2000)
		 action.moveToElement(element).perform();
		 //	driver.findElement(By.xpath(path)).click()
		 //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 //	WebDriverWait wait = new WebDriverWait(driver, 30);
		 element.click();
		 //	WebElement ele = wait.until(ExpectedConditions.visibilityOf(element));
		 //	WebElement male_radio_button=driver.findElement(By.xpath(".//*[@id='u_0_c']"));
		 //	ele.click();
		 //	WebUI.waitForElementVisible(null, 0)
		 //driver.findElement(By.xpath(path)).click()
		 //action.clickAndHold(element1).build()
		 //Thread.sleep(2000)
		 //	action.build().perform() */

		//WebElement e1 = driver.findElement(By.xpath("//tr[td[contains(text(),'11 DEC quest form PD')]]/td[1]/input/following-sibling::label"));
		//e1.click();
		//	action.moveToElement(e1).click().build().perform()
		//	action.contextClick(e1).build().perform()

		//	WebElement element=driver.findElement(By.xpath("//span[@class='radio_state']"));

	}

	@Keyword
	def selectNewSupplier(){
		Actions action = new Actions(driver);
		FileInputStream file = new FileInputStream (new File("../SafetyChain-Test-Automation-Katalon/SCTestData/location.xlsx"))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String s = sheet.getRow(1).getCell(13).toString()
		println "Y-"+s
		String namePath = "//*[@id='scs-add-supplier-grid-container']/div[3]/table/tbody/tr/td";
		String selectPath = "//*[@id='scs-add-supplier-grid-container']/div[2]/table/tbody/tr/td/input";
		List<WebElement> elements = driver.findElements(By.xpath(namePath));
		String s1;
		int t=0
		for(int i=1;i<elements.size();i++){

			s1=driver.findElement(By.xpath("//*[@id='scs-add-supplier-grid-container']/div[3]/table/tbody/tr["+i+"]/td")).getAttribute("innerHTML");
			//println "Z2-"+s1
			if(s1.equals(s)){
				t=i+1;
				//	println "Z-"+s1
				selectPath = "//*[@id='scs-add-supplier-grid-container']/div[2]/table/tbody/tr["+i+"]/td/input";
				WebElement element = driver.findElement(By.xpath(selectPath));
				Thread.sleep(2000)
				action.moveToElement(element).click().build().perform()
				Thread.sleep(2000)
				break;
			}
		}

	}
	@Keyword
	def setSupplier(){
		//driver.findElement(By.xpath("//*[@id='scs-popup']//div[div[contains(text(),'User Name')]]//div[2]/input"))
		FileInputStream file = new FileInputStream (new File("../SafetyChain-Test-Automation-Katalon/SCTestData/SupplierCred.xlsx"))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		file.close();
		FileOutputStream outFile =new FileOutputStream(new File("../SafetyChain-Test-Automation-Katalon/SCTestData/SupplierCred.xlsx"));
		sheet.getRow(1).createCell(0).setCellValue(user_name);
		sheet.getRow(1).createCell(1).setCellValue(password);
		sheet.getRow(1).createCell(2).setCellValue(newPassword);
		sheet.getRow(1).createCell(4).setCellValue(wgName);
		workbook.write(outFile);
		outFile.close();

	}
	@Keyword
	def setSupplierName(){
		//driver.findElement(By.xpath("//*[@id='scs-popup']//div[div[contains(text(),'User Name')]]//div[2]/input"))
		FileInputStream file = new FileInputStream (new File("../SafetyChain-Test-Automation-Katalon/SCTestData/SupplierCred.xlsx"))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		file.close();
		FileOutputStream outFile =new FileOutputStream(new File("../SafetyChain-Test-Automation-Katalon/SCTestData/SupplierCred.xlsx"));
		sheet.getRow(1).createCell(3).setCellValue(supplier_name);
		workbook.write(outFile);
		outFile.close();

	}
	@Keyword
	def selectSupplierTask(){
		Actions action = new Actions(driver);
		//driver.findElement(By.xpath("//*[@id='scs-popup']//div[div[contains(text(),'User Name')]]//div[2]/input"))
		FileInputStream file = new FileInputStream (new File("../SafetyChain-Test-Automation-Katalon/SCTestData/data.xlsx"))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String tskName= sheet.getRow(1).getCell(1).toString()
		file.close();
		String tsknmPath = "//*[@id='supplier-inbox-grid']/div[2]/div[1]/table/tbody/tr/td[3]/span/strong[contains(text(),'"+tskName+"')]"
		WebElement ele = driver.findElement(By.xpath(tsknmPath))
		action.moveToElement(ele).doubleClick().build().perform()
	}

	@Keyword
	def selectWG(){
		Actions action = new Actions(driver);
		//driver.findElement(By.xpath("//*[@id='scs-popup']//div[div[contains(text(),'User Name')]]//div[2]/input"))
		FileInputStream file = new FileInputStream (new File("../SafetyChain-Test-Automation-Katalon/SCTestData/SupplierCred.xlsx"))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String s = sheet.getRow(1).getCell(4).toString()
		file.close();
		println s
		String path = "//div/div[@id='scs-add-requirement-step3-approver-dropdown-list']/div//ul/li[contains(text(),'"+s+"')]"
		println path
		WebElement ele  = driver.findElement(By.xpath(path));
		action.moveToElement(ele).click().build().perform()

	}
	@Keyword
	def selectTaskInInbox(){
		Actions action = new Actions(driver);
		//driver.findElement(By.xpath("//*[@id='scs-popup']//div[div[contains(text(),'User Name')]]//div[2]/input"))
		FileInputStream file = new FileInputStream (new File("../SafetyChain-Test-Automation-Katalon/SCTestData/data.xlsx"))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String s = sheet.getRow(1).getCell(1).toString()
		file.close();
		String path = "//*[@id='scs-inbox-grid-container']//b[contains(text(),'"+s+"')]"
		WebElement ele  = driver.findElement(By.xpath(path));
		action.moveToElement(ele).doubleClick().build().perform()

	}
	@Keyword
	def searchDocument(){
		Actions action = new Actions(driver);
		String supplierList = "//*[@id='scs-selected-partner_listbox']/li"
		String iconPath = "//*[@id='supplier-inbox-grid']//tr/td[2]/div/i[@class='fa fa-upload']";
		String taskName = "//*[@id='supplier-inbox-grid']//tr[td[2]/div/i[@class='fa fa-upload']]/td[3]/span";
		String listOption = "//*[@id='partnerportalheader']//single-select-dropdown-list/div/span"
		String openperPageOption = "//*[@id='supplier-inbox-grid']/div[3]/span[1]/span/span/span[1]"
		String select500 = "/html/body/div/div/div/ul/li[contains(text(),'500')]";
		String selectFile = "//*[@id='scs-upload-new-doc-dms-body-popup']//div[1]/input"
		String date = "//*[@id='expirationDatePicker']"
		String comment = "//*[@id='scs-upload-new-doc-dms-body-popup']//textarea"
		String upload ="//button[contains(text(),'UPLOAD')]";
		List<WebElement> listSupp = driver.findElements(By.xpath(supplierList));

		println "Supplier Size"+listSupp.size()
		WebElement e;
		for(int i=1;i<listSupp.size()+1;i++){
			driver.findElement(By.xpath(listOption)).click()
			Thread.sleep(4000)
			e= driver.findElement(By.xpath("//*[@id='scs-selected-partner_listbox']/li["+i+"]"))
			action.moveToElement(e).click().build().perform()
			Thread.sleep(9000)
			List<WebElement> element = driver.findElements(By.xpath(iconPath));
			//println elements.size()
			for(int j=0;j<element.size();j++){
				Thread.sleep(2000)
				List<WebElement> elements = driver.findElements(By.xpath(iconPath));
				List<WebElement> name = driver.findElements(By.xpath(taskName));
				Thread.sleep(2000)
				println "Current Task - "+name.get(0).getText()
				action.moveToElement(elements.get(0)).doubleClick().build().perform()
				Thread.sleep(7000)
				driver.findElement(By.xpath(selectFile)).sendKeys("D:\\Git Data\\SafetyChain-Test-Automation-Katalon\\SCTestData\\Tulips.jpg")
				Thread.sleep(2000)
				driver.findElement(By.xpath(comment)).sendKeys("Task is to upload file.")
				driver.findElement(By.xpath(date)).sendKeys("12/18/2018")
				Thread.sleep(2000)
				driver.findElement(By.xpath(upload)).click()
				Thread.sleep(10000)
			}
			//			driver.findElement(By.xpath(openperPageOption)).click()
			//			Thread.sleep(2000)
			//			driver.findElement(By.xpath(select500)).click()
			//	Thread.sleep(6000)
		}
		//	driver.findElement(By.xpath(listOption)).click()

		//		List<WebElement> elements = driver.findElements(By.xpath(iconPath));
		//		println elements.size()
		//		for(int i=0;i<elements.size();i++){
		//			action.moveToElement(elements.get(i)).click().build().perform()
		//			Thread.sleep(2000)
		//		}
	}
	@Keyword
	def approveTaskDocumentInInbox(){
		Actions action = new Actions(driver);
		String openEnOption = "//*[@id='scs-inbox-grid-container']/div/span/span/span/span[1]";
		String select500Record = "/html/body/div/div/div//li[contains(text(),'500')]"
		String total = "//*[@id='scs-inbox-grid-container']//tr"
		String currentTask = "//*[@id='scs-inbox-grid-container']//tr[td[3]/span or td[3]/b]"
		String browse = "//*[@id='scs-upload-new-doc-dms-body-popup']//div/div/input"
		String approvaltick = "//*[@id='filter-panel']/li[1]/ul/li//li[1]//input";
		String filterButton = "//*[@id='content']/div/div/div/div/div[contains(text(),'Filter')]";
		String selectFirstTask = "//*[@id='scs-inbox-grid-container']//tr[1]/td[3]"
		String approveButton = "//*[@id='scs-doc-view-approve-button']"
		String yesButton = "//div/button[contains(text(),'YES')]"
		driver.findElement(By.xpath(approvaltick)).click()
		Thread.sleep(2000)
		driver.findElement(By.xpath(filterButton)).click()
		Thread.sleep(8000)
		driver.findElement(By.xpath(openEnOption)).click()
		Thread.sleep(2000)
		driver.findElement(By.xpath(select500Record)).click()
		Thread.sleep(10000)
		List<WebElement> element = driver.findElements(By.xpath(total));
		//println element.size()
		WebElement el;
		String taskName = null;
		for(int j=0;j<element.size()-1;j++){
			el = driver.findElement(By.xpath(selectFirstTask))
			taskName = driver.findElement(By.xpath(currentTask)).getText()
			println "Current Task - "+taskName
			action.moveToElement(el).doubleClick().build().perform()
			Thread.sleep(9000)
			driver.findElement(By.xpath(approveButton)).click()
			Thread.sleep(2000)
			driver.findElement(By.xpath(yesButton)).click()
			Thread.sleep(8000)
		}

	}
}