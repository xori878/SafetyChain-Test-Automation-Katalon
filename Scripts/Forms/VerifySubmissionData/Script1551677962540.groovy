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

not_run: WebUI.callTestCase(findTestCase('Forms/2_FormSubmission'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Record/record_Tab'), 45)

not_run: Thread.sleep(5000)

not_run: WebUI.openBrowser(GlobalVariable.URL)

not_run: WebUI.maximizeWindow()

not_run: WebUI.setText(findTestObject('Record/login_Username'), GlobalVariable.UserName)

not_run: WebUI.setText(findTestObject('Record/login_Password'), GlobalVariable.Password)

not_run: WebUI.click(findTestObject('Record/login_Button'))

WebUI.refresh()

WebUI.waitForElementClickable(findTestObject('Record/record_Tab'), 45)

Thread.sleep(4000)

WebUI.click(findTestObject('Record/record_Tab'))

WebUI.waitForElementClickable(findTestObject('FormTab/selectForm'), 45)

Thread.sleep(5000)

WebUI.click(findTestObject('Record/formNameOptions'))

Thread.sleep(2000)

WebUI.mouseOver(findTestObject('FormTab/filterOption'))

Thread.sleep(2000)

CustomKeywords.'FormName.filterDocumentName'()

WebUI.click(findTestObject('FormTab/filterButton'))

Thread.sleep(4000)

WebUI.waitForElementClickable(findTestObject('FormTab/selectForm'), 45)

Thread.sleep(2000)

WebUI.doubleClick(findTestObject('FormTab/selectForm'))

Thread.sleep(2000)

CustomKeywords.'Submission.verifyData'()

CustomKeywords.'AdminTool_Location.moveCursor'()

