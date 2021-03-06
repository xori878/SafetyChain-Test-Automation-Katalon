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

not_run: WebUI.openBrowser(GlobalVariable.URL)

not_run: WebUI.maximizeWindow()

WebUI.setText(findTestObject('Form_Selection_Creation/login_Username'), GlobalVariable.UserName)

WebUI.setText(findTestObject('Form_Selection_Creation/login_Password'), GlobalVariable.Password)

WebUI.click(findTestObject('Form_Selection_Creation/login_Button'))

Thread.sleep(4000)

WebUI.click(findTestObject('Form_Selection_Creation/mainMenu_Button'))

WebUI.click(findTestObject('SupplierFlow/inbox'))

Thread.sleep(6000)

WebUI.setText(findTestObject('SupplierFlow/searchTaskInInbox'), findTestData('SupplierData').getValue('FormTask', 1))

WebUI.sendKeys(findTestObject('SupplierFlow/searchTaskInInbox'), Keys.chord(Keys.ENTER))

Thread.sleep(3000)

WebUI.waitForElementClickable(findTestObject('SupplierFlow/firstEntry'), 45)

Thread.sleep(3000)

CustomKeywords.'Supplier.selectTaskInInbox'()

WebUI.waitForElementClickable(findTestObject('SupplierFlow/rejectButton'), 45)

Thread.sleep(6000)

WebUI.click(findTestObject('SupplierFlow/rejectButton'))

Thread.sleep(3000)

WebUI.setText(findTestObject('SupplierFlow/rejectionNote'), 'This Task is rejected')

Thread.sleep(2000)

WebUI.click(findTestObject('SupplierFlow/sendTask'))

Thread.sleep(2000)

WebUI.waitForElementVisible(findTestObject('SupplierFlow/firstEntry'), 45)

Thread.sleep(2000)

not_run: WebUI.setText(findTestObject('SupplierFlow/searchTaskInInbox'), findTestData('SupplierData').getValue('FormTask', 
        1))

not_run: WebUI.sendKeys(findTestObject('SupplierFlow/searchTaskInInbox'), Keys.chord(Keys.ENTER))

not_run: Thread.sleep(3000)

WebUI.setText(findTestObject('SupplierFlow/searchTaskInInbox'), findTestData('SupplierData').getValue('FormTask1', 1))

WebUI.sendKeys(findTestObject('SupplierFlow/searchTaskInInbox'), Keys.chord(Keys.ENTER))

Thread.sleep(3000)

WebUI.waitForElementClickable(findTestObject('SupplierFlow/firstEntry'), 45)

Thread.sleep(3000)

CustomKeywords.'Supplier.selectTaskInInbox'()

WebUI.waitForElementClickable(findTestObject('SupplierFlow/rejectButton'), 45)

Thread.sleep(6000)

WebUI.click(findTestObject('SupplierFlow/rejectButton'))

Thread.sleep(3000)

WebUI.setText(findTestObject('SupplierFlow/rejectionNote'), 'This Task is rejected')

Thread.sleep(2000)

WebUI.click(findTestObject('SupplierFlow/sendTask'))

Thread.sleep(2000)

CustomKeywords.'AdminTool_Location.moveCursor'()

Thread.sleep(2000)

WebUI.waitForElementVisible(findTestObject('SupplierFlow/firstEntry'), 45)

WebUI.setText(findTestObject('SupplierFlow/searchTaskInInbox'), findTestData('SupplierData').getValue('DocTask', 1))

WebUI.sendKeys(findTestObject('SupplierFlow/searchTaskInInbox'), Keys.chord(Keys.ENTER))

Thread.sleep(3000)

WebUI.waitForElementClickable(findTestObject('SupplierFlow/firstEntry'), 45)

Thread.sleep(3000)

CustomKeywords.'Supplier.selectTaskInInbox'()

WebUI.waitForElementClickable(findTestObject('SupplierFlow/rejectButton'), 45)

Thread.sleep(6000)

WebUI.click(findTestObject('SupplierFlow/rejectButton'))

Thread.sleep(3000)

WebUI.setText(findTestObject('SupplierFlow/rejectionNote'), 'This Task is rejected')

Thread.sleep(2000)

WebUI.click(findTestObject('SupplierFlow/sendTask'))

Thread.sleep(2000)

WebUI.waitForElementVisible(findTestObject('SupplierFlow/firstEntry'), 45)

Thread.sleep(2000)

WebUI.setText(findTestObject('SupplierFlow/searchTaskInInbox'), findTestData('SupplierData').getValue('DocTask1', 1))

WebUI.sendKeys(findTestObject('SupplierFlow/searchTaskInInbox'), Keys.chord(Keys.ENTER))

Thread.sleep(3000)

WebUI.waitForElementClickable(findTestObject('SupplierFlow/firstEntry'), 45)

Thread.sleep(3000)

CustomKeywords.'Supplier.selectTaskInInbox'()

WebUI.waitForElementClickable(findTestObject('SupplierFlow/rejectButton'), 45)

Thread.sleep(6000)

WebUI.click(findTestObject('SupplierFlow/rejectButton'))

Thread.sleep(3000)

WebUI.setText(findTestObject('SupplierFlow/rejectionNote'), 'This Task is rejected')

Thread.sleep(2000)

WebUI.click(findTestObject('SupplierFlow/sendTask'))

Thread.sleep(4000)

WebUI.waitForElementVisible(findTestObject('SupplierFlow/firstEntry'), 45)

Thread.sleep(3000)

WebUI.waitForElementClickable(findTestObject('TestUser/clickToCheck'), 45)

Thread.sleep(2000)

WebUI.click(findTestObject('TestUser/clickToCheck'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUser/logoutUser'))

Thread.sleep(2000)

