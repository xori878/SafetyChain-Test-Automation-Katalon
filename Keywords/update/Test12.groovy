
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
import org.openqa.selenium.JavascriptExecutor;
import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI
import java.util.HashMap;
import java.util.Map;
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



class Test12 {

	// = new String[7][7];
	static String fileName = "C:\\Users\\pashine_a\\Documents\\rockymountain.xlsx";
	static String d1,curTask,curResource;
	static int curCount;
	static List<String[]> alltasks= new ArrayList<String>(),allResource= new ArrayList<Integer>(),allLoc= new ArrayList<String>();
	static List<Integer[]> taskCount= new ArrayList<Integer>();
	static WebDriver driver =  DriverFactory.getWebDriver();
	public static void click(WebElement element) {
		Actions action = new Actions(driver);
		(new WebDriverWait(driver,60)).until(ExpectedConditions.elementToBeClickable(element));
		Thread.sleep(1000)
		println "Found"
		action.moveToElement(element).click().build().perform()
	}
	public static void click(String path) {
		if(driver.findElements(By.xpath(path)).isEmpty()){
			waitToLoad(path)
		}
		WebElement element = driver.findElement(By.xpath(path))
		Actions action = new Actions(driver);
		(new WebDriverWait(driver,60)).until(ExpectedConditions.elementToBeClickable(element));
		Thread.sleep(2000)
		action.moveToElement(element).click().build().perform()
	}
	public static void setText(String path,value) {
		WebElement element = driver.findElement(By.xpath(path))
		Actions action = new Actions(driver);
		(new WebDriverWait(driver,60)).until(ExpectedConditions.elementToBeClickable(element));
		Thread.sleep(1000)
		action.moveToElement(element).sendKeys(value).build().perform()
	}
	public static void doubleClick(WebDriver driver, By by) {
		WebElement element = driver.findElement(by);
		Actions action = new Actions(driver);
		(new WebDriverWait(driver,60)).until(ExpectedConditions.elementToBeClickable(by));
		Thread.sleep(1000)
		action.moveToElement(element).doubleClick().build().perform()
	}

	public static void waitToClick(String path) {
		if(driver.findElements(By.xpath(path)).isEmpty()){
			waitToLoad(path)
		}
		WebElement element = driver.findElement(By.xpath(path))
		Actions action = new Actions(driver);
		(new WebDriverWait(driver,60)).until(ExpectedConditions.elementToBeClickable(element));
		Thread.sleep(1000)
	}
	public static void waitToLoad() {
		Thread.sleep(2000);
		println "Wait Load"
	}
	public static void waitToLoad(String path) {
		if(driver.findElements(By.xpath(path)).isEmpty()){
			Thread.sleep(2000);
			println "Loading"
			println path
			waitToLoad(path)
		}
	}
	public static void waitToClick(WebElement element) {
		Actions action = new Actions(driver);
		(new WebDriverWait(driver,60)).until(ExpectedConditions.elementToBeClickable(element));
		Thread.sleep(1000)
	}


	@Keyword
	def selectTask() {
		//Thread.sleep(15000)
		getData()

		//test12()
	}

	public static void test12(int i) {

		String r = "\"" + curResource + "\"";
		String t = "\"" + curTask + "\"";
		//	println r
		//	String tn = "//*[@id='scs-ts-task-grid-container']//tr[td[contains(text(),"+r+")] or td[contains(text(),'-')] and td/span[contains(text(),"+t+")]]/td/span[contains(text(),"+t+")]";
		String firstEl = "//*[@id='scs-ts-task-grid-container']/div/table/tbody/tr[1]/td/p"
		if(driver.findElements(By.xpath(firstEl)).isEmpty()){
			waitToLoad(firstEl)
		}
		//<WebElement> el2 =  driver.findElements(By.xpath("//tr[td/span[contains(text(),'M-11 Daily Temperature Log')] and td[contains(text(),'-') or contains(text(),'HyLife')]]"))
		//	int s = el2.size()
		println "IND - "+i
		//	for(int i=0;i<s;i++){
		println "Path - "+"//tr[td/span[contains(text(),"+t+")] and td[contains(text(),'-') or contains(text(),"+r+")]]/td/span[@class='scs-ts-task-name-col']"
		WebElement el = driver.findElements(By.xpath("//tr[td/span[contains(text(),"+t+")] and td[contains(text(),'-') or contains(text(),"+r+")]]/td/span[@class='scs-ts-task-name-col']")).get(i)
		//		println el.getTagName()
		click(el)


		//		String firstEl = "//*[@id='scs-ts-task-grid-container']/div/table/tbody/tr[1]/td/p"
		//		if(driver.findElements(By.xpath(firstEl)).isEmpty()){
		//			waitToLoad(firstEl)
		//		}
		//		//<WebElement> el2 =  driver.findElements(By.xpath("//tr[td/span[contains(text(),'M-11 Daily Temperature Log')] and td[contains(text(),'-') or contains(text(),'HyLife')]]"))
		//		//	int s = el2.size()
		//		println "IND - "+i
		//		//	for(int i=0;i<s;i++){
		//		println "Path - "+"//tr[td/span[contains(text(),'"+curTask+"')] and td[contains(text(),'-') or contains(text(),'"+curResource+"')]]/td/span[@class='scs-ts-task-name-col']"
		//		WebElement el = driver.findElements(By.xpath("//tr[td/span[contains(text(),'"+curTask+"')] and td[contains(text(),'-') or contains(text(),'"+curResource+"')]]/td/span[@class='scs-ts-task-name-col']")).get(i)
		//		//		println el.getTagName()
		//		click(el)

	}
	public static int  testAvail() {
		int curIndex=0;
		int presentIn,flag=0;
		for(int i=0;i<alltasks.size();i++){
			//		println "Hello"
			if(alltasks.get(i).toString().equals(curTask)){
				if(allResource.get(i).equals(curResource)){
					presentIn = taskCount.get(i)
					curIndex = presentIn+1;
					taskCount.add(i,presentIn+1)
					flag=1;
					break;
				}
			}
		}
		if(flag==0){
			alltasks.add(curTask)
			allResource.add(curResource)
			taskCount.add(0)
		}
		println curTask
		println curResource
		println curIndex
		return curIndex
	}

	public static void   getData() {
		FileInputStream file = new FileInputStream (new File(fileName))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum()
		file.close();
		println "Total Rows - "+rowCount
		for(int i=0;i<rowCount;i++){
			selectLocation(i+1)
		}
	}
	public static void   selectDate(int row) {
		String firstEl = "//*[@id='scs-ts-task-grid-container']/div/table/tbody/tr[1]/td/p"
		FileInputStream file = new FileInputStream (new File(fileName))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum()
		String d =  sheet.getRow(row).getCell(6)
		file.close();
		//	println d
		String[] s1 = new String[3];
		s1 = d.split("-")
		String date = s1[1] +" "+s1[0] + " "+ s1[2]
		println "Task Date - "+date
		d1=date
		if(driver.findElements(By.xpath(firstEl)).isEmpty()){
			waitToLoad(firstEl)
		}
		waitToClick("//*[@id='scs-ts-header-components']/div/label[@class='scs-ts-date-string ng-binding']")
		String nowDate = driver.findElement(By.xpath("//*[@id='scs-ts-header-components']/div/label[@class='scs-ts-date-string ng-binding']")).getText().toString()
		println "Current Date - "+nowDate
		if(nowDate.equals(date)){
			selectTask1(row)
		}else{
			click("//*[@id='scs-ts-header-components']/div[2]/button[@ng-click='navigateNext()']")
			Thread.sleep(2000)
			alltasks = null
			allResource = null
			taskCount = null
			alltasks = new ArrayList<String>()
			allResource = new ArrayList<String>();
			taskCount = new ArrayList<Integer>();
			selectDate(row)
		}
	}
	public static void   selectLocation(int row) {
		int flag1=0;
		String firstEl = "//*[@id='scs-ts-task-grid-container']/div/table/tbody/tr[1]/td/p"
		String searchLocation = "//*[@id='scs-task-scheduler-location-list']//input";
		String openLocation = "//div//div[label[contains(text(),'Location') or contains(text(),'LOCATION')]]/span/span/span[last()]";
		FileInputStream file = new FileInputStream (new File(fileName))
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum()
		String location =  sheet.getRow(row).getCell(4)
		file.close();
		if(driver.findElements(By.xpath(firstEl)).isEmpty()){
			waitToLoad(firstEl)
		}
		if(driver.findElements(By.xpath(openLocation)).isEmpty()){
			waitToLoad(openLocation)
			//selectLocation(row)
		}
		waitToClick(openLocation)
		String nowLocation = driver.findElement(By.xpath("//*[@id='scs-ts-header-components']/div/single-select-dropdown-list/div/span/span/span[1]")).getText().toString()
		println "Current Location - "+nowLocation
		if(nowLocation.equals(location)){
			selectDate(row)
			//selectTask1(row)
		}else{
			click(openLocation)
			Thread.sleep(2000)
			setText(searchLocation, location)
			Thread.sleep(7000)
			driver.findElement(By.xpath(searchLocation)).sendKeys(Keys.DOWN)
			for(int j=0;j<allLoc.size();j++){
				if(allLoc.get(j).toString().equals(location)){
					flag1=1;
					break

				}
			}
			if(flag1==0){
				alltasks = null
				allResource = null
				taskCount = null
				alltasks= new ArrayList<String>()
				allResource= new ArrayList<String>();
				taskCount= new ArrayList<Integer>();
			}
			selectDate(row)
		}
	}
	public static void  selectTask1(int row) {
		try {
			int ind=1,flag1=0;
			Robot hal = new Robot();
			Random random = new Random();
			int x = random.nextInt() % 640;
			int y = random.nextInt() % 480;
			hal.mouseMove(x,y);
			String currentDate = "//*[@id='scs-ts-header-components']/div[2]/label";
			String firstEl = "//*[@id='scs-ts-task-grid-container']/div/table/tbody/tr[1]/td/p"
			String openLocation = "//div//div[label[contains(text(),'Location') or contains(text(),'LOCATION')]]/span/span/span[last()]";
			String searchLocation = "//*[@id='scs-task-scheduler-location-list']//input";
			println "Row Number - "+row
			FileInputStream file = new FileInputStream (new File(fileName))
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			String resource = sheet.getRow(row).getCell(2)
			String task =  sheet.getRow(row).getCell(3)
			String location =  sheet.getRow(row).getCell(4)
			curResource = sheet.getRow(row).getCell(2)
			curTask =  sheet.getRow(row).getCell(3)
			file.close();
			String tn = "//*[@id='scs-ts-task-grid-container']//tr[td[contains(text(),'"+resource+"')] or td[contains(text(),'-')] and td/span[contains(text(),'"+task+"')]]/td/span[contains(text(),'"+task+"')]";
			//			println tn
			if(driver.findElements(By.xpath(firstEl)).isEmpty()){
				waitToLoad(firstEl)
			}
			waitToClick(firstEl)
			//			String tn = "//*[@id='scs-ts-task-grid-container']//table[@class='k-selectable']//tr[td[contains(text(),'"+resource+"')] or td[contains(text(),'-')] and td/span[contains(text(),'"+task+"')]]/td/span[contains(text(),'"+task+"')]]["+count+"]";

			//		WebElement tskn = driver.findElement(By.xpath("//*[@id='scs-ts-task-grid-container']//table[@class=k-selectable"]//tr[td[contains(text(),'HyLife Foods')] or td[contains(text(),'-')] and td/span[contains(text(),'M-11 Daily Temperature Log')]][10]"));

			if(allLoc==null || allLoc.size()==0 || allLoc.isEmpty()){
				allLoc.add(location)

			}
			if(alltasks==null || alltasks.size()==0 || alltasks.isEmpty()){
				//		println "SZ - "+alltasks.size()
				alltasks.add(curTask)
				allResource.add(curResource)
				taskCount.add(0)
				for(int j=0;j<allLoc.size();j++){
					if(allLoc.get(j).toString().equals(location)){
						flag1=1;
						break

					}
				}
				if(flag1==0){
					allLoc.add(location)
				}
				test12(0)

			}else{
				//	println alltasks.size()
				test12(testAvail())
			}



			//		String tsknm = "//*[@id='scs-ts-task-grid-container']//table[@class='k-selectable']//tr[td[contains(text(),'"+resource+"')] or td[contains(text(),'-')] and td/span[contains(text(),'"+task+"')]]["+ind+"]/td/span[contains(text(),'"+task+"')]";
			//		println tsknm
			//		List<WebElement> taskName= driver.findElements(By.xpath(tn));
			//			Thread.sleep(4000)
			//
			//			if(driver.findElements(By.xpath(firstEl)).isEmpty()){
			//				Thread.sleep(5000)
			//				waitToLoad(firstEl)
			//			}
			//	waitToClick(tsknm)
			Thread.sleep(2000)
			//	click(tsknm)
			update();
			Thread.sleep(2000)
		} catch (WebElementNotFoundException e) {
			println e;
		}
	}
	public static void update(){
		String w = "//*[@id='scs-ts-edit-schedule-form']/div[1]/div[5]/div[1]"
		String editSc = "//*[@id='scs-ts-details-edit-schedule']"
		String wg = "//div[div[contains(text(),'ASSIGN TO WORKGROUP')]]//span[contains(text(),'Select')]"
		if(driver.findElements(By.xpath(editSc)).isEmpty()){
			waitToLoad(editSc)
			update()
		}
		click(editSc);
		Thread.sleep(3000)
		if(!driver.findElements(By.xpath(editSc)).isEmpty()){
			waitToLoad(editSc)
			click(editSc);
			Thread.sleep(2000)
		}
		if(!driver.findElements(By.xpath(editSc)).isEmpty()){
			waitToLoad(editSc)
			click(editSc);
			Thread.sleep(2000)
		}
		Thread.sleep(2000)
		if(!driver.findElements(By.xpath(editSc)).isEmpty()){
			waitToLoad(editSc)
			click(editSc);
			Thread.sleep(2000)
		}
		if(driver.findElements(By.xpath(w)).isEmpty()){
			waitToLoad(w)
			waitToClick(w);
		}
		waitToClick(w);
		Thread.sleep(2000)
		click("//button[contains(text(),'UPDATE')]")
		Thread.sleep(4000)
		if(!driver.findElements(By.xpath("//button[contains(text(),'UPDATE')]")).isEmpty()){
			Thread.sleep(6000)
			if(!driver.findElements(By.xpath("//button[contains(text(),'UPDATE')]")).isEmpty()){
				Thread.sleep(6000)
				println "Waiting"
				click("//button[contains(text(),'UPDATE')]")
			}
		}
		if(!driver.findElements(By.xpath("//button[contains(text(),'UPDATE')]")).isEmpty()){
			waitToClick("//button[contains(text(),'CANCEL')]");
			Thread.sleep(2000)
			println "CANCELED"
			click("//button[contains(text(),'CANCEL')]")
			Thread.sleep(2000)
		}else{
			println "UPDATED";
			Thread.sleep(2000);
		}
		waitToClick(editSc)
		Thread.sleep(6000)
		waitToClick("//*[@id='scs-ts-details-clsoe' or contains(text(),'Close')]")
		click("//*[@id='scs-ts-details-clsoe' or contains(text(),'Close')]")
		Thread.sleep(2000)
		if(!driver.findElements(By.xpath("//*[@id='scs-ts-details-clsoe' or contains(text(),'Close')]")).isEmpty()){
			Thread.sleep(6000)
			println "Waiting"
			click("//*[@id='scs-ts-details-clsoe' or contains(text(),'Close')]")
			Thread.sleep(2000)
		}
		Thread.sleep(2000)
		if(!driver.findElements(By.xpath("//*[@id='scs-ts-details-clsoe' or contains(text(),'Close')]")).isEmpty()){
			Thread.sleep(6000)
			println "Waiting"
			click("//*[@id='scs-ts-details-clsoe' or contains(text(),'Close')]")
			Thread.sleep(2000)
		}

		//		for(int i=0;i<alltasks.size();i++){
		//			println "Data"
		//			println alltasks.get(i)
		//			println allResource.get(i)
		//			println taskCount.get(i)
		//		}
	}
}