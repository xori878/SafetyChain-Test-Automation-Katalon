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
import java.util.*;
import java.util.List;
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions

class Submission{

	WebDriver driver =  DriverFactory.getWebDriver();

	DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm a");
	DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");



	public void setValue(WebElement element,String value){
		Actions action = new Actions(driver);
		action.moveToElement(element).sendKeys(value).build.perform()
	}
	public void click(WebDriver driver, By by) {
		WebElement element = driver.findElement(by);
		Actions action = new Actions(driver);
		(new WebDriverWait(driver,120)).until(ExpectedConditions.elementToBeClickable(by));
		Thread.sleep(1000)
		action.moveToElement(element).click().build().perform()
	}
	public void waitToClick(WebDriver driver, By by) {
		(new WebDriverWait(driver,121)).until(ExpectedConditions.elementToBeClickable(by));
	}
	public void waits(WebDriver driver, By by) {
		(new WebDriverWait(driver,122)).until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	public String getFieldType(String fieldId){
		String type= driver.findElement(By.xpath("//*[@id='scs-form-level']//div[@data-field='"+fieldId+"']")).getAttribute("data-fieldtype").toString()
		return type;
	}
	public boolean right(String fieldId){
		boolean status = driver.findElements(By.xpath("//*[@id='scs-form-level']//div[@data-field='"+fieldId+"']//i[@class='fa fa-circle-o' or @class='fa']")).isEmpty()
		return !status;
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
				//	println path
				status = true;
			}
		}
		return status;

	}

	public int getTaskType(){
		int type = 0;
		String taskType = driver.findElement(By.xpath("//*[@id='supplier-inbox-grid']//tr[1]//div[@class='scs-tasktype-type-icon']//i[1]")).getAttribute("class").toString()
		if(taskType=="fa fa-upload"){
			type=1;
		}
		if(taskType=="fa fa-flag-o"){
			type=2;
		}
		return type;
	}
	public void uploadDocument(){
		String selectFile = "//*[@id='scs-upload-new-doc-dms-body-popup']//div[1]/input"
		String date = "//*[@id='expirationDatePicker']"
		LocalDateTime now = LocalDateTime.now();
		String todaydate = dtf1.format(now);
		String comment = "//*[@id='scs-upload-new-doc-dms-body-popup']//textarea"
		String upload ="//button[contains(text(),'U') or contains(text(),'S')]";
		//String upload ="//button[contains(text(),'UPLOAD')]";
		println "Document Upload"
		waitToClick(driver, By.xpath("//*[@id='scs-upload-new-doc-dms-body-popup']/div/div/div/div/div/span"))
		driver.findElement(By.xpath(selectFile)).sendKeys("D:\\Git Data\\SafetyChain-Test-Automation-Katalon\\SCTestData\\Tulips.jpg")
		Thread.sleep(2000)
		driver.findElement(By.xpath(comment)).sendKeys("Task is to upload file.")
		driver.findElement(By.xpath(date)).sendKeys(todaydate)
		Thread.sleep(2000)
		driver.findElement(By.xpath(upload)).click()
		Thread.sleep(12000)
	}
	public void signACK(){
		Thread.sleep(2000)
		String sign = "//*[@id='scs-pp-acknowledgment-container']//span[contains(text(),'SIGN')]"
		waitToClick(driver, By.xpath(sign))
		Thread.sleep(2000)
		driver.findElement(By.xpath(sign)).click()
		Thread.sleep(8000)
	}
	public void submitForm(){
		int n= 0;
		LocalDateTime now = LocalDateTime.now();
		String date = dtf1.format(now);
		String time = dtf2.format(now);
		String dateTime = dtf3.format(now);
		Thread.sleep(4000)
		println "Form Submission"
		String fieldId = null,fieldPath = "//field-template/div[@data-field]",
		fileFieldPath="//input[@type='file']",
		commentPath = "//*[@ng-model='field.Comment']";
		String type = null;
		int c=0;
		boolean status = true,st = false;

		waits(driver, By.xpath(fieldPath))
		Thread.sleep(2000)

		List<WebElement> total = driver.findElements(By.xpath(fieldPath))
		List<WebElement> totalFileIn = driver.findElements(By.xpath(fileFieldPath))
		List<WebElement> totalComment = driver.findElements(By.xpath(commentPath))
		//	println total.size()
		for(int i=0;i<total.size();i++){
			n= Math.random()*100
			fieldId = total.get(i).getAttribute("data-field").toString()
			status = right(fieldId)
			type = getFieldType(fieldId)
			//	println type
			if(total.get(i).isDisplayed() && status){
				if(type=="FreeText" || type=="SingleLineText"){
					driver.findElement(By.xpath("//*[@id='scs-form-level']//div[@data-field='"+fieldId+"']//input")).sendKeys("This is Text")
					Thread.sleep(2000)
				}
				if(type=="Paragraph"){
					driver.findElement(By.xpath("//*[@id='scs-form-level']//div[@data-field='"+fieldId+"']//textarea")).sendKeys("This is Paragraph")
					Thread.sleep(2000)
				}
				if(type=="SelectOne"){
					st = false;
					driver.findElement(By.xpath("//*[@id='scs-form-level']//div[@data-field='"+fieldId+"']//span[input]/span[last()]")).click()
					Thread.sleep(2000)
					while(!st){
						c++;
						st = check("//div["+c+"]//ul/li[@data-offset-index='0']")
						//			println "//div["+c+"]//ul/li[@data-offset-index='0']"
					}
					driver.findElement(By.xpath("//div["+c+"]//ul/li[@data-offset-index='0']")).click()
					Thread.sleep(2000)
				}
				if(type=="SelectMultiple"){
					st = false;
					driver.findElement(By.xpath("//*[@id='scs-form-level']//div[@data-field='"+fieldId+"']//div[@class='k-multiselect-wrap k-floatwrap']")).click()
					Thread.sleep(2000)
					while(!st){
						c++;
						st = check("//div["+c+"]//ul/li[@data-offset-index='0']")
						//	println "//div["+c+"]//ul/li[@data-offset-index='0']"
					}
					driver.findElement(By.xpath("//div["+c+"]//ul/li[@data-offset-index='0']")).click()
					Thread.sleep(2000)
				}
				if(type=="Numeric"){
					driver.findElement(By.xpath("//*[@id='scs-form-level']//div[@data-field='"+fieldId+"']//input")).sendKeys("9")
					Thread.sleep(2000)
				}
				if(type=="Date"){
					driver.findElement(By.xpath("//*[@id='scs-form-level']//div[@data-field='"+fieldId+"']//input")).sendKeys(date)
					Thread.sleep(2000)
				}
				if(type=="Time"){
					driver.findElement(By.xpath("//*[@id='scs-form-level']//div[@data-field='"+fieldId+"']//input")).sendKeys(time)
					Thread.sleep(2000)
				}
				if(type=="DateTime"){
					driver.findElement(By.xpath("//*[@id='scs-form-level']//div[@data-field='"+fieldId+"']//input")).sendKeys(dateTime)

				}
			}


		}
		for(int i=0;i<totalFileIn.size();i++){
			fieldId = totalFileIn.get(i).getAttribute("id").toString()
			if(driver.findElement(By.xpath("//div[input[@id='"+fieldId+"']]")).isDisplayed()){
				totalFileIn.get(i).sendKeys("D:\\Git Data\\SafetyChain-Test-Automation-Katalon\\SCTestData\\Tulips.jpg")
				Thread.sleep(6000)
			}
		}
		for(int i=0;i<totalComment.size();i++){
			if(totalComment.get(i).isDisplayed()){
				totalComment.get(i).sendKeys("This is automatic comment")
				Thread.sleep(1000)
			}
		}
		click(driver, By.xpath("//i[@class='fa fa-paperclip']"))
		Thread.sleep(2000)
		waitToClick(driver,By.xpath("//*[@id='scs-formlevelfiles-container']/div/div/div/span"))
		driver.findElement(By.xpath("//*[@id='formlevelfiles']")).sendKeys("D:\\Git Data\\SafetyChain-Test-Automation-Katalon\\SCTestData\\Lighthouse.jpg")
		Thread.sleep(9000)
		click(driver, By.xpath("//button[contains(text(),'CLOSE')]"))
		Thread.sleep(2000)
		click(driver,By.xpath("//*[@id='scs-submit-form-button']"))
		Thread.sleep(3000)
		if(!driver.findElements(By.xpath("//*[@id='scs-form-resubmission-note']")).isEmpty()){
			driver.findElement(By.xpath("//*[@id='scs-form-resubmission-note']")).sendKeys("Automatic Form Submission")
			Thread.sleep(2000)
			driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click()
		}
		Thread.sleep(12000)
	}
	@Keyword
	def supplierPortalSubmission(){
		Actions action = new Actions(driver);
		String supplierList = "//*[@id='scs-selected-partner_listbox']/li"
		String taskList = "//*[@id='supplier-inbox-grid']//tr"
		String listOption = "//*[@id='partnerportalheader']//single-select-dropdown-list/div/span"
		String supplierName = null;
		WebElement e,e1;
		String currentTask = null;
		int type=0;
		int i1 = 1,flag=0;
		Thread.sleep(2000)
		//	waits(driver,By.xpath("//*[@id='partnerportalheader]"))
		if(driver.findElements(By.xpath(listOption)).isEmpty()){
			i1=0;
			flag=1;
		}
		List<WebElement> listSupp = driver.findElements(By.xpath(supplierList));
		println "Supplier Size - "+listSupp.size()

		for(i1;i1<listSupp.size()+1;i1++){ // CAN CHANGE
			if(flag==0){
				click(driver,By.xpath(listOption))
				Thread.sleep(2000)
				e= driver.findElement(By.xpath("//*[@id='scs-selected-partner_listbox']/li["+i1+"]"))
				supplierName = driver.findElement(By.xpath("//*[@id='scs-selected-partner_listbox']/li["+i1+"]/div/div[1]")).getText()
				println "Supplier "+i1+" Name - "+supplierName
				action.moveToElement(e).click().build().perform()
				Thread.sleep(7000)
			}
			List<WebElement> listTask = driver.findElements(By.xpath(taskList));
			for(int j=1;j<listTask.size();j++){
				Robot hal = new Robot();
				Random random = new Random();
				//	hal.delay(1000 * 60);
				int x = random.nextInt() % 640;
				int y = random.nextInt() % 480;
				hal.mouseMove(x,y);

				waitToClick(driver, By.xpath("//*[@id='supplier-inbox-grid']//tr[1]/td[3]/span"))
				type=getTaskType()
				e1 = driver.findElement(By.xpath("//*[@id='supplier-inbox-grid']//tr[1]/td[3]/span"))
				currentTask = e1.getText()
				println "Current Task - "+currentTask
				waitToClick(driver, By.xpath("//*[@id='supplier-inbox-grid']//tr[1]/td[3]/span"))
				action.moveToElement(e1).doubleClick().build().perform()
				Thread.sleep(6000)
				if(type==0){
					submitForm()
				}
				if(type==1){
					uploadDocument()
				}
				if(type==2){
					signACK()
				}

			}
			Thread.sleep(4000)
		}
	}
}