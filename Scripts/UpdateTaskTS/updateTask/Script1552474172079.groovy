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

WebUI.openBrowser(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Form_Selection_Creation/login_Username'), 'Superadmin')

WebUI.setText(findTestObject('Form_Selection_Creation/login_Password'), GlobalVariable.Password)

WebUI.click(findTestObject('Form_Selection_Creation/login_Button'))

Thread.sleep(3000)

WebUI.waitForElementClickable(findTestObject('Form_Selection_Creation/mainMenu_Button'), 60)

WebUI.click(findTestObject('Form_Selection_Creation/mainMenu_Button'))

WebUI.waitForElementClickable(findTestObject('UpdateTask/taskSchedular'), 60)

Thread.sleep(1000)

WebUI.click(findTestObject('UpdateTask/taskSchedular'))

Thread.sleep(2000)

CustomKeywords.'Test12.selectTask'()

