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

	WebDriver driver = DriverFactory.getWebDriver();
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy-HH:mm");
	LocalDateTime now = LocalDateTime.now();
	public String supplier_name = "SuppReq_"+dtf.format(now);
	public String item_name = "ItemReq_"+dtf.format(now);
	public String user_name = "Supplier_"+dtf.format(now);
	public String password = "password"
	public String newPassword = "password@123#"
	public String wgName = "WorkGroup_"+dtf.format(now);
	public String formTaskName = "TestFormTask_"+dtf.format(now);
	public String documentTaskName = "TestDocTask_"+dtf.format(now);
	public String ackTaskName = "TestACKTask_"+dtf.format(now);
	static String path = PathUtil.relativeToAbsolutePath("../SafetyChain-Test-Automation-Katalon/SCTestData", RunConfiguration.getProjectDir())

	@Keyword
	def refreshBrowser() {
		KeywordUtil.logInfo("Refreshing")
		WebDriver webDriver = DriverFactory.getWebDriver()
		webDriver.navigate().refresh()
		KeywordUtil.markPassed("Refresh successfully")
	}

	public static void click(WebDriver driver, By by) {
		(new WebDriverWait(driver,30)).until(ExpectedConditions.elementToBeClickable(by));
		driver.findElement(by).click();
	}
	public static void waits(WebDriver driver, By by) {
		(new WebDriverWait(driver,30)).until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	@Keyword
	def getSupplierName(){
		//driver.findElement(By.xpath("//*[@id='scs-popup']//div[div[contains(text(),'User Name')]]//div[2]/input"))
		FileInputStream file = new FileInputStream (new File(path+"/location.xlsx"))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String suppName = sheet.getRow(1).getCell(13).toString();
		println suppName;
		String path1 = "//*[@id='scs-add-new-user-supplier-dropdown_listbox']/li/span[contains(text(),'"+suppName+"')]"
		click(driver,By.xpath(path1))
		file.close();

	}
	@Keyword
	def selectForm(){
		Thread.sleep(4000)
		//driver.findElement(By.xpath("//*[@id='scs-popup']//div[div[contains(text(),'User Name')]]//div[2]/input"))
		FileInputStream file = new FileInputStream (new File(path+"/data.xlsx"))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String s = sheet.getRow(1).getCell(8).toString()
		println s
		Actions action = new Actions(driver);
		String path1 = "//*[@id='scs-pp-acknowledgement-step-1-grid-container']/div/table/tbody/tr[td[contains(text(),'"+s+"')]]/td[1]/input/following-sibling::label"
		WebElement element = driver.findElement(By.xpath(path1))
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
		/*	String path = "//*[@id='scs-pp-acknowledgement-step-1-grid-container']/div/table/tbody/tr[td[contains(text(),'"+s+"')]]/td[1]/input/following-sibling::label"
		 String path1 = "//*[@id='scs-pp-acknowledgement-step-1-grid-container']/div/table/tbody/tr[td[contains(text(),'"+s+"')]]/td[1]"
		 file.close();
		 Actions action = new Actions(driver);
		 WebElement element = driver.findElement(By.xpath(path))
		 WebElement element1 = driver.findElement(By.xpath(path1))
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
	def selectDocument(){
		Thread.sleep(4000)
		String path1 = "//*[@id='scs-pp-acknowledgement-step-1-grid-container']//tr[1]/td[1]/input/following-sibling::label"
		String namePath = "//*[@id='scs-pp-acknowledgement-step-1-grid-container']//tr[1]/td[2]"
		WebElement element = driver.findElement(By.xpath(path1))
		String docName = driver.findElement(By.xpath(namePath)).getText().toString()
		/*	FileInputStream file = new FileInputStream (new File(path+"/SupplierCred.xlsx"))
		 XSSFWorkbook workbook = new XSSFWorkbook(file);
		 XSSFSheet sheet = workbook.getSheetAt(0);
		 file.close();
		 FileOutputStream outFile =new FileOutputStream(new File(path+"/SupplierCred.xlsx"));
		 sheet.getRow(1).createCell(6).setCellValue(docName);
		 workbook.write(outFile);
		 outFile.close();
		 */
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}

	@Keyword
	def selectACK(){
		Thread.sleep(4000)
		String path1 = "//*[@id='scs-pp-acknowledgement-step-1-grid-container']//tr[1]/td[1]/input/following-sibling::label"
		String namePath = "//*[@id='scs-pp-acknowledgement-step-1-grid-container']//tr[1]/td[3]"
		WebElement element = driver.findElement(By.xpath(path1))
		String taskName = driver.findElement(By.xpath(namePath)).getText().toString()
		/*	FileInputStream file = new FileInputStream (new File(path+"/SupplierCred.xlsx"))
		 XSSFWorkbook workbook = new XSSFWorkbook(file);
		 XSSFSheet sheet = workbook.getSheetAt(0);
		 file.close();
		 FileOutputStream outFile =new FileOutputStream(new File(path+"/SupplierCred.xlsx"));
		 sheet.getRow(1).createCell(7).setCellValue(taskName);
		 workbook.write(outFile);
		 outFile.close();
		 */
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}

	@Keyword
	def selectNewSupplier(){
		Actions action = new Actions(driver);
		FileInputStream file = new FileInputStream (new File(path+"/location.xlsx"))
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
			if(driver.findElements(By.xpath("//*[@id='scs-add-supplier-grid-container']/div/table/tbody/tr["+i+"]/td[2]")).isEmpty()){
				s1=driver.findElement(By.xpath("//*[@id='scs-add-supplier-grid-container']/div[3]/table/tbody/tr["+i+"]/td")).getAttribute("innerHTML");
			}else{
				s1=driver.findElement(By.xpath("//*[@id='scs-add-supplier-grid-container']/div/table/tbody/tr["+i+"]/td[2]")).getAttribute("innerHTML");
			}
			//	s1=driver.findElement(By.xpath("//*[@id='scs-add-supplier-grid-container']/div[3]/table/tbody/tr["+i+"]/td")).getAttribute("innerHTML");
			//		s1=driver.findElement(By.xpath("//div[@id='scs-add-supplier-grid-container']/div[2]/table/tbody/tr["+i+"]/td[2]")).getAttribute("innerHTML");
			//	s1=driver.findElement(By.xpath("//*[@id='scs-add-supplier-grid-container']/div[3]/table/tbody/tr["+i+"]/td")).getAttribute("innerHTML");
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
	def selectNewItem(){
		Actions action = new Actions(driver);
		FileInputStream file = new FileInputStream (new File(path+"/location.xlsx"))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String s = sheet.getRow(1).getCell(10).toString()
		println "Y-"+s
		String namePath = "//*[@id='scs-add-supplier-grid-container']/div[3]/table/tbody/tr/td";
		String selectPath = "//*[@id='scs-add-supplier-grid-container']/div[2]/table/tbody/tr/td/input";
		List<WebElement> elements = driver.findElements(By.xpath(namePath));
		String s1;
		int t=0
		for(int i=1;i<elements.size();i++){
			if(driver.findElements(By.xpath("//div[@id='scs-add-supplier-grid-container']/div/table/tbody/tr["+i+"]/td[2]")).isEmpty()){
				s1=driver.findElement(By.xpath("//div[@id='scs-add-supplier-grid-container']/div[3]/table/tbody/tr["+i+"]/td")).getAttribute("innerHTML");
			}else{
				s1=driver.findElement(By.xpath("//div[@id='scs-add-supplier-grid-container']/div/table/tbody/tr["+i+"]/td[2]")).getAttribute("innerHTML");
			}
			//	s1=driver.findElement(By.xpath("//*[@id='scs-add-supplier-grid-container']/div[3]/table/tbody/tr["+i+"]/td")).getAttribute("innerHTML");
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
		////*[@id="scs-pp-acknowledgment-container"]/div[2]/div[2]/div[2]/span
		//driver.findElement(By.xpath("//*[@id='scs-popup']//div[div[contains(text(),'User Name')]]//div[2]/input"))
		FileInputStream file = new FileInputStream (new File(path+"/SupplierCred.xlsx"))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		file.close();
		FileOutputStream outFile =new FileOutputStream(new File(path+"/SupplierCred.xlsx"));
		sheet.getRow(1).createCell(0).setCellValue(user_name);
		sheet.getRow(1).createCell(1).setCellValue(password);
		sheet.getRow(1).createCell(2).setCellValue(newPassword);
		sheet.getRow(1).createCell(4).setCellValue(wgName);
		workbook.write(outFile);
		outFile.close();

	}
	@Keyword
	def setWG(){
		////*[@id="scs-pp-acknowledgment-container"]/div[2]/div[2]/div[2]/span
		//driver.findElement(By.xpath("//*[@id='scs-popup']//div[div[contains(text(),'User Name')]]//div[2]/input"))
		FileInputStream file = new FileInputStream (new File(path+"/SupplierCred.xlsx"))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		file.close();
		FileOutputStream outFile =new FileOutputStream(new File(path+"/SupplierCred.xlsx"));
		sheet.getRow(1).createCell(4).setCellValue(wgName);
		workbook.write(outFile);
		outFile.close();

	}

	@Keyword
	def setSupplierName(){
		//driver.findElement(By.xpath("//*[@id='scs-popup']//div[div[contains(text(),'User Name')]]//div[2]/input"))
		FileInputStream file = new FileInputStream (new File(path+"/SupplierCred.xlsx"))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		file.close();
		FileOutputStream outFile =new FileOutputStream(new File(path+"/SupplierCred.xlsx"));
		sheet.getRow(1).createCell(3).setCellValue(supplier_name);
		workbook.write(outFile);
		outFile.close();

	}
	@Keyword
	def setItemName(){
		//driver.findElement(By.xpath("//*[@id='scs-popup']//div[div[contains(text(),'User Name')]]//div[2]/input"))
		FileInputStream file = new FileInputStream (new File(path+"/SupplierCred.xlsx"))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		file.close();
		FileOutputStream outFile =new FileOutputStream(new File(path+"/SupplierCred.xlsx"));
		sheet.getRow(1).createCell(8).setCellValue(item_name);
		workbook.write(outFile);
		outFile.close();

	}
	@Keyword
	def selectSupplierTask(){
		Actions action = new Actions(driver);
		//driver.findElement(By.xpath("//*[@id='scs-popup']//div[div[contains(text(),'User Name')]]//div[2]/input"))
		FileInputStream file = new FileInputStream (new File(path+"/data.xlsx"))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String tskName= sheet.getRow(1).getCell(1).toString()
		file.close();
		String tsknmPath = "//*[@id='supplier-inbox-grid']/div[2]/div[1]/table/tbody/tr/td[3]/span/strong[contains(text(),'"+tskName+"')]"
		WebElement ele = driver.findElement(By.xpath(tsknmPath))
		action.moveToElement(ele).doubleClick().build().perform()
	}
	public static boolean isClickable(WebDriver driver,WebElement webe){
		try{
			WebDriverWait wait = new WebDriverWait(driver, 3);
			wait.until(ExpectedConditions.elementToBeClickable(webe));
			return true;
		}catch (Exception e){
			return false;
		}
	}
	@Keyword
	def selectWG(){
		Actions action = new Actions(driver);
		//driver.findElement(By.xpath("//*[@id='scs-popup']//div[div[contains(text(),'User Name')]]//div[2]/input"))
		FileInputStream file = new FileInputStream (new File(path+"/SupplierCred.xlsx"))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String s = sheet.getRow(1).getCell(4).toString()
		file.close();
		println s
		String path1 = "//li[contains(text(),'"+s+"')]"
		println path1
		Thread.sleep(2000)
		//waits(driver, By.xpath(path))
		//		WebElement ele = driver.findElement(By.xpath(path));
		List<WebElement> allWG = driver.findElements(By.xpath(path1));
		for(int i=0;i<allWG.size();i++){
			if(isClickable(driver,allWG.get(i))){
				action.moveToElement(allWG.get(i)).click().build().perform()
				break;
			}
		}


	}
	@Keyword
	def selectTaskInInbox(){
		Actions action = new Actions(driver);
		//driver.findElement(By.xpath("//*[@id='scs-popup']//div[div[contains(text(),'User Name')]]//div[2]/input"))
		/*	FileInputStream file = new FileInputStream (new File(path+"/data.xlsx"))
		 XSSFWorkbook workbook = new XSSFWorkbook(file);
		 XSSFSheet sheet = workbook.getSheetAt(0);
		 String s = sheet.getRow(1).getCell(1).toString()
		 file.close(); */
		Thread.sleep(2000)
		String path1 = "//*[@id='scs-inbox-grid-container']//tr[1]/td[3]"
		WebElement ele = driver.findElement(By.xpath(path1));
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
		String supplierName = null;
		WebElement e;
		Thread.sleep(2000)
		//waits(driver,By.xpath(supplierList))
		List<WebElement> listSupp = driver.findElements(By.xpath(supplierList));
		println "Supplier Size - "+listSupp.size()
		for(int i=1;i<listSupp.size()+1;i++){ // CAN CHANGE
			click(driver,By.xpath(listOption))
			//	driver.findElement(By.xpath(listOption)).click()
			Thread.sleep(4000)
			//	waits(driver,By.xpath("//*[@id='scs-selected-partner_listbox']/li["+i+"]"))
			e= driver.findElement(By.xpath("//*[@id='scs-selected-partner_listbox']/li["+i+"]"))
			supplierName = driver.findElement(By.xpath("//*[@id='scs-selected-partner_listbox']/li["+i+"]/div/div[1]")).getText()
			println "Supplier "+i+" Name - "+supplierName
			action.moveToElement(e).click().build().perform()
			Thread.sleep(7000)
			List<WebElement> element = driver.findElements(By.xpath(iconPath));
			//println elements.size()
			for(int j=0;j<element.size();j++){
				Thread.sleep(2000)
				List<WebElement> elements = driver.findElements(By.xpath(iconPath));
				List<WebElement> name = driver.findElements(By.xpath(taskName));
				Thread.sleep(2000)
				println "Current Task - "+name.get(0).getText()
				action.moveToElement(elements.get(0)).doubleClick().build().perform()
				Thread.sleep(6000)
				//waits(driver, By.xpath(selectFile))
				driver.findElement(By.xpath(selectFile)).sendKeys("D:\\Git Data\\SafetyChain-Test-Automation-Katalon\\SCTestData\\Tulips.jpg")
				Thread.sleep(2000)
				driver.findElement(By.xpath(comment)).sendKeys("Task is to upload file.")
				driver.findElement(By.xpath(date)).sendKeys("12/18/2018")
				Thread.sleep(2000)
				driver.findElement(By.xpath(upload)).click()
				Thread.sleep(10000)
			}
			//	driver.findElement(By.xpath(openperPageOption)).click()
			//	Thread.sleep(2000)
			//	driver.findElement(By.xpath(select500)).click()
			//	Thread.sleep(6000)
		}
		//	driver.findElement(By.xpath(listOption)).click()

		//	List<WebElement> elements = driver.findElements(By.xpath(iconPath));
		//	println elements.size()
		//	for(int i=0;i<elements.size();i++){
		//	action.moveToElement(elements.get(i)).click().build().perform()
		//	Thread.sleep(2000)
		//	}
	}
	public String getFieldType(String fieldId){
		String type= driver.findElement(By.xpath("//*[@id='scs-form-level']//div[@data-field='"+fieldId+"']")).getAttribute("data-fieldtype").toString()
		return type;

	}
	public boolean right(String fieldId){
		boolean status = driver.findElements(By.xpath("//*[@id='scs-form-level']//div[@data-field='"+fieldId+"']//i[@class='fa fa-circle-o']")).isEmpty()
		return !status;

	}
	public boolean check(String path1){
		boolean status = false;
		boolean elements = driver.findElements(By.xpath(path1)).isEmpty()
		boolean element;
		boolean element1;
		if(!elements){
			//	println "AP"
			element = driver.findElement(By.xpath(path1)).isDisplayed()
			element1 = driver.findElement(By.xpath(path1)).isEnabled()
			if(element && element1){
				println path1
				status = true;
			}
		}
		return status;

	}

	@Keyword
	def searchDocument1(){
		Actions action = new Actions(driver);
		String supplierList = "//*[@id='scs-selected-partner_listbox']/li"
		String iconPath = "//*[@id='supplier-inbox-grid']//i[@class='fa fa-file-text-o']";
		String taskName = "//*[@id='supplier-inbox-grid']//tr[td//i[@class='fa fa-file-text-o']]/td[3]/span";
		String listOption = "//*[@id='partnerportalheader']//single-select-dropdown-list/div/span"
		String openperPageOption = "//*[@id='supplier-inbox-grid']/div[3]/span[1]/span/span/span[1]"
		String select500 = "/html/body/div/div/div/ul/li[contains(text(),'500')]";
		String selectFile = "//*[@id='scs-upload-new-doc-dms-body-popup']//div[1]/input"
		String supplierName = null;
		WebElement e;
		Thread.sleep(2000)
		WebElement ele,e1;
		String s = null;
		int i=0;
		List<WebElement> listSupp = driver.findElements(By.xpath(supplierList));
		println "Supplier Size - "+listSupp.size()
		for(int i1=1;i1<listSupp.size()+1;i1++){ // CAN CHANGE
			click(driver,By.xpath(listOption))
			Thread.sleep(4000)
			e= driver.findElement(By.xpath("//*[@id='scs-selected-partner_listbox']/li["+i1+"]"))
			supplierName = driver.findElement(By.xpath("//*[@id='scs-selected-partner_listbox']/li["+i1+"]/div/div[1]")).getText()
			println "Supplier "+i1+" Name - "+supplierName
			action.moveToElement(e).click().build().perform()
			Thread.sleep(7000)
			List<WebElement> element = driver.findElements(By.xpath(iconPath));
			for(int j=0;j<element.size();j++){
				Thread.sleep(2000)
				List<WebElement> elements = driver.findElements(By.xpath(iconPath));
				List<WebElement> name = driver.findElements(By.xpath(taskName));
				Thread.sleep(2000)
				println "Current Task - "+name.get(0).getText()
				action.moveToElement(elements.get(0)).doubleClick().build().perform()
				Thread.sleep(6000)
				List<WebElement> text = driver.findElements(By.xpath("//*[@class='actualInput scs-field-singleText ng-pristine ng-empty ng-invalid ng-invalid-required ng-touched' or @class='actualInput scs-field-singleText ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required']"))
				List<WebElement> paragraph = driver.findElements(By.xpath("//textarea"))
				List<WebElement> numeric = driver.findElements(By.xpath("//*[@class='k-formatted-value actualInput scs-field-numeric ng-pristine ng-untouched ng-valid k-input']"))
				List<WebElement> selOneOpen = driver.findElements(By.xpath("//*[@id='scs-form-level']//span[span[input[@class='k-input actualInput scs-field-selectOne']]]/span/span[last()]"))
				List<WebElement> selMulOpen = driver.findElements(By.xpath("//*[@id='scs-form-level']//field-template/div/div/div/div/div/div"))
				List<WebElement> selOneOption =  driver.findElements(By.xpath("//*[@id='field-{{field.Id}}_listbox' and @aria-live='off']//li[1]"))
				List<WebElement> selMulOption =  driver.findElements(By.xpath("//*[@id='field-{{field.Id}}_listbox' and @aria-live='polite']/li[1]"))
				List<WebElement> date = driver.findElements(By.xpath("//*[@class='k-widget k-datepicker k-header actualInput scs-date-time-fields']//input"))
				List<WebElement> time = driver.findElements(By.xpath("//*[@class='k-widget k-timepicker k-header actualInput scs-date-time-fields']//input"))
				List<WebElement> dateTime = driver.findElements(By.xpath("//*[@class='k-widget k-datetimepicker k-header actualInput scs-date-time-fields']//input"))
				println "Text - "+text.size()


				List<WebElement> total = driver.findElements(By.xpath("//*[@id='scs-form-level']/div"))

				for(int m=1;m<total.size()+1;m++){
					if(check("//*[@id='scs-form-level']/div["+m+"]//field-template//input[@class='actualInput scs-field-singleText ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required']")){
						driver.findElement(By.xpath("//*[@id='scs-form-level']/div["+m+"]//field-template//input")).sendKeys("This is Text")
						Thread.sleep(2000)
					}
					/*	if(check("//*[@id='scs-form-level']/div["+m+"]//field-template//input[@type='file']")){
					 driver.findElement(By.xpath("//*[@id='scs-form-level']/div["+m+"]//field-template//input[@type='file']")).sendKeys("D:\\Git Data\\SafetyChain-Test-Automation-Katalon\\SCTestData\\Tulips.jpg")
					 Thread.sleep(8000)
					 } */
					if(!driver.findElements(By.xpath("//*[@id='scs-form-level']/div["+m+"]//field-template//input[@type='file']")).isEmpty()){
						if(driver.findElement(By.xpath("//*[@id='scs-form-level']/div["+m+"]//field-template//div[@class='k-button k-upload-button']")).isDisplayed()){
							driver.findElement(By.xpath("//*[@id='scs-form-level']/div["+m+"]//field-template//input[@type='file']")).sendKeys("D:\\Git Data\\SafetyChain-Test-Automation-Katalon\\SCTestData\\Tulips.jpg")
							Thread.sleep(8000)
						}
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

						/*	driver.findElement(By.xpath("//*[@id='scs-form-level']/div["+m+"]//field-template//span[@aria-controls='field-{{field.Id}}_listbox']")).click()
						 Thread.sleep(2000)
						 if(check("//*[@id='field-{{field.Id}}_listbox' and @aria-live='off']//li[1]")){
						 driver.findElement(By.xpath("//*[@id='field-{{field.Id}}_listbox' and @aria-live='off']//li[1]")).click()
						 Thread.sleep(2000)
						 }
						 */
						while(!st){
							c++;
							st = check("//div["+c+"]//ul/li[@data-offset-index='0']")
							println "//div["+c+"]//ul/li[@data-offset-index='0']"
						}
						driver.findElement(By.xpath("//div["+c+"]//ul/li[@data-offset-index='0']")).click()

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
						/*	driver.findElement(By.xpath("//*[@id='scs-form-level']/div["+m+"]//field-template//div[@class='k-multiselect-wrap k-floatwrap']")).click()
						 Thread.sleep(2000)
						 if(check("//*[@id='field-{{field.Id}}_listbox' and @aria-live='polite']/li[1]")){
						 driver.findElement(By.xpath("//*[@id='field-{{field.Id}}_listbox' and @aria-live='polite']/li[1]")).click()
						 Thread.sleep(2000)
						 } */

						while(!st){
							c++;
							st = check("//div["+c+"]//ul/li[@data-offset-index='0']")
							println "//div["+c+"]//ul/li[@data-offset-index='0']"
						}
						driver.findElement(By.xpath("//div["+c+"]//ul/li[@data-offset-index='0']")).click()
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


				Thread.sleep(10000)
			}
		}
	}

	@Keyword
	def formSubmission(){

		Actions action = new Actions(driver);
		String supplierList = "//*[@id='scs-selected-partner_listbox']/li"
		String iconPath = "//*[@id='supplier-inbox-grid']//i[@class='fa fa-file-text-o']";
		String taskName = "//*[@id='supplier-inbox-grid']//tr[td//i[@class='fa fa-file-text-o']]/td[3]/span";
		String listOption = "//*[@id='partnerportalheader']//single-select-dropdown-list/div/span"
		String openperPageOption = "//*[@id='supplier-inbox-grid']/div[3]/span[1]/span/span/span[1]"
		String select500 = "/html/body/div/div/div/ul/li[contains(text(),'500')]";
		String selectFile = "//*[@id='scs-upload-new-doc-dms-body-popup']//div[1]/input"
		String supplierName = null;
		WebElement e;
		boolean status = true;
		Thread.sleep(2000)
		WebElement ele,e1;
		String s = null;
		List<WebElement> listSupp = driver.findElements(By.xpath(supplierList));
		println "Supplier Size - "+listSupp.size()
		for(int i1=1;i1<listSupp.size()+1;i1++){ // CAN CHANGE
			click(driver,By.xpath(listOption))
			Thread.sleep(2000)
			e= driver.findElement(By.xpath("//*[@id='scs-selected-partner_listbox']/li["+i1+"]"))
			supplierName = driver.findElement(By.xpath("//*[@id='scs-selected-partner_listbox']/li["+i1+"]/div/div[1]")).getText()
			println "Supplier "+i1+" Name - "+supplierName
			action.moveToElement(e).click().build().perform()
			Thread.sleep(7000)
			List<WebElement> element = driver.findElements(By.xpath(iconPath));
			for(int j=0;j<element.size();j++){
				Thread.sleep(2000)
				List<WebElement> elements = driver.findElements(By.xpath(iconPath));
				List<WebElement> name = driver.findElements(By.xpath(taskName));
				Thread.sleep(2000)
				println "Current Task - "+name.get(0).getText()
				action.moveToElement(elements.get(0)).doubleClick().build().perform()
				Thread.sleep(6000)

				String fieldId = null,fieldPath = "//field-template/div[@data-field]",fileFieldPath="//input[@type='file']";
				String type = null;
				int c=0;
				boolean st = false;
				List<WebElement> total = driver.findElements(By.xpath(fieldPath))
				List<WebElement> totalFileIn = driver.findElements(By.xpath(fileFieldPath))
				println total.size()
				for(int i=0;i<total.size();i++){
					fieldId = total.get(i).getAttribute("data-field").toString()
					status = right(fieldId)
					type = getFieldType(fieldId)
					println type
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
								println "//div["+c+"]//ul/li[@data-offset-index='0']"
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
								println "//div["+c+"]//ul/li[@data-offset-index='0']"
							}
							driver.findElement(By.xpath("//div["+c+"]//ul/li[@data-offset-index='0']")).click()
							Thread.sleep(2000)
						}
						if(type=="Numeric"){
							driver.findElement(By.xpath("//*[@id='scs-form-level']//div[@data-field='"+fieldId+"']//input")).sendKeys("9")
							Thread.sleep(2000)
						}
						if(type=="Date"){
							driver.findElement(By.xpath("//*[@id='scs-form-level']//div[@data-field='"+fieldId+"']//input")).sendKeys("12/31/2018")
							Thread.sleep(2000)
						}
						if(type=="Time"){
							driver.findElement(By.xpath("//*[@id='scs-form-level']//div[@data-field='"+fieldId+"']//input")).sendKeys("4:30 AM")
							Thread.sleep(2000)
						}
						if(type=="DateTime"){
							driver.findElement(By.xpath("//*[@id='scs-form-level']//div[@data-field='"+fieldId+"']//input")).sendKeys("12/31/2018 10:30 AM")

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
				Thread.sleep(3000)
				click(driver,By.xpath("//*[@id='scs-submit-form-button']"))
				Thread.sleep(3000)
				if(!driver.findElements(By.xpath("//*[@id='scs-form-resubmission-note']")).isEmpty()){
					driver.findElement(By.xpath("//*[@id='scs-form-resubmission-note']")).sendKeys("Automatic Form Submission")
					Thread.sleep(2000)
					click(driver,By.xpath("//button[contains(text(),'OK')]"))
				}
				Thread.sleep(6000)
			}
			Thread.sleep(2000)
		}
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

		click(driver,By.xpath(approvaltick))
		Thread.sleep(2000)
		click(driver,By.xpath(filterButton))
		Thread.sleep(8000)
		click(driver,By.xpath(openEnOption))
		Thread.sleep(2000)
		click(driver,By.xpath(select500Record))
		Thread.sleep(8000)
		waits(driver,By.xpath(total))
		List<WebElement> element = driver.findElements(By.xpath(total));
		//println element.size()
		WebElement el;
		String taskName = null;
		for(int j=0;j<element.size()-1;j++){
			waits(driver, By.xpath(selectFirstTask))
			el = driver.findElement(By.xpath(selectFirstTask))
			waits(driver, By.xpath(currentTask))
			taskName = driver.findElement(By.xpath(currentTask)).getText()
			println "Current Task - "+taskName
			action.moveToElement(el).doubleClick().build().perform()
			Thread.sleep(9000)
			waits(driver, By.xpath(approveButton))
			click(driver, By.xpath(approveButton))
			//	driver.findElement(By.xpath(approveButton)).click()
			Thread.sleep(2000)
			click(driver,By.xpath(yesButton))
			//	driver.findElement(By.xpath(yesButton)).click()
			Thread.sleep(7000)
		}

	}
	@Keyword
	def setFormTaskName() {
		XSSFSheet sheet;
		FileInputStream file = new FileInputStream (new File(path+"/SupplierCred.xlsx"))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		sheet = workbook.getSheetAt(0);
		file.close();
		Thread.sleep(2000)
		FileOutputStream outFile =new FileOutputStream(new File(path+"/SupplierCred.xlsx"));
		sheet.getRow(1).createCell(5).setCellValue(formTaskName);
		workbook.write(outFile);
		outFile.close();

	}
	@Keyword
	def setDocTaskName() {
		XSSFSheet sheet;
		FileInputStream file = new FileInputStream (new File(path+"/SupplierCred.xlsx"))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		sheet = workbook.getSheetAt(0);
		file.close();
		Thread.sleep(2000)
		FileOutputStream outFile = new FileOutputStream(new File(path+"/SupplierCred.xlsx"));
		sheet.getRow(1).createCell(6).setCellValue(documentTaskName);
		workbook.write(outFile);
		outFile.close();
	}
	@Keyword
	def setACKTaskName() {
		XSSFSheet sheet;
		FileInputStream file = new FileInputStream (new File(path+"/SupplierCred.xlsx"))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		sheet = workbook.getSheetAt(0);
		file.close();
		Thread.sleep(2000)
		FileOutputStream outFile =new FileOutputStream(new File(path+"/SupplierCred.xlsx"));
		sheet.getRow(1).createCell(7).setCellValue(ackTaskName);
		workbook.write(outFile);
		outFile.close();

	}
	@Keyword
	def setFormTaskName1() {
		FileInputStream file = new FileInputStream (new File(path+"/SupplierCred.xlsx"))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		file.close();
		Thread.sleep(2000)
		FileOutputStream outFile =new FileOutputStream(new File(path+"/SupplierCred.xlsx"));
		sheet.getRow(1).createCell(9).setCellValue(formTaskName);
		workbook.write(outFile);
		outFile.close();
	}
	@Keyword
	def setDocTaskName1() {
		FileInputStream file = new FileInputStream (new File(path+"/SupplierCred.xlsx"))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		file.close();
		Thread.sleep(2000)
		FileOutputStream outFile =new FileOutputStream(new File(path+"/SupplierCred.xlsx"));
		sheet.getRow(1).createCell(10).setCellValue(documentTaskName);
		workbook.write(outFile);
		outFile.close();
	}
	@Keyword
	def setACKTaskName1() {
		FileInputStream file = new FileInputStream (new File(path+"/SupplierCred.xlsx"))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		file.close();
		Thread.sleep(2000)
		FileOutputStream outFile =new FileOutputStream(new File(path+"/SupplierCred.xlsx"));
		sheet.getRow(1).createCell(11).setCellValue(ackTaskName);
		workbook.write(outFile);
		outFile.close();
	}
	@Keyword
	def selectSupplierInItem(){
		//driver.findElement(By.xpath("//*[@id='scs-popup']//div[div[contains(text(),'User Name')]]//div[2]/input"))
		FileInputStream file = new FileInputStream (new File(path+"/location.xlsx"))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String suppName = sheet.getRow(1).getCell(13).toString();
		println suppName;
		String path1 = "//*[@id='scs-supp-item-link-grid']//tr[td[contains(text(),'"+suppName+"')]]/td[1]/input"
		//	driver.findElement(By.xpath(path)).click();
		click(driver, By.xpath(path1))
		file.close();

	}
}