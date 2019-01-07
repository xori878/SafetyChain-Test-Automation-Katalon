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

Thread.sleep(4000)

WebUI.setText(findTestObject('TestUserLocation/login_Username'), findTestData('UserData').getValue('UserName', 1))

CustomKeywords.'User.setNewPass'()

WebUI.setText(findTestObject('TestUserLocation/login_Password'), findTestData('UserData').getValue('Password', 1))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUserLocation/login_Button'))

Thread.sleep(6000)

WebUI.setText(findTestObject('TestUser/newPassword'), 'a')

WebUI.setText(findTestObject('TestUser/confirmPassword'), 'b')

Thread.sleep(2000)

WebUI.click(findTestObject('TestUser/createPasswordButton'))

Thread.sleep(4000)

WebUI.click(findTestObject('TestUser/passwordMatch'))

WebUI.setText(findTestObject('TestUser/newPassword'), 'a')

WebUI.setText(findTestObject('TestUser/confirmPassword'), 'a')

Thread.sleep(2000)

WebUI.click(findTestObject('TestUser/createPasswordButton'))

Thread.sleep(4000)

WebUI.click(findTestObject('TestUser/characterLength'))

WebUI.setText(findTestObject('TestUser/newPassword'), findTestData('UserData').getValue('Password', 1))

WebUI.setText(findTestObject('TestUser/confirmPassword'), findTestData('UserData').getValue('Password', 1))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUser/createPasswordButton'))

Thread.sleep(4000)

WebUI.click(findTestObject('TestUser/specialCharacater'))

WebUI.setText(findTestObject('TestUser/newPassword'), findTestData('UserData').getValue('NewPassword', 1))

WebUI.setText(findTestObject('TestUser/confirmPassword'), findTestData('UserData').getValue('NewPassword', 1))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUser/createPasswordButton'))

Thread.sleep(4000)

WebUI.setText(findTestObject('TestUserLocation/login_Username'), findTestData('UserData').getValue('UserName', 1))

WebUI.setText(findTestObject('TestUserLocation/login_Password'), findTestData('UserData').getValue('NewPassword', 1))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUserLocation/login_Button'))

Thread.sleep(4000)

WebUI.waitForElementClickable(findTestObject('TestUser/clickToCheck'), 70)

WebUI.click(findTestObject('TestUser/clickToCheck'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUser/logoutUser'))

