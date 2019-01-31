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
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
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

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.*;
import java.util.List;
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions

class TaskMGMT {

	WebDriver driver =  DriverFactory.getWebDriver();;
	static String path = PathUtil.relativeToAbsolutePath("../SafetyChain-Test-Automation-Katalon/SCTestData", RunConfiguration.getProjectDir())


	public void click(WebDriver driver, By by) {
		WebElement element = driver.findElement(by);
		Actions action = new Actions(driver);
		(new WebDriverWait(driver,120)).until(ExpectedConditions.elementToBeClickable(by));
		Thread.sleep(1000)
		action.moveToElement(element).click().build().perform()
	}

	@Keyword
	def setData() {
		try {
			Thread.sleep(2000)
			String openLocation = "//*[@id='scs-popup']/div/div/div/div[2]/div/span/span"
			String openRes="//*[@id='scs-popup']/div/div/div/div[4]/div/span/span"
			driver.findElement(By.xpath(openLocation)).click()
			Thread.sleep(2000)
			String locationId = driver.findElement(By.xpath("//*[@id='scs-popup']/div/div/div/div[2]/div/span")).getAttribute("aria-activedescendant").toString()
			List<WebElement> locations = driver.findElements(By.xpath("//ul[li[@id='"+locationId+"']]//li"))
			click(driver,By.xpath(openLocation))
			Thread.sleep(2000)
			int i=0,j=0,flag=0;
			String s = findTestData('SupplierData').getValue("WorkGroupName", 1)
			println s
			String selectWG = "//div/div/div/ul/li[contains(text(),'"+s+"')]"
			click(driver, By.xpath("//*[@id='scs-popup']//div[div[contains(text(),'Assign To')]]//span[2]"))
			Thread.sleep(2000)
			click(driver, By.xpath(selectWG))

			while(i<locations.size()){
				click(driver,By.xpath(openLocation))
				Thread.sleep(2000)
				locations.get(i).click()
				Thread.sleep(2000)
				click(driver,By.xpath(openRes))
				Thread.sleep(2000)
				List<WebElement> resOptions = driver.findElements(By.xpath("//div[div[@class='k-list-optionlabel ng-scope k-state-selected k-state-focused']]//li[1]"))
				while(j<resOptions.size()){
					if(resOptions.get(j).isDisplayed()){
						resOptions.get(j).click()
						Thread.sleep(2000)
						flag=1;
						break;
					}
					j++;
				}
				if(flag==1){
					break;
				}
				i++;
			}
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}
}