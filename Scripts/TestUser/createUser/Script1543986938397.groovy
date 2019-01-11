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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.interactions.Actions as Actions

WebUI.openBrowser(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('TestUserLocation/login_Username'), 70)

WebUI.setText(findTestObject('TestUserLocation/login_Username'), GlobalVariable.UserName)

WebUI.setText(findTestObject('TestUserLocation/login_Password'), GlobalVariable.Password)

CustomKeywords.'User.setNamePass'()

WebUI.click(findTestObject('TestUserLocation/login_Button'))

Thread.sleep(6000)

WebUI.waitForElementClickable(findTestObject('TestUserLocation/mainmenu_button'), 70)

WebUI.click(findTestObject('TestUserLocation/mainmenu_button'))

WebUI.click(findTestObject('Form_Selection_Creation/mainMenu_AdminTools'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUser/users'))

Thread.sleep(6000)

WebUI.click(findTestObject('TestUser/addNewUser'))

Thread.sleep(4000)

WebUI.setText(findTestObject('TestUser/userName'), findTestData('UserData').getValue('UserName', 1))

WebUI.setText(findTestObject('TestUser/password'), findTestData('UserData').getValue('Password', 1))

WebUI.setText(findTestObject('TestUser/firstName'), 'Test')

WebUI.setText(findTestObject('TestUser/lastName'), 'Auto')

WebUI.setText(findTestObject('TestUser/email'), 'test123@auto.com')

WebUI.click(findTestObject('TestUser/timeZoneOpen'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUser/selectTimeZone'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUser/clickOutside'))

WebUI.click(findTestObject('TestUser/locationOpen'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUser/selectLocation'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUser/clickOutside'))

WebUI.click(findTestObject('TestUser/roleOpen'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUser/selectRole'))

Thread.sleep(2000)

CustomKeywords.'AdminTool_Location.moveCursor'()

Thread.sleep(2000)

WebUI.click(findTestObject('TestUser/clickOutside'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUser/saveUser'))

Thread.sleep(6000)

WebUI.click(findTestObject('TestUser/clickToCheck'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUser/logoutUser'))

Thread.sleep(2000)

