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
import org.openqa.selenium.support.ui.ExpectedConditions

class Submission{

	WebDriver driver =  DriverFactory.getWebDriver();

	DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("h:mm a");
	DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MM/dd/yyyy h:mm a");
	static String path = PathUtil.relativeToAbsolutePath("../SafetyChain-Test-Automation-Katalon/SCTestData", RunConfiguration.getProjectDir())
	static List<String> allParagraph = new ArrayList<String>();
	static List<String> allNumber = new ArrayList<String>();
	static List<String> allSelectOne = new ArrayList<String>();
	static List<String> allSelectMul = new ArrayList<String>();
	static List<String> allElement = new ArrayList<String>();
	static List<String> allComments = new ArrayList<String>();

	static int flag1=0


	public void setValue(WebElement element,String value){
		Actions action = new Actions(driver);
		action.moveToElement(element).sendKeys(value).build.perform()
	}
	public void click(WebDriver driver, By by) {
		WebElement element = driver.findElement(by);
		Actions action = new Actions(driver);
		(new WebDriverWait(driver,45)).until(ExpectedConditions.elementToBeClickable(by));
		Thread.sleep(1000)
		action.moveToElement(element).click().build().perform()
	}
	public void click(WebElement element) {
		Actions action = new Actions(driver);
		(new WebDriverWait(driver,45)).until(ExpectedConditions.elementToBeClickable(element));
		Thread.sleep(1000)
		action.moveToElement(element).click().build().perform()
	}
	public void doubleClick(WebDriver driver, By by) {
		WebElement element = driver.findElement(by);
		Actions action = new Actions(driver);
		(new WebDriverWait(driver,45)).until(ExpectedConditions.elementToBeClickable(by));
		Thread.sleep(1000)
		action.moveToElement(element).doubleClick().build().perform()
	}
	public void waitToClick(WebDriver driver, By by) {
		(new WebDriverWait(driver,45)).until(ExpectedConditions.elementToBeClickable(by));
	}
	public void waits(WebDriver driver, By by) {
		(new WebDriverWait(driver,45)).until(ExpectedConditions.visibilityOfElementLocated(by));
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

		if(flag1==1){
			driver.findElement(By.xpath(selectFile)).sendKeys(path+"/Lighthouse.jpg")
			Thread.sleep(2000)
			driver.findElement(By.xpath(comment)).sendKeys("Task is to upload Right file.")
			flag1 = 0;
		}else{
			driver.findElement(By.xpath(selectFile)).sendKeys(path+"/Tulips.jpg")
			Thread.sleep(2000)
			driver.findElement(By.xpath(comment)).sendKeys("Task is to upload file.")
		}
		driver.findElement(By.xpath(date)).sendKeys(todaydate)
		Thread.sleep(2000)
		click(driver,By.xpath(upload))
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
		allParagraph = new ArrayList<String>();
		allNumber = new ArrayList<String>();
		allSelectOne = new ArrayList<String>();
		allSelectMul = new ArrayList<String>();
		allElement = new ArrayList<String>();
		allComments = new ArrayList<String>();
		Thread.sleep(2000)
		int cnt=0;
		String openLoc = "//*[@id='scs-header-level']/div[1]/div/span/span/span[2]";
		List<WebElement> allLoc;
		if(!driver.findElements(By.xpath(openLoc)).isEmpty()){
			if(driver.findElement(By.xpath(openLoc)).isDisplayed()){
				click(driver,By.xpath(openLoc))
				Thread.sleep(2000)
				click(driver,By.xpath("/html/body/div/div/div/ul[@aria-live='off']/li[1]"))
				Thread.sleep(2000)
				click(driver,By.xpath("//*[@id='scs-header-level']/div[2]/div/span/span/span[2]"))
				Thread.sleep(2000)
				List<WebElement> options = driver.findElements(By.xpath("/html/body/div/div/div/ul[@aria-live='polite']/li[1]"))
				while(cnt<options.size()){
					println "Field - "+options.get(cnt).getText()
					if(options.get(cnt).isDisplayed()){
						println "Field Displayed - "+options.get(cnt).getText()
						options.get(cnt).click()
						break;
					}
					cnt++;

				}
				Thread.sleep(2000)
			}
		}
		Thread.sleep(3000)
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
		if(flag1==0){
			for(int i=0;i<total.size();i++){
				n= Math.random()*100
				fieldId = total.get(i).getAttribute("data-field").toString()
				status = right(fieldId)
				type = getFieldType(fieldId)
				//	println type
				if(total.get(i).isDisplayed() && status){
					if(type=="FreeText" || type=="SingleLineText"){
						driver.findElement(By.xpath("//*[@id='scs-form-level']//div[@data-field='"+fieldId+"']//input")).sendKeys("This is Text")
						allElement.add("This is Text")
						Thread.sleep(2000)
					}
					if(type=="Paragraph"){
						driver.findElement(By.xpath("//*[@id='scs-form-level']//div[@data-field='"+fieldId+"']//textarea")).sendKeys("This is Paragraph")
						allParagraph.add("This is Paragraph")
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
						//	println driver.findElement(By.xpath("//div["+c+"]//ul/li[@data-offset-index='0']")).getText().toString()
						allSelectOne.add(driver.findElement(By.xpath("//div["+c+"]//ul/li[@data-offset-index='0']")).getText().toString())
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
						allSelectMul.add(driver.findElement(By.xpath("//div["+c+"]//ul/li[@data-offset-index='0']")).getText().toString())
						driver.findElement(By.xpath("//div["+c+"]//ul/li[@data-offset-index='0']")).click()
						Thread.sleep(2000)
					}
					if(type=="Numeric"){
						driver.findElement(By.xpath("//*[@id='scs-form-level']//div[@data-field='"+fieldId+"']//input")).sendKeys("1")
						Thread.sleep(2000)

						driver.findElement(By.xpath("//*[@id='scs-form-level']//div[@data-field='"+fieldId+"']//span[@title='Increase value']")).click()
						//	driver.findElement(By.xpath("//*[@data-fieldtype='Numeric']//span[@title='Increase value']")).click()
						allNumber.add("2")
						Thread.sleep(2000)
					}
					if(type=="Date"){
						driver.findElement(By.xpath("//*[@id='scs-form-level']//div[@data-field='"+fieldId+"']//input")).sendKeys(date)
						allElement.add(date)
						Thread.sleep(2000)
					}
					if(type=="Time"){
						driver.findElement(By.xpath("//*[@id='scs-form-level']//div[@data-field='"+fieldId+"']//input")).sendKeys(time)
						allElement.add(time)
						Thread.sleep(2000)
					}
					if(type=="DateTime"){
						driver.findElement(By.xpath("//*[@id='scs-form-level']//div[@data-field='"+fieldId+"']//input")).sendKeys(dateTime)
						allElement.add(dateTime)
						Thread.sleep(2000)
					}
				}


			}
			for(int i=0;i<totalFileIn.size();i++){
				fieldId = totalFileIn.get(i).getAttribute("id").toString()
				if(driver.findElement(By.xpath("//div[input[@id='"+fieldId+"']]")).isDisplayed()){
					totalFileIn.get(i).sendKeys(path+"/Tulips.jpg")
					Thread.sleep(6000)
				}
			}
			for(int i=0;i<totalComment.size();i++){
				if(totalComment.get(i).isDisplayed()){
					totalComment.get(i).sendKeys("This is automatic comment")
					Thread.sleep(1000)
					allComments.add("This is automatic comment")
				}
			}
		}
		if(!driver.findElements(By.xpath("//*[@id='breadCrumb']/span/span/a[contains(text(),'Resource Browser')]")).isEmpty()){
			if(driver.findElement(By.xpath("//*[@id='breadCrumb']/span/span/a[contains(text(),'Resource Browser')]")).isDisplayed()){
				click(driver,By.xpath("//*[@id='scs-submit-form-button']"))
				Thread.sleep(5000)
				click(driver,By.xpath("//button[contains(text(),'OK')]"))
			}
		}else{
			if(flag1==0){
				click(driver, By.xpath("//i[@class='fa fa-paperclip']"))
				Thread.sleep(2000)
				waitToClick(driver,By.xpath("//*[@id='scs-formlevelfiles-container']/div/div/div/span"))
				driver.findElement(By.xpath("//*[@id='formlevelfiles']")).sendKeys(path+"/Lighthouse.jpg")
				Thread.sleep(9000)
				click(driver, By.xpath("//button[contains(text(),'CLOSE')]"))
			}
			Thread.sleep(3000)
			//	if(!driver.findElements(By.xpath("//*[@id='scs-save-form-button']")).isEmpty()){
			//		click(driver,By.xpath("//*[@id='scs-save-form-button']"))
			//	}
			click(driver,By.xpath("//*[@id='scs-submit-form-button']"))
			Thread.sleep(3000)
			if(!driver.findElements(By.xpath("//*[@id='scs-form-resubmission-note']")).isEmpty()){
				if(flag1==1){
					driver.findElement(By.xpath("//*[@id='scs-form-resubmission-note']")).sendKeys("Automatic Form Re - Submission")
					flag1=0;
					Thread.sleep(2000)
				}else{
					driver.findElement(By.xpath("//*[@id='scs-form-resubmission-note']")).sendKeys("Automatic Form Submission")
					Thread.sleep(2000)
				}
			}
			driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click()

		}
		Thread.sleep(12000)
	}
	@Keyword
	def fillForm(){
		Thread.sleep(2000)
		int cnt=0;
		String openLoc = "//*[@id='scs-header-level']/div[1]/div/span/span/span[2]";
		List<WebElement> allLoc;
		if(!driver.findElements(By.xpath(openLoc)).isEmpty()){
			if(driver.findElement(By.xpath(openLoc)).isDisplayed()){
				click(driver,By.xpath(openLoc))
				Thread.sleep(2000)
				click(driver,By.xpath("/html/body/div/div/div/ul[@aria-live='off']/li[1]"))
				Thread.sleep(2000)
				click(driver,By.xpath("//*[@id='scs-header-level']/div[2]/div/span/span/span[2]"))
				Thread.sleep(2000)
				List<WebElement> options = driver.findElements(By.xpath("/html/body/div/div/div/ul[@aria-live='polite']/li[1]"))
				while(cnt<options.size()){
					if(options.get(cnt).isDisplayed()){
						options.get(cnt).click()
						break;
					}
				}
				Thread.sleep(2000)
			}
		}
		Thread.sleep(3000)
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
		if(flag1==0){
			for(int i=0;i<total.size();i++){
				n= Math.random()*100
				fieldId = total.get(i).getAttribute("data-field").toString()
				status = right(fieldId)
				type = getFieldType(fieldId)
				//	println type
				if(total.get(i).isDisplayed() && status){
					if(type=="FreeText" || type=="SingleLineText"){
						driver.findElement(By.xpath("//*[@id='scs-form-level']//div[@data-field='"+fieldId+"']//input")).sendKeys("MyTest")
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
						driver.findElement(By.xpath("//*[@id='scs-form-level']//div[@data-field='"+fieldId+"']//input")).sendKeys("1")
						Thread.sleep(2000)
						driver.findElement(By.xpath("//*[@id='scs-form-level']//div[@data-field='"+fieldId+"']//span[@title='Increase value']")).click()
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
		}
	}
	@Keyword
	def formSubmission(){
		submitForm()
	}
	@Keyword
	def supplierPortalSubmission(){
		Actions action = new Actions(driver);
		String supplierList = "//*[@id='scs-selected-partner_listbox']/li"
		String taskList = "//*[@id='supplier-inbox-grid']//tr"
		String listOption = "//*[@id='partnerportalheader']//single-select-dropdown-list/div/span"
		String rejected = "//*[@id='supplier-inbox-grid']//tr[1]/td[3]/strong[contains(text(),'Rejected')]"
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
				if(!driver.findElements(By.xpath(rejected)).isEmpty()){
					if(driver.findElement(By.xpath(rejected)).isDisplayed()){
						println "Rejected Task"
						flag1 = 1;
					}
				}
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
	@Keyword
	def createResource(){
		Thread.sleep(2000);
		List<WebElement> allInput = driver.findElements(By.xpath("//input[@class='field-prop-value scs-fieldcontainer-input scs-manage-res-text-input ng-pristine ng-untouched ng-valid ng-empty ng-valid-maxlength ng-valid-required' or @class='field-prop-value scs-fieldcontainer-input scs-manage-res-text-input ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required ng-valid-maxlength requiredFields']"))
		List<WebElement> allNum = driver.findElements(By.xpath("//*[@class='k-numeric-wrap k-state-default']//input"))
		//	List<WebElement> allSelectOne = driver.findElements(By.xpath("//span[@aria-label='select']"))
		List<WebElement> allSelectOne = driver.findElements(By.xpath("//*[@id='scsResourceDetails']/ul/li/div/span/span/span[2]"))
		List<WebElement> selectLastOption = driver.findElements(By.xpath("//body/div/div/div/ul/li[last()]"))
		List<WebElement> selectFirstOption =driver.findElements(By.xpath("//form[@id='scsResourceDetails']//input[@placeholder='Select...']"))
		//*[@class='k-numeric-wrap k-state-default']//span[@title='Increase value']
		boolean st = false;
		for(int i=0;i<allInput.size();i++){
			allInput.get(i).sendKeys("Automatic Test Text")
			Thread.sleep(2000);
		}
		for(int i=0;i<allNum.size();i++){
			if(allNum.get(i).isDisplayed()){
				allNum.get(i).sendKeys("8")
				//allNum.get(i).click()
				Thread.sleep(2000);
			}
		}
		Thread.sleep(4000);
		int p=0;
		for(int i=0;i<selectFirstOption.size();i++){
			while(true){
				p++;
				if(!driver.findElements(By.xpath("//*[@id='scsResourceDetails']/ul/li["+p+"]/div/span/span/span[2]/span")).isEmpty()){
					if(driver.findElement(By.xpath("//*[@id='scsResourceDetails']/ul/li["+p+"]/div/span/span/span[2]/span")).isDisplayed()){
						driver.findElement(By.xpath("//*[@id='scsResourceDetails']/ul/li["+p+"]/div/span/span/span[2]/span")).click()
						Thread.sleep(3000);
						//	driver.findElement(By.xpath("//*[@id='scsResourceDetails']/ul/li["+p+"]/div/span/span/input")).click()
						driver.findElement(By.xpath("//*[@id='scsResourceDetails']/ul/li["+p+"]/div/span/span/input")).sendKeys(Keys.ARROW_DOWN)
						Thread.sleep(3000);
						driver.findElement(By.xpath("//*[@id='scsResourceDetails']/ul/li["+p+"]/div/span/span/input")).sendKeys(Keys.ENTER)
						Thread.sleep(2000);
						break;
						/*	selectFirstOption.get(i).click()
						 Thread.sleep(2000);
						 selectFirstOption.get(i).sendKeys(Keys.ARROW_DOWN)
						 Thread.sleep(2000);
						 selectFirstOption.get(i).sendKeys(Keys.ENTER)
						 Thread.sleep(2000); */
					}
				}

			}
			Thread.sleep(2000);

		}
		/*	for(int i=0;i<allSelectOne.size();i++){
		 allSelectOne.get(i).click()
		 Thread.sleep(2000);
		 for(int j=0;i<selectLastOption.size();j++){
		 if(selectLastOption.get(j).isDisplayed()){
		 selectLastOption.get(j).click()
		 Thread.sleep(2000);
		 break;
		 }
		 }
		 } 	*/
	}
	@Keyword
	def testDS(){
		int c=8;
		String s = null;
		String openLoc = "//*[@id='scs-header-level']/div[1]/div/span/span/span[2]";
		String openRes = "//*[@id='scs-header-level']/div[2]/div/span/span/span[2]"
		click(driver,By.xpath(openLoc))
		Thread.sleep(2000)
		List<WebElement> locations = driver.findElements(By.xpath("/html/body/div/div/div/ul/li"))
		click(driver,By.xpath(openLoc))
		for(int i=0;i<locations.size();i++){
			click(driver,By.xpath(openLoc))
			Thread.sleep(2000)
			println locations.get(i).getText()
			s = findTestData('LocationData').getValue('SubLocationName',1+i).toString()
			println s
			if(s==locations.get(i).getText()){
				println "Correct Location "+(i+1)
			}else{
				throw new com.kms.katalon.core.exception.StepFailedException()
			}
			click(locations.get(i))
			Thread.sleep(2000)
			click(driver,By.xpath(openRes))
			Thread.sleep(2000)
			List<WebElement> resources = driver.findElements(By.xpath("//*[@id='resrcDrpdown_listbox']/li"))
			click(driver,By.xpath(openRes))
			for(int j=0;j<resources.size();j++){
				click(driver,By.xpath(openRes))
				Thread.sleep(2000)
				println resources.get(j).getText()
				s = findTestData('LocationData').getValue(c, 1)
				println s

				if(s==resources.get(j).getText()){
					println "Correct Resource "+(j+1)
				}else{
					throw new com.kms.katalon.core.exception.StepFailedException()
				}
				click(resources.get(j))
				Thread.sleep(2000)
				c = c+ 4;
			}
			c = 10
			Thread.sleep(2000)
		}
	}

	@Keyword
	def docUploadAdmin(){
		String resCat = findTestData('LocationData').getValue(3,1).toString()
		String res = findTestData('LocationData').getValue(8,1).toString()

		click(driver, By.xpath("//*[@id='scs-documentmgmt-left-panel']/div/span/span/span[2]"))
		Thread.sleep(4000)
		click(driver,By.xpath("//*[@id='scs-product-dropdown_listbox']/li[2]/span"))
		Thread.sleep(8000)
		/*	click(driver, By.xpath("//*[@id='scs-left-panel-treeview']/ul/li/ul/li//div[span/span/span[contains(text(),'"+resCat+"')]]/span[1]"))
		 Thread.sleep(4000)
		 click(driver,By.xpath("//*[@id='scs-left-panel-treeview']/ul/li/ul/li/ul/li//span[contains(text(),'"+res+"')]"))
		 Thread.sleep(4000)
		 driver.findElement(By.xpath("//*[@id='scs-document-file-upload-input']")).sendKeys(path+"/Tulips.jpg") */
	}
	@Keyword
	def verifyDocInUSer(){
		String fileName = "Lighthouse.jpg";
		waitToClick(driver, By.xpath("//*[@id='scs-documents-grid']/div/table/tbody/tr[1]/td[3]"))
		String text = driver.findElement(By.xpath("//*[@id='scs-documents-grid']/div/table/tbody/tr[1]/td[3]")).getText().toString()
		if(text==fileName){
			println "Verified"
		}	else{
			throw new com.kms.katalon.core.exception.StepFailedException()
		}
		/*	click(driver, By.xpath("//*[@id='scs-left-panel-treeview']/ul/li/ul/li//div[span/span/span[contains(text(),'"+resCat+"')]]/span[1]"))
		 Thread.sleep(4000)
		 click(driver,By.xpath("//*[@id='scs-left-panel-treeview']/ul/li/ul/li/ul/li//span[contains(text(),'"+res+"')]"))
		 Thread.sleep(4000)
		 driver.findElement(By.xpath("//*[@id='scs-document-file-upload-input']")).sendKeys(path+"/Tulips.jpg") */
	}

	@Keyword
	def verifyData(){
		List<WebElement> paragraphElement = driver.findElements(By.xpath("//div[@ng-if=\"(field.Type === 'Paragraph')\"]/span"));
		List<WebElement> selectoneElement = driver.findElements(By.xpath("//div[@ng-if=\"(field.Type === 'SelectOne')\"]/span"));
		List<WebElement> selectMulElement = driver.findElements(By.xpath("//div[@ng-if=\"(field.Type === 'SelectMultiple')\"]/span"));
		List<WebElement> numericElement = driver.findElements(By.xpath("//div[@ng-if=\"(field.Type === 'Numeric' || field.Type === 'Aggregate')\"]/span[1]"));
		List<WebElement> element = driver.findElements(By.xpath("//div[@ng-if=\"(field.Type === 'Date' || field.Type === 'Time' || field.Type === 'DateTime' || field.Type === 'SingleLineText' || field.Type === 'FreeText')\"]/span"));
		List<WebElement> commentElement = driver.findElements(By.xpath("//div[@ng-if=\"(field.AllowComments && field.Comment)\"]/div[2]"));
		for(int i=0;i<allSelectOne.size();i++){
			String s1 = allSelectOne.get(i).toString()
			String s2 = selectoneElement.get(i).getText().toString()
			if(s1.equals(s2)){
				println "Select One Matches."
			}else{
				println "Not Matched."
			}
		}
		for(int i=0;i<allSelectMul.size();i++){
			String s1 = allSelectMul.get(i).toString()
			String s2 = selectMulElement.get(i).getText().toString()
			if(s1.equals(s2)){
				println "Select Multiple Matches."
			}else{
				println "Not Matched."
			}
		}
		for(int i=0;i<allParagraph.size();i++){
			String s1 = allParagraph.get(i).toString()
			String s2 = paragraphElement.get(i).getText().toString()
			if(s1.equals(s2)){
				println "Paragraph  Matches."
			}else{
				println "Not Matched."
			}
		}
		for(int i=0;i<allNumber.size();i++){
			String s1 = allNumber.get(i).toString()
			String s2 = numericElement.get(i).getText().toString()
			if(s1.equals(s2)){
				println "Numeric Matches."
			}else{
				println "Not Matched."
			}
		}
		for(int i=0;i<allElement.size();i++){
			String s1 = allElement.get(i).toString()
			String s2 = element.get(i).getText().toString()
			if(s1.equals(s2)){
				println "Matches."
			}else{
				println s1
				println s2
				println "Not Matched."
			}
		}
		for(int i=0;i<allComments.size();i++){
			String s1 = allComments.get(i).toString()
			String s2 = commentElement.get(i).getText().toString()
			if(s1.equals(s2)){
				println "Comment Matches."
			}else{
				println s1
				println s2
				println "Not Matched."
			}
		}
	}


}