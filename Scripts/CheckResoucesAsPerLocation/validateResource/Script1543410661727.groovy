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

not_run: WebUI.setText(findTestObject('Form_Selection_Creation/login_Password'), GlobalVariable.Password11)

Thread.sleep(4000)

CustomKeywords.'FormName.setData'()

not_run: WebUI.click(findTestObject('Form_Selection_Creation/login_Button'))

WebUI.click(findTestObject('Form_Selection_Creation/mainMenu_Button'))

not_run: WebUI.click(findTestObject('Form_Selection_Creation/mainMenu_AdminTools'))

WebUI.click(findTestObject('Form_Selection_Creation/mainMenu_AdminTools_FormDesigner'))

//WebUI.click(findTestObject('Form_Selection_Creation/DirectRelease'))
//Thread.sleep(2000)
WebUI.click(findTestObject('Form_Selection_Creation/selectCheckForm'))

Thread.sleep(5000)

CustomKeywords.'AdminTool_Location.selectResType'()

CustomKeywords.'AdminTool_Location.dragDropRes'()

Thread.sleep(5000)

not_run: WebUI.dragAndDropToObject(findTestObject('null'), findTestObject('Form_Selection_Creation/Target_Res_Object'))

CustomKeywords.'AdminTool_Location.validate'()

String s = WebUI.getText(findTestObject('TestResource/testText'))

println(s)

