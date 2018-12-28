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
import java.util.List;
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions

class AnyForm {
	WebDriver driver =  DriverFactory.getWebDriver();
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy-HH:mm");
	LocalDateTime now = LocalDateTime.now();
	public String location_name = "LOCATION_ON_"+dtf.format(now);


	public  setValue(WebElement element,String value){
		Actions action = new Actions(driver);
		action.moveToElement(element).sendKeys(value).build.perform()
	}
	public  click(WebElement element){
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build.perform()
	}
	@Keyword
	def fillForm1() {
		Actions action = new Actions(driver);
		List<WebElement> total = driver.findElements(By.xpath("//*[@id='scs-form-level']/div"))
		WebElement ele;
		for(int i=1;i<total.size()+1;i++){
			//	ele="//*[@id='scs-form-level']/div["+i+"]//field-template//input"
			if(driver.findElements(By.xpath("//*[@id='scs-form-level']/div["+i+"]//field-template//input")).isSe){
				println "ABC"
			}

		}

	}
	@Keyword
	def fillForm() {
		try {
			Actions action = new Actions(driver);
			////*[@id="scs-form-level"]//span[@class="k-widget k-combobox k-header actualInput scs-field-selectOne k-combobox-clearable"]/span/span[2]
			List<WebElement> text = driver.findElements(By.xpath("//*[@class='actualInput scs-field-singleText ng-pristine ng-empty ng-invalid ng-invalid-required ng-touched' or @class='actualInput scs-field-singleText ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required']"))
			List<WebElement> paragraph = driver.findElements(By.xpath("//textarea"))
			List<WebElement> numeric = driver.findElements(By.xpath("//*[@class='k-formatted-value actualInput scs-field-numeric ng-pristine ng-untouched ng-valid k-input']"))
			List<WebElement> selOneOpen = driver.findElements(By.xpath("//*[@id='scs-form-level']//span[span[input[@class='k-input actualInput scs-field-selectOne']]]/span/span[last()]"))
			//	List<WebElement> selMulOpen = driver.findElements(By.xpath("//*[@id='scs-form-level']/div/div/field-template/div/div/div/div/div/div/input"))
			List<WebElement> selMulOpen = driver.findElements(By.xpath("//*[@id='scs-form-level']//field-template/div/div/div/div/div/div"))
			List<WebElement> selOneOption =  driver.findElements(By.xpath("//*[@id='field-{{field.Id}}_listbox' and @aria-live='off']//li[1]"))
			List<WebElement> selMulOption =  driver.findElements(By.xpath("//*[@id='field-{{field.Id}}_listbox' and @aria-live='polite']/li[1]"))
			List<WebElement> date = driver.findElements(By.xpath("//*[@class='k-widget k-datepicker k-header actualInput scs-date-time-fields']//input"))
			List<WebElement> time = driver.findElements(By.xpath("//*[@class='k-widget k-timepicker k-header actualInput scs-date-time-fields']//input"))
			List<WebElement> dateTime = driver.findElements(By.xpath("//*[@class='k-widget k-datetimepicker k-header actualInput scs-date-time-fields']//input"))

			int i=0;
			Thread.sleep(2000)
			for(i=0;i<text.size();i++){

				text.get(i).sendKeys("This is Text")
				Thread.sleep(2000)
			}
			for(i=0;i<paragraph.size();i++){

				paragraph.get(i).sendKeys("This is Paragraph")
				Thread.sleep(2000)
			}
			for(i=0;i<selOneOpen.size();i++){
				action.moveToElement(selOneOpen.get(i))
				selOneOpen.get(i).click()
				Thread.sleep(2000)
				selOneOption.get(i).click()
				Thread.sleep(2000)
			}
			for(i=0;i<selMulOpen.size();i++){
				action.moveToElement(selMulOpen.get(i))
				selMulOpen.get(i).click()
				Thread.sleep(2000)
				selMulOption.get(i).click()

				Thread.sleep(2000)
			}
			for(i=0;i<numeric.size();i++){

				numeric.get(i).sendKeys("8")
				Thread.sleep(2000)
			}
			for(i=0;i<date.size();i++){

				date.get(i).sendKeys("12/27/2018")
				Thread.sleep(2000)
			}
			for(i=0;i<time.size();i++){

				time.get(i).sendKeys("3:00 AM")
				Thread.sleep(2000)
			}
			for(i=0;i<dateTime.size();i++){

				dateTime.get(i).sendKeys("12/27/2018 2:30 AM")
				Thread.sleep(2000)
			}
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}

	public boolean check(String path){
		boolean status = false;
		boolean elements = driver.findElements(By.xpath(path)).isEmpty()
		boolean element;
		boolean element1;
		if(!elements){
			//	println "AP"
			element = driver.findElement(By.xpath(path)).isDisplayed()
			element1 = driver.findElement(By.xpath(path)).isEnabled()
			if(element && element1){
				println path
				status = true;
			}
		}
		return status;

	}

	@Keyword
	def searchDocument1(){
		List<WebElement> total = driver.findElements(By.xpath("//*[@id='scs-form-level']/div"))
		WebElement ele,e1;
		String s = null;
		Actions actions = new Actions(driver);
		int cnt=0,cnt1=0;
		for(int m=1;m<total.size()+1;m++){
			if(check("//*[@id='scs-form-level']/div["+m+"]//field-template//input[@class='actualInput scs-field-singleText ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required']")){
				driver.findElement(By.xpath("//*[@id='scs-form-level']/div["+m+"]//field-template//input")).sendKeys("This is Text")
				Thread.sleep(2000)
			}
			if(!driver.findElements(By.xpath("//*[@id='scs-form-level']/div["+m+"]//field-template//input[@type='file']")).isEmpty()){
				driver.findElement(By.xpath("//*[@id='scs-form-level']/div["+m+"]//field-template//input[@type='file']")).sendKeys("D:\\Git Data\\SafetyChain-Test-Automation-Katalon\\SCTestData\\Tulips.jpg")
				Thread.sleep(8000)
			}
			if(check("//*[@id='scs-form-level']/div["+m+"]//field-template//textarea[@class='actualInput paratextfield ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required']")){
				driver.findElement(By.xpath("//*[@id='scs-form-level']/div["+m+"]//field-template//textarea")).sendKeys("Paragraph")
				Thread.sleep(2000)
			}
			if(check("//*[@id='scs-form-level']/div["+m+"]//field-template//input[@class='k-formatted-value actualInput scs-field-numeric ng-pristine ng-untouched ng-valid k-input']")){
				driver.findElement(By.xpath("//*[@id='scs-form-level']/div["+m+"]//field-template//input[@class='k-formatted-value actualInput scs-field-numeric ng-pristine ng-untouched ng-valid k-input']")).sendKeys("9")
				Thread.sleep(2000)
			}
			if(check("//*[@id='scs-form-level']/div["+m+"]//field-template//span[@aria-controls='field-{{field.Id}}_listbox']")){
				driver.findElement(By.xpath("//*[@id='scs-form-level']/div["+m+"]//field-template//span[@aria-controls='field-{{field.Id}}_listbox']")).click()
				Thread.sleep(2000)
				e1 = driver.findElement(By.xpath("//*[@id='scs-form-level']/div["+m+"]//field-template//input"))
				s = e1.getAttribute("aria-activedescendant")
				println s
				if(check("//ul//li[@id='"+s+"']")){

					driver.findElement(By.xpath("//ul//li[@id='"+s+"']")).click()
					Thread.sleep(2000)


				}

			}
			if(check("//*[@id='scs-form-level']/div["+m+"]//div[@class='k-multiselect-wrap k-floatwrap']")){
				driver.findElement(By.xpath("//*[@id='scs-form-level']/div["+m+"]//field-template//div[@class='k-multiselect-wrap k-floatwrap']")).click()
				Thread.sleep(2000)
				e1 = driver.findElement(By.xpath("//*[@id='scs-form-level']/div["+m+"]//field-template//input"))
				s = e1.getAttribute("aria-activedescendant")
				println s
				if(check("//ul//li[@id='"+s+"']")){

					driver.findElement(By.xpath("//ul//li[@id='"+s+"']")).click()
					Thread.sleep(2000)


				}
			}
			if(check("//*[@id='scs-form-level']/div["+m+"]//field-template//span[@class='k-widget k-datepicker k-header actualInput scs-date-time-fields']//input")){
				driver.findElement(By.xpath("//*[@id='scs-form-level']/div["+m+"]//field-template//span[@class='k-widget k-datepicker k-header actualInput scs-date-time-fields']//input")).sendKeys("12/28/2018")
				Thread.sleep(2000)
			}
			if(check("//*[@id='scs-form-level']/div["+m+"]//field-template//span[@class='k-widget k-timepicker k-header actualInput scs-date-time-fields']//input")){
				driver.findElement(By.xpath("//*[@id='scs-form-level']/div["+m+"]//field-template//span[@class='k-widget k-timepicker k-header actualInput scs-date-time-fields']//input")).sendKeys("3:00 AM")
				Thread.sleep(2000)
			}
			if(check("//*[@id='scs-form-level']/div["+m+"]//field-template//span[@class='k-widget k-datetimepicker k-header actualInput scs-date-time-fields']//input")){
				driver.findElement(By.xpath("//*[@id='scs-form-level']/div["+m+"]//field-template//span[@class='k-widget k-datetimepicker k-header actualInput scs-date-time-fields']//input")).sendKeys("12/28/2018 10:30 AM")
				Thread.sleep(2000)
			}

		}
	}


}