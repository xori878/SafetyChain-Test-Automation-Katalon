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

not_run: WebUI.setText(findTestObject('TestUserLocation/login_Password'), GlobalVariable.Password)

not_run: WebUI.click(findTestObject('TestUserLocation/login_Button'))

WebUI.waitForElementClickable(findTestObject('Form_Selection_Creation/mainMenu_Button'), 30)

WebUI.click(findTestObject('Form_Selection_Creation/mainMenu_Button'))

not_run: WebUI.click(findTestObject('Form_Selection_Creation/mainMenu_AdminTools'))

WebUI.waitForElementVisible(findTestObject('Form_Selection_Creation/mainMenu_AdminTools_FormDesigner'), 45)

WebUI.click(findTestObject('Form_Selection_Creation/mainMenu_AdminTools_FormDesigner'))

//WebUI.click(findTestObject('Form_Selection_Creation/DirectRelease'))
//Thread.sleep(2000)
WebUI.click(findTestObject('Form_Selection_Creation/selectCheckForm'))

Thread.sleep(4000)

CustomKeywords.'AdminTool_Location.selectResType'()

Thread.sleep(4000)

CustomKeywords.'AdminTool_Location.dragDropRes'()

Thread.sleep(4000)

CustomKeywords.'AdminTool_Location.validate'()

