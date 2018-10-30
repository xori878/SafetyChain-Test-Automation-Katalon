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
import org.openqa.selenium.Keys as Keys

CustomKeywords.'sc.sc_customkeywords.UniqueName'('UserName')

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.URL)

Thread.sleep(5000)

WebUI.setText(findTestObject('CommonObjects/Login_UserName'), GlobalVariable.UserName)

WebUI.setText(findTestObject('CommonObjects/Login_Password'), GlobalVariable.Password)

WebUI.click(findTestObject('CommonObjects/Login_LoginButton'))

WebUI.click(findTestObject('CommonObjects/MainMenu_Icon'))

WebUI.click(findTestObject('CommonObjects/MainMenu_AdminTools'))

WebUI.click(findTestObject('InternalUser/MainMenu_Users'))

WebUI.click(findTestObject('InternalUser/ManageUsers_AddNewButton'))

WebUI.setText(findTestObject('InternalUser/ManageUser_NewUserPopUp_Username'), findTestData('TestData').getValue('UserName', 
        1))

WebUI.setText(findTestObject('InternalUser/ManageUsers_NewUserPopUp_Password'), 'Test')

WebUI.setText(findTestObject('InternalUser/ManageUsers_NewUserPopUp_FirstName'), 'Katalon')

WebUI.setText(findTestObject('InternalUser/ManageUsers_NewUserPopUp_LastName'), 'User')

WebUI.setText(findTestObject('InternalUser/ManageUsers_NewUserPopUp_Email'), 'test@xoriant.com')

WebUI.click(findTestObject('InternalUser/ManageUsers_NewUserPopUp_Roles'))

Thread.sleep(5000)

WebUI.click(findTestObject('InternalUser/ManageUsers_NewUserPopUp_RolesSuperadmin'))

WebUI.click(findTestObject('InternalUser/ManageUsers_NewUserPopUp_Location'))

Thread.sleep(5000)

WebUI.click(findTestObject('InternalUser/ManageUsers_NewUserPopUp_AllLocation'))

WebUI.click(findTestObject('InternalUser/ManageUsers_NewUserPopUp_SaveButton'))

Thread.sleep(8000)

WebUI.closeBrowser()

