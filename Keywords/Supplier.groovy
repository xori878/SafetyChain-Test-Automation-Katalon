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

class Supplier {

	WebDriver driver =  DriverFactory.getWebDriver();
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy-HH:mm");
	LocalDateTime now = LocalDateTime.now();
	public String user_name = "User_On_"+dtf.format(now);
	public String password = "password"
	public String newPassword = "password@123#"
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
		String namePath = "//*[@id='scs-add-supplier-grid-container']/div[3]/table/tbody/tr/td";
		String selectPath = "//*[@id='scs-add-supplier-grid-container']/div[2]/table/tbody/tr/td/input";
		List<WebElement> elements = driver.findElements(By.xpath(namePath));
		String s;
		for(int i=0;i<elements.getSize();i++){
		//	s = elements.get(i).getText().toString();
			//if()
		}
	}
}