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

not_run: WebUI.click(findTestObject('Form_Selection_Creation/mainMenu_Button'))

WebUI.openBrowser(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Form_Selection_Creation/login_Username'), GlobalVariable.UserName)

WebUI.setText(findTestObject('Form_Selection_Creation/login_Password'), GlobalVariable.Password)

WebUI.click(findTestObject('Form_Selection_Creation/login_Button'))

Thread.sleep(3000)

CustomKeywords.'AdminTool_Location.moveCursor'()

Thread.sleep(2000)

WebUI.click(findTestObject('Form_Selection_Creation/mainMenu_Button'))

WebUI.click(findTestObject('Form_Selection_Creation/mainMenu_AdminTools'))

WebUI.click(findTestObject('DPT/import-export'))

WebUI.waitForElementClickable(findTestObject('DPT/exportTab'), 45)

Thread.sleep(4000)

WebUI.click(findTestObject('DPT/exportTab'))

WebUI.waitForElementClickable(findTestObject('DPT/extractData'), 20)

Thread.sleep(4000)

WebUI.click(findTestObject('DPT/extractData'))

WebUI.waitForElementClickable(findTestObject('DPT/selectForm'), 45)

Thread.sleep(2000)

WebUI.click(findTestObject('DPT/option'))

Thread.sleep(2000)

WebUI.mouseOver(findTestObject('FormTab/filterOption'))

Thread.sleep(2000)

CustomKeywords.'AdminTool_Location.moveCursor'()

Thread.sleep(2000)

CustomKeywords.'FormName.filterFormName'()

Thread.sleep(2000)

WebUI.click(findTestObject('FormTab/filterButton'))

Thread.sleep(4000)

WebUI.waitForElementClickable(findTestObject('DPT/selectForm'), 45)

WebUI.click(findTestObject('DPT/selectForm'))

WebUI.click(findTestObject('DPT/chooseFirstForm'))

Thread.sleep(2000)

WebUI.click(findTestObject('DPT/dataExtract'))

WebUI.waitForElementClickable(findTestObject('DPT/firstCompliance'), 45)

Thread.sleep(2000)

CustomKeywords.'FormName.testExportStatus'()

Thread.sleep(2000)

CustomKeywords.'Test.setText'()

Thread.sleep(4000)

WebUI.waitForElementClickable(findTestObject('DPT/import'), 30)

Thread.sleep(2000)

WebUI.click(findTestObject('DPT/import'))

WebUI.waitForElementClickable(findTestObject('DPT/newImport'), 30)

Thread.sleep(2000)

WebUI.click(findTestObject('DPT/newImport'))

CustomKeywords.'FormName.uploadExFile'()

Thread.sleep(4000)

WebUI.click(findTestObject('DPT/upload'))

WebUI.waitForElementClickable(findTestObject('DPT/selectFormImport'), 45)

Thread.sleep(4000)

WebUI.click(findTestObject('DPT/selectFormImport'))

Thread.sleep(4000)

CustomKeywords.'FormName.testImportStatus'()

Thread.sleep(2000)

