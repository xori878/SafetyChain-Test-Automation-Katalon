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

CustomKeywords.'sc.sc_customkeywords.UniqueName'('WorkGroup')

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('CommonObjects/Login_UserName'), GlobalVariable.UserName)

WebUI.setText(findTestObject('CommonObjects/Login_Password'), GlobalVariable.Password11)

WebUI.click(findTestObject('CommonObjects/Login_LoginButton'))

WebUI.click(findTestObject('CommonObjects/FSQA_MainMenu'))

WebUI.click(findTestObject('CommonObjects/MainMenu_AdminTools'))

WebUI.click(findTestObject('CommonObjects/MainMenu_WorkGroups'))

WebUI.click(findTestObject('WorkGroup/WorkGroup_PlusIcon'))

WebUI.setText(findTestObject('WorkGroup/WorkGroup_AddingNewTextField'), findTestData('TestData').getValue('WorkGroup', 
        1))

WebUI.click(findTestObject('WorkGroup/WorkGroup_SaveButton'))

Thread.sleep(3000)

WebUI.verifyTextPresent(findTestData('TestData').getValue("WorkGroup", 1), false)

WebUI.closeBrowser()

