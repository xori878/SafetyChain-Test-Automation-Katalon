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

not_run: WebUI.setText(findTestObject('Form_Selection_Creation/login_Username'), GlobalVariable.UserName)

not_run: WebUI.setText(findTestObject('Form_Selection_Creation/login_Password'), GlobalVariable.Password)

not_run: WebUI.click(findTestObject('Form_Selection_Creation/login_Button'))

Thread.sleep(3000)

CustomKeywords.'AdminTool_Location.moveCursor'()

Thread.sleep(2000)

WebUI.click(findTestObject('Form_Selection_Creation/mainMenu_Button'))

not_run: WebUI.click(findTestObject('Form_Selection_Creation/mainMenu_AdminTools'))

WebUI.waitForElementVisible(findTestObject('Form_Selection_Creation/mainMenu_AdminTools_FormDesigner'), 45)

WebUI.click(findTestObject('Form_Selection_Creation/mainMenu_AdminTools_FormDesigner'))

Thread.sleep(2000)

WebUI.click(findTestObject('Form_Selection_Creation/releaseForm'))

WebUI.waitForElementClickable(findTestObject('Form_Selection_Creation/button_Release'), 30)

Thread.sleep(3000)

WebUI.click(findTestObject('Form_Selection_Creation/div_Preview             Form1'))

not_run: WebUI.click(findTestObject('Form_Selection_Creation/previewForm'))

Thread.sleep(2000)

not_run: WebUI.click(findTestObject('Form_Selection_Creation/openRes'))

not_run: Thread.sleep(2000)

not_run: WebUI.click(findTestObject('Form_Selection_Creation/selectFirstRes'))

not_run: Thread.sleep(2000)

WebUI.waitForElementClickable(findTestObject('Form_Selection_Creation/button_Release'), 30)

Thread.sleep(4000)

WebUI.click(findTestObject('Form_Selection_Creation/a_Home'))

WebUI.waitForElementClickable(findTestObject('FormTab/form_Tab'), 45)

Thread.sleep(4000)

WebUI.refresh()

WebUI.waitForElementClickable(findTestObject('FormTab/form_Tab'), 45)

Thread.sleep(6000)

WebUI.click(findTestObject('FormTab/form_Tab'))

WebUI.waitForElementClickable(findTestObject('FormTab/selectForm'), 45)

Thread.sleep(6000)

WebUI.click(findTestObject('FormTab/options'))

Thread.sleep(2000)

WebUI.mouseOver(findTestObject('FormTab/filterOption'))

Thread.sleep(2000)

CustomKeywords.'AdminTool_Location.moveCursor'()

Thread.sleep(2000)

CustomKeywords.'FormName.filterFormName'()

Thread.sleep(2000)

WebUI.click(findTestObject('FormTab/filterButton'))

Thread.sleep(4000)

WebUI.waitForElementClickable(findTestObject('FormTab/selectForm'), 45)

WebUI.click(findTestObject('FormTab/selectForm'))

Thread.sleep(4000)

CustomKeywords.'Submission.formSubmission'()

CustomKeywords.'FormName.TestCompliance'()

