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

not_run: WebUI.setText(findTestObject('DocumentTab/login_Username'), GlobalVariable.UserName)

not_run: WebUI.setText(findTestObject('DocumentTab/login_Password'), GlobalVariable.Password)

not_run: WebUI.click(findTestObject('DocumentTab/login_Button'))

WebUI.refresh()

Thread.sleep(2000)

WebUI.waitForElementClickable(findTestObject('DocumentTab/documentTab'), 45)

Thread.sleep(6000)

WebUI.click(findTestObject('DocumentTab/documentTab'))

WebUI.waitForElementClickable(findTestObject('DocumentTab/selectDocument'), 45)

Thread.sleep(4000)

CustomKeywords.'AdminTool_Location.moveCursor'()

Thread.sleep(2000)

WebUI.click(findTestObject('DocumentTab/options'))

Thread.sleep(2000)

WebUI.mouseOver(findTestObject('FormTab/filterOption'))

not_run: WebUI.click(findTestObject('FormTab/filterOption'))

Thread.sleep(2000)

CustomKeywords.'FormName.filterDocumentName'()

Thread.sleep(2000)

WebUI.click(findTestObject('FormTab/filterButton'))

Thread.sleep(4000)

WebUI.waitForElementClickable(findTestObject('DocumentTab/selectDocument'), 45)

WebUI.doubleClick(findTestObject('DocumentTab/selectDocument'))

Thread.sleep(2000)

CustomKeywords.'Submission.verifyData'()

Thread.sleep(2000)

not_run: CustomKeywords.'FormName.documentFormName'()

Thread.sleep(2000)

