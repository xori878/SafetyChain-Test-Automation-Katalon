import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

if(check("//*[@id='scs-form-level']//div[div[@class='ng-scope']]/div["+m+"]//field-template//input[@class='actualInput scs-field-singleText ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required']") || check("//*[@id='scs-form-level']/div["+m+"]//field-template//input[@class='actualInput scs-field-singleText ng-pristine ng-untouched ng-scope k-textbox ng-empty ng-invalid ng-invalid-required']")){
	 driver.findElement(By.xpath("//*[@id='scs-form-level']/div["+m+"]//field-template//input")).sendKeys("This is Text")
	 Thread.sleep(2000)
 }
 if(!driver.findElements(By.xpath("//*[@id='scs-form-level']//div[div[@class='ng-scope']]/div["+m+"]//field-template//input[@type='file']")).isEmpty()){
	 driver.findElement(By.xpath("//*[@id='scs-form-level']/div["+m+"]//field-template//input[@type='file']")).sendKeys("D:\\Git Data\\SafetyChain-Test-Automation-Katalon\\SCTestData\\Tulips.jpg")
	 Thread.sleep(8000)
 }
 if(check("//*[@id='scs-form-level']//div[div[@class='ng-scope']]/div["+m+"]//field-template//textarea[@class='actualInput paratextfield ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required']")){
	 driver.findElement(By.xpath("//*[@id='scs-form-level']/div["+m+"]//field-template//textarea")).sendKeys("Paragraph")
	 Thread.sleep(2000)
 }
 if(check("//*[@id='scs-form-level']//div[div[@class='ng-scope']]/div["+m+"]//field-template//input[@class='k-formatted-value actualInput scs-field-numeric ng-pristine ng-untouched ng-valid k-input']")){
	 driver.findElement(By.xpath("//*[@id='scs-form-level']/div["+m+"]//field-template//input[@class='k-formatted-value actualInput scs-field-numeric ng-pristine ng-untouched ng-valid k-input']")).sendKeys("9")
	 Thread.sleep(2000)
 }
 if(check("//*[@id='scs-form-level']//div[div[@class='ng-scope']]/div["+m+"]//field-template//span[@aria-controls='field-{{field.Id}}_listbox']")){
	 c=0;
	 st = false;
	 driver.findElement(By.xpath("//*[@id='scs-form-level']/div["+m+"]//field-template//span[@aria-controls='field-{{field.Id}}_listbox']")).click()
	 Thread.sleep(2000)
/*		e1 = driver.findElement(By.xpath("//*[@id='scs-form-level']/div["+m+"]//field-template//input"))
	 s = e1.getAttribute("aria-activedescendant")
	 println s
	 if(check("//ul//li[@id='"+s+"']")){
		 driver.findElement(By.xpath("//ul//li[@id='"+s+"']")).click()
		 Thread.sleep(2000)
	 } */
	 while(!st){
		 c++;
		 st = check("//div["+c+"]//ul/li[@data-offset-index='0']")
		 println "//div["+c+"]//ul/li[@data-offset-index='0']"
	 }
	 driver.findElement(By.xpath("//div["+c+"]//ul/li[@data-offset-index='0']")).click()
 }
 if(check("//*[@id='scs-form-level']//div[div[@class='ng-scope']]/div["+m+"]//div[@class='k-multiselect-wrap k-floatwrap']")){
	 c=0;
	 st = false;
	 driver.findElement(By.xpath("//*[@id='scs-form-level']/div["+m+"]//field-template//div[@class='k-multiselect-wrap k-floatwrap']")).click()
	 Thread.sleep(2000)
/*		e1 = driver.findElement(By.xpath("//*[@id='scs-form-level']/div["+m+"]//field-template//input"))
	 s = e1.getAttribute("aria-activedescendant")
	 println s
	 if(check("//ul//li[@id='"+s+"']")){

		 driver.findElement(By.xpath("//ul//li[@id='"+s+"']")).click()
		 Thread.sleep(2000)


	 } */
	 while(!st){
		 c++;
		 st = check("//div["+c+"]//ul/li[@data-offset-index='0']")
		 println "//div["+c+"]//ul/li[@data-offset-index='0']"
	 }
	 driver.findElement(By.xpath("//div["+c+"]//ul/li[@data-offset-index='0']")).click()
 }
 if(check("//*[@id='scs-form-level']//div[div[@class='ng-scope']]/div["+m+"]//field-template//span[@class='k-widget k-datepicker k-header actualInput scs-date-time-fields']//input")){
	 driver.findElement(By.xpath("//*[@id='scs-form-level']/div["+m+"]//field-template//span[@class='k-widget k-datepicker k-header actualInput scs-date-time-fields']//input")).sendKeys("12/28/2018")
	 Thread.sleep(2000)
 }
 if(check("//*[@id='scs-form-level']//div[div[@class='ng-scope']]/div["+m+"]//field-template//span[@class='k-widget k-timepicker k-header actualInput scs-date-time-fields']//input")){
	 driver.findElement(By.xpath("//*[@id='scs-form-level']/div["+m+"]//field-template//span[@class='k-widget k-timepicker k-header actualInput scs-date-time-fields']//input")).sendKeys("3:00 AM")
	 Thread.sleep(2000)
 }
 if(check("//*[@id='scs-form-level']//div[div[@class='ng-scope']]/div["+m+"]//field-template//span[@class='k-widget k-datetimepicker k-header actualInput scs-date-time-fields']//input")){
	 driver.findElement(By.xpath("//*[@id='scs-form-level']/div["+m+"]//field-template//span[@class='k-widget k-datetimepicker k-header actualInput scs-date-time-fields']//input")).sendKeys("12/28/2018 10:30 AM")
	 Thread.sleep(2000)
 }
