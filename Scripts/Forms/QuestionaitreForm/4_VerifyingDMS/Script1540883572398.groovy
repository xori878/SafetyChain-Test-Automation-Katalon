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

not_run: WebUI.setText(findTestObject('DMS_Forms/login_Username'), GlobalVariable.UserName)

not_run: WebUI.setText(findTestObject('DMS_Forms/login_Password'), GlobalVariable.Password)

not_run: WebUI.click(findTestObject('DMS_Forms/login_Button'))

Thread.sleep(4000)

WebUI.click(findTestObject('DMS_Forms/mainmenu_button'))

WebUI.click(findTestObject('DMS_Forms/mainmenu_Document'))

Thread.sleep(3000)

CustomKeywords.'FormName.findinDMS'()

Thread.sleep(4000)

WebUI.doubleClick(findTestObject('DMS_Forms/openDocument'))

Thread.sleep(4000)

