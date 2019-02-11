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
import org.openqa.selenium.Keys as Keys
import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.Row
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import internal.GlobalVariable
import java.util.List;
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

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.*;
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions


class FormName {
	WebDriver driver =  DriverFactory.getWebDriver();
	static String fileName = null;
	//public String form_name = "AUTO_TOOL_KATALON_"+(int)(Math.random()*100)+"_FORM";
	//public String form_name = "AUTOQUESTIONAIREFORMTEST7";
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy-HH:mm:ss");
	LocalDateTime now = LocalDateTime.now();
	public String form_name = "TestForm_"+dtf.format(now);
	public String task_name = "TestTask_"+dtf.format(now);
	public String document_name = "TestDocument_"+dtf.format(now);
	public String new_document_name = "TestRSTDocument_"+dtf.format(now);
	public String task_document_name_DMS =  "TestAssignTaskDocument"+dtf.format(now);
	public String task_name_DMS = "TestDMSTask_"+dtf.format(now);
	public String location_name = "TestLocation_"+dtf.format(now);
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
			println "Hi"
			FileInputStream file = new FileInputStream (new File(path+"/data.xlsx"))
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			sheet.getRow(1).createCell(0).setCellValue(form_name);
			println "Hi"
			print form_name
			file.close();
			FileOutputStream outFile =new FileOutputStream(new File(path+"/data.xlsx"));
			workbook.write(outFile);
			outFile.close();
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}
	@Keyword
	def setData1() {
		try {
			println "Hi"
			FileInputStream file = new FileInputStream (new File(path+"/data.xlsx"))
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			sheet.getRow(1).createCell(0).setCellValue(form_name);
			sheet.getRow(1).createCell(8).setCellValue(form_name);
			println "Hi"
			print form_name
			file.close();
			FileOutputStream outFile =new FileOutputStream(new File(path+"/data.xlsx"));
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
			click(driver,By.xpath("//*[@id='scs-forms-grid']/div[2]/table/tbody/tr/td[contains(text(),'"+s+"')]"))
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
			click(driver, By.xpath("//*[@id='scs-resources-document-grid']/div[2]/div[1]/table/tbody/tr/td[3 and contains(text(),'"+s+"')]"))
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
			driver.findElement(By.xpath("//div/form/div/input")).clear()
			Thread.sleep(2000)
			driver.findElement(By.xpath("//div/form/div/input")).sendKeys(s);
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}
	@Keyword
	def filterDocumentName() {
		try {
			String s = findTestData('FormData').getValue('FormName',1)
			driver.findElement(By.xpath("//div/form/div/input")).clear()
			Thread.sleep(2000)
			driver.findElement(By.xpath("//div/form/div/input")).sendKeys(s);
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}
	@Keyword
	def filterFormName1() {
		try {
			//	String s = "Auto_Test_Form_15/12-15:06"
			String s = "AUTO_TOOL_KAT_FORM_06/11/2018-13:45:24"
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
			driver.findElement(By.xpath("//*[@id='scs-dms-tree-search-input']")).sendKeys(s)
			Thread.sleep(2000)
			driver.findElement(By.xpath("//*[@id='scs-dms-tree-search-input']")).sendKeys(Keys.DOWN)
			Thread.sleep(2000)
			driver.findElement(By.xpath("//*[@id='scs-dms-tree-search-input']")).sendKeys(Keys.ENTER)
			//	WebElement element = driver.findElement(By.xpath("//*[@id='scs-left-panel-treeview']/ul/li/div/span/span/span[contains(text(),'"+s+"')]"));
			//	action.doubleClick(element).perform();
			//element = driver.findElement(By.xpath("//*[@id='scs-documents-grid']/div[2]/table/tbody/tr/td[3 and contains(text(),'"+form_name+"')]"));
			//action.doubleClick(driver.findElement(By.xpath("//*[@id='scs-documents-grid']/div[2]/table/tbody/tr/td[3]"))).perform();
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}
	@Keyword
	def setTaskName() {
		FileInputStream file = new FileInputStream (new File(path+"/data.xlsx"))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		sheet.getRow(1).createCell(1).setCellValue(task_name);
		file.close();
		FileOutputStream outFile =new FileOutputStream(new File(path+"/data.xlsx"));
		workbook.write(outFile);
		outFile.close();
	}

	@Keyword
	def setDocumentName() {
		FileInputStream file = new FileInputStream (new File(path+"/data.xlsx"))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		sheet.getRow(1).createCell(2).setCellValue(document_name);
		sheet.getRow(1).createCell(3).setCellValue(new_document_name);
		sheet.getRow(1).createCell(4).setCellValue(task_document_name_DMS);
		sheet.getRow(1).createCell(5).setCellValue(task_name_DMS);
		file.close();
		FileOutputStream outFile =new FileOutputStream(new File(path+"/data.xlsx"));
		workbook.write(outFile);
		outFile.close();
	}

	@Keyword
	def setNewDocumentName() {
		FileInputStream file = new FileInputStream (new File(path+"/data.xlsx"))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		sheet.getRow(1).createCell(3).setCellValue(new_document_name);
		file.close();
		FileOutputStream outFile =new FileOutputStream(new File(path+"/data.xlsx"));
		workbook.write(outFile);
		outFile.close();
	}
	@Keyword
	def getDocumentName() {
		FileInputStream file = new FileInputStream (new File(path+"/data.xlsx"))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String documentName = sheet.getRow(1).getCell(2);
		file.close();

		click(driver,By.xpath("//*[@id='scs-documents-grid']/div/table/tbody/tr/td[contains(text(),'"+documentName+"')]"))

	}

	@Keyword
	def getDocumentName1() {
		FileInputStream file = new FileInputStream (new File(path+"/data.xlsx"))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String documentName = sheet.getRow(1).getCell(3);
		file.close();

		click(driver,By.xpath("//*[@id='scs-documents-grid']/div/table/tbody/tr/td[contains(text(),'"+documentName+"')]"))

	}
	@Keyword
	def testStatus() {
		int i=0;
		while(true){
			if(driver.findElements(By.xpath("//*[@id='scs-data-provisioning-export-grid-container']//tr[1]/td[1]/span[@class='scs-status-tooltip scs-success-status']")).isEmpty()){
				Thread.sleep(5000)
			}
		}

	}
	@Keyword
	def getDocumentName3() {
		FileInputStream file = new FileInputStream (new File(path+"/data.xlsx"))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String documentName = sheet.getRow(1).getCell(4);
		file.close();

		click(driver,By.xpath("//*[@id='scs-documents-grid']/div/table/tbody/tr/td[contains(text(),'"+documentName+"')]"))

	}
	@Keyword
	def getTaskName() {
		FileInputStream file = new FileInputStream (new File(path+"/data.xlsx"))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String documentName = sheet.getRow(1).getCell(5);
		file.close();

		click(driver,By.xpath("//*[@id='scs-documents-grid']/div/table/tbody/tr/td[contains(text(),'"+documentName+"')]"))

	}
	@Keyword
	def getSize() {
		try {
			Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
			int width = (short) size.getWidth();
			int height = (short) size.getHeight();

			Actions actions = new Actions(driver);
			WebElement srcElement = driver.findElement(By.xpath("//*[@id='scs-rule-builder-right-header-container']/div[13]"));
			//WebElement srcElement = driver.findElement(By.xpath("//*[@id='scs-rule-builder-right-header-container']/div[contains(text(),'Value')]"));
			WebElement targetElement = driver.findElement(By.xpath("//*[@id='scs-rule-builder-container']/div/div/div[3]/div[2]"));
			//actions.dragAndDrop(srcElement, targetElement);
			actions.click(srcElement)
			Thread.sleep(3000)
			actions.clickAndHold(srcElement)
			Thread.sleep(2000)
			actions.moveByOffset(width/2, 230).release().build().perform()
			//	actions.dragAndDropBy(srcElement, width/2, 230)
			//	actions.build().perform();

			//WebElement dragElement = driver.findElement(By.id("//*[@id='scs-rule-builder-right-header-container']/div[contains(text(),'Value')]"));
			//WebElement dropElement = driver.findElement(By.id("//*[@id='scs-rule-builder-container']/div/div/div[3]/div[2]"));
			//Actions act = new Actions(driver);
			//	builder.clickAndHold(dragElement).moveToElement(dropElement).release().build().perform();
			//	act.dragAndDropBy(dragElement,580,230).build().perform();
			/*	WebElement From=driver.findElement(By.xpath("//*[@id='scs-rule-builder-right-header-container']/div[contains(text(),'Value')]"));
			 //	WebElement To=driver.findElement(By.xpath("//*[@id='scs-rule-builder-container']/div/div/div[1]/div[2]"));
			 WebElement To=driver.findElement(By.xpath("//*[@id='scs-rule-builder-container']/div/div/div[1]/div/div/span"));
			 Actions act=new Actions(driver);
			 //
			 act.dragAndDrop(From, To).build().perform();
			 */
			/*WebElement Image = driver.findElement(By.xpath("//*[@id='scs-rule-builder-container']/div/div/div[1]/div[2]"));
			 //Get width of element.
			 int ImageWidth = Image.getSize().getWidth();
			 println("Image width Is "+ImageWidth+" pixels");
			 //Get height of element.
			 int ImageHeight = Image.getSize().getHeight();
			 println("Image height Is "+ImageHeight+" pixels");*/
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}
	@Keyword
	def testExportStatus() {
		Actions actions = new Actions(driver);
		int i=0;
		while(true){
			click(driver,By.xpath("//*[@id='scs-data-provisioning-export-grid-container']//tr[1]/td[3]"))
			fileName = driver.findElement(By.xpath("//*[@id='scs-data-provisioning-export-grid-container']//tr[1]/td[3]")).getText()
			String className = driver.findElement(By.xpath("//*[@id='scs-data-provisioning-export-grid-container']//tr[1]/td[1]/span")).getAttribute("class")
			println className
			FileInputStream file = new FileInputStream (new File(path+"/data.xlsx"))
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			sheet.getRow(1).createCell(9).setCellValue(fileName);
			file.close();
			FileOutputStream outFile =new FileOutputStream(new File(path+"/data.xlsx"));
			workbook.write(outFile);
			outFile.close();
			if(className != "scs-status-tooltip scs-success-status"){
				if(className=="scs-status-tooltip scs-failure-status"){
					fileName = 	driver.findElement(By.xpath("//*[@id='scs-data-provisioning-export-grid-container']//tr[1]/td[3]")).getText()
					String errorMeessage = driver.findElement(By.xpath("//*[@id='scs-data-provisioning-export-grid-container']//tr[1]/td[5]")).getText()
					println fileName
					if(errorMeessage!=null){
						println "Error Message - "+errorMeessage
						throw new com.kms.katalon.core.exception.StepFailedException()
					}
					break;
				}
				Thread.sleep(5000)
				i++;
				click(driver,By.xpath("//*[@id='scs-data-provisioning-export-grid-container']/div/a[@title='Refresh']"))
				Thread.sleep(3000)
			}else{

				fileName = 	driver.findElement(By.xpath("//*[@id='scs-data-provisioning-export-grid-container']//tr[1]/td[3]")).getText()
				WebElement element = driver.findElement(By.xpath("//*[@id='scs-data-provisioning-export-grid-container']//tr[1]/td[3]"))
				actions.moveToElement(element).doubleClick().build().perform()
				Thread.sleep(4000)
				println fileName
				break;
			}
			if(i==3){


				println "To Long to load"

				throw new com.kms.katalon.core.exception.StepFailedException()

				break;
			}
		}

	}
	@Keyword
	def testImportStatus() {
		Actions actions = new Actions(driver);
		int i=0;
		while(true){
			click(driver,By.xpath("//*[@id='scs-data-provisioning-import-grid-container']//tr[1]/td[5]"))
			String className = driver.findElement(By.xpath("//*[@id='scs-data-provisioning-import-grid-container']//tr[1]/td[1]/span")).getAttribute("class")
			println className
			if(className != "scs-status-tooltip scs-success-status"){
				if(className=="scs-status-tooltip scs-failure-status"){
					fileName = 	driver.findElement(By.xpath("//*[@id='scs-data-provisioning-import-grid-container']//tr[1]/td[5]")).getText()
					String errorMeessage = driver.findElement(By.xpath("//*[@id='scs-data-provisioning-import-grid-container']//tr[1]/td[6]")).getText()
					println fileName
					if(errorMeessage!=null){
						println "Error Message - "+errorMeessage
						throw new com.kms.katalon.core.exception.StepFailedException()
					}
					break;
				}
				Thread.sleep(5000)
				i++;
				click(driver,By.xpath("//*[@id='scs-data-provisioning-import-grid-container']/div/a[@title='Refresh']"))
				Thread.sleep(3000)
			}else{

				fileName = 	driver.findElement(By.xpath("//*[@id='scs-data-provisioning-import-grid-container']//tr[1]/td[3]")).getText()
				WebElement element = driver.findElement(By.xpath("//*[@id='scs-data-provisioning-import-grid-container']//tr[1]/td[3]"))
				actions.moveToElement(element).doubleClick().build().perform()
				Thread.sleep(4000)
				println fileName
				break;
			}
			if(i==3){


				println "To Long to load"

				throw new com.kms.katalon.core.exception.StepFailedException()

				break;
			}
		}

	}
	@Keyword
	def TestCompliance() {

		List<WebElement> min = driver.findElements(By.xpath("//*[@id='scs-form-level']//div[@data-fieldtype='Numeric']/div/div/div/span[3]/span[1]"))
		List<WebElement> max = driver.findElements(By.xpath("//*[@id='scs-form-level']//div[@data-fieldtype='Numeric']/div/div/div/span[3]/span[3]"))
		List<WebElement> uom = driver.findElements(By.xpath("//*[@id='scs-form-level']//div[@data-fieldtype='Numeric']/div/div/div/span[2]"))

		for(int i=0;i<min.size();i++){
			if(min.get(i).getText().toString()  == 	"Min: 4"){
				println "MIN"
			}
			if(max.get(i).getText().toString()  == 	"Max: 8" ){
				println "MAX"
			}
			if(uom.get(i).getText().toString()  == 	"CM"){
				println "UOM"
			}
		}
	}
	@Keyword
	def uploadExFile() {
		Thread.sleep(2000)
		println fileName
		driver.findElement(By.xpath("//*[@id='scs-dpt-file-upload-input']")).sendKeys("C:\\Users\\pashine_a\\Downloads\\"+fileName);
		Thread.sleep(2000)
	}
	@Keyword
	def upload() {
		driver.findElement(By.xpath("//*[@id='scs-document-file-upload-input']")).sendKeys(path+"/Desert.jpg");

	}
	@Keyword
	def setLocationName() {
		try {
			FileInputStream file = new FileInputStream (new File(path+"/location.xlsx"))
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			sheet.getRow(1).createCell(0).setCellValue(location_name);
			file.close();
			FileOutputStream outFile =new FileOutputStream(new File(path+"/location.xlsx"));
			workbook.write(outFile);
			outFile.close();
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}
}