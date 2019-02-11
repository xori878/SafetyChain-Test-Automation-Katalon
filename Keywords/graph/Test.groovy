package graph
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import org.openqa.selenium.interactions.Actions
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

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.*;
import java.util.*;
import java.util.List;
import org.openqa.selenium.support.ui.WebDriverWait
import org.stringtemplate.v4.compiler.STParser.element_return
import org.openqa.selenium.support.ui.ExpectedConditions


class Test {

	WebDriver driver =  DriverFactory.getWebDriver();
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
	@Keyword
	def fetch() {
		waitForLoad()
		driver.findElement(By.xpath("//div[a[@href='/network-view']]//a")).click()
		waitForLoad()
		Actions action = new Actions(driver);
		Thread.sleep(7000)
		List<WebElement> element = driver.findElements(By.xpath("//*[@fill='#FAC454']"))
		println  "Total Points - "+element.size()
		for(int i=0;i<element.size();i++){
			action.moveToElement(element.get(i)).doubleClick().build().perform()
			Thread.sleep(2000)
			String s = driver.findElement(By.xpath("//*[@id='mirror-linechart-tooltip']/span/strong")).getText()
			println "Current Value - "+s
			Thread.sleep(2000)
		}
	}
	@Keyword
	def fetch2() {
		waitForLoad()
		driver.findElement(By.xpath("//div[a[@href='/threat-index']]//a")).click()
		waitForLoad()
		int count = 0;
		String value= null;
		Actions action = new Actions(driver);
		Thread.sleep(7000)
		List<WebElement> element = driver.findElements(By.xpath("//*[@fill='red']"))
		println "Total Points - "+element.size()
		Thread.sleep(2000)
		for(int i=0;i<element.size();i++){
			value = element.get(i).getAttribute("count")
			count = count + Integer.parseInt(value);
			println "Current Value - "+value
			Thread.sleep(2000)
		}
		println "Counted Value - "+count

		String total = driver.findElement(By.xpath("//tr[td[div[span[@style='background-color: red;']]]]/td[2]")).getText()
		println "Value Displayed - "+total
		int totalCount = Integer.parseInt(total);
		if(count==totalCount){
			println "Correct Count"
		}
	}
	public void waitForLoad(){
		while(true){
			if(!driver.findElements(By.xpath("//div[@class='loading']")).isEmpty()){
				println "Loading .."
				Thread.sleep(5000)
			}else{
				println "Loaded"
				Thread.sleep(5000)
				break
			}
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