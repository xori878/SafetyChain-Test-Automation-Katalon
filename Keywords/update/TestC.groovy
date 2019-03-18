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
import java.util.HashMap;
import java.util.Map;

class TestC {
	static HashMap<String, String> map = new HashMap<String,String>();
	static HashMap<String, String> map1 = new HashMap<String,String>();
	@Keyword
	def setData() {
		try {


			print(map);


			//			if (map.containsKey("vishal"))
			//			{
			//				Integer a = map.get("vishal");
			//				System.out.println("value for key \"vishal\" is:- " + a);
			//			}

			//			map.clear();
			//			print(map);

			FileInputStream file = new FileInputStream (new File("C:\\Users\\pashine_a\\Documents\\hylifestage.xlsx"))
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			int t = sheet.getLastRowNum();
			println sheet.getRow(1).getCell(2)
			println sheet.getRow(1).getCell(3)
			println sheet.getRow(1).getCell(4)
			String d =  sheet.getRow(1).getCell(6)
			for(int i=1;i<t+1;i++){
				//	map.put(sheet.getRow(i).getCell(3), 1);
			}
			//			println d
			//			String[] s1 = new String[3];
			//			s1 = d.split("-")
			//			String date = s1[1] +" "+s1[0] + " "+ s1[2]
			//			println date
			//[$-en-US]mmm dd yyyy
			file.close();
			//	print(map);

			Iterator iterator = map.keySet().iterator();

			while (iterator.hasNext()) {
				String key = iterator.next().toString();
				String value = map.get(key).toString();

				println "K - "+key + " Value - " + value;
			}
			//			FileOutputStream outFile =new FileOutputStream(new File(path+"/data.xlsx"));
			//			workbook.write(outFile);
			//			outFile.close();
		} catch (Exception e) {
			KeywordUtil.markFailed(e)
		}
	}
}