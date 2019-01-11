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

not_run: WebUI.openBrowser(GlobalVariable.URL)

not_run: WebUI.maximizeWindow()

not_run: WebUI.setText(findTestObject('TestUserLocation/login_Username'), GlobalVariable.UserName)

not_run: WebUI.setText(findTestObject('TestUserLocation/login_Password'), GlobalVariable.Password11)

Thread.sleep(2000)

CustomKeywords.'Supplier.setSupplier'()

not_run: WebUI.click(findTestObject('TestUserLocation/login_Button'))

not_run: Thread.sleep(6000)

Thread.sleep(4000)

WebUI.click(findTestObject('TestUserLocation/mainmenu_button'))

not_run: WebUI.click(findTestObject('Form_Selection_Creation/mainMenu_AdminTools'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUser/users'))

Thread.sleep(6000)

WebUI.click(findTestObject('SupplierFlow/selectSupplierTab'))

CustomKeywords.'AdminTool_Location.moveCursor'()

Thread.sleep(2000)

Thread.sleep(6000)

WebUI.click(findTestObject('SupplierFlow/addNewSupplierButton'))

Thread.sleep(3000)

WebUI.click(findTestObject('SupplierFlow/openSupplierOption'), FailureHandling.STOP_ON_FAILURE)

Thread.sleep(2000)

CustomKeywords.'Supplier.getSupplierName'()

CustomKeywords.'Supplier.setSupplier'()

WebUI.setText(findTestObject('SupplierFlow/userName'), findTestData('SupplierData').getValue('UserName', 1))

WebUI.setText(findTestObject('SupplierFlow/firstName'), 'Supplier')

WebUI.setText(findTestObject('SupplierFlow/lastName'), 'Test')

WebUI.setText(findTestObject('SupplierFlow/email'), 'Sup@gmail.com')

WebUI.setText(findTestObject('SupplierFlow/password'), findTestData('SupplierData').getValue('Password', 1))

WebUI.setText(findTestObject('SupplierFlow/title'), 'Test')

WebUI.click(findTestObject('SupplierFlow/openTimeZone'))

Thread.sleep(2000)

WebUI.click(findTestObject('SupplierFlow/selectTimeZone_India'))

Thread.sleep(4000)

WebUI.click(findTestObject('SupplierFlow/saveButton'))

Thread.sleep(6000)

