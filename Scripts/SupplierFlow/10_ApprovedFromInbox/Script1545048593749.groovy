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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Form_Selection_Creation/login_Username'), GlobalVariable.UserName)

WebUI.setText(findTestObject('Form_Selection_Creation/login_Password'), GlobalVariable.Password)

WebUI.click(findTestObject('Form_Selection_Creation/login_Button'))

Thread.sleep(3000)

WebUI.click(findTestObject('Form_Selection_Creation/mainMenu_Button'))

WebUI.click(findTestObject('SupplierFlow/inbox'))

Thread.sleep(6000)

WebUI.setText(findTestObject('SupplierFlow/searchTaskInInbox'), findTestData('FormData').getValue('TaskName', 1))

WebUI.sendKeys(findTestObject('SupplierFlow/searchTaskInInbox'), Keys.chord(Keys.ENTER))

Thread.sleep(3000)

CustomKeywords.'Supplier.selectTaskInInbox'()

Thread.sleep(6000)

WebUI.click(findTestObject('SupplierFlow/approveButton'))

Thread.sleep(3000)

WebUI.setText(findTestObject('SupplierFlow/expirtionDate_ApproveTask'), '12/17/2018')

Thread.sleep(2000)

WebUI.click(findTestObject('SupplierFlow/approveYesButton'))

Thread.sleep(6000)

WebUI.setText(findTestObject('SupplierFlow/searchTaskInInbox'), findTestData('FormData').getValue('TaskName', 1))

WebUI.sendKeys(findTestObject('SupplierFlow/searchTaskInInbox'), Keys.chord(Keys.ENTER))

Thread.sleep(6000)

